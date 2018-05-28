package com.nhsoft.luckygold.util;

import com.nhsoft.luckygold.bean.Item;
import com.nhsoft.luckygold.request.RequestData;
import org.springframework.beans.BeanUtils;

public class CopyUtil {


    public static RequestData copyProperties(Item item, RequestData requestData){
        BeanUtils.copyProperties(item, requestData);

        if (item.getRetail_price() != null) {
            String retailPrice = String.valueOf(item.getRetail_price());
            String[] split = retailPrice.split("\\.");
            requestData.setRetail_price_inter(split[0]);
            if(split.length > 1){
                requestData.setRetail_price_decimal(split[1]);
            }
        }

        if (item.getVip_price() != null) {
            String vipPrice = String.valueOf(item.getVip_price());
            String[] split = vipPrice.split("\\.");
            requestData.setVip_price_inter(split[0]);
            if(split.length > 1){
                requestData.setVip_price_decimal(split[1]);
            }
        }

        if(item.getPromo_retail_price() != null){
            String promoPrice = String.valueOf(item.getPromo_retail_price());
            String[] split = promoPrice.split("\\.");
            requestData.setPromo_retail_price_inter(split[0]);
            if(split.length > 1){
                requestData.setPromo_retail_price_decimal(split[1]);
            }
        }

        if(item.getSuggested_retail_price() != null){
            String suggestedPrice = String.valueOf(item.getSuggested_retail_price());
            String[] split = suggestedPrice.split("\\.");
            requestData.setSuggested_retail_price_inter(split[0]);
            if(split.length > 1){
                requestData.setSuggested_retail_price_decimal(split[1]);
            }
        }
        if(item.getAmount() != null){
            requestData.setAmount(String.valueOf(item.getAmount()));
        }
        if(item.getItem_status()){
            requestData.setItem_status("True");
        }else{
            requestData.setItem_status("False");
        }
        return requestData;
    }
}
