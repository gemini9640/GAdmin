package com.gadmin.service.erp;

import java.util.List;

import com.gadmin.entity.CPSPUnit;

public interface SpunitService{

	public void save(CPSPUnit cpspUnit);
	
	public void delete(String SPUNIT_ID);
	
	public void edit(CPSPUnit cpspUnit);
	
	
	public List<CPSPUnit> list(String keywords, String USERNAME);
	
	/**列表(全部)
	 */
	public List<CPSPUnit> listAll(String USERNAME);
	
	public CPSPUnit findById(String SPUNIT_ID);
	
	public void deleteAll(List ids);
}

