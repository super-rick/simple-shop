package com.qdyunzhongxin.shop.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author rick
 * @since 2020-12-05
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Comment implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private Integer userId;

    private String title;

    private String content;

    private String pic;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;

    private Integer productId;

    private String productName;

    private Integer skuId;

    private String skuName;

    private Integer buyQuantity;

    private LocalDateTime buyTime;

    private Integer status;

    private Integer isDel;


}
