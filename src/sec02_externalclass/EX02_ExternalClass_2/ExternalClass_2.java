package sec02_externalclass.EX02_ExternalClass_2;
import sec02_externalclass.EX02_ExternalClass_2.pack1.A; 
	/* 패키지의 풀네임을 통해 임포트. 한번만 쓰면 간단히 클래스명으로만 호출이 가능해 편리함.
	   그러나 소스 코드상에는 패키지, 임포트, 외부 클래스 순으로 순서를 지켜야 하며, 이를 어길시에는 컴파일 오류가 발생하게 됨. 
	   이들 3가지 요소 외에는 어떤 문법 요소도 위치할 수 없음
     */
public class ExternalClass_2 {

	public static void main(String[]args) {
		
		/* ExternalClass_1에서 언급한 것처럼, 다른 패키지에서도 외부 클래스 A의 객체를 생성하고자 할 때 유일한 방법은, 외부 클래스를
		   별도의 소스 파일로 분리하는 것임. 이렇게 되면 클래스 A도 public 클래스로 선언할 수 있으므로 다른 패키지에서도 임포트가 가능함.
		   
		   package sec02_externalclass.EX02_ExternalClass_2.pack1;

		   public class A { // 별도의 파일(A.java)로 분리해 A를 public 클래스로 선언하면 다른 패키지에서 임포트 가능
		      int m = 3;
	          int n = 4;
	          public void print() {
		         System.out.println(m + ", " + n);
	          }
           }
		   
		   이와 같이 새로운 소스 파일을 작성해서 다른 패키지에 넣어 놓은 뒤에 아래의 코드를 통해서 외부 클래스를 사용해보자.
		 */
		
		/*- 실습 - 1개의 소스 파일에 외부 클래스 구성*/ System.out.println("- 실습 - 1개의 소스 파일에 외부 클래스 구성");
		
		A a = new A();
		a.print();
		
	}
	
}
