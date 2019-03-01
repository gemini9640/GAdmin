package com.gadmin.service.erp.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gadmin.dao.ERPIntokuMapper;
import com.gadmin.entity.ERPIntoku;
import com.gadmin.entity.join.GoodsIntoku;


@Service("intokuService")
public class IntoKuServiceImpl {

	@Autowired
	private ERPIntokuMapper erpIntokuMapper;
	
	public void save(ERPIntoku intoku) {
		erpIntokuMapper.save(intoku);
	}
	
	public void delete(String INTOKU_ID) {
		erpIntokuMapper.deleteById(INTOKU_ID);
	}
	
	public void edit(ERPIntoku intoku) {
		erpIntokuMapper.edit(intoku);
	}
	
	public List<GoodsIntoku> list(String keywords, String USERNAME, String lastStart, String lastEnd) {
		return erpIntokuMapper.dataListPage(keywords, USERNAME, lastStart, lastEnd);
	}
	
	/**列表(全部)
	 */
	public List<ERPIntoku> listAll(String USERNAME) {
		return erpIntokuMapper.listAllByUsername(USERNAME);
	}
	
	public ERPIntoku findById(String INTOKU_ID) {
		return erpIntokuMapper.findById(INTOKU_ID);
	}
	
	public void deleteAll(List ids) {
		erpIntokuMapper.deleteAllByIds(ids);
	}
	
	/**总金额
	 */
	public Double priceSum(String keywords, String USERNAME, String lastStart, String lastEnd)   {
		return erpIntokuMapper.priceSum(keywords, USERNAME, lastStart, lastEnd);
	}
}

