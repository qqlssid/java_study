package hello;
import java.util.*;
public class study13 {
		public static void main(String[] args) {
		int x;
		int y;
		int a;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("");
		x = sc.nextInt();
		y = sc.nextInt();
		a=y+100-x;                                    <<<<<<<수식은 다음 줄에
		
		System.out.println(a);
		if(a > 0)  {
			System.out.println("Obesity");
		}
		else {
			System.out.println(" ");     
		}

		}
}
