package sec01_accessmodifier.EX04_AccessModifierOfClass_2;

import sec01_accessmodifier.EX04_AccessModifierOfClass_2.pack.*;


// *를 통해서 해당 패키지 안에 가능한 모든 모든 클래스를 임포트함. 이때 default 접근 지정자인 클래스 BB는 임포트가 불가능함.

public class AccessModifierOfClass_2 {

	public static void main(String[]args) {
		
		// 객체 생성
		AA a = new AA(); // 클래스 AA는 public 생성자이므로 다른 패키지에서도 객체 선언(AA a)과 생성자 호출(new AA())이 가능함.
		// BB b = new BB(); // 클래스 BB는 임포트 불가능. 따라서 객체 선언 및 생성자 호출이 불가능함.
		CC c; // 클래스 CC는 public 접근 지정자를 가지므로 객체 선언은 가능함.
		// c = new CC(); //  허나 생성자가 default 접근 지정자를 가지므로 생성자 호출이 불가능함.
		
	}
	
}
