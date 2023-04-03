package kr.co.softsoldesk.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.softsoldesk.beans.DataBean;
import kr.co.softsoldesk.beans.SamsungTV;
import kr.co.softsoldesk.beans.TV;
import kr.co.softsoldesk.beans.TestBean;
import kr.co.softsoldesk.beans.TestBean1;


public class MainClass {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/co/softsoldesk/config/beans.xml");
		
		//#1
		TestBean t1 = new TestBean();
		t1.printData();
		
		System.out.println("====================================================");
		TestBean obj1 = ctx.getBean("obj1", TestBean.class);
		System.out.println("obj1 : " + obj1 );
		obj1.printData();
		System.out.println("----------------------------------------------------");

		//#2 int
		TestBean t2 = new TestBean(100);
		t2.printData();
		
		System.out.println("====================================================");
		TestBean obj2 = ctx.getBean("obj2", TestBean.class);
		System.out.println("obj2 : " + obj2 );
		obj2.printData();
		System.out.println("----------------------------------------------------");
		
		//#3 double
		TestBean t3 = new TestBean(11.11);
		t3.printData();
		System.out.println("====================================================");
		TestBean obj3 = ctx.getBean("obj3", TestBean.class);
		obj3.printData();
		System.out.println("----------------------------------------------------");

		//#4 String
		TestBean t4 = new TestBean("soldesk");
		t4.printData();
		System.out.println("====================================================");
		TestBean obj4 = ctx.getBean("obj4", TestBean.class);
		obj4.printData();
		System.out.println("----------------------------------------------------");

		//#5 속성 모두 주입
		TestBean t5 = new TestBean(200, 22.22, "software");
		t5.printData();
		System.out.println("====================================================");
		TestBean obj5 = ctx.getBean("obj5", TestBean.class);
		obj5.printData();
		System.out.println("----------------------------------------------------");
		
		// #6 속성 모두 주입시 순서변경
		// 자바에서 불가능
		//TestBean t6 = new TestBean("softsoldesk", 200, 22.22);
		//t6.printData();
		System.out.println("====================================================");
		TestBean obj6 = ctx.getBean("obj6", TestBean.class);
		obj6.printData();
		System.out.println("----------------------------------------------------");
		
		// #7 인덱스 값을 통해 주입
		TestBean obj7 = ctx.getBean("obj7", TestBean.class);
		obj7.printData();
		System.out.println("----------------------------------------------------");

		
		// #8 외부 객체를 속성으로 주입
		TestBean1 obj8 = ctx.getBean("obj8", TestBean1.class);
		obj8.printData();
		System.out.println("----------------------------------------------------");
		
		//Java
		DataBean d1 = new DataBean();
		DataBean d2 = new DataBean();
		TestBean1 t100 = new TestBean1(d1, d2);
		t100.printData();
		System.out.println("----------------------------------------------------");
		
		// #8 외부 객체를 속성으로 주입
		TestBean1 obj9 = ctx.getBean("obj9", TestBean1.class);
		obj9.printData();
		System.out.println("----------------------------------------------------");

		// 활용
		TV tv = (TV)ctx.getBean("tv");
		tv.powerOn();
		tv.powerOff();
		tv.volumeUp();
		tv.volumeDown();

		
		
		ctx.close();
		
	}

}
