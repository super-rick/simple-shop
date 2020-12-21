package com.qdyunzhongxin.shop.entity;

import java.math.BigDecimal;
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
public class Product implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String name;

    private BigDecimal price;

    private BigDecimal originPrice;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;

    private Integer status;

    private Integer isDel;

    private Integer catId;

    private String pic;

    private String text;

    private Integer stock;

    private Integer soleNumber;

    private String props;

    private String tags;


}
