package com.jk.service;

import com.jk.pojo.Book;

import java.util.List;

/**
 * Created by lenovo on 2017/5/15.
 */
public interface BookService {

    void insertbook(Book book);

    List<Book> selectlistbook();

    void removebook(Book book);
}
