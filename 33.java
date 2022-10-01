import java.util.*;
public class Main {
	public static void main(String[] args) {
		int x;
		
		Scanner sc = new Scanner(System.in);
		
		while(true){
			System.out.println("1. Korea");
			System.out.println("2. USA");
			System.out.println("3. Japan");
			System.out.println("4. China");
			System.out.println("number? ");
			x = sc.nextInt();
			
			if(x == 1) {
				System.out.println("Seoul");
			}else if (x == 2) 
				System.out.println("USA");
			else if (x == 3) 
				System.out.println("Japan");
			else if (x == 4) 
				System.out.println("China");
			else {               
				System.out.println("none");           }//else에서 묶어줘야 if문의 문장이 반복됨.
				break;
			}
				
			}
	}
}	
