package com.qdyunzhongxin.shop.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
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
public class Deliver implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private Integer orderId;

    private Integer orderItemId;

    private Integer orderNumber;

    private Integer userId;

    private Integer addressId;

    private Integer address;

    private String phone;

    private String name;

    private String deliverCode;

    private Integer type;

    private Integer status;

    private Integer isDel;


}
