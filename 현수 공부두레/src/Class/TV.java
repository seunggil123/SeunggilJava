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
		return "TV�� ���� ���� : ���� ä��: " + this.channel + " ���� �ҷ�: " + this.volume;
	}

}
