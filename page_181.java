package java_study;
import java.util.*;

class car	//상속을 받고 있기 때문에 "public"이 앞에 붙어 있으면 안됨.
{   
	int speed;
	public void setSpeed(int speed) {
		this.speed = speed;
		
	}
}

class Sportcar extends car	//상속을 받고 있기 때문에 "public"이 앞에 붙어 있으면 안됨.
{    
	boolean turbo;
	
	public void setTurbo(boolean flag) {
		turbo = flag;
	}
}



public class java01 {
	public static void main(String[] args) {
		Sportcar obj = new Sportcar(); 
		
	}
}

//자바수업.페이지 181페이지 내용.
