package com.gadmin.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gadmin.entity.ERPOutku;
import com.gadmin.entity.ERPOutku_temp;
import com.gadmin.entity.summery.OutkuOrder;
import com.gadmin.entity.summery.OutkuSalesReport;

public interface ERPOutkuMapper {
    int save(ERPOutku record);
    
    int saveTemp(ERPOutku_temp temp);
    
    int deleteTempById(@Param("OUTKU_ID")String OUTKU_ID);

    int deleteOldTempByOutDate(@Param("OUTDATE")String OUTDATE);
    
    int editTemp(ERPOutku_temp temp);
    
    ERPOutku findById(@Param("OUTKU_ID")String OUTKU_ID);
    
    ERPOutku_temp findByIdFromTemp(@Param("OUTKU_ID")String OUTKU_ID);
    
    List<ERPOutku> datalistPage(@Param("keywords")String keywords, @Param("USERNAME")String USERNAME, @Param("CUSTOMER_ID")String CUSTOMER_ID, @Param("lastStart")String lastStart, @Param("lastEnd")String lastEnd);
    
    List<ERPOutku> allListByOrderNumber(@Param("ORDER_NUMBERS")String ORDER_NUMBERS);
    
    List<OutkuOrder> orderList(@Param("keywords")String keywords, @Param("USERNAME")String USERNAME, @Param("CUSTOMER_ID")String CUSTOMER_ID, @Param("lastStart")String lastStart, @Param("lastEnd")String lastEnd);
   
    Double priceSum(@Param("keywords")String keywords, @Param("USERNAME")String USERNAME, @Param("onemonth")String onemonth, @Param("days")String days, @Param("lastStart")String lastStart, @Param("lastEnd")String lastEnd);

    Double priceSumTempByOrderNumber(@Param("ORDER_NUMBERS")String ORDER_NUMBERS);
    
    List<ERPOutku_temp> listTempByOrderNumber(@Param("ORDER_NUMBERS")String ORDER_NUMBERS);
    
    List<ERPOutku> listAllByUsername(@Param("USERNAME")String USERNAME);
    
    List<OutkuSalesReport> salesReportlist(@Param("keywords")String keywords, @Param("USERNAME")String USERNAME, @Param("forderby")String forderby, @Param("days")String days, @Param("lastStart")String lastStart, @Param("lastEnd")String lastEnd);
    
    int deleteAllByIds(List ids);
}