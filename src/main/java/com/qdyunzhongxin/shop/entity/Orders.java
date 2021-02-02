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
public class Orders implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String orderNumber;

    private Integer userId;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;

    private LocalDateTime payTime;

    private LocalDateTime cancelTime;

    private LocalDateTime deliverTime;

    private LocalDateTime finishTime;

    private BigDecimal totalPrice;

    private BigDecimal payPrice;

    private BigDecimal deliverPrice;

    private String address;

    private String phone;

    private String name;

    private String pic;

    private Integer status;

    private Integer isDel;


}
