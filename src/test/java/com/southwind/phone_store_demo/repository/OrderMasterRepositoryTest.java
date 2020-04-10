package com.southwind.phone_store_demo.repository;

import com.southwind.phone_store_demo.entity.OrderMaster;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class OrderMasterRepositoryTest {

    @Autowired
    private OrderMasterRepository repository;

    @Test
    void findAll(){
        List<OrderMaster> list = repository.findAll();
        for (OrderMaster orderMaster : list) {
            System.out.println(orderMaster);
        }
    }

    @Test
    void save(){
        OrderMaster orderMaster = new OrderMaster();
        orderMaster.setOrderId("123456");
        orderMaster.setBuyerName("张三");
        orderMaster.setBuyerAddress("广东省深圳市罗湖区科技路123号456室");
        orderMaster.setBuyerPhone("13678787878");
        orderMaster.setOrderAmount(new BigDecimal(6400));
        orderMaster.setPayStatus(0);
        orderMaster.setPhoneIcon("../static/e84a2e03-7f19-41d2-98a5-a5c16b7e252d.jpg");
        orderMaster.setPhoneId(1);
        orderMaster.setPhoneName("Honor 8A");
        orderMaster.setPhoneQuantity(2);
        orderMaster.setSpecsId(1);
        orderMaster.setSpecsName("32GB");
        orderMaster.setSpecsPrice(new BigDecimal(320000));
        repository.save(orderMaster);
    }

    @Test
    void findById(){
        OrderMaster orderMaster = repository.findById("123456").get();
        System.out.println(orderMaster);
    }

    @Test
    void pay(){
        OrderMaster orderMaster = repository.findById("123456").get();
        orderMaster.setPayStatus(1);
        repository.save(orderMaster);
    }
}