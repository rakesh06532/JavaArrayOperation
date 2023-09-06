package Com.Pack2;

public class DuplicateElement {
	public void  meth(int arr[])
	{
		int i,j,n;
	 n=arr.length;
		
		for( i=0;i<n;i++)
		{
			for( j=i+1;j<n;j++)
			{
				if(arr[i]==arr[j])
				{
					
					 for(int k=i;k<n-1;k++)
					 {
						 arr[k]=arr[k+1];
						 
					 }
					 i--;n--;
				
				}//if
				
			}//inner for loop
			
		}//outer for loop
		for(  i=0;i<n;i++)
		
			System.out.print(arr[i]+" ");

	}
	
	public static void main(String[] args) {
		DuplicateElement a=new DuplicateElement();
		int arr[]= {1,20,4,8,89,4,20};
		a.meth(arr);
		
		
	}
	

}
