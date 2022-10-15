import java.util.*;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		 int x=sc.nextInt();
		 int y=sc.nextInt();

		 if(y<=x) {                //y는 x보다 작다
			 for(int i=y; i<=x; i++)     //변수는 y이며, 변수는 x보다 작거나 같고, 수는 1씩 증가한다
			 System.out.print(i+" ");}
		 
		 else if(y>=x) {
			 for(int i=x; i<=y; i++)
			 System.out.print(i+" ");
		 
		 
		 }
    } 	
}

//100 이하의 두 개의 정수를 입력받아 작은 수부터 큰 수까지 차례대로 출력하는 프로그램을 작성하시오.

