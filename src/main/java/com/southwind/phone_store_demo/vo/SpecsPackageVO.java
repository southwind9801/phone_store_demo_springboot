package com.southwind.phone_store_demo.vo;

import lombok.Data;

import java.util.Map;

@Data
public class SpecsPackageVO {
    private Map<String,String> goods;
    private SkuVO sku;
}
