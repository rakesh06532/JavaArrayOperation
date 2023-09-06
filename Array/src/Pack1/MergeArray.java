package Pack1;

import java.util.Arrays;

public class MergeArray {
	public void meth()
	{
	
		int a[]= {12,14,16,18};
		int b[]= {11,13,15,17};
		int c=a.length+b.length;
		
		int d[]=new int[c];
		for(int i=0;i<a.length;i++)
		{
			d[i]=a[i];
		}
		for(int i=0;i<b.length;i++)
		{
			d[i+4]=b[i];
		}
		
		
			System.out.print(Arrays.toString(d));
		
	}
	public static void main(String[] args) {
		MergeArray obj=new MergeArray();
		obj.meth();
	}

}
