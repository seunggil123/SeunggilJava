package Class;

abstract class Machine {

	public boolean power = false;
	public int volume = 0;;

	public void Turn() {
		power = !power;
	}

	public void setVol(int vol) {
		this.volume = vol;
	}

	public int getVolume() {
		return this.volume;
	}

	public boolean getPower() {
		return power;
	}

}
