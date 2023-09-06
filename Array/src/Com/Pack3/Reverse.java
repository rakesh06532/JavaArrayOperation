package Com.Pack3;

import java.util.Scanner;
public class Reverse {
	public String Word(String s)
	{
		String st="";
		for(int i=s.length()-1;i>=0;i--)
		{
			st=st+s.charAt(i);
		}
		return st;
	}
	public String Word2(String s)
	{
		String st="";
		for(int i=0;i<s.length();i++)
		{
		  if(s.charAt(i)==' ')
		  {
			for(int j=s.length()-1;j>=0;j--)
			{
				st=st+s.charAt(j);
			}
		  }
		}
		return st;
	}
	public static void main(String[] args) {
		Reverse obj=new Reverse();
		Scanner sc=new Scanner(System.in);
		//System.out.println("Enter word for Reverse ");
		//System.out.println(obj.Word(sc.nextLine()));
		System.out.println("Enter sentance for Reverse : ");
		System.out.println(obj.Word2(sc.nextLine()));
		sc.close();
	}

}
