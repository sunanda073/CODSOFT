//ATM Interface

import java.io.*;
class userAccount
{
	int pin = 2713;
	float balance = 1500.15f;
}

class atmMachine extends userAccount
{
	int p, x;
    float a;
	
	atmMachine()
	{
		try
		{
			DataInputStream ds = new DataInputStream(System.in);
			System.out.println("\nEnter Your PIN : ");
			p = Integer.parseInt(ds.readLine());
		
			if(p == pin)
			{
				option();		
			}
			else
			{
				System.out.println("\nINVALID PIN\n");
			}
		}
		catch(IOException e){}
	}
	
	void option()
	{

		System.out.println("1 : Withdraw");
		System.out.println("2 : Deposit");
		System.out.println("3 : Check Balance");
		System.out.println("4 : Exit");
	
		try
		{
			DataInputStream ds = new DataInputStream(System.in);
			System.out.println("Enter Your choice : ");
			x = Integer.parseInt(ds.readLine());
		}
		catch(IOException e){}


		switch(x)
		{
			case 1: withdraw();
					break;

			case 2: deposit();
					break;

			case 3: checkBalance();
					break;	

			case 4: System.out.println("\nThank you visit again.\n");
					break;

			default: System.out.println("\nEnter a Valid Choice\n");
					 option();
		}
	}
			
	void checkBalance()
	{
		System.out.println("\nYour Balance is : "+ balance+"\n");
		option();
	}

	void withdraw()
	{
		System.out.println("Enter amount : ");
		try
		{
			DataInputStream ds = new DataInputStream(System.in);
			a = Integer.parseInt(ds.readLine());
		}
		catch(IOException e){}

		if(a > balance)
		{
			System.out.println("\nInsufficient Balance\n");
		}
		else
		{
			balance-=a;
			System.out.println("\nMoney Withdrawn successfully\n");
		}

		option();
				
	}

	void deposit()
	{
		
		System.out.println("Enter amount : ");
		try
		{
			DataInputStream ds = new DataInputStream(System.in);
			a = Integer.parseInt(ds.readLine());
		}
		catch(IOException e){}
		
		balance += a;
		System.out.println("\nMoney deposited successfully\n");

		option();
		
	}
		
}

class ATM
{
	public static void main(String args[]) throws IOException
	{
		atmMachine obj = new atmMachine();		
	}
}	
		
