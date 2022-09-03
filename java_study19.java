import java.util.*;
public class study13 {
		public static void main(String[] args) {
		double score;
	
		Scanner sc = new Scanner(System.in);
		System.out.printf("");
		score= sc.nextDouble();

		if(score<=50.80)  {
			System.out.printf("Flyweight");
		}
		else if(score<=61.23) {
			System.out.printf("Lightweight");
		}
		else if(score<=72.57) {
			System.out.printf("Middleweight");
		}
		else if(score<=88.45) {
			System.out.printf("Cruiserweight");
		}
		else if(score>88.45) {
			System.out.printf("Heavyweight");
		}
		else {
			System.out.printf("");     
		}

		}
}
