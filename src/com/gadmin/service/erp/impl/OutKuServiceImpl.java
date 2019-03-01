package com.gadmin.service.erp.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gadmin.dao.ERPOutkuMapper;
import com.gadmin.entity.ERPOutku;
import com.gadmin.entity.ERPOutku_temp;
import com.gadmin.entity.summery.OutkuOrder;
import com.gadmin.entity.summery.OutkuSalesReport;
import com.gadmin.service.erp.OutKuService;

@Service("outkuService")
public class OutKuServiceImpl implements OutKuService{

	@Autowired
	private ERPOutkuMapper erpOutkuMapper;
	
	public void save(ERPOutku outku) {
		erpOutkuMapper.save(outku);
	}
	
	/**新增到库存临时表
	 */
	public void saveOne(ERPOutku_temp temp) {
		erpOutkuMapper.saveTemp(temp);
	}
	
	public void deleteTempById(String OUTKU_ID) {
		erpOutkuMapper.deleteTempById(OUTKU_ID);
	}
	
	/**删除非今天数据(从出库记录临时表中)
	 */
	public void deleteOldTempByOutDate(String OUTDATE) {
		erpOutkuMapper.deleteOldTempByOutDate(OUTDATE);
	}

	public void editTemp(ERPOutku_temp temp) {
		erpOutkuMapper.editTemp(temp);
	}
	
	public  List<ERPOutku> list(String keywords, String USERNAME, String CUSTOMER_ID, String lastStart, String lastEnd) {
		return erpOutkuMapper.datalistPage(keywords, USERNAME, CUSTOMER_ID, lastStart, lastEnd);
	}
	
	/**列表(某一订单号下的出库记录)
	 */
	public  List<ERPOutku> listAllByDingdan(String ORDER_NUMBERS) {
		return erpOutkuMapper.allListByOrderNumber(ORDER_NUMBERS);
	}
	
	/**订单列表
	 */
	public List<OutkuOrder> dingdanList(String keywords, String USERNAME, String CUSTOMER_ID, String lastStart, String lastEnd) {
		return erpOutkuMapper.orderList(keywords, USERNAME, CUSTOMER_ID, lastStart, lastEnd);
	}
	
	/**商品销售报表
	 */
	public List<OutkuSalesReport> salesReport(String keywords, String USERNAME, String forderby, String days, String lastStart, String lastEnd) {
		return erpOutkuMapper.salesReportlist(keywords, USERNAME, forderby, days, lastStart, lastEnd);
	}
	
	/**列表临时(全部)
	 */
	public List<ERPOutku_temp>  listTemp(String ORDER_NUMBERS) {
		return erpOutkuMapper.listTempByOrderNumber(ORDER_NUMBERS);
	}
	
	/**列表(全部)
	 */
	public  List<ERPOutku> listAll(String USERNAME) {
		return erpOutkuMapper.listAllByUsername(USERNAME);
	}
	
	/**通过id获取数据
	 */
	public ERPOutku findById(String OUTKU_ID) {
		return erpOutkuMapper.findById(OUTKU_ID);
	}
	
	/**通过id获取数据(临时表)
	 */
	public ERPOutku_temp findByIdFromTemp(String OUTKU_ID) {
		return erpOutkuMapper.findByIdFromTemp(OUTKU_ID);
	}
	
	public void deleteAll(List ids) {
		erpOutkuMapper.deleteAllByIds(ids);
	}
	
	/**总金额
	 */
	public Double priceSum(String keywords, String USERNAME, String onemonth, String days, String lastStart, String lastEnd)  {
		return erpOutkuMapper.priceSum(keywords, USERNAME, onemonth, days, lastStart, lastEnd);
	}
	
	/**临时表总金额
	 */
	public Double priceSumTemp(String ORDER_NUMBERS)   {
		return erpOutkuMapper.priceSumTempByOrderNumber(ORDER_NUMBERS);
	}
}

