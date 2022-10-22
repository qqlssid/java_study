import java.util.*;
public class Main {
	public static void main(String[] args) {	
		int x,y,n=0;
		
		 Scanner sc = new Scanner(System.in);
		 	x = sc.nextInt();
		 	y = sc.nextInt();
		 	
		 	
		 	if (x>=y) {
		 for(int i=0; i<9; i++) { 
			 n++;	  //안쪽 for문이 끝났을 때 1씩 추가된다.
       
      //-------------------------------------------------여기부터
		 for(int j=x; j>=y; j--) 
		 {                                      
			 System.out.printf("%d * %d = %2d   ",j,n,j*n); }
      //------------------------------------------------여기까지 안쪽 for문
       
		 		System.out.println();
		 }}
		 	
		 	else if (x<y) {     //반대로 숫자가 작은것부터 시작됐을 경우
		 		 for(int i=0; i<9; i++) { 
					 n++;
      //-------------------------------------------------여기부터    
				 for(int j=x; j<=y; j++) 
				 { 
					 System.out.printf("%d * %d = %2d   ",j,n,j*n); }
		 //------------------------------------------------여기까지 안쪽 for문 		
           System.out.println();
				 }}
		 	
	 } 	
}


//2부터 9까지의 수 중 2개를 입력받아 입력받은 수 사이의 구구단을 출력하는 프로그램을 작성하시오.

단 반드시 먼저 입력된 수의 구구단부터 아래의 형식에 맞게 출력하여야 한다.

구구단 사이의 공백은 3칸이다.
