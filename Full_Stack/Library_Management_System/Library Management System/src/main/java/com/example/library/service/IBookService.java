package com.example.library.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.library.domain.Book;

public interface IBookService extends IService<Book> {

    boolean saveBook(Book book);
    boolean modify(Book book);

    IPage<Book> getPage(int currentPage, int pageSize);

    IPage<Book> getPage(int currentPage, int pageSize, Book book);
}
