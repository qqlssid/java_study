package hello;
import java.util.*;
public class Main {
		public static void main(String[] args) {
		int number;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("");
		number = sc.nextInt();
		
		if(number > 0)  {
			System.out.println(number+"\n");
		}
		else if(number == 0){
			System.out.println(number+"\n");
		}
		else {
			System.out.println(number+"\nminus");      <<<<<<<<\n
		}
		
		}
}
