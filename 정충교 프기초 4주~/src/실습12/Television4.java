package ½Ç½À12;

public class Television4 {

	boolean on;
	int channel;
	int volume;
	
	public void setChannel(int ch)
	{
		this.channel = ch;
	}
	
	public int getChannel()
	{
		return channel;
	}
	
	public void setVolume(int v)
	{
		this.volume = v;
	}
	
	public int getVolume()
	{
		return volume;
	}
	
	public void setOn(boolean o)
	{
		this.on = o;
	}
	
	public boolean isOn()
	{
		if(on=true)
		{
			return true;
		}
		else
			return false;
	}
	
	public String toString()
	{
		return "TV[ÄÑÁü =" + on + ", Ã¤³Î= " + channel + ", ºÒ·ý= " + volume + "]"; 
	}
	
	
}
