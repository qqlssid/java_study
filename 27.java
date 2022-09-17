import java.util.*;
public class Main {
	public static void main(String[] args) {
	    int number;
	    int grade;              //char은 문자 하나를 뜻함.
	    
		Scanner sc = new Scanner(System.in);
		System.out.print("");
		number = sc.nextInt();
		
		switch (number){
		case 12:
		case 10:
		case 8:
		case 7:
		case 5:
		case 3:
		case 1:
			grade = 31;
		break;
		                                //동일한 grade는 묶어서 활용
		
		case 11:
		case 9:
		case 6:
		case 4:
			grade = 30;
		break;
	
		
		case 2:
			grade = 28;
		break;
	
		
		default:
			grade = 0;
		break;
		}
		System.out.print(grade);
	}
}
