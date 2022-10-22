import java.util.*;
public class Main {
	public static void main(String[] args) {	
		int x, y;
		
		 Scanner sc = new Scanner(System.in);
		 	x = sc.nextInt();
		 	y = sc.nextInt();
		 	
		 for(int i=1; i<=x; i++) {
			 
			 for(int j=1; j<=y; j++) 
				
				System.out.print(i*j+" ");
			 
			 System.out.println();
		 }
	 } 	
}

//행과 열의 수를 입력받아 다음과 같이 출력하는 프로그램을 작성하시오.

