package sec02_method.EX01_ExternalCallMethods;

class A {
	// 리턴 타입 void, 입력매개변수 없음.
	void print() { 
		System.out.println("안녕");
	}
	
	// 리턴 타입 int, 입력매개변수 없음.
	int data() { // 리턴 타입 int이기 때문에 리턴값으로 int형을 출력해야 함.
		return 3; // 다만 return = 3; 을 반환하므로 입력매개변수는 필요 없음.
	}
	
	// 리턴 타입 double, 입력매개변수 2개
	double sum(int a, double b) {
		return a + b;
	}
	
	// 리턴 타입 void, 내부에 리턴 포함(함수를 종료함)
	void printMonth(int m) {
		if(m < 0 || m > 12) {
			System.out.println("잘못된 입력. 1월부터 12월 사이의 값을 입력하십시오.");
			return;
		}
		System.out.println("입력하신 값은 " + m + "월입니다.");
	}
}

public class ExternalCallMethods {

	public static void main(String[]args) {
		
		/* 7.2.3 메서드 호출하기
		   
		   클래스 외부에서 메서드 호출하기
		   
		   메서드도 클래스의 멤버이므로, 힙 메모리의 객체 안에 존재할 것이고, 클래스 외부에서 메서드를 사용하려면 먼저 객체를 생성해야 함.
		   이어서 객체의 위치를 저장하고 있는 참조 변수를 이용해 메서드를 호출해야 함. 다음 실습은 앞에서 알아본 4개의 메서드를 클래스 A에
		   구성하고 클래스 외부에서 클래스 A의 객체를 생성해 메서드를 호출하는 사례들임.
		   
		*/
		   
		   /*- 실습 - 클래스 외부에서의 메서드 호출*/	System.out.println("- 실습 - 클래스 외부에서의 메서드 호출");
		   System.out.println();
		   
		   //객체 생성
		   A a = new A();
		   
		   /*메서드 호출(멤버 활용)*/	System.out.println("메서드 호출(멤버 활용)");
		   System.out.print("a.print(); = ");
		   a.print();
		   System.out.println();
		   
		   a.data(); // 리턴값으로 a.data() = 3이 되었지만 별다른 실행 부분이 없어서 콘솔창에 나타나지 않음 
		   System.out.println();
		   
		   System.out.print("int k = a.data(); 일때 System.out.print(k); = ");
		   int k = a.data();
		   System.out.println(k);
		   System.out.println();
		   
		   System.out.print("double result = a.sum(3, 5.2); 일때 System.out.println(result); = ");
		   double result = a.sum(3, 5.2);
		   System.out.println(result);
		   System.out.println();
		   
		   System.out.print(" a.printMonth(5); = ");
		   a.printMonth(5);
		   System.out.println();
		   
		   System.out.print(" a.printMonth(15); = ");
		   a.printMonth(15);
		   System.out.println();
		
	}
	
}
