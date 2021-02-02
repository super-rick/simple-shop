package com.qdyunzhongxin.shop.entity;

import lombok.Data;

import java.util.List;

/**
 * @author Rick
 * @since 2021-02-02 16:44
 **/
@Data
public class Menu {

    private Long id;
    private String url;
    private String pid;
    private String name;
    private String icon;
    private List<Menu> menus;

    public Menu(){

    }

    public Menu(Long id, String url, String pid, String name, String icon) {
        this.id = id;
        this.url = url;
        this.pid = pid;
        this.name = name;
        this.icon = icon;
    }
}
