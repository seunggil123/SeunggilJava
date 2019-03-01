package ½Ç½À12;

public class Television3 {

	boolean on;
	int channel;
	int volume;
	
	public String toString()
	{
		return "TV[ÄÑÁü =" + on + ", Ã¤³Î= " + channel + ", ºÒ·ý= " + volume + "]"; 
	}
	
	public Television3()
	{
		
	}
	public Television3 (boolean on, int channel,int volume) {
		this.on = on;
		this.channel = channel;
		this.volume=volume;
	
	}
	
	public void on(boolean on)
	{
	this.on = true;
		
	}
	public boolean on()
	{
		return on;
	}
	
	public void changeChannel(int channel)
	{
		this.channel = channel;
	}
	
	public int getChannel()
	{
		return channel;
	}
	
	public void changeVolume(int volume)
	{
		this.volume = volume;
	}
	
	public int getVolume()
	{
		return volume;
	}
	
	
}
