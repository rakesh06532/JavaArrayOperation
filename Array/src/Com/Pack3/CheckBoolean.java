package Com.Pack3;

import java.util.Scanner;
public class CheckBoolean {
	public char meth(String s,boolean b)
	{
		char c=' ';
		for(int i=0;i<s.length();i++)
		{
		if(b==true)
			c= s.charAt(0);
		if(b==false)
			c= s.charAt(s.length()-1);
		}
		return c;
	}
	public static void main(String[] args) {
		CheckBoolean obj=new CheckBoolean();
		Scanner sc=new Scanner(System.in);
		
		try {
			
			System.out.println("Enter word and boolean ");
			System.out.println( obj.meth(sc.nextLine(), sc.nextBoolean()));
		}
		catch(Exception e)
		{
			System.out.println("Please enter valid boolean ");
		}
		
		sc.close();
	}

}
