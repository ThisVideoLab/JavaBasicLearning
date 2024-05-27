package sec02_externalclass.EX01_ExternalClass_1;

class ABC{ // 외부 클래스는 다른 패키지에서 임포트가 불가능함. 만일 사용하고 싶다면 별도의 소스 파일을 만들고 public 클래스로 작성해야 함.
	
	int m = 3;
	int n = 4;
	
	void print() {
		System.out.println("이 메시지는 print() 메서드로 출력되었습니다.");
		System.out.println(m + ", " + n);
	}
}

public class ExternalClass_1 { // public 클래스는 다른 패키지에서 임포트 가능함

	public static void main(String[]args) {
		
		/* 8.2 외부 클래스
		   
		   외부 클래스는 public 클래스의 외부에 추가로 정의한 클래스를 의미함. 1개의 자바 소스 파일에는 최대 1개의 public 클래스만 존재할
		   수 있고 public 클래스를 제외한 모든 클래스는 외부 클래스임(내부 클래스 제외). public 클래스가 아니면 다른 패키지에서 임포트할 수
		   없으므로, 외부 클래스는 같은 패키지 안에서만 사용이 가능함. 코드 상단의 class ABC를 살펴보자.
		   
		   위의 설명과 같이 public이 없다면 다른 패키지에서 ABC 클래스를 사용할 순 없지만, 내부에서는 얼마든지 외부 클래스를 사용 가능함.
		   다음 예제를 통해 자세한 용법을 알아보자.
		   
		 */
		
		/*- 실습 - 1개의 소스 파일에 외부 클래스 구성*/ System.out.println("- 실습 - 1개의 소스 파일에 외부 클래스 구성");
		
		ABC abc = new ABC();
		abc.print();
		
	}
	
}
