package com.gadmin.service.erp;

import java.util.List;

import com.gadmin.entity.CPSPType;

public interface SptypeService{

	public void save(CPSPType cpspType);
	
	public void delete(String SPTYPE_ID);
	
	public void edit(CPSPType cpspType);
	
	public List<CPSPType> list(String keywords, String USERNAME);
	
	/**列表(全部)
	 */
	public List<CPSPType> listAll(String USERNAME);
	
	public CPSPType findById(String SPTYPE_ID);
	
	public void deleteAll(List ids);
	
}

