package com.gadmin.service.erp.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gadmin.dao.ERPLevelMapper;
import com.gadmin.entity.ERPLevel;
import com.gadmin.service.erp.LevelService;
@Service("levelService")
public class LevelServiceImpl implements LevelService{

	@Autowired
	private ERPLevelMapper erpLevelMapper;
	
	public void save(ERPLevel level) {
		erpLevelMapper.save(level);
	}
	
	public void delete(String LEVEL_ID) {
		erpLevelMapper.deleteById(LEVEL_ID);
	}
	
	public void edit(ERPLevel level) {
		erpLevelMapper.edit(level);
	}
	
	public List<ERPLevel> list(String keywords, String USERNAME) {
		return erpLevelMapper.dataListPage(keywords, USERNAME);
	}
	
	/**列表(全部)
	 */
	public List<ERPLevel> listAllById(String LEVEL_ID) {
		return erpLevelMapper.listAllById(LEVEL_ID);
	}
	
	public ERPLevel findById(String LEVEL_ID) {
		return erpLevelMapper.findById(LEVEL_ID);
	}
	
	public void deleteAll(List ids) {
		erpLevelMapper.deleteAllByIds(ids);
	}
}

