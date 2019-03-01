package com.gadmin.service.erp.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gadmin.dao.CPSPBrandMapper;
import com.gadmin.entity.CPSPBrand;
import com.gadmin.service.erp.SpbrandService;

@Service("spbrandService")
public class SpbrandServiceImpl implements SpbrandService{

	@Autowired
	private CPSPBrandMapper cpspBrandMapper;
	
	public void save(CPSPBrand cpspBrand) {
		cpspBrandMapper.save(cpspBrand);
	}
	
	public void delete(String SPBRAND_ID) {
		cpspBrandMapper.deleteById(SPBRAND_ID);
	}
	
	public void edit(CPSPBrand cpspBrand) {
		cpspBrandMapper.edit(cpspBrand);
	}
	
	public List<CPSPBrand> list(String keywords, String USERNAME) {
		return cpspBrandMapper.datalistPage(keywords, USERNAME);
	}
	
	/**列表(全部)
	 */
	public List<CPSPBrand> listAll(String USERNAME) {
		return cpspBrandMapper.listAllByUsername(USERNAME);
	}
	
	public CPSPBrand findById(String SPBRAND_ID) {
		return cpspBrandMapper.findById(SPBRAND_ID);
	}
	
	public void deleteAll(List ids) {
		cpspBrandMapper.deleteAll(ids);
	}
	
}

