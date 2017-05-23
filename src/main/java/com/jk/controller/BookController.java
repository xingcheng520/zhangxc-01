package com.jk.controller;

import com.jk.pojo.Book;
import com.jk.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by lenovo on 2017/5/15.
 */
@Controller
public class BookController {

     @Autowired
     private BookService bookService;

     @RequestMapping("insertbook")
     public String insertbook(Book book){
          bookService.insertbook(book);
          return "redirect:/selectlistbook.jhtml";
     }

     @RequestMapping("toinsertbook")
     public String toinsertbook(){
          return "book/insertbook";
     }

     @RequestMapping("selectlistbook")
     public String selectlistbook(Model model){
          List<Book> bookList=bookService.selectlistbook();
          model.addAttribute("bookList",bookList);
          return "book/listbook";
     }

     @RequestMapping("deletebook")
     public String deletebook(Book book){
          bookService.removebook(book);
          return "redirect:/selectlistbook.jhtml";
     }


     @RequestMapping("ceshi")
     public void ceshi(){


     }

}
