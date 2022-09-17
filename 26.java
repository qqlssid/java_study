//swich문으로 활용

import java.util.*;
public class Main {
	public static void main(String[] args) {
	    int number;
	    String a;
	    
		Scanner sc = new Scanner(System.in);
		System.out.print("Number? ");           //대문자소문자 구분 중요
		number = sc.nextInt();
		
		
		switch (number){
		
		
		case 3:
			a = "chick";
		break;
		
		case 2:
			a = "cat";
		break;
		
		case 1:
			a = "dog";
		break;
		
		default:
			a = "I don't know.";
		break;
		}
		System.out.print(a);
	}
}

//1번은 개, 2번은 고양이, 3번은 병아리로 정하고 번호를 입력하면 번호에 해당하는 동물을 영어로 출력하는 프로그램을 작성하시오.
해당 번호가 없으면 "I don't know."라고 출력한다.

개-dog

고양이-cat

병아리-chick​ 
