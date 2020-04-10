package com.southwind.phone_store_demo.vo;

import lombok.Data;

import java.util.List;

@Data
public class DataVO {
    private List<PhoneCategoryVO> categories;
    private List<PhoneInfoVO> phones;
}
