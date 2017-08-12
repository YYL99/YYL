import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("ÇëÊäÈëÈÕÆÚ£º");
		String date=in.nextLine();
		System.out.println(new NextDay(date).getMsg());
	}

}
