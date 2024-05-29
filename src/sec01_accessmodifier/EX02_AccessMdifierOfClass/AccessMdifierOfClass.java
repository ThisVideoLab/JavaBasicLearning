package sec01_accessmodifier.EX02_AccessMdifierOfClass;

public class AccessMdifierOfClass {

	public static void main(String[]args) {
		
		/* 9.1.2 클래스의 접근 지정자
		   
		   클래스의 접근 지정자는 public, default만을 접근 지정자로 가짐. 쉽게 말해 class 키워드 앞에 public이 붙어 있거나
		   붙어있지 않거나(이럴 경우엔 컴파일 과정에서 자동으로 default)가 붙음. 그렇다면 각각의 접근 지정자는 어떤 의미를 가지는가.
		   앞에서와 마찬가지로 default 클래스는 같은 패키지 내에서만 사용할 수 있고, public 클래스는 다른 패키지에서도 사용 할 수 있음.
		   클래스를 default로 정의하면 다른 패키지에서 임포트가 불가능해서 사용할 수 없게 됨.
		   
		   1) 클래스에서 사용하는 접근 지정자(default)
		   
		   패키지 abc.bcd -------------------------
		   
		   package abc.bcd;
		   
		   class A{ // default 클래스 (접근 지정자를 생략할 경우에 자동으로 붙음)
		      
		      // ...
		   
		   }
		   
		   class B{
		      void vcd() {
		         A a = new A(); // (o)
		      }
		   }
		   --------------------------------------
		   
		   패키지 bcd.cde -------------------------
		   
		   package bcd.cde;
		   
		   // import abc.bcd.A; // (X) 클래스 A는 default 접근 지정자이므로 다른 패키지에서 임포트 불가능
		   
		   class C {
		      void cde() {
		         // A 클래스 사용(선언) 불가능
		      }
		   }
		   --------------------------------------
		   
		   이러한 설명에서 볼 수 있듯이 다른 패키지에서 클래스를 사용하기 위해서는 해당 클래스를 임포트할 수 있어야 하므로, 이를 위해서는
		   public으로 선언해야 하는 것임. 물론 임포트 대신 '패키지명.클래스명' 형태의 풀네임으로 바로 호출할 때 역시 public으로 선언되어
		   있어야 함.
		   
		   2) 클래스에서 사용하는 접근 지정자(public)
		   
		   패키지 abc.bcd -------------------------
		   
		   package abc.bcd;
		   
		   public class A{ // default 클래스 (접근 지정자를 생략할 경우에 자동으로 붙음)
		      
		      // ...
		   
		   }
		   
		   class B{
		      void vcd() {
		         A a = new A(); // (o)
		      }
		   }
		   --------------------------------------
		   
		   패키지 bcd.cde -------------------------
		   
		   package bcd.cde;
		   
		   import abc.bcd.A; // (o) 클래스 A가 public 접근 지정자이므로 다른 패키지에서 임포트 가능
		   
		   class C {
		      void cde() {
		         // A 클래스 사용(선언) 가능
		      }
		   }
		   --------------------------------------
		 */
		
	}
}
