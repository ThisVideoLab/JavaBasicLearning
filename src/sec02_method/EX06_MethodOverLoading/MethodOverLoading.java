package sec02_method.EX06_MethodOverLoading;

public class MethodOverLoading {

	public static void main(String[]args) {
		
		/* 7.2.4 오버로딩된 메서드
		   
		   메서드 오버로딩을 이해하기 위해서는 먼저 메서드 시그니처method signature의 의미를 알아야 함. 메서드 시그니처는 메서드명과
		   입력매개변수의 자료형을 말함. 시그니처(서명)라는 말에서 유추할 수 있듯이 메서드를 구분하는 기준 역할을 함. JVM은 메서드 시그니처가
		   다르면 메서드명이 동일해도 다른 메서드로 인식함. 메서드 오버로딩method overloading은 이러한 특징을 이용한 것으로, 입력매개변수의
		   개수나 자료형이 다른 여러 개의 동일한 이름을 지닌 메서드를 같은 공간에 정의하는 것을 의미함. 이를 묘사하자면 abc.jpg, abc.png,
		   abc.bmp를 동일한 폴더에 저장할 수 있는 원리와 같음. 파일명은 동일하지만, 확장자가 다른 것과 유사함.
		   
		   리턴 타입 메서드명(자료형 변수명, 자료형 변수명, ...){ // 이 행의 메서드명, 자료형이 일종의 파일 이름과 확장자에 해당함
		   		// 메서드 실행 내용
		   {
		   
		   int sum(int a, int b){ // 이 행의 메서드명, 자료형이 일종의 파일 이름과 확장자에 해당함
		   		return 3;
		   }
		   
		   오버로딩된 메서드의 호출은 앞에서 배운 메서드의 호출과 전혀 다를 것이 없음. 다만 동일한 이름의 메서드가 많기 때문에, 입력매개변수에
		   따라 실제 어떤 메서드가 호출된 것인지만 구분해주면 됨.
		   
		   입력매개변수에 따라 4개의 메서드로 오버로딩된 메서드의 예
		   
		   public static void main(String[]args){
		   	   print();
		   	   print(3);
		   	   print(5.8);
		   	   print(2, 5);
		   }
		   public static void print() {
		   	   System.out.println("데이터가 없습니다");
		   }
		   public static void print(int a) {
		   	   System.out.println("a");
		   }
		   public static void print(double a) {
		   	   System.out.println("a");
		   }
		   public static void print(int a, int b) {
		   	   System.out.println("a" + ", " + "b");
		   }
		   
		   앞의 예제를 살펴보면 4개의 print() 메서드가 오버로딩되어 있으며, 각각은 서로 다른 입력매개변수의 개수나 타입을 포함하고 있다는
		   것을 알 수 있음. 즉, 서로 다른 메서드 시그니처를 가지고 있음. 이는 앞서 묘사한 print.jpg, print.bmp, print.gif와 같이
		   시그니처에 따라 다른 메서드로 인식된다는 것임. 입력하는 자료형이 중복된다면, 오버로딩이 불가능함.
		   사실 많이 사용해왔던 System.out.println() 메서드 또한 무려 10개의 메서드가 오버로딩된 메서드임. 따라서 정수, 실수, 문자열 등
		   많은 출력이 자유롭게 이루어졌던 것.
		   
		 */
		
		/*- 실습 - 메서드의 오버로딩*/ System.out.println("- 실습 - 메서드의 오버로딩");
	
		print(); // 서로 다른 시그니처를 지니고 있는 print() 메서드를 입력매개변수에 따라 각기 다르게 호출
		print(3);
		print(5.8);
		print(2, 5);
		
	}
	
	public static void print() {
		System.out.println("데이터가 없습니다.");	
	}
	public static void print(int a) {
		System.out.println(a);
	}
	public static void print(double a) {
		System.out.println(a);
	}
	
	/*
	public static void print(double b) { // void print(double a){}와 중복으로 정의 불가능 
		System.out.println(b);
	}
	*/
	public static void print(int a, int b) {
		System.out.println("a: " + a + " / b: " + b);
	}
	/*
	public static void print(int a, int b) { // void print(int a, int b)와 붕족으로 정의 불가능
		System.out.println("a: " + a + " / b: " + b);
	}
	*/
}
