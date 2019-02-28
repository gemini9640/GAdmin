package com.gadmin.service.erp;

import java.util.List;

import com.gadmin.entity.CPGoods;
import com.gadmin.entity.join.GoodDetails;

public interface GoodsService {
	public void save(CPGoods goods);
	
	public void deleteById(String GOODS_ID);
	
	public void edit(CPGoods goods);
	
	public void editKuCun(String GOODS_ID, Integer ZCOUNT);
	
	public List<GoodDetails> list(String keywords, String USERNAME, String SPBRAND_ID, String SPTYPE_ID, String isInstock);
	
	public List<GoodDetails> listAll(String USERNAME);
	
	/**通过产品编码
	 */
	public List<GoodDetails> listByBm(String USERNAME, String BIANMA);
 
	public CPGoods findById(String GOODS_ID);
	
	/**通过id获取数据(查看详细信息)
	 */
	public GoodDetails findByIdToCha(String GOODS_ID);
	
	public void deleteAll(List ids);
	
	/**商品入库，增加库存
	 */
	public void addInstock(String GOODS_ID, Integer addCount);
}
