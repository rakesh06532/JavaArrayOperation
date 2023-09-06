package Com.Pack4;

public class RightAngleTraingle {
	public void Traingle(int number)
	{
		for(int i=1;i<=number;i++)
		{
			for(int j=1;j<=i;j++)
			{
				
					System.out.print(" *");
			}
			System.out.println();
		}
		System.out.println();
	}
	public void meth(int number1,int number2)
	{
		System.out.println("meth called ");
		for(int i=1;i<=number1;i++)
		{
			for(int j=1;j<=number2;j++)
			{
				if(i==1||i==number1||j==1||j==number2||i==j||i+j==11)
				//if(i<=j)
					System.out.print(" *");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		System.out.println();
	}
	public void meth2(int num1,int num2)
	{
		System.out.println("meth2 called ");
		for(int i=1;i<=num1;i++)
		{
			for(int j=1;j<=num2;j++)
			{
				if(i==j||i+j==11)
					System.out.print(" *");
				else System.out.print("  ");
			}
			System.out.println();
		}
	}
	public void meth3(int num1,int num2)
	{
		System.out.println("meth3 called ");
		for(int i=1;i<=num1;i++)
		{
			for(int j=1;j<=num2;j++)
			{
				if(i==num1||j==num2)
					System.out.print(" *");
				else System.out.print(" ");
			}
			System.out.println();
		}
	}
    
	public static void main(String[] args) {
		RightAngleTraingle obj=new RightAngleTraingle();
		obj.Traingle(10);
		obj.meth(10, 10);
		obj.meth2(10,10);
		System.out.println();
		obj.meth3(10,10);
	}

}
