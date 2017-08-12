import java.util.Scanner;

public class TaxCalculator 
{
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		System.out.print("请输入工资：");
		double salary=in.nextDouble(),
				    tax=salary-3500,
				    result;
		if(tax<=0)
			result=0;
		else if(tax<=1500)
			result=tax*0.03;
		else if(tax<=4500)
			result=tax*0.1;
		else if(tax<=9000)
			result=tax*0.2;
		else if(tax<=35000)
			result=tax*0.25;
		else if(tax<=55000)
			result=tax*0.3;
		else if(tax<=80000)
			result=tax*0.35;
		else
			result=tax*0.45;
		
		System.out.println("所需缴纳的税费为："+result);
	}
}
