package com.gadmin.service.erp;

import java.util.List;

import com.gadmin.entity.ERPRemarks;
public interface RemarksService{

	public void save(ERPRemarks erpRemarks);
	
	public void delete(String REMARKS_ID);
	
	public void edit(ERPRemarks erpRemarks);
	
	public List<ERPRemarks> list(String keywords, String USERNAME);
	
	/**列表(全部)
	 */
	public List<ERPRemarks> listAll(String USERNAME);
	
	public ERPRemarks findById(String REMARKS_ID);
	
	public void deleteAll(List ids);
}

