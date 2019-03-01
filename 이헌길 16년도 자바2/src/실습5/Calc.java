package ½Ç½À5;

import java.io.FileNotFoundException;

abstract public class Calc {

	public int add(int a, int b)
	{
		return a+b;
	}
	
	public int substract(int a, int b)
	{
		return a-b;
		
	}
	
	public abstract int file_add(String file_name) throws FileNotFoundException;
	
	public abstract void file_list(String file_name) throws FileNotFoundException;
}
