package sec01_basicsyntax.EX02_ByteCodeFiles;

class A{
}
class B{
}
class C{
	class D{ // C$D.class
	}
}
/* 1개의 파일 안에 클래스 4개 A,B,C,D가 정의 됨. public class로 정의된 것은 A 이므로 이 파일의 이름은
 * A.java 파일이 됨. 이 소스 파일을 컴파일하면 바이트 코드는 파일 단위가 아닌 클래스 단위로 생성되기 때문에
 * 총 4개의 바이트 코드가 생성됨. 여기서 중요점은 생성되는 바이트 코드명임. A,B,C는 각각 외부에 있는 클래스이므로
 * class A{} → A.class,class B{} → B.class, class C{} → C.class와 같은 형식으로 생성됨.
 * 다만 class D는 class C의 내부에 포함된 '이너 클래스' 이기 때문에 반드시 자신을 감사고 있는 클래스부터
 * 표현을 해줘야 함. 이러한 속성은 다음과 같이 표기됨. (C$D.class) 이때 바이트 코드도 이러한 상태를 표기하기 위해 
 * '아우터 클래스 이름$이너 클래스 이름.class'와 같은 형식으로 함께 생성됨.
 * 생성된 바이트 코드 파일은 bin 폴더 내에서 그 모습을 확인 할 수 있음
 */

public class ByteCodeFiles{ //ByteCodeFiles.class
		public static void main(String[]args) {
		System.out.println();
		}
}
