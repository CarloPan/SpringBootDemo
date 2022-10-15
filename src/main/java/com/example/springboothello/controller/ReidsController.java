package com.example.springboothello.controller;

import com.example.springboothello.entity.PriceRateConfig;
import com.example.springboothello.entity.SmcSettleBillHeader;
import com.example.springboothello.entity.SpecGroup;
import com.example.springboothello.entity.SpecParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class ReidsController {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Autowired
    private RedisTemplate redisTemplate;

    @RequestMapping("/getRedis")
    @ResponseBody
    public String getRedis() {
        String fk1001 = stringRedisTemplate.opsForValue().get("fk1001");
        return fk1001;
    }

    @RequestMapping("/setRedis")
    @ResponseBody
    public String setRedis() {
        stringRedisTemplate.opsForValue().set("fk1001", "2022-10-01 test");
        return "设置成功";
    }

    @RequestMapping("/getRedisTem")
    @ResponseBody
    public String getRedisTem() {
        String fk1001 = stringRedisTemplate.opsForValue().get("fk1002");
        return fk1001;
    }

    @RequestMapping("/setRedisTem")
    @ResponseBody
    public String setRedisTem() {
        stringRedisTemplate.opsForValue().set("fk1002", "2022-10-02 test");
        return "设置成功";
    }

    //设置点位信息
    @RequestMapping("/setRatePC")
    @ResponseBody
    public Map<String, PriceRateConfig> setRatePC() {
        //stringRedisTemplate.opsForValue().set("fk1002","2022-10-02 test");
        PriceRateConfig priceRateConfig = new PriceRateConfig();
        priceRateConfig.setRateName("事业部-10月份点位");
        priceRateConfig.setRetePrice(new BigDecimal(100.9999));
        priceRateConfig.setTenantCode("T2022090801");
        priceRateConfig.setCenterCode("CT000001");
        priceRateConfig.setCustomerCode("CC000001");
        priceRateConfig.setShopCode("S000001");
        priceRateConfig.setMerchantCode("M000001");
        priceRateConfig.setFlag(true);
        String prc1Key = priceRateConfig.getMerchantCode() + "_" + priceRateConfig.getShopCode();

        PriceRateConfig priceRateConfig2 = new PriceRateConfig();
        priceRateConfig2.setRateName("事业部-10月份点位02");
        priceRateConfig2.setRetePrice(new BigDecimal(160.9999));
        priceRateConfig2.setTenantCode("T2022090802");
        priceRateConfig2.setCenterCode("CT000002");
        priceRateConfig2.setCustomerCode("CC000002");
        priceRateConfig2.setShopCode("S000002");
        priceRateConfig2.setMerchantCode("M000002");
        priceRateConfig2.setFlag(true);
        String prc1Key2 = priceRateConfig2.getMerchantCode() + "_" + priceRateConfig2.getShopCode();
        List<PriceRateConfig> priceRateConfigList = new ArrayList<>();
        priceRateConfigList.add(priceRateConfig);
        priceRateConfigList.add(priceRateConfig2);


        //构造存入redis中的map
        Map<String, PriceRateConfig> priceRateConfigMap = new HashMap<>();
        priceRateConfigMap.put(prc1Key, priceRateConfig);
        priceRateConfigMap.put(prc1Key2, priceRateConfig2);

        //存入redis
        String tenantCode = "T00001";
        redisTemplate.opsForHash().putAll(tenantCode, priceRateConfigMap);

        //获取缓存内容
        Map<String, PriceRateConfig> resultMap = redisTemplate.opsForHash().entries(tenantCode);
        return resultMap;
    }

    @RequestMapping("/getRatePC")
    @ResponseBody
    public Map<String, PriceRateConfig> getRatePC() {
        String tenantCode = "T00001";
        Map<String, PriceRateConfig> resultMap = redisTemplate.opsForHash().entries(tenantCode);
        Object price = redisTemplate.opsForHash().get("T00001", "M000002_S000002");
        System.out.println(price.toString());
        return resultMap;
    }

    @RequestMapping("/setSmc")
    @ResponseBody
    public Map<String, SmcSettleBillHeader> setSmc() {
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
        String tenantCode = "SMC_00001";
        redisTemplate.opsForHash().putAll(tenantCode, settleBillHeaderHashMap);
        //获取缓存内容
        Map<String, SmcSettleBillHeader> resultMap = redisTemplate.opsForHash().entries(tenantCode);
        return resultMap;
    }

    @RequestMapping("/getSmc")
    @ResponseBody
    public Map<String, SmcSettleBillHeader> getSmc() {
        String tenantCode = "SMC_00001";
        Map<String, SmcSettleBillHeader> resultMap = redisTemplate.opsForHash().entries(tenantCode);
        Object price = redisTemplate.opsForHash().get(tenantCode, "0001");
        System.out.println(price.toString());
        return resultMap;
    }

    //参数表
    @RequestMapping("/setSpec")
    @ResponseBody
    public Map<String, SpecGroup> setSpec() {
        SpecGroup specGroup = new SpecGroup();
        specGroup.setId(1001);
        specGroup.setName("test001");
        specGroup.setSpgId(100);

        SpecGroup specGroup2 = new SpecGroup();
        specGroup2.setId(1002);
        specGroup2.setName("test002");
        specGroup2.setSpgId(102);

        SpecParam specParam = new SpecParam();
        specParam.setId(1);
        specParam.setName("param001");
        specParam.setSpgId(100);
        specParam.setUnit("个");

        SpecParam specParam2 = new SpecParam();
        specParam2.setId(2);
        specParam2.setName("param002");
        specParam2.setSpgId(100);
        specParam2.setUnit("斤");
        List<SpecParam> specParamList = new ArrayList<>();
        specParamList.add(specParam);
        specParamList.add(specParam2);
        specGroup.setSpecParamList(specParamList);

        Map<String, SpecGroup> settleBillHeaderHashMap = new HashMap<>();
        settleBillHeaderHashMap.put("specG01",specGroup);
        settleBillHeaderHashMap.put("specG02",specGroup2);
        redisTemplate.opsForHash().putAll("Group999", settleBillHeaderHashMap);
        //获取缓存内容
        Map<String, SmcSettleBillHeader> resultMap = redisTemplate.opsForHash().entries("Group999");
        return settleBillHeaderHashMap;
    }

    @RequestMapping("/getSpec")
    @ResponseBody
    public Map<String, SpecGroup> getSpec() {
        String tenantCode = "Group999";
        Map<String, SpecGroup> resultMap = redisTemplate.opsForHash().entries(tenantCode);
        Object price = redisTemplate.opsForHash().get(tenantCode, "specG01");
        System.out.println(price.toString());
        return resultMap;
    }

    @RequestMapping("/setSpec2")
    @ResponseBody
    public Map<String, SpecGroup> setSpec2() {
        SpecGroup specGroup = new SpecGroup();
        specGroup.setId(1001);
        specGroup.setName("test001");
        specGroup.setSpgId(100);

        SpecGroup specGroup2 = new SpecGroup();
        specGroup2.setId(1002);
        specGroup2.setName("test002");
        specGroup2.setSpgId(102);

        SpecParam specParam = new SpecParam();
        specParam.setId(1);
        specParam.setName("param001");
        specParam.setSpgId(100);
        specParam.setUnit("个");

        SpecParam specParam2 = new SpecParam();
        specParam2.setId(2);
        specParam2.setName("param002");
        specParam2.setSpgId(100);
        specParam2.setUnit("斤");
        List<SpecParam> specParamList = new ArrayList<>();
        specParamList.add(specParam);
        specParamList.add(specParam2);
        specGroup.setSpecParamList(specParamList);

        Map<String, SpecGroup> settleBillHeaderHashMap = new HashMap<>();
        settleBillHeaderHashMap.put("specG01",specGroup);
        settleBillHeaderHashMap.put("specG02",specGroup2);
        stringRedisTemplate.opsForHash().putAll("Group8880", settleBillHeaderHashMap);
        //获取缓存内容
        //Map<String, SmcSettleBillHeader> resultMap = stringRedisTemplate.opsForHash().entries("Group8880");
        Map<Object, Object> group8880 = stringRedisTemplate.opsForHash().entries("Group8880");
        return settleBillHeaderHashMap;
    }

    @RequestMapping("/getSpec2")
    @ResponseBody
    public Map<String, SpecGroup> getSpec2() {
        String tenantCode = "Group888";
        Map<String, SpecGroup> resultMap = redisTemplate.opsForHash().entries(tenantCode);
        Object price = redisTemplate.opsForHash().get(tenantCode, "specG01");
        System.out.println(price.toString());
        return resultMap;
    }

    @RequestMapping("/setSpec22")
    @ResponseBody
    public String setSpec22() {
        stringRedisTemplate.opsForValue().set("Group888", "2022-10-01 test");
        return "success,,,";
    }

    @RequestMapping("/getSpec22")
    @ResponseBody
    public String getSpec22() {
        String result = stringRedisTemplate.opsForValue().get("Group888");
        return "success,,,"+result;
    }

    @RequestMapping("/setSpec3")
    @ResponseBody
    public String setSpec3() {
        stringRedisTemplate.opsForValue().set("Group66:T2:N4:U_456:Y00", "2022-10-01 test");
        return "success,,,";
    }

    @RequestMapping("/setSpec4")
    @ResponseBody
    public String setSpec4() {
        stringRedisTemplate.opsForValue().set("Group66:T2:N5:U_457:Y001", "2022-10-01 test");
        return "success,,,";
    }

    @RequestMapping("/setSpec5")
    @ResponseBody
    public String setSpec5() {
        stringRedisTemplate.opsForValue().set("Group67_T2_N5_U_457_Y001", "2022-10-01 test");
        return "success,,,";
    }

}
