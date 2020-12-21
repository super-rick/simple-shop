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
public class Sku implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private Integer name;

    private String props;

    private Integer productId;

    private String productName;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;

    private Integer status;

    private Integer isDel;

    private Integer stock;

    private BigDecimal price;

    private String pic;

    private Integer soleNumber;


}
