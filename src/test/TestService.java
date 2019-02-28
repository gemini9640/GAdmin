package test;

import java.util.Date;

import com.gadmin.entity.ERPCustomer;
import com.gadmin.service.erp.CustomerService;
import com.gadmin.util.Tools;
import com.gadmin.util.UuidUtil;

public class TestService extends TestBase {

	private static CustomerService customerService;

	public static void main(String[] args) {
		try {
			init();
			customerService = (CustomerService) ctx.getBean("customerService");
//			saveCustomer();
			deleteById();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.exit(0);
		}
	}

	public static void deleteById() {
		customerService.deleteById("b0b2f59fca114beead666bd92376f145");
	}
	
	public static void saveCustomer() {
		ERPCustomer customer = new ERPCustomer();
		customer.setCUSTOMER_ID(UuidUtil.get32UUID());
		customer.setCTIME(Tools.date2Str(new Date()));
		customer.setUSERNAME("a3");
		customerService.save(customer);
	}
}
