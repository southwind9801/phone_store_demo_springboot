package com.southwind.phone_store_demo.vo;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AddressVO {
    private Integer id;
    private String areaCode;
    private String name;
    private String tel;
    private String address;
}
