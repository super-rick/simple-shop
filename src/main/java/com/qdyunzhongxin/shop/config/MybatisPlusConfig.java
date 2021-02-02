package com.qdyunzhongxin.shop.config;

import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Rick
 * @since 2021-02-02 17:53
 **/
@Configuration
@ConditionalOnClass(value = {PaginationInnerInterceptor.class})
public class MybatisPlusConfig {

    @Bean
    public PaginationInnerInterceptor paginationInnerInterceptor(){
        return new PaginationInnerInterceptor();
    }
}
