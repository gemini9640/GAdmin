package com.gadmin.service.erp.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gadmin.dao.ERPRemarksMapper;
import com.gadmin.entity.ERPRemarks;
import com.gadmin.service.erp.RemarksService;

@Service("remarksService")
public class RemarksServiceImpl implements RemarksService{

	@Autowired
	private ERPRemarksMapper erpRemarksMapper;
	
	public void save(ERPRemarks erpRemarks) {
		erpRemarksMapper.save(erpRemarks);
	}
	
	public void delete(String REMARKS_ID) {
		erpRemarksMapper.deleteById(REMARKS_ID);
	}
	
	public void edit(ERPRemarks erpRemarks) {
		erpRemarksMapper.edit(erpRemarks);
	}
	
	public List<ERPRemarks> list(String keywords, String USERNAME) {
		return erpRemarksMapper.datalistPage(keywords, USERNAME);
	}
	
	/**列表(全部)
	 */
	public List<ERPRemarks> listAll(String USERNAME) {
		return erpRemarksMapper.listAllByUsername(USERNAME);
	}
	
	public ERPRemarks findById(String REMARKS_ID) {
		return erpRemarksMapper.findById(REMARKS_ID);
	}
	
	public void deleteAll(List ids) {
		erpRemarksMapper.deleteAllByIds(ids);
	}
	
}

