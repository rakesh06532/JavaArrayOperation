package Com.Pack3;


public class Test {
	void meth1(String str)
	{
		String s[]=str.split(" ");
		String sum="";
		
		for(String st:s)
		{
		for(int i=st.length()-1;i>=0;i--)
		{
			
		sum=sum+st.charAt(i);
		}
		sum=sum+" ";
		}
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
		new Test().meth1("rakesh kumar");
	
		
		
	}

}
