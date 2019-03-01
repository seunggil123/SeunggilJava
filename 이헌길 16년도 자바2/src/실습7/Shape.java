package ½Ç½À7;

public abstract class Shape {

	protected int rows;
	protected char ch;
	
	public Shape()
	{
		rows = 0;
		ch = 0;
	}
	
	public Shape(int x, char ch)
	{
		rows = x;
		this.ch = ch;
	}
	public int getRows()
	{
		return rows;
	}
	
	public char getCharacter()
	{
		return ch;
	}
	
	public void setRows(int y)
	{
		rows = y;
	}
	 
	public void setCharacter(char ch)
	{
		this.ch = ch;
	}

	public abstract void draw(int x, int y);




}
