package Com.Pack2;

public class Duplicate {  
	public void Element(int a[])
	{
		System.out.print("Duplicate elements is : ");
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
					System.out.print(a[i]+" ");
			}
		}
	}
    public static void main(String[] args) {   
    	int arr[]= {10,5,2,4,6,5,2,10};
    	Duplicate a=new Duplicate();
    	a.Element(arr);
          
    }  
}  
