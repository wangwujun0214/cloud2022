package com.atgui.springcloud.dao;

import com.atgui.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author: HASEE
 * @ClassName: PaymentDao.java
 * @JdkVersion: JDK11.0
 * @Date: 2022/3/5
 * @Description: TODO(注释信息内容)
 */
@Mapper
public interface PaymentDao
{
    public int create(Payment payment);
    public Payment getPaymentById (@Param("id") Long id);
    public List<Payment> getPayment (Payment payment);

}
