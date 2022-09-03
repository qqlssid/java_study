import java.util.*;
public class study13 {
		public static void main(String[] args) {
		char a;
		int score2;
	
		
		Scanner sc = new Scanner(System.in);
		System.out.print("");
		a = sc.next().charAt(0);   //(charAt)문자열에서 하나의 문자를 캐치
                               //(0)0번째 위치에서 가져오겟다
		score2 = sc.nextInt();
	
		
		if(a == 'M' &&score2>=18)  
			System.out.println("MAN");
		
		else if(a=='F'&&score2>=18) 
			System.out.println("WOMAN");

		else if(a=='M'&&score2<18) 
			System.out.println("BOY");

		else if(a=='F'&&score2<18) 
			System.out.println("GIRL");

		else 
			System.out.println("");     
		}
}
