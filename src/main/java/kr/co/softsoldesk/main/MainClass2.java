package kr.co.softsoldesk.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.softsoldesk.beans2.LgTV;
import kr.co.softsoldesk.beans2.TV;
import kr.co.softsoldesk.beans2.TestBean;



public class MainClass2 {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/co/softsoldesk/config/beans2.xml");
		
		TestBean t1 = ctx.getBean("t1", TestBean.class);
		
		System.out.println("t1.data1 : " + t1.getData1());
		System.out.println("t1.data1 : " + t1.getData2());
		System.out.println("t1.data1 : " + t1.isData3());
		System.out.println("t1.data1 : " + t1.getData4());
		System.out.println("t1.data1 : " + t1.getData5());
		System.out.println("t1.data1 : " + t1.getData6());
		System.out.println("==============================================================================");
		
		//=============================================================================================================
		TV tv1 = (TV)ctx.getBean("tv");
		// override된 메서드만 사용 가능
		tv1.powerOn();
		tv1.powerOff();
		tv1.volumeUp();
		tv1.volumeDown();
		System.out.println("==============================================================================");
		//=============================================================================================================
		//TV+LGTV : TV와 LGTV 메서드 모두 사용 가능;
		LgTV tv2 = ctx.getBean("tv1", LgTV.class);
		tv2.getPrice();
		tv2.getSpeaker();
		tv2.powerOn();
		tv2.powerOff();
		
		
		ctx.close();
		
	}

}
