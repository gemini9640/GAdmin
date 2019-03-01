package com.gadmin.service.erp.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gadmin.dao.CPSPTypeMapper;
import com.gadmin.entity.CPSPType;
import com.gadmin.service.erp.SptypeService;
@Service("sptypeService")
public class SptypeServiceImpl implements SptypeService{

	@Autowired
	private CPSPTypeMapper cpspTypeMapper;
	
	public void save(CPSPType cpspType) {
		cpspTypeMapper.save(cpspType);
	}
	
	public void delete(String SPTYPE_ID) {
		cpspTypeMapper.deleteById(SPTYPE_ID);
	}
	
	public void edit(CPSPType cpspType) {
		cpspTypeMapper.edit(cpspType);
	}
	
	public List<CPSPType> list(String keywords, String USERNAME) {
		return cpspTypeMapper.datalistPage(keywords, USERNAME);
	}
	
	/**列表(全部)
	 */
	public List<CPSPType> listAll(String USERNAME) {
		return cpspTypeMapper.listAllByUsername(USERNAME);
	}
	
	public CPSPType findById(String SPTYPE_ID) {
		return cpspTypeMapper.findById(SPTYPE_ID);
	}
	
	public void deleteAll(List ids) {
		cpspTypeMapper.deleteAll(ids);
	}
	
}

