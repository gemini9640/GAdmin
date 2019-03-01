package com.gadmin.service.erp;

import java.util.List;

import com.gadmin.entity.CPSPBrand;

public interface SpbrandService{

	public void save(CPSPBrand cpspBrand);
	
	public void delete(String SPBRAND_ID);
	
	public void edit(CPSPBrand cpspBrand);
	
	public List<CPSPBrand> list(String keywords, String USERNAME);
	
	/**列表(全部)
	 */
	public List<CPSPBrand> listAll(String USERNAME);
	
	public CPSPBrand findById(String SPBRAND_ID);
	
	public void deleteAll(List ids);
}

