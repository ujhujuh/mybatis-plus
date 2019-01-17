package com.hand.cloud.mybatisplus.controller;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.segments.MergeSegments;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.hand.cloud.mybatisplus.entity.Book;
import com.hand.cloud.mybatisplus.mapper.BookMapper;
import com.sun.tools.internal.ws.processor.modeler.annotation.WrapperInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author fantasy
 * @date 2019/1/17
 * @time 14:08
 */

@RestController
@RequestMapping("/mybatisplus/book")
public class BookController {

    @Autowired
    private BookMapper bookMapper;

    @GetMapping("/getAll")
    public IPage<Book> getAll(int pageNum, int pageSize) {
        Page<Book> page = new Page<>(pageNum, pageSize);
        return bookMapper.selectPage(page, null);
    }

    @GetMapping("/getByName")
    public IPage<Book> getByName(Integer pageNum, Integer pageSize, String name) {
        Page<Book> page = new Page<>(pageNum, pageSize);
        QueryWrapper<Book> bookWrapper = new QueryWrapper<>();
        bookWrapper.like("name", name);
        return bookMapper.selectPage(page, bookWrapper);
    }
}
