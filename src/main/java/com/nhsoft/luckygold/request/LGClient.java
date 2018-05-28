package com.nhsoft.luckygold.request;


import com.csvreader.CsvWriter;
import com.nhsoft.luckygold.bean.Item;
import com.nhsoft.luckygold.util.AppConstants;
import com.nhsoft.luckygold.util.CopyUtil;
import com.nhsoft.luckygold.util.HttpUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.*;

public class LGClient {

    private static final Logger logger = LoggerFactory.getLogger(LGClient.class);//引入到别的系统中，所以不需要实现

    /*public static void main(String[] args) {
        Item item = new Item();
        item.setName("name");
        item.setShortname("shortName");
        item.setBarcode("12345qweqwe");
        item.setShop_barcode("qwe");
        item.setGrade("登记");
        item.setUnit("单位");
        item.setCategory_name("分类");
        item.setOrigin("来源");
        item.setSpec("规格");
        item.setShelf_life("2018-05-24");
        item.setAmount(BigDecimal.valueOf(1000));
        item.setItem_status(true);
        item.setProduction_date("2018-05-24");
        item.setExpiry_date("2018-05-24");
        item.setDiscount_type("折扣");
        item.setDiscount_start_time("2018-05-24");
        item.setDiscount_end_time("2018-05-24");
        item.setRetail_price(BigDecimal.valueOf(100.001));
        item.setVip_price(BigDecimal.valueOf(100.002));
        item.setPromo_retail_price(BigDecimal.valueOf(100.003));
        item.setSuggested_retail_price(BigDecimal.valueOf(100.004));
        item.setPrint_date("2018-05-24");
        item.setPrint_time("12:12");
        item.setCreated_time("2018-05-24 12:12");
        item.setUpdated_time("2018-05-24 12:12");
        item.setItem_serial_id("99586258");
        item.setExtend_field1("");
        item.setExtend_field2("");

       // ResultData resultData = addItem(item);
        ResultData resultData = updateItem(item);
        String result = resultData.getResult();
        System.out.println(result);

    }*/


    public static void main(String[] args) {
      /*  List<RequestData> list  = new ArrayList<>();

        RequestData item = new RequestData();
        item.setName("name");
        item.setShortname("shortName");
        item.setBarcode("12345qweqwe");
        item.setShop_barcode("qwe");
        item.setGrade("登记");
        item.setUnit("单位");
        item.setCategory_name("分类");
        item.setOrigin("来源");
        item.setSpec("规格");
        item.setShelf_life("2018-05-24");
        item.setAmount(BigDecimal.valueOf(1000));
        item.setItem_status(true);
        item.setProduction_date("2018-05-24");
        item.setExpiry_date("2018-05-24");
        item.setDiscount_type("折扣");
        item.setDiscount_start_time("2018-05-24");
        item.setDiscount_end_time("2018-05-24");
        item.setRetail_price(BigDecimal.valueOf(100.001));
        item.setVip_price(BigDecimal.valueOf(100.002));
        item.setPromo_retail_price(BigDecimal.valueOf(100.003));
        item.setSuggested_retail_price(BigDecimal.valueOf(100.004));
        item.setPrint_date("2018-05-24");
        item.setPrint_time("12:12");
        item.setCreated_time("2018-05-24 12:12");
        item.setUpdated_time("2018-05-24 12:12");
        item.setItem_serial_id("99586258");
        item.setExtend_field1("");
        item.setExtend_field2("");
        importCSV();*/
    }
    public static void importCSV(List<RequestData> list){

        try {
            //创建文件夹
            File file = new File("c://ESL Service//eslFTP_HOME//Import//");
            file.mkdirs();

            Calendar instance = Calendar.getInstance();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
            String format = sdf.format(instance.getTime());
            StringBuilder sb = new StringBuilder();
            sb.append("c://ESL Service//eslFTP_HOME//Import//import_").append(format).append(".csv");
            String csvFilePath = sb.toString();
            CsvWriter wr =new CsvWriter(csvFilePath,',', Charset.forName("UTF-8"));
            String[] header = {"name","shortname","barcode","shop_barcode","grade","unit","category_name","origin","spec","shelf_life","amount",
                    "item_status","production_date","expiry_date","discount_type","discount_start_time","discount_end_time","retail_price_inter",
                    "retail_price_decimal","vip_price_inter","vip_price_decimal","promo_retail_price_inter","promo_retail_price_decimal",
                    "suggested_retail_price_inter","suggested_retail_price_decimal","print_date","print_time","created_time","updated_time",
                    "item_serial_id","extend_field1","extend_field2"
            };
            wr.writeRecord(header);//写入文件头

            //写入文件内容
            for(int i=0;i<list.size();i++)
            {
                RequestData requestData = list.get(i);
                String s = requestData.toString();
                String[] split = s.split(",");
                System.out.println(s);
                wr.writeRecord(split);//写一次就是一行
            }
            wr.close();
        } catch (IOException e) {
           logger.info("写入文件失败");
        }


    }


    public static ResultData addItem(Item item){
        if(item == null){
            return new ResultData(AppConstants.ITEM_IS_NULL);
        }
        String url = "http://127.0.0.1:8080/esl/merchandise/add";
        RequestData requestData = new RequestData();
        RequestData data = CopyUtil.copyProperties(item, requestData);
        Map<String,Object> map = new HashMap<>();
        map.put("new",data);
        ResultData resultData = null;
        try {
            resultData = HttpUtil.sendPost(url, map);
        } catch (Exception e) {
            return new ResultData(AppConstants.ITEM_ADD_FAIL);
        }
        return resultData;

    }

    public static ResultData updateItem(Item item){
        if(item == null){
            return new ResultData(AppConstants.ITEM_IS_NULL);
        }
        String url = "http://127.0.0.1:8080/esl/merchandise/edit";
        RequestData requestData = new RequestData();
        RequestData data = CopyUtil.copyProperties(item, requestData);
        Map<String,Object> map = new HashMap<>();
        map.put("key",data.getBarcode());
        map.put("change",data);
        ResultData resultData = null;
        try {
            resultData = HttpUtil.sendPost(url, map);
        } catch (Exception e) {
            return new ResultData(AppConstants.ITEM_ADD_FAIL);
        }
        return resultData;
    }





}
