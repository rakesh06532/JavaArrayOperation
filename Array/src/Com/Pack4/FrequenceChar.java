package Com.Pack4;


public class FrequenceChar {
	public void Word(String str)
	{
		int count,i,mc=0;
		char arr[]=str.toCharArray();
		
		for( i=0;i<arr.length;)
		{
			count=0;
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				
					count++;
					
			}
			System.out.print(arr[i]+" "+count);
			i=i+count;
			if(count>mc)
				mc=count;
		
		}
		System.out.println();
		System.out.println(mc);
	}
	public static void main(String[] args) {
		FrequenceChar obj=new FrequenceChar();
		String str="Java is awesome";
		obj.Word(str);
	}

}
