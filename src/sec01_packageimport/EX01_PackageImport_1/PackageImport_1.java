package sec01_packageimport.EX01_PackageImport_1;

public class PackageImport_1 {

	public static void main(String[]args) {
		// 객체 생성
		// A a = new A(); // 오류 발생함. 당장 이 java 파일 내에는 class A가 없음
		
		sec01_packageimport.common.A a = new sec01_packageimport.common.A();
		
		// 멤버 활용
		System.out.println(a.m);
		System.out.println(a.n);
		a.print();
	}
	
}
