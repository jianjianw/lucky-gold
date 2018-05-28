package com.nhsoft.luckygold.request;

import java.io.Serializable;

/**
 * 要发送给LG的数据
 * */
public class RequestData implements Serializable {
    private static final long serialVersionUID = -2046988400648648039L;

    private String name;                     //商品名称
    private String shortname;               //商品名称  简称
    private String barcode;                 //商品条形码
    private String shop_barcode;            //商品店内条形码
    private String grade;                   //登记
    private String unit;                    //单位
    private String category_name;          //分类名称
    private String origin;                  //产地
    private String spec;                    //规格
    private String shelf_life;              //保质期
    private String amount;                  //库存数量
    private String item_status;             //商品状态
    private String production_date;        //生产日期   yyyy-MM-dd HH:mm:ss
    private String expiry_date;             //过期日期
    private String discount_type;           //折扣类型
    private String discount_start_time;     //折扣开始时间
    private String discount_end_time;       //折扣结束时间
    private String retail_price_inter;      //零售价整数
    private String retail_price_decimal;    //零售价小数
    private String vip_price_inter;          //会员价整数
    private String vip_price_decimal;        //会员价小数
    private String promo_retail_price_inter;         //促销价整数
    private String promo_retail_price_decimal;       //促销价小数
    private String suggested_retail_price_inter;      //建议零售价整数
    private String suggested_retail_price_decimal;    //建议零售价小数
    private String print_date;                          //打印日期      yyyy-MM-dd
    private String print_time;                          //打印时间      HH:mm:ss
    private String created_time;                        //创建时间      yyyy-MM-dd HH:mm:ss
    private String updated_time;                        //更新时间      yyyy-MM-dd HH:mm:ss
    private String item_serial_id;                      //接入erp系统的商品id
    private String extend_field1;                       //扩展保留字段1
    private String extend_field2;                       //扩展保留字段2

