###1、首页数据

```
GET /phone/index
```

参数

```json
无
```

返回

```json
{
  code: 0,
  msg: "成功",
  data: {
    categories: [
      {
        name: "魅焰红",
        type: 1
      }
    ],
    phones: [
      {
        id: 1,
        title: "Honor 8A",
        price: "2800.00",
        desc: "魅焰红",
        tag: [
          {
            name: "720P珍珠屏"
          },
          {
            name: "Micro USB接口"
          }
        ],
        thumb: "../static/e84a2e03-7f19-41d2-98a5-a5c16b7e252d.jpg"
      }
    ]
  }
}
```

###2、根据类型查询手机

```
GET /phone/findByCategoryType
```

参数

```json
categoryType: 1
```

返回

```json
{
  code: 0,
  msg: "成功",
  data: [
    {
      id: 1,
      title: "Honor 8A",
      price: "2800.00",
      desc: "魅焰红",
      tag: [
        {
          name: "720P珍珠屏"
        },
        {
          name: "Micro USB接口"
        }
      ],
      thumb: "../static/e84a2e03-7f19-41d2-98a5-a5c16b7e252d.jpg"
    }
  ]
}
```

###3、查询手机规格

```
GET /phone/findSpecsByPhoneId
```

参数

```json
phoneId: 1
```

返回

```json
{
  code: 0,
  msg: "成功",
  data: {
    goods: {
      picture: "../static/e84a2e03-7f19-41d2-98a5-a5c16b7e252d.jpg"
    },
    sku: {
      tree: [
        {
          k: "规格",
          v: [
            {
              id: 1,
              name: "32GB",
              imgUrl: "../static/e84a2e03-7f19-41d2-98a5-a5c16b7e252d.jpg",
              previewImgUrl: "../static/e84a2e03-7f19-41d2-98a5-a5c16b7e252d.jpg"
            },
            {
              id: 2,
              name: "64GB",
              imgUrl: "../static/e84a2e03-7f19-41d2-98a5-a5c16b7e252d.jpg",
              previewImgUrl: "../static/e84a2e03-7f19-41d2-98a5-a5c16b7e252d.jpg"
            }
          ],
          k_s: "s1"
        }
      ],
      list: [
        {
          s1: 1,
          price: 280000,
          stock_num: 1
        },
        {
          s1: 2,
          price: 320000,
          stock_num: 1
        }
      ],
      price: "2800.00",
      stock_num: 2,
      none_sku: false,
      hide_stock: false
    }
  }
}
```

###4、查询地址

```
GET /address/list
```

参数

```json
无
```

返回

```json
{
  code: 0,
  msg: "成功",
  data: [
    {
      areaCode: "440303",
      id: 21,
      name: "张三",
      tel: "13678787878",
      address: "广东省深圳市罗湖区科技路123号456室"
    }
  ]
}
```

### 5、创建地址

```
POST /address/create
```

参数

```json
{
  name: "张三"
  tel: "13678900987"
  country: ""
  province: "北京市"
  city: "北京市"
  county: "东城区"
  areaCode: "110101"
  postalCode: ""
  addressDetail: "168号306室"
  isDefault: false
}
```

返回

```json
{
    code: 0,
    msg: "成功",
    data: null
}
```

### 6、修改地址

```
PUT /address/update
```

参数

```json
{
  id: 27
  name: "张三"
  tel: "13678900987"
  addressDetail: "168号306室"
  areaCode: "110101"
  province: "北京市"
  city: "北京市"
  county: "东城区"
}
```

返回

```json
{
    code: 0,
    msg: "成功",
    data: null
}
```

###7、创建订单

```
POST /order/create
```

参数

```json
{
  name: "张三"
  tel: "13678787878"
  address: "广东省深圳市罗湖区科技路123号456室"
  specsId: 1
  quantity: 1
}
```

返回

```json
{
  code: 0,
  msg: "成功",
  data: {
      orderId: "1586254006069813075"
  }
}
```

###8、订单详情

```
GET /order/detail
```

参数

```json
orderId: "1586253884545138376"
```

返回

```json
{
  code: 0,
  msg: "成功",
  data: {
    orderId: "1586253884545138376",
    buyerName: "张三",
    phoneName: "Honor 8A",
    payStatus: 0,
    freight: 10,
    tel: "13678787878",
    address: "广东省深圳市罗湖区科技路123号456室",
    num: 1,
    specs: "32GB",
    price: "2800.00",
    icon: "../static/e84a2e03-7f19-41d2-98a5-a5c16b7e252d.jpg",
    amount: 2810
  }
}
```

###9、支付订单

```
PUT /order/pay
```

参数

```json
orderId: "1586253884545138376"
```

返回

```json
{
  code: 0
  msg: "成功"
  data: {
      orderId: "1586253884545138376"
  }
}
```


