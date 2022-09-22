import java.util.Scanner;

public class Fibonacci
{
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	int n=17;
	series(n);
	}
	
	static void series(int num)
	{
	System.out.println("Fibonacci series up to 1000 is: ");
	int i=0,j=1,next;
	for(int c=0;c<num;c++)
	{
	if(c<=1)
		next=c;
	else
	{
	next=i+j;
	i=j;
	j=next;
	}
	System.out.print(next+" ");
	}
	}



}