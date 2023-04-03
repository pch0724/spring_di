package kr.co.softsoldesk.beans;

public class SamsungTV implements TV{
	
	private int price;
	private SonySpeaker speaker;
	
	public SamsungTV() {
		System.out.println("==> SamsungTV(1) 객체 생성");
	}
	
	public SamsungTV(SonySpeaker speaker) {
		System.out.println("==> SamsungTV(2) 객체 생성");
		this.speaker = speaker;
	}
	
	public SamsungTV(int price, SonySpeaker speaker) {
		System.out.println("==> SamsungTV(3) 객체 생성");
		this.price = price;
		this.speaker = speaker;
	}

	@Override
	public void powerOn() {
		System.out.println("SamsungTV --- 전원 켜짐");
		System.out.println("가격 : " + price);
	}
	
	@Override
	public void powerOff() {
		System.out.println("SamsungTV --- 전원 꺼짐");		
	}
	
	@Override
	public void volumeUp() {
		speaker.volumeUp();
	}

	@Override
	public void volumeDown() {
		speaker.volumeDown();
	}
	
}
