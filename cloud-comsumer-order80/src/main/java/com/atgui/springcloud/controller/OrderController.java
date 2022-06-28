package com.atgui.springcloud.controller;

import com.atgui.springcloud.entities.CommonResult;
import com.atgui.springcloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author: HASEE
 * @ClassName: OrderController.java
 * @JdkVersion: JDK11.0
 * @Date: 2022/3/7
 * @Description: TODO(注释信息内容)
 */
@Slf4j
@RestController
@RequestMapping("/member/payment")
public class OrderController {

    private static final String PAYMENT_URL = "http://localhost:8001/inner/query";

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/queryPaymentById/{id}")
    public CommonResult<Payment> queryPaymentById(@PathVariable("id") String id){
        log.info("queryPaymentById入参："+id);
        return restTemplate.getForObject(PAYMENT_URL+"/queryPaymentById/"+id,CommonResult.class);
    }

    @RequestMapping(value = "/getPayment",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public CommonResult<List<Payment>> getPayment(@RequestBody Payment payment){
        log.info("getPayment入参："+payment);
        return restTemplate.postForObject(PAYMENT_URL+"/queryPayment",payment,CommonResult.class);
    }

    @RequestMapping(value = "/create",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public CommonResult<Payment> create(@RequestBody Payment payment){
        log.info("create入参："+payment);
        return restTemplate.postForObject(PAYMENT_URL+"/create",payment,CommonResult.class);
    }
}
