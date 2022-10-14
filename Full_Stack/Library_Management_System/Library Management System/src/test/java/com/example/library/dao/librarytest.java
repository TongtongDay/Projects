package com.example.library.dao;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.library.domain.Book;
import org.apache.logging.log4j.util.Strings;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class librarytest {

    @Autowired
    private BookDao bookDao;

    @Test
    void testGetById(){
        System.out.println(bookDao.selectById(1));
    }

    @Test
    void testSave(){
        Book book = new Book();
        book.setType("test");
        book.setName("test");
        book.setDescription("text");
        bookDao.insert(book);
    }

    @Test
    void testupdate(){
        Book book = new Book();
        book.setId(4);
        book.setType("test");
        book.setName("test");
        book.setDescription("test");
        bookDao.updateById(book);
    }

    @Test
    void testDelete(){
        bookDao.deleteById(4);
    }

    @Test
    void testGetAll(){
        bookDao.selectList(null);
    }

    @Test
    void testGetPage(){
        IPage page = new Page(2,2);
        bookDao.selectPage(page,null);
    }

    @Test
    void testGetBy(){
        String name = "Spring";
        QueryWrapper<Book> qw = new QueryWrapper<>();
        qw.like(Strings.isNotEmpty(name),"name",name);
        bookDao.selectList(qw);
    }

}
