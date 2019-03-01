package com.gadmin.service.erp;

import java.util.List;

import com.gadmin.entity.ERPOutku;
import com.gadmin.entity.ERPOutku_temp;
import com.gadmin.entity.summery.OutkuOrder;
import com.gadmin.entity.summery.OutkuSalesReport;
public interface OutKuService{

	public void save(ERPOutku outku);
	
	/**新增到库存临时表
	 */
	public void saveOne(ERPOutku_temp temp);
	
	public void deleteTempById(String OUTKU_ID);
	
	/**删除非今天数据(从出库记录临时表中)
	 */
	public void deleteOldTempByOutDate(String OUTDATE);

	public void editTemp(ERPOutku_temp temp);
	
	public  List<ERPOutku> list(String keywords, String USERNAME, String CUSTOMER_ID, String lastStart, String lastEnd);
	
	/**列表(某一订单号下的出库记录)
	 */
	public  List<ERPOutku> listAllByDingdan(String ORDER_NUMBERS);
	
	/**订单列表
	 */
	public List<OutkuOrder> dingdanList(String keywords, String USERNAME, String CUSTOMER_ID, String lastStart, String lastEnd);
	
	/**商品销售报表
	 */
	public List<OutkuSalesReport> salesReport(String keywords, String USERNAME, String forderby, String days, String lastStart, String lastEnd);
	
	/**列表临时(全部)
	 */
	public List<ERPOutku_temp>  listTemp(String ORDER_NUMBERS);
	
	/**列表(全部)
	 */
	public  List<ERPOutku> listAll(String USERNAME);
	
	/**通过id获取数据
	 */
	public ERPOutku findById(String OUTKU_ID);
	
	/**通过id获取数据(临时表)
	 */
	public ERPOutku_temp findByIdFromTemp(String OUTKU_ID);
	
	public void deleteAll(List ids);
	
	/**总金额
	 */
	public Double priceSum(String keywords, String USERNAME, String onemonth, String days, String lastStart, String lastEnd);
	
	/**临时表总金额
	 */
	public Double priceSumTemp(String ORDER_NUMBERS);
}

