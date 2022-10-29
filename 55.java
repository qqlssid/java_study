import java.util.*;
public class Main {
	public static void main(String[] args) {	
		int n;
			
		 Scanner sc = new Scanner(System.in);
		 	n = sc.nextInt();
		 	
		 	for(int i=0; i<n; i++){	  //i는 n의 만큼 1씩 증가하며 입력이되고
		 		for(int j=0; j<=i; j++){  //j는 i가 입력되는 만큼 1씩 증가하며 입력이된다
		 			System.out.print("*");
		 			}
		 		System.out.println();
		 	}	
	}
}
//자연수 n을 입력받아서 n줄만큼 다음과 같이 출력하는 프로그램을 작성하시오.

