package kr.co.softsoldesk.beans3;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class TestBean {
	// 중복이 허용되는 list
	private List<String> list1; // 문자열
	private List<Integer> list2; // 정수
	private List<DataBean> list3; // DataBean
	
	// 중복된 값을 넣지 못하는 Set
	private Set<String> set1; // 문자열
	private Set<Integer> set2; // 정수
	private Set<DataBean> set3; // DataBean
	
	private Map<String, Object> map1;
	// 문자열만 사용 가능
	private Properties prop1;
	
	//================================================================
	public List<String> getList1() {
		return list1;
	}
	public void setList1(List<String> list1) {
		this.list1 = list1;
	}
	public List<Integer> getList2() {
		return list2;
	}
	public void setList2(List<Integer> list2) {
		this.list2 = list2;
	}
	public List<DataBean> getList3() {
		return list3;
	}
	public void setList3(List<DataBean> list3) {
		this.list3 = list3;
	}
	public Set<String> getSet1() {
		return set1;
	}
	public void setSet1(Set<String> set1) {
		this.set1 = set1;
	}
	public Set<Integer> getSet2() {
		return set2;
	}
	public void setSet2(Set<Integer> set2) {
		this.set2 = set2;
	}
	public Set<DataBean> getSet3() {
		return set3;
	}
	public void setSet3(Set<DataBean> set3) {
		this.set3 = set3;
	}
	public Map<String, Object> getMap1() {
		return map1;
	}
	public void setMap1(Map<String, Object> map1) {
		this.map1 = map1;
	}
	public Properties getProp1() {
		return prop1;
	}
	public void setProp1(Properties prop1) {
		this.prop1 = prop1;
	}
	
	
}
