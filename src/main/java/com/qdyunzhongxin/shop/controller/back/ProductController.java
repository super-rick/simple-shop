package com.qdyunzhongxin.shop.controller.back;


import com.qdyunzhongxin.shop.entity.Product;
import com.qdyunzhongxin.shop.entity.vo.BackProductDetailVO;
import com.qdyunzhongxin.shop.entity.vo.BackProductListVO;
import com.qdyunzhongxin.shop.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
@RequestMapping("/back/shop/product")
public class ProductController {

    @Autowired
    private IProductService productService;

    @GetMapping
    public List<Product> list(){
        return productService.list();
    }

    @GetMapping("/{id}")
    public Product detail(@PathVariable("id") Long id){
        return productService.getById(id);
    }

    @PostMapping
    public void add(@RequestBody Product product){
        productService.save(product);
    }

    @PutMapping
    public void edit(@RequestBody Product product){
        productService.updateById(product);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id){
        productService.removeById(id);
    }
}

