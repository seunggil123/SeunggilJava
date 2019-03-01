package ½Ç½À5;

import java.util.Scanner;

public class DirectRemote extends Remote {

	protected int lastChannel;

	public DirectRemote()
	{
		super();
		lastChannel = DEFAULT_CHANNEL;
	}

	public DirectRemote(int ch, int vol, int last)
	{
		super(ch,vol);
		lastChannel = last;
	}

	public void channelUp()
	{
		lastChannel = channel;
		super.channelUp();
	}

	public void channelDown()
	{
		lastChannel = channel;
		super.channelDown();
	}

	public void setChannel(int ch)
	{
		lastChannel = channel;
		channel = ch;
	}

	public void last()
	{
		int temp = channel;
		channel = lastChannel;
		lastChannel = temp;
	}

	public void menu()
	{
		Scanner input = new Scanner(System.in);
		String choice;

		System.out.println("POWER ON");
		display();
		do
		{
			System.out.println("Channel up: +");
			System.out.println("Channel down: -");
			System.out.println("Volume up: ++");
			System.out.println("Volume down: --");
			System.out.println("Last channel: <<");
			System.out.println("Enter channel number: ");
			System.out.println("Power off: o");
			System.out.print("Choose: ");

			choice = input.next();
			if (choice.equals("+"))
				channelUp();
			else if (choice.equals("-"))
				channelDown();
			else if (choice.equals("++"))
				volumeUp();
			else if (choice.equals("--"))
				volumeDown();
			else if (choice.equals("<<"))
				last();
			else if (!choice.equals("o"))
			{
				int ch = getChannel(choice);
				if(ch>=1 && ch <= 200)
					setChannel(ch);
			}
			display();
		} 
		while ( !choice.equals("o") );
		System.out.println("POWER OFF");
	}

	private int getChannel(String ch)
	{
		int number =0;

		for(int i=0; i<ch.length(); i++)
		{
			char digit = ch.charAt(i);
			if(digit>'9' || digit <0)
				return 0;
			number = 10*number + (digit-'0');
		}
		return number;
	}

	public static void main(String[] args)
	{
		DirectRemote remote = new DirectRemote();
		remote.menu();
	}

}





