package com.atgui.springcloud.service;

import com.atgui.springcloud.entities.CommonResult;
import com.atgui.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author: HASEE
 * @ClassName: IPaymentService.java
 * @JdkVersion: JDK11.0
 * @Date: 2022/3/6
 * @Description: TODO(注释信息内容)
 */
public interface IPaymentService {
    CommonResult create(Payment payment);
    CommonResult<List<Payment>> getPayment (Payment payment);
    CommonResult<Payment> getPaymentById (@Param("id") Long id);
}
