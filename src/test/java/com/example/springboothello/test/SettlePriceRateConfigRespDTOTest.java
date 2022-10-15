package com.example.springboothello.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

    public class SettlePriceRateConfigRespDTOTest {
        public static void main(String[] args) {
            /**
             tenantCode  T20201223044726   T20201223044723  T20201223044745 T20201223044724
             merchantCode E0108107 E0106103  E0103502
             shopCode
             distributeShopCode
             priceType
             */


            SettlePriceRateConfigRespDTO srr = new SettlePriceRateConfigRespDTO();
            srr.setTenantCode("T20201223044721");
            srr.setMerchantCode("M0108101");
            srr.setShopCode("S2021121500011");
            srr.setDistributeShopCode("DS2020113000021");
            srr.setPriceType("1");
            SettlePriceRateConfigRespDTO srr2 = new SettlePriceRateConfigRespDTO();
            srr2.setTenantCode("T20201223044721");
            srr2.setMerchantCode("M01081011");
            srr2.setShopCode("S2021121500011");
            srr2.setDistributeShopCode("DS2020113000022");
            srr2.setPriceType("2");

            SettlePriceRateConfigRespDTO srr3 = new SettlePriceRateConfigRespDTO();
            srr3.setTenantCode("T20201223044721");
            srr3.setMerchantCode("M0108103");
            srr3.setShopCode("S2021121500013");
            srr3.setDistributeShopCode("DS2020113000023");
            srr3.setPriceType("3");
            SettlePriceRateConfigRespDTO srr4 = new SettlePriceRateConfigRespDTO();
            srr4.setTenantCode("T20201223044721");
            srr4.setMerchantCode("M0108103");
            srr4.setShopCode("S2021121500013");
            srr4.setDistributeShopCode("DS2020113000024");
            srr4.setPriceType("4");

            SettlePriceRateConfigRespDTO srr5 = new SettlePriceRateConfigRespDTO();
            srr5.setTenantCode("T20201223044721");
            srr5.setMerchantCode("M0108105");
            srr5.setShopCode("S2021121500015");
            srr5.setDistributeShopCode("DS2020113000025");
            srr5.setPriceType("5");

            SettlePriceRateConfigRespDTO srr6 = new SettlePriceRateConfigRespDTO();
            srr6.setTenantCode("T20201223044721");
            srr6.setMerchantCode("M0108105");
            srr6.setShopCode("S2021121500016");
            srr6.setDistributeShopCode("DS2020113000025");
            srr6.setPriceType("6");

            List<SettlePriceRateConfigRespDTO> list = new ArrayList();
            list.add(srr);
            list.add(srr2);
            list.add(srr3);
            list.add(srr4);
            list.add(srr5);
            list.add(srr6);

            //list 需要转为map key: 商户merchant+店铺shop , 数据详细列表

}

    }
