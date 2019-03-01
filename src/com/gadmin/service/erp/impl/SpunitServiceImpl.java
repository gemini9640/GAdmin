package com.gadmin.service.erp.impl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gadmin.dao.CPSPUnitMapper;
import com.gadmin.entity.CPSPUnit;
import com.gadmin.service.erp.SpunitService;

@Service("spunitService")
public class SpunitServiceImpl implements SpunitService{

	@Autowired
	private CPSPUnitMapper cpspUnitMapper;
	
	public void save(CPSPUnit cpspUnit) {
		cpspUnitMapper.save(cpspUnit);
	}
	
	public void delete(String SPUNIT_ID) {
		cpspUnitMapper.deleteById(SPUNIT_ID);
	}
	
	public void edit(CPSPUnit cpspUnit) {
		cpspUnitMapper.edit(cpspUnit);
	}
	
	
	public List<CPSPUnit> list(String keywords, String USERNAME) {
		return cpspUnitMapper.datalistPage(keywords, USERNAME);
	}
	
	/**列表(全部)
	 */
	public List<CPSPUnit> listAll(String USERNAME) {
		return cpspUnitMapper.listAllByUsername(USERNAME);
	}
	
	public CPSPUnit findById(String SPUNIT_ID) {
		return cpspUnitMapper.findById(SPUNIT_ID);
	}
	
	public void deleteAll(List ids) {
		cpspUnitMapper.deleteAll(ids);
	}
	
}

