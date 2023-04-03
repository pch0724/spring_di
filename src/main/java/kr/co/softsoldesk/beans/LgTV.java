package kr.co.softsoldesk.beans;

public class LgTV implements TV{

	private int price;
	private AppleSpeaker speaker;

	public LgTV() {
		System.out.println("===> LG TV 객체 생성");
		
	}
		
	public LgTV(int price, AppleSpeaker speaker) {
		this.price = price;
		this.speaker = speaker;
	}

	@Override
	public void powerOn() {
		System.out.println("LG TV === PowerOn");
		System.out.println("LG TV 가격 : " + price);
		
	}

	@Override
	public void powerOff() {
		System.out.println("LG TV === PowerOff");
		
	}

	@Override
	public void volumeUp() {
		speaker.volumeUp();
	}

	@Override
	public void volumeDown() {
		speaker.volumeDown();
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public AppleSpeaker getSpeaker() {
		return speaker;
	}

	public void setSpeaker(AppleSpeaker speaker) {
		this.speaker = speaker;
	}
	
}