    public RequestData() {
        this.name = "";
        this.shortname = "";
        this.barcode = "";
        this.shop_barcode = "";
        this.grade = "";
        this.unit = "";
        this.category_name = "";
        this.origin = "";
        this.spec = "";
        this.shelf_life = "";
        this.amount = "";
        this.item_status = "";
        this.production_date = "";
        this.expiry_date = "";
        this.discount_type = "";
        this.discount_start_time = "";
        this.discount_end_time = "";
        this.retail_price_inter = "";
        this.retail_price_decimal = "";
        this.vip_price_inter = "";
        this.vip_price_decimal = "";
        this.promo_retail_price_inter = "";
        this.promo_retail_price_decimal = "";
        this.suggested_retail_price_inter = "";
        this.suggested_retail_price_decimal = "";
        this.print_date = "";
        this.print_time = "";
        this.created_time = "";
        this.updated_time = "";
        this.item_serial_id = "";
        this.extend_field1 = "";
        this.extend_field2 = "";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShortname() {
        return shortname;
    }

    public void setShortname(String shortname) {
        this.shortname = shortname;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getShop_barcode() {
        return shop_barcode;
    }

    public void setShop_barcode(String shop_barcode) {
        this.shop_barcode = shop_barcode;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getCategory_name() {
        return category_name;
    }

    public void setCategory_name(String category_name) {
        this.category_name = category_name;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec;
    }

    public String getShelf_life() {
        return shelf_life;
    }

    public void setShelf_life(String shelf_life) {
        this.shelf_life = shelf_life;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getItem_status() {
        return item_status;
    }

    public void setItem_status(String item_status) {
        this.item_status = item_status;
    }

    public String getProduction_date() {
        return production_date;
    }

    public void setProduction_date(String production_date) {
        this.production_date = production_date;
    }

    public String getExpiry_date() {
        return expiry_date;
    }

    public void setExpiry_date(String expiry_date) {
        this.expiry_date = expiry_date;
    }

    public String getDiscount_type() {
        return discount_type;
    }

    public void setDiscount_type(String discount_type) {
        this.discount_type = discount_type;
    }

    public String getDiscount_start_time() {
        return discount_start_time;
    }

    public void setDiscount_start_time(String discount_start_time) {
        this.discount_start_time = discount_start_time;
    }

    public String getDiscount_end_time() {
        return discount_end_time;
    }

    public void setDiscount_end_time(String discount_end_time) {
        this.discount_end_time = discount_end_time;
    }

    public String getRetail_price_inter() {
        return retail_price_inter;
    }

    public void setRetail_price_inter(String retail_price_inter) {
        this.retail_price_inter = retail_price_inter;
    }

    public String getRetail_price_decimal() {
        return retail_price_decimal;
    }

    public void setRetail_price_decimal(String retail_price_decimal) {
        this.retail_price_decimal = retail_price_decimal;
    }

    public String getVip_price_inter() {
        return vip_price_inter;
    }

    public void setVip_price_inter(String vip_price_inter) {
        this.vip_price_inter = vip_price_inter;
    }

    public String getVip_price_decimal() {
        return vip_price_decimal;
    }

    public void setVip_price_decimal(String vip_price_decimal) {
        this.vip_price_decimal = vip_price_decimal;
    }

    public String getPromo_retail_price_inter() {
        return promo_retail_price_inter;
    }

    public void setPromo_retail_price_inter(String promo_retail_price_inter) {
        this.promo_retail_price_inter = promo_retail_price_inter;
    }

    public String getPromo_retail_price_decimal() {
        return promo_retail_price_decimal;
    }

    public void setPromo_retail_price_decimal(String promo_retail_price_decimal) {
        this.promo_retail_price_decimal = promo_retail_price_decimal;
    }

    public String getSuggested_retail_price_inter() {
        return suggested_retail_price_inter;
    }

    public void setSuggested_retail_price_inter(String suggested_retail_price_inter) {
        this.suggested_retail_price_inter = suggested_retail_price_inter;
    }

    public String getSuggested_retail_price_decimal() {
        return suggested_retail_price_decimal;
    }

    public void setSuggested_retail_price_decimal(String suggested_retail_price_decimal) {
        this.suggested_retail_price_decimal = suggested_retail_price_decimal;
    }

    public String getPrint_date() {
        return print_date;
    }

    public void setPrint_date(String print_date) {
        this.print_date = print_date;
    }

    public String getPrint_time() {
        return print_time;
    }

    public void setPrint_time(String print_time) {
        this.print_time = print_time;
    }

    public String getCreated_time() {
        return created_time;
    }

    public void setCreated_time(String created_time) {
        this.created_time = created_time;
    }

    public String getUpdated_time() {
        return updated_time;
    }

    public void setUpdated_time(String updated_time) {
        this.updated_time = updated_time;
    }

    public String getItem_serial_id() {
        return item_serial_id;
    }

    public void setItem_serial_id(String item_serial_id) {
        this.item_serial_id = item_serial_id;
    }

    public String getExtend_field1() {
        return extend_field1;
    }

    public void setExtend_field1(String extend_field1) {
        this.extend_field1 = extend_field1;
    }

    public String getExtend_field2() {
        return extend_field2;
    }

    public void setExtend_field2(String extend_field2) {
        this.extend_field2 = extend_field2;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        return sb.append(name+",").append(shortname+",").append(barcode+",").append(shop_barcode+",").append(grade+",").append(unit+",").append(category_name+",").append(origin+",")
                .append(spec+",").append(shelf_life+",").append(amount+",").append(item_status+",").append(production_date+",").append(expiry_date+",").append(discount_type+",").append(discount_start_time+",")
                .append(discount_end_time+",").append(retail_price_inter+",").append(retail_price_decimal+",").append(vip_price_inter+",").append(vip_price_decimal+",").append(promo_retail_price_inter+",")
                .append(promo_retail_price_decimal+",").append(suggested_retail_price_inter+",").append(suggested_retail_price_decimal+",").append(print_date+",").append(print_time+",").append(created_time+",")
                .append(updated_time+",").append(item_serial_id+",").append(extend_field1+",").append(extend_field2).toString();
    }
}
