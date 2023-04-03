package kr.co.softsoldesk.beans;

public class TestBean1 {
	
	private DataBean data1;
	private DataBean data2;
	
	//setter 개념
	public TestBean1(DataBean data1, DataBean data2) {
		super();
		this.data1 = data1;
		this.data2 = data2;
	}
	
	//getter 개념
	public void printData() {
		System.out.println("data1 : " + data1);
		System.out.println("data2 : " + data2);
	}
}
