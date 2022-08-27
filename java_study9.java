package hello;
import java.util.*;      <<*(중요)규격
public class javanew {
	public static void main(String[] args) {
		int x;
		Scanner in = new Scanner(System.in);  <<입력 후 답이 나올 수 있게 도와줌
		x = in.nextInt();
		System.out.print((x++));        <<후치증가 연산자
		System.out.print(" "+(++x));    <<전치증가 연산자
	}

}
