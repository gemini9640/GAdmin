package com.gadmin.service.erp;

import java.util.List;

import com.gadmin.entity.ERPLevel;
public interface LevelService{
	public void save(ERPLevel level);
	
	public void delete(String LEVEL_ID);
	
	public void edit(ERPLevel level);
	
	public List<ERPLevel> list(String keywords, String USERNAME);
	
	/**列表(全部)
	 */
	public List<ERPLevel> listAllById(String LEVEL_ID);
	
	public ERPLevel findById(String LEVEL_ID);
	
	public void deleteAll(List ids);
}

