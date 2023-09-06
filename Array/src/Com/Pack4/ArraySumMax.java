package Com.Pack4;

import java.util.ArrayList;
import java.util.LinkedHashSet;


public class ArraySumMax {
	ArrayList FindArraySum(int a[])
	{
		int ms=0;
		int cs=0;
		ArrayList<String> al=new ArrayList<String>();
		for(int i=0;i<a.length;i++)
		{
			cs=cs+a[i];
			if(cs>ms)
			{
				ms=cs;
				al.add(String.valueOf(a[i]));
			}
			if(cs<0)
				cs=0;
		}
		al.add("Sum "+ms);
		return al;
	}
	public static void duplicateElements()
	{
		int arr[]= {1,2,3,4,1,2,5},i;
		for( i=0;i<arr.length;i++)
		{
			for(int j=1+i;j<arr.length-1;j++)
			{
				if(arr[i]==arr[j])
					arr[i]='@';	
			}
			if(arr[i]=='@')
				System.out.print("");
			else System.out.print(arr[i]+" ");
			}
		}
  public static void reverse()
  {
	  String st="Rakesh";
	  String str="";
	  for(int i=st.length()-1;i>=0;i--)
	  {
		  str=str+st.charAt(i);
	  }
	  System.out.println(str);
  }
  static void palindrom()
  {
	  String st="mom";
	  String str="";
	  for(int i=st.length()-1;i>=0;i--)
	  {
		  str=str+st.charAt(i);
	  }
	  if(st.equalsIgnoreCase(str))
		  System.out.println("Palindrom");
	  else System.out.println("Not palindrom");
  }
  static void wordCount()
  {
	  String st="count word of   given string";
	  int c=0;
	  for(int i=0;i<st.length()-1;i++)
	  {
		  if((st.charAt(0)!=' ' && i==0 ) || ((st.charAt(i)!=' ') && (st.charAt(i+1)==' ')))
			  c++;
	  }
	  System.out.println(c);
  }
  static void star()
  {
	  int a=5;
	  for(int i=1;i<=a;i++)
	  {
		  for(int j=1;j<=a;j++)
		  {
			  
		  if((i+j)%2==0)
			  System.out.print("*");
		  else System.out.print("#");
		  }
		  System.out.println();
	  }
  }
  static void sorting()
  {
	  int arr[]= {2,6,9,2,7,3,8,1,9};
	  for(int i=0;i<arr.length;i++)
	  {
		  for(int j=i+1;j<arr.length;j++)
		  {
			  if(arr[i]>arr[j])
			  {
				  int temp=arr[i];
				  arr[i]=arr[j];
				  arr[j]=temp;
			  }
		  }
	  }
	  for(int x:arr)
		  System.out.print(x+" ");
  }
  
  static void swastic()
  {
	  for(int i=1;i<=7;i++)
	  {
		  for(int j=1;j<=7;j++)
		  {
			  if(i==4||(j==1 && i>=4)||(j==7 && i<=4)||(i==1 && j<=4)||j==4 || (i==7 && j>=4))
                   System.out.print("+");
               else System.out.print(" ");
		  }
		  System.out.println();
	  }
  }
  static void number()
  {
	  
	  for(int i=1;i<=5;i++)
	  {
		  
		  for(int j=1;j<=i;j++)
		  {
		
			  System.out.print(j+" ");
			 
		  }
		  System.out.println();
		 
	  }
  }
  static void fibonacci()
  {
	  int f1=0,f2=1,f3;
	  System.out.print(f1+" "+f2+" ");
	  for(int i=1;i<=10;i++)
	  {
		  f3=f1+f2;
		  System.out.print(f3+" ");
		  f1=f2;
		  f2=f3;
	  }
  }
  static void duplicateCharacter()
  {
	  
	  String st="shankar";
	  LinkedHashSet<Character> set=new LinkedHashSet<Character>();
	  
	  for(int i=0;i<st.length();i++)
	  {
		 set.add(st.charAt(i));
	  } 
	  for(Character ch:set)
		  System.out.print(ch);
  }
  static void replaceWord()
  {
	  String st="Replace word in a string";
	 String str=st.replaceAll("in", "is");
	  System.out.println(str);
  }
  static void removeduplicate()
  {
	  String st[]= {"shankar","sasaram","sanam","Giridih"};
	  
	  for(String x:st)
	  {
		  LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		  for(int i=0;i<x.length();i++)
		  {
			  set.add(x.charAt(i));
		  }
		  for(Character ch:set)
			  System.out.print(ch);
		  System.out.print(" ");
	  }
	  
  }
	public static void main(String[] args) {
		//int array[]= {-2,1,-3,4,-1,2,1,-5,4};
		//ArrayList<Integer> res=new ArraySumMax().FindArraySum(array);
		//ArrayList<Integer> al=new ArrayList<Integer>(Arrays.asList(array));
		//System.out.println(res);
		//duplicateElements();
		//reverse();
		//palindrome();
		//wordCount();
		//star();
		//sorting();
		//swastic();
		//number();
		//fibonacci();
		//duplicateCharacter();
		removeduplicate(); //replaceWord();
	}
	

}
