package com.nhsoft.luckygold.bean;

import java.io.Serializable;
import java.math.BigDecimal;

public class Item implements Serializable {

    private static final long serialVersionUID = -2032099267484151251L;


    private String name;                     //商品名称
    private String shortname;               //商品名称  简称
    private String barcode;                 //商品条形码
    private String shop_barcode;            //商品店内条形码       店内条形码是短码，客户自己内部的编码
    private String grade;                   //登记
    private String unit;                    //单位
    private String category_name;          //分类名称
    private String origin;                  //产地
    private String spec;                    //规格
    private String shelf_life;              //保质期    yyyy-MM-dd
    private BigDecimal amount;                  //库存数量
    private boolean item_status;             //商品状态   是否在售 //Ture 或 False
    private String production_date;        //生产日期   yyyy-MM-dd
    private String expiry_date;             //过期日期   yyyy-MM-dd
    private String discount_type;           //折扣类型  0为非折扣  1为促销   2为会员
    private String discount_start_time;     //折扣开始时间        yyyy-MM-dd
    private String discount_end_time;       //折扣结束时间        yyyy-MM-dd
    private BigDecimal retail_price;         //零售价
    private BigDecimal vip_price;                //会员价
    private BigDecimal promo_retail_price;      //促销价
    private BigDecimal suggested_retail_price;  //建议零售价
    private String print_date;                          //打印日期      yyyy-MM-dd
    private String print_time;                          //打印时间      HH:mm
    private String created_time;                        //创建时间      yyyy-MM-dd HH:mm
    private String updated_time;                        //更新时间      yyyy-MM-dd HH:mm
    private String item_serial_id;                      //接入erp系统的商品id
    private String extend_field1;                       //扩展保留字段1
    private String extend_field2;                       //扩展保留字段2


    public Item() {
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
        this.amount = BigDecimal.ZERO;
        this.production_date = "";
        this.expiry_date = "";
        this.discount_type = "";
        this.discount_start_time = "";
        this.discount_end_time = "";
        this.retail_price = BigDecimal.ZERO;
        this.vip_price = BigDecimal.ZERO;
        this.promo_retail_price = BigDecimal.ZERO;
        this.suggested_retail_price = BigDecimal.ZERO;
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

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public boolean getItem_status() {
        return item_status;
    }

    public void setItem_status(boolean item_status) {
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

    public BigDecimal getRetail_price() {
        return retail_price;
    }

    public void setRetail_price(BigDecimal retail_price) {
        this.retail_price = retail_price;
    }

    public BigDecimal getVip_price() {
        return vip_price;
    }

    public void setVip_price(BigDecimal vip_price) {
        this.vip_price = vip_price;
    }

    public BigDecimal getPromo_retail_price() {
        return promo_retail_price;
    }

    public void setPromo_retail_price(BigDecimal promo_retail_price) {
        this.promo_retail_price = promo_retail_price;
    }

    public BigDecimal getSuggested_retail_price() {
        return suggested_retail_price;
    }

    public void setSuggested_retail_price(BigDecimal suggested_retail_price) {
        this.suggested_retail_price = suggested_retail_price;
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
}
