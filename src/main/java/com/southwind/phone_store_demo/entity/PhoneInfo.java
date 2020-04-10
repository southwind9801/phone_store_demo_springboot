package com.southwind.phone_store_demo.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

@Data
@Entity
public class PhoneInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer phoneId;
    private String phoneName;
    private BigDecimal phonePrice;
    private String phoneDescription;
    private Integer phoneStock;
    private String phoneIcon;
    private Integer categoryType;
    private String phoneTag;
    private Date createTime;
    private Date updateTime;
}
