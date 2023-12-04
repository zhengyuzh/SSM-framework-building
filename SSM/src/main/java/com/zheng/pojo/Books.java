package com.zheng.pojo;

/**
 * @BelongsProject: SSM
 * @BelongsPackage: com.zheng.pojo
 * @Author: zhengyuzhu
 * @CreateTime: 2023-12-04  09:46
 * @Description: 书本实体类
 * @Version: 1.0
 */
public class Books {
    private int bookId;
    private String bookName;
    private int bookCounts;
    private String detail;

    public Books( ) {

    }
    public Books(int bookId, String bookName, int bookCounts, String detail) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.bookCounts = bookCounts;
        this.detail = detail;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getBookCounts() {
        return bookCounts;
    }

    public void setBookCounts(int bookCounts) {
        this.bookCounts = bookCounts;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    @Override
    public String toString() {
        return "Books{" +
                "bookId=" + bookId +
                ", bookName='" + bookName + '\'' +
                ", bookCounts=" + bookCounts +
                ", detail='" + detail + '\'' +
                '}';
    }
}

