package com.qdyunzhongxin.shop.controller.back;

import com.qdyunzhongxin.shop.entity.Menu;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class IndexController {

    @GetMapping("/back")
    public String index(ModelMap modelMap){
        modelMap.put("home","Simple-shop");
        modelMap.put("menus",defaultMenu());
        return "iframe";
    }

    private List<Menu> defaultMenu(){
        List<Menu> menus = new ArrayList<>();
        Menu menu1 = new Menu(1L,"/back/orders",null,"订单管理","nav-icon fas fa-tachometer-alt");
        Menu menu2 = new Menu(2L,"/back/products",null,"产品管理","nav-icon fas fa-th");
        Menu menu3 = new Menu(3L,"/back/users",null,"用户管理","nav-icon fas fa-chart-pie");

        menus.add(menu1);
        menus.add(menu2);
        menus.add(menu3);
        return menus;
    }
}
