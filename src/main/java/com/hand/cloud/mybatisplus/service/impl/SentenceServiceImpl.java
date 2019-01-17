package com.hand.cloud.mybatisplus.service.impl;

import com.hand.cloud.mybatisplus.entity.Sentence;
import com.hand.cloud.mybatisplus.mapper.SentenceMapper;
import com.hand.cloud.mybatisplus.service.ISentenceService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author jobob
 * @since 2019-01-17
 */
@Service
public class SentenceServiceImpl extends ServiceImpl<SentenceMapper, Sentence> implements ISentenceService {

}
