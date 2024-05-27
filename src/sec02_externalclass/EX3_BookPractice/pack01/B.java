package sec02_externalclass.EX3_BookPractice.pack01;

import sec02_externalclass.EX3_BookPractice.pack01.A;

public class B {
	void bcd(){
		A a = new A();
		/* 클래스 B에서 다른 패키지의 클래스A를 써주려면 풀네임을 써야 함. 고로 수정할 코드 내용은 다음과 같음.
		   sec02_externalclass.EX3_BookPractice.pack01.A a =
		   new sec02_externalclass.EX3_BookPractice.pack01.A();
		 */
		System.out.println(a.m);
		System.out.println(a.n);
	}
}
