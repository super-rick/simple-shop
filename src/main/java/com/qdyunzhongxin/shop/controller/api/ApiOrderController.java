package com.qdyunzhongxin.shop.controller.api;


import com.qdyunzhongxin.shop.entity.Address;
import com.qdyunzhongxin.shop.service.IAddressService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author rick
 * @since 2020-12-05
 */
@RestController
@RequestMapping("/shop/address")
@Slf4j
public class ApiOrderController {

    @Autowired
    private IAddressService addressService;

    @GetMapping
    public List<Address> getList(){
        log.warn("/shop/address getList");
        return addressService.list();
    }
}

