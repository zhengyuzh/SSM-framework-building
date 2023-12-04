package com.zheng.dao;

/**
 * @BelongsProject: SSM
 * @BelongsPackage: com.zheng.dao
 * @Author: zhengyuzhu
 * @CreateTime: 2023-12-04  09:47
 * @Description: TODO
 * @Version: 1.0
 */
import com.zheng.pojo.Books;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookMapper {

    /**
     * @description:   增加一本书
     * @author: zhengyuzhu
     * @date: 2023/12/4 10:17
     * @param: books
     * @return: int
     **/
    int addBook(Books books);

    /**
     * @description: 删除一本书
     * @author: zhengyuzhu
     * @date: 2023/12/4 10:18
     * @param: id
     * @return: int
     **/
    int deleteBookById(int id);

    /**
     * @description: 更新一本书
     * @author: zhengyuzhu
     * @date: 2023/12/4 10:18
     * @param: books
     * @return: int
     **/
    int updateBook(Books books);

    /**
     * @description: 查询所有的书籍
     * @author: zhengyuzhu
     * @date: 2023/12/4 10:18
     * @return: java.util.List<com.zheng.pojo.Books>
     **/
    List<Books> queryAllBook();

    /**
     * @description: 查询一本书籍通过id
     * @author: zhengyuzhu
     * @date: 2023/12/4 10:18
     * @param: id
     * @return: com.zheng.pojo.Books
     **/
    Books queryBookById(int id);

    /**
     * @description: 通过书名查询书籍
     * @author: zhengyuzhu
     * @date: 2023/12/4 10:19
     * @param: bookName
     * @return: com.zheng.pojo.Books
     **/
    public Books queryBookByName(@Param("bookName") String bookName);
}

