package mypackage;

public class LearningMethods {

	public static void main(String[] args) {
		int num1=20;
		int num2=10;
		Addition(num1,num2);
		Subtraction(num1,num2);
		Division(num1);
		Largest(num1,num2);
	}	
	static int Addition(int n1,int n2)
	{
		int total=n1+n2;
		System.out.println("The Addition value is:"+total);
		return total;
	}
	static int Subtraction(int n1,int n2)
	{
		int total=n1-n2;
		System.out.println("The Subtraction value is:"+total);
		return 0;
	}

	static int Division(int n1)
	{
		int ans=n1/2;
		System.out.println("The Division of the number is:"+ans);
		return ans;
	}
	
	static int Largest(int n1,int n2)
	{
		int ans=0;
		if(n1>n2)
		{
			System.out.println("The Biggest Number is:"+n1);
		}
		else
		{
			System.out.println("The Biggest Number is:"+n2);
		}
		return ans ;
	}
}

