package com.atgui.springcloud.service.impl;

import com.atgui.springcloud.dao.PaymentDao;
import com.atgui.springcloud.entities.CommonResult;
import com.atgui.springcloud.entities.Payment;
import com.atgui.springcloud.service.IPaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author: HASEE
 * @ClassName: PaymentServiceImpl.java
 * @JdkVersion: JDK11.0
 * @Date: 2022/3/6
 * @Description: TODO(注释信息内容)
 */
@Service
public class PaymentServiceImpl implements IPaymentService {

    @Resource
    private PaymentDao paymentDao;

    @Override
    public CommonResult create(Payment payment) {
        int i = paymentDao.create(payment);
        if (i>=1){
            return new CommonResult(200,"创建成功!",payment);
        }else {
            return new CommonResult(-1,"创建失败!");
        }

    }

    @Override
    public CommonResult<List<Payment>> getPayment(Payment payment) {
        List<Payment> payments = paymentDao.getPayment(payment);
        if (payments.size()>=0) {
            return new CommonResult<>(200,"查询成功!",payments);
        } else {
            return new CommonResult<>(-1,"查询失败!");
        }

    }

    @Override
    public CommonResult<Payment> getPaymentById(Long id) {
        Payment paymentById = paymentDao.getPaymentById(id);
        return new CommonResult<>(200,"查询成功!",paymentById);
    }
}
