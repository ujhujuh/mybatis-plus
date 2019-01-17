package com.hand.cloud.mybatisplus.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.hand.cloud.mybatisplus.entity.Sentence;
import com.hand.cloud.mybatisplus.mapper.SentenceMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author jobob
 * @since 2019-01-17
 */
@RestController
@RequestMapping("/mybatisplus/sentence")
public class SentenceController {

    @Autowired
    private SentenceMapper sentenceMapper;

    @GetMapping("/getAll")
    public IPage<Sentence> getAll(int pageNum, int pageSize) {
        return sentenceMapper.selectPage(new Page<>(pageNum, pageSize), null);
    }
}
