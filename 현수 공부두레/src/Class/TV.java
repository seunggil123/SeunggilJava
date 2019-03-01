package Class;

public class TV extends PC {

	private int channel;

	public TV() {
		super();
		channel = 0;
	}

	public void setch(int ch) {
		this.channel = ch;
	}

	public String toString() {
		return "TV의 현재 상태 : 현재 채널: " + this.channel + " 현재 불륨: " + this.volume;
	}

}
