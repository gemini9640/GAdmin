package com.gadmin.service.erp.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gadmin.dao.CPGoodsMapper;
import com.gadmin.entity.CPGoods;
import com.gadmin.entity.join.GoodDetails;
import com.gadmin.service.erp.GoodsService;

@Service("goodsService")
public class GoodsServiceImpl implements GoodsService {
	
	@Autowired
	private CPGoodsMapper cpGoodsMapper;
	
	public void save(CPGoods goods) {
		cpGoodsMapper.save(goods);
	}
	
	public void deleteById(String GOODS_ID) {
		cpGoodsMapper.deleteById(GOODS_ID);
	}
	
	public void edit(CPGoods goods) {
		cpGoodsMapper.edit(goods);
	}
	
	public void editKuCun(String GOODS_ID, Integer ZCOUNT) {
		cpGoodsMapper.editInstockById(GOODS_ID, ZCOUNT);
	}
	
	public List<GoodDetails> list(String keywords, String USERNAME, String SPBRAND_ID, String SPTYPE_ID, String isInstock) {
		return cpGoodsMapper.dataListPage(keywords, USERNAME, SPBRAND_ID, SPTYPE_ID, isInstock);
	}
	
	public List<GoodDetails> listAll(String USERNAME) {
		return cpGoodsMapper.listAllByUsername(USERNAME);
	}
	
	/**通过产品编码
	 */
	public List<GoodDetails> listByBm(String USERNAME, String BIANMA) {
		return cpGoodsMapper.listByUsernameAndBianma(USERNAME, BIANMA);
	}
 
	public CPGoods findById(String GOODS_ID) {
		return cpGoodsMapper.findById(GOODS_ID);
	}
	
	/**通过id获取数据(查看详细信息)
	 */
	public GoodDetails findByIdToCha(String GOODS_ID) {
		return cpGoodsMapper.findDetailsById(GOODS_ID);
	}
	
	public void deleteAll(List ids) {
		cpGoodsMapper.deleteAllByIds(ids);
	}
	
	/**商品入库，增加库存
	 */
	public void addInstock(String GOODS_ID, Integer addCount) {
		cpGoodsMapper.addInstockById(GOODS_ID, addCount);
	}
}
