package Class;

public class AUDIO extends Machine {

	private double hz = 0;

	public AUDIO() {
		super();
		hz = 0;
	}

	public void setHz(double hz) {
		this.hz = hz;
	}

	public double getHz() {
		return this.hz;
	}

	public String toString() {
		return "���� ä��: " + this.hz + " ���� �ҷ�: " + this.volume;
	}
}
