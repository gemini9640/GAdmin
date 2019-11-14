package test;

import java.util.ArrayList;
import java.util.List;

import org.apache.shiro.crypto.hash.SimpleHash;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gadmin.dao.CPGoodsMapper;
import com.gadmin.dao.CPSPBrandMapper;
import com.gadmin.dao.SYSUserMapper;
import com.gadmin.entity.CPGoods;
import com.gadmin.entity.SYSUser;
import com.gadmin.entity.join.GoodDetails;
import com.gadmin.entity.join.UserAndRole;
import com.gadmin.util.DateUtil;
import com.gadmin.util.UuidUtil;



public class TestMapper extends TestBase{
	private static CPSPBrandMapper cPSPBrandMapper;
	private static SYSUserMapper sYSUserMapper;
	private static CPGoodsMapper cpGoodsMapper;
	
	public static void main(String[] args) {
		try {
//			cPSPBrandMapper = (CPSPBrandMapper) ctx.getBean("cPSPBrandMapper");
//			sYSUserMapper = (SYSUserMapper) ctx.getBean("SYSUserMapper");
			cpGoodsMapper = (CPGoodsMapper) ctx.getBean("CPGoodsMapper");
			
			
			
//			testSYSUserMapper();
			testCPGoodsMapper();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.exit(0);
		}
	}
	
	public static void testCPGoodsMapper() {
		CPGoods goods = new CPGoods(UuidUtil.get32UUID(), "盐焗鸡", "22004", "80c376c418014643aa1a77e2462ce704", "a129234a7c584cedbc90f2917f3c9b9c", "87e8777c1b514085a09e0f3438151b24", "盐焗鸡", "盐焗鸡", "a1", 100);
//		System.out.println(cpGoodsMapper.save(goods));
//		System.out.println(cpGoodsMapper.deleteById("9e393b34d4054067a16955108f3c43ad"));
//		System.out.println(cpGoodsMapper.findDetailsById("284e2238d7fc4bd481c6324fc4c160cf"));
//		List list = cpGoodsMapper.dataListPage("发", "a1", "", "", "");
//		List list = cpGoodsMapper.listAllByUsername("a1");
//		List list = cpGoodsMapper.listByUsernameAndBianma("a1", "FHD22003");
//		for (Object object : list) {
//			GoodDetails goodDetails = (GoodDetails) object;
//			System.out.println(goodDetails);
//		}
//		System.out.println(cpGoodsMapper.addInstockById("284e2238d7fc4bd481c6324fc4c160cf", 100));
	}
	
	public static void testSYSUserMapper() {
		//test
		String USERNAME = "admin";
		String PASSWORD = "1";
		String passwd = new SimpleHash("SHA-1", USERNAME, PASSWORD).toString();
//		System.out.println(sYSUserMapper.getUserInfo("1",USERNAME, passwd));
//		System.out.println(sYSUserMapper.updateLastLogin("1", DateUtil.getTime()));
//		System.out.println(sYSUserMapper.saveSkin("skin1", USERNAME));
//		System.out.println(sYSUserMapper.getUserAndRoleById("1"));
//		System.out.println(sYSUserMapper.findByUsername(USERNAME));
//		System.out.println(sYSUserMapper.saveIP(USERNAME, "0.0.0.0"));
//		List userIds = sYSUserMapper.listAllUserByRoldId("68f8e4a39efe47c7bb869e9d15ab925d");
//		for (Object object : userIds) {
//			System.out.println(object);
//		}
//		List list = sYSUserMapper.userlistPage("a", "68f8e4a39efe47c7bb869e9d15ab925d", "", "");
//		for (Object object : list) {
//			UserAndRole userAndRole = (UserAndRole) object;
//			System.out.println(userAndRole);
//			System.out.println();
//		}
//		List list = sYSUserMapper.findByUserEmail("55555@qq.com", USERNAME);
//		for (Object object : list) {
//			SYSUser sysUser = (SYSUser) object;
//			System.out.println(sysUser);
//			System.out.println();
//		}
//		List list = sYSUserMapper.findByUserNumber("1002", USERNAME);
//		for (Object object : list) {
//			SYSUser sysUser = (SYSUser) object;
//			System.out.println(sysUser);
//			System.out.println();
//		}
//		System.out.println(sYSUserMapper.findById("1"));
//		SYSUser sysUser = new SYSUser("2","admin1","de41b7fb99201d8334c23c014db35ecd92df81bc","管理员","1133671055321055258374707980945218933803269864762743594642571294","1","","","0","admin1","no-skin","","002","18999999999");
//		System.out.println(sYSUserMapper.saveUser(sysUser));
//		sysUser.setPHONE("12333333333");
//		System.out.println(sYSUserMapper.editUser(sysUser));
//		System.out.println(sYSUserMapper.deleteById("2"));
//		List list = sYSUserMapper.listAllUser("a", "", "", "");
//		for (Object object : list) {
//			UserAndRole userAndRole = (UserAndRole) object;
//			System.out.println(userAndRole);
//			System.out.println();
//		}
//		System.out.println(sYSUserMapper.getUserCount());
	}
}
