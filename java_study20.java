import java.util.*;
public class study13 {
		public static void main(String[] args) {
		double score, score2;                 //논리 연산자 사용을위해 하나 더 생성
	
		Scanner sc = new Scanner(System.in);
		System.out.printf("");
		score= sc.nextDouble();
		score2= sc.nextDouble();
		
		if(score>=4.0 && score2>=4.0)        //논리 연산자 사용
			System.out.printf("A");
		
		else if(score>=3.0 && score2>=3.0) 
			System.out.printf("B");

		else 
			System.out.printf("C");     
		}
}

//두 개의 실수를 입력받아 모두 4.0 이상이면 "A", 
//모두 3.0 이상이면 "B", 
//아니면 "C" 라고 출력하는 프로그램을 작성하시오.
