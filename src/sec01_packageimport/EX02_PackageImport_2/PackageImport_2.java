package sec01_packageimport.EX02_PackageImport_2;

import sec01_packageimport.common.A; // sec01_packageimport.common 내의 A 클래스를 임포트

public class PackageImport_2 {

	public static void main(String[]args) {
		
		// 객체 생성
		
		A a = new A();
		
		// 멤버 활용
		System.out.println(a.m);
		System.out.println(a.n);
		a.print();
		
		/* * 기호로 임포트할 때 주의점이 있음. 실제 임포트되는 대상은 소스 코드 (.java)가 아닌 bin 폴더에 위치한 컴파일이 왼료된 바이트
		   코드(.class)임. 다음과 같은 구조의 패키지를 살펴보자. pack1 패키지 내부에는 2개의 클래스 파일(A.class B.class)과 1개의
		   하위 패키지(pack2)가 있음. pack1.pack2의 내부에는 다시 2개의 클래스 파일(C.class, D.class)이 있음. 이때 * 기호를
		   사용해 다음과 같이 임포트하면 하위 폴더는 임포트되지 않으며, 클래스 파일들만 임포트 됨. 따라서 4개의 클래스를 모두 임포트 하기 
		   위해서는 다음과 같이 작성해야 함.
		   
		   import pack1.*; // A.class, B.class 임포트
		   import pack1.pack2.*; // C.class, D.class 임포트
		   
		   보통 윈도우에서 * 기호는 모든 것을 대상으로 하는데, 자바에서도 비슷한 쓰임으로 사용된다는 것을 알 수 있음. 그러나 한가지 주의점은
		   하위 모든 구조들을 포함하는 것이 아닌, 해당 패키지에 있는 대상들만을 포함한다는 것의 유의해야 할 것. 그러므로 앞선 방법1과 방법2,
		   * 기호등을 활용해 목표로하는 패키지를 불러오기 위해 반복숙달이 필요함.
		 
		 */
	}
}
