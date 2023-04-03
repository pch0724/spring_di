package kr.co.softsoldesk.main;

import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.softsoldesk.beans3.CollectionBean;
import kr.co.softsoldesk.beans3.DataBean;
import kr.co.softsoldesk.beans3.TestBean;



public class MainClass3 {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/co/softsoldesk/config/beans3.xml");
		
		TestBean t1 = ctx.getBean("t1", TestBean.class);
		
		for(int i = 0; i < t1.getList1().size(); i++) {
			System.out.println(t1.getList1().get(i));
		}
		System.out.println("-----------------------------------------------");
		for(int i = 0; i < t1.getList2().size(); i++) {
			System.out.print(t1.getList2().get(i) + ", ");
			System.out.println(t1.getList2().get(i).TYPE);
		}
		System.out.println("-----------------------------------------------");
		for(int i = 0; i < t1.getList3().size(); i++) {
			System.out.println(t1.getList3().get(i));
		}
		
		
		System.out.println("===============================================");
		
		
		for(String str : t1.getSet1()) {
			System.out.print(str + " ");
		}
		
		System.out.println();
		System.out.println("-----------------------------------------------");
		
		for(Integer num : t1.getSet2()) {
			System.out.print(num + " ");
		}
		
		System.out.println();
		System.out.println("-----------------------------------------------");
		
		for(DataBean obj : t1.getSet3()) {
			System.out.println(obj);
		}
		System.out.println("-----------------------------------------------");
		
		Map<String, Object> map1 = t1.getMap1();
		
		String a1 = (String)map1.get("a1");
		System.out.println("a1 : " + a1);
		
		int a2 = (int)(map1.get("a2"));
		System.out.println("a2 : " + a2);
		
		DataBean a3 = (DataBean)map1.get("a3");
		System.out.println("a3 : " + a3);
		
		DataBean a4 = (DataBean)map1.get("a4");
		System.out.println("a4 : " + a4);
		
		List<String> a5 = (List<String>)map1.get("a5");
		for(String str : a5) {
			System.out.println("a5 : " + str);
		}
		System.out.println("===============================================");
		
		Properties prop1 = t1.getProp1();
		String p1 = prop1.getProperty("p1");
		String p2 = prop1.getProperty("p2");
		String p3 = prop1.getProperty("p3");
		
		System.out.println("p1" + p1);
		System.out.println("p2" + p2);
		System.out.println("p3" + p3);
		System.out.println("===============================================");
		
		CollectionBean addr = ctx.getBean("addr", CollectionBean.class);
		List<String> addrList = addr.getAddressList();
		for(String address : addrList) {
			System.out.println("AddressList : " + address);			
		}
		/* 
		 IOC | DI 구분
		 IOC : 생성자 - 프레임워크
		 DI : 
		 */
	}

}
