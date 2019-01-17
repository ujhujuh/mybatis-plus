package com.hand.cloud.mybatisplus.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author fantasy
 * @date 2019/1/17
 * @time 11:55
 */

@TableName(value = "book")
@Data
public class Book implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    private String catalog;
    private String name;
    private String author;
    private String publishing;
    private String publishingTime;
    private String price;
    private String imgUrl;
    private String description;

}
