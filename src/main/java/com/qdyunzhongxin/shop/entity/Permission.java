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
public class Permission implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String menuName;

    private String permName;

    private String url;

    private Integer type;

    private Integer pid;

    private Integer level;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;

    private Integer status;

    private Integer isDel;

    private Integer sort;


}
