package com.example.springboothello.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.example.springboothello.config.RedisConfigttt;
import com.example.springboothello.entity.SmcSettleBillHeader;
import com.example.springboothello.product.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.math.BigDecimal;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

@Controller
public class RedisController2 {
    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Autowired
    RedisConfigttt redisConfig;

    @RequestMapping("/setSmcStr")
    @ResponseBody
    public String setSmc() {
        SmcSettleBillHeader ssb1 = new SmcSettleBillHeader();
        ssb1.setName("bill_结算单1");
        ssb1.setADouble(2.0897);
        ssb1.setAFloat(3.567F);
        ssb1.setIntValue(100);
        ssb1.setALong(789134L);
        ssb1.setAl(456);
        ssb1.setBdPoint(new BigDecimal(889.34));
        ssb1.setBd(new BigDecimal(1234567890));

        SmcSettleBillHeader ssb2 = new SmcSettleBillHeader();
        ssb2.setName("bill_结算单2");
        ssb2.setADouble(2.08972);
        ssb2.setAFloat(3.5672F);
        ssb2.setIntValue(1002);
        ssb2.setALong(7891342L);
        ssb2.setAl(4562);
        ssb2.setBdPoint(new BigDecimal(889.67));
        ssb2.setBd(new BigDecimal(12345678902L));

        //构造存入redis中的map
        Map<String, SmcSettleBillHeader> settleBillHeaderHashMap = new HashMap<>();
        settleBillHeaderHashMap.put("0001", ssb1);
        settleBillHeaderHashMap.put("0002", ssb2);

        //存入redis
        String tenantCode = "SMC_66_str";
        String jsonStr = JSON.toJSONString(settleBillHeaderHashMap);
        stringRedisTemplate.opsForValue().set(tenantCode,jsonStr,12, TimeUnit.DAYS);
        return jsonStr;
    }

    @RequestMapping("/getSmcStr")
    @ResponseBody
    public String getSmcStr() {
        String tenantCode = "SMC_66_str";
        String result = stringRedisTemplate.opsForValue().get("tenantCode");
       // Map<String, SmcSettleBillHeader> settleBillHeaderHashMap = JSON.parseArray(result,Map.class);
        return "success,,,"+result;
    }

    @RequestMapping("/setProduct")
    @ResponseBody
    public String setProduct() {
        Product prod1 = new Product(1L, 1, new BigDecimal("15.5"), "面包", "零食");
        Product prod2 = new Product(2L, 2, new BigDecimal("20"), "饼干", "零食");
        Product prod3 = new Product(3L, 3, new BigDecimal("30"), "月饼", "零食");
        Product prod4 = new Product(4L, 3, new BigDecimal("10"), "青岛啤酒", "啤酒");
        Product prod5 = new Product(5L, 10, new BigDecimal("15"), "百威啤酒", "啤酒");
        Product prod6 = new Product(6L, 11, new BigDecimal("16"), "百威啤酒", "啤酒");

        List<Product> prodList = new ArrayList<>();
        prodList.add(prod1);
        prodList.add(prod2);
        prodList.add(prod3);
        prodList.add(prod4);
        prodList.add(prod5);
        prodList.add(prod6);
        //Lists.newArrayList(prod1, prod2, prod3, prod4, prod5,prod6);

        Map<String, List<Product>> prodMap = prodList.stream()
                .collect(Collectors.groupingBy(item -> item.getCategory() + "_" + item.getName()));
        //System.out.println(prodMap);
        //System.out.println(JSON.toJSONString(prodMap));
        String jsonStr = JSON.toJSONString(prodMap);
        String productKey = "product123";
        stringRedisTemplate.opsForValue().set(productKey,jsonStr,12, TimeUnit.DAYS);
        return jsonStr;
    }

    @RequestMapping("/getProduct")
    @ResponseBody
    public String getProduct() {
        String productKey = "product123";
        String result = stringRedisTemplate.opsForValue().get(productKey);
        Map<String, List<Product>> prodMap = JSON.parseObject(result,Map.class);
        prodMap.forEach((key,value) -> {
            System.out.println(key+":"+value);
            JSONArray jsonArray = new JSONArray();
            List<Product> products = ((JSONArray)value).toJavaList(Product.class);
            System.out.println(products);
        });
        /*Collection<List<Product>> values = prodMap.values();
        Object[] objects = values.toArray();
        Iterator iterator = values.iterator();
        while(iterator.hasNext()){
            //next():①指针下移 ②将下移以后集合位置上的元素返回
            Object next = iterator.next();
            System.out.println("1111");
        }*/
        return "";
    }

    @RequestMapping("/setProductHash")
    @ResponseBody
    public String setProductHash() {
        Product prod1 = new Product(1L, 1, new BigDecimal("15.5"), "面包", "零食");
        Product prod2 = new Product(2L, 2, new BigDecimal("20"), "饼干", "零食");
        Product prod3 = new Product(3L, 3, new BigDecimal("30"), "月饼", "零食");
        Product prod4 = new Product(4L, 3, new BigDecimal("10"), "青岛啤酒", "啤酒");
        Product prod5 = new Product(5L, 10, new BigDecimal("15"), "百威啤酒", "啤酒");
        Product prod6 = new Product(6L, 11, new BigDecimal("16"), "百威啤酒", "啤酒");

        List<Product> prodList = new ArrayList<>();
        prodList.add(prod1);
        prodList.add(prod2);
        prodList.add(prod3);
        prodList.add(prod4);
        prodList.add(prod5);
        prodList.add(prod6);
        //Lists.newArrayList(prod1, prod2, prod3, prod4, prod5,prod6);

        Map<String, List<Product>> prodMap = prodList.stream()
                .collect(Collectors.groupingBy(item -> item.getCategory() + "_" + item.getName()));
        String key = "phash001";
        redisConfig.getStringRedisTemplate().opsForHash().putAll(key,prodMap);

        //System.out.println(prodMap);
        //System.out.println(JSON.toJSONString(prodMap));
        /*String jsonStr = JSON.toJSONString(prodMap);
        String productKey = "product123";
        stringRedisTemplate.opsForValue().set(productKey,jsonStr,12, TimeUnit.DAYS);*/
        return "jsonStr";
    }
    @RequestMapping("/getProductHash")
    @ResponseBody
    public String getProductHash() {
        String rediskey = "phash001";
        Map<Object, Object> objectObjectMap = redisConfig.getStringRedisTemplate().opsForHash().entries(rediskey);

        return "";
    }
}
