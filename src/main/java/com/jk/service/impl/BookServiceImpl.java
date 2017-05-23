package com.jk.service.impl;

import com.jk.dao.BookDao;
import com.jk.pojo.Book;
import com.jk.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by lenovo on 2017/5/15.
 */
@Service
public class BookServiceImpl implements BookService {



    @Autowired
    private BookDao bookDao;


    public void removebook(Book book) {
        bookDao.removebook(book);
    }

    public List<Book> selectlistbook() {
        return bookDao.selectlistbook();
    }

    public void insertbook(Book book) {
        bookDao.insertbook(book);
    }


}
