import java.util.*;
public class study13 {
		public static void main(String[] args) {
		int y;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("");
		y= sc.nextInt();

		if(y>= 20)  {
			System.out.println("adult");
		}
		
		else {
			y-=20;
			System.out.println(-y+" years later");     
		}

		}
}
