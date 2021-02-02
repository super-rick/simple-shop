package com.qdyunzhongxin.shop.controller.back;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.fasterxml.jackson.databind.util.JSONPObject;
import com.qdyunzhongxin.shop.entity.Orders;
import com.qdyunzhongxin.shop.service.IOrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author rick
 * @since 2020-12-05
 */
@Controller
@RequestMapping("/back/orders")
@Slf4j
public class OrderController {

    @Autowired
    private IOrderService orderService;

    @GetMapping
    public String index(ModelMap modelMap){
        IPage<Orders> page = new Page<>(1,10);
        page = orderService.page(page);
        log.warn("{}", page.getRecords());
        modelMap.put("orders",page);
        return "pages/back/order/list";
    }

}

