package com.atgui.springcloud.controller;

import com.atgui.springcloud.entities.CommonResult;
import com.atgui.springcloud.entities.Payment;
import com.atgui.springcloud.service.IPaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author: HASEE
 * @ClassName: PaymentController.java
 * @JdkVersion: JDK11.0
 * @Date: 2022/3/6
 * @Description: TODO(注释信息内容)
 */
@RestController
@RequestMapping("/inner/query")
@Slf4j
public class PaymentController {

    @Autowired
    IPaymentService paymentService;

    @GetMapping (value = "queryPaymentById/{id}")
    public CommonResult<Payment> queryPaymentById(@PathVariable("id") Long id){
        log.info("queryPaymentById查询入参"+id);
        return paymentService.getPaymentById(id);
    }

    @PostMapping (value = "queryPayment")
    public CommonResult<List<Payment>> queryPayment(@RequestBody Payment payment){
        log.info("主打歌hi i");
        return paymentService.getPayment(payment);
    }

    @RequestMapping(value = "create")
    public CommonResult create(@RequestBody Payment payment){
        return paymentService.create(payment);
    }
}
