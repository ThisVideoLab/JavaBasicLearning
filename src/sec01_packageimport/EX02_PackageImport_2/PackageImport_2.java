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
		
	}
	
}
