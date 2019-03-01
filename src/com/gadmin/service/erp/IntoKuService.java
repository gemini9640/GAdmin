package com.gadmin.service.erp;

import java.util.List;

import com.gadmin.entity.ERPIntoku;
import com.gadmin.entity.join.GoodsIntoku;


public interface IntoKuService{

	public void save(ERPIntoku intoku);
	
	public void delete(String INTOKU_ID);
	
	public void edit(ERPIntoku intoku);
	
	public List<GoodsIntoku> list(String keywords, String USERNAME, String lastStart, String lastEnd);
	
	/**列表(全部)
	 */
	public List<ERPIntoku> listAll(String USERNAME);
	
	public ERPIntoku findById(String INTOKU_ID);
	
	public void deleteAll(List ids);
	
	/**总金额
	 */
	public Double priceSum(String keywords, String USERNAME, String lastStart, String lastEnd);
}

