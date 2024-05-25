package sec05_thismethod.EX03_BookPractice;

class Q1A{
	boolean a;
	int b;
	double c;
	String d;
	
	void abc() {
		System.out.println(b+c);
		System.out.println(c+d);
		System.out.println(d+a);
	}
}

public class BookPractice {

	public static void main(String[]args) {
		
		/*Q1 클래스 A가 다음과 같이 정의되어 있다.*/ System.out.println("Q1 클래스 A가 다음과 같이 정의되어 있다.");
		
		System.out.println();
		System.out.println("class Q1A{");
		System.out.println("	boolean a;");
		System.out.println("	int b;");
		System.out.println("	double c;");
		System.out.println("	String d;");
		System.out.println("	void abc() {");
		System.out.println("		System.out.println(b+c);");
		System.out.println("		System.out.println(c+d);");
		System.out.println("		System.out.println(d+a);");
		System.out.println("	}");
		System.out.println("}");
		
		/*다음 코드의 출력값을 쓰시오.*/ System.out.println("다음 코드의 출력값을 쓰시오.");
		System.out.println();
		
		System.out.println("Q1A q1a = new Q1A();");
		System.out.println();
		Q1A q1a = new Q1A();
		System.out.print("System.out.println(q1a.a); = ");
		System.out.println(q1a.a);
		System.out.print("System.out.println(q1a.b); = ");
		System.out.println(q1a.b);
		System.out.print("System.out.println(q1a.c); = ");
		System.out.println(q1a.c);
		System.out.print("System.out.println(q1a.d); = ");
		System.out.println(q1a.d);
		System.out.println();
		System.out.println("q1a.abc(); = ");
		q1a.abc();
		System.out.println();
		
		/*Q2 4가지 형태로 오버로딩된 print() 메서드의 실행 결과가 다음과 같이 출력되도록 클래스 A를 완성하시오.*/
		System.out.println("Q2 4가지 형태로 오버로딩된 print() 메서드의 실행 결과가 다음과 같이 출력되도록 클래스 A를 완성하시오.");
		
		System.out.println("class Q2A{");
		System.out.println("");
		System.out.println("   // 내부 클래스 내용");
		System.out.println("");
		System.out.println("}");
		System.out.println();
		System.out.println("Q2A q2a = new Q2A();");
		System.out.println("q2a.print();");
		System.out.println("q2a.print(3);");
		System.out.println("q2a.print(5.8);");
		System.out.println("q2a.print(\"안녕\");");
		System.out.println();
		
		class Q2A{
			void print(){
				System.out.println("입력값이 없습니다.");
			}
			void print(int a){
				System.out.println("정수 입력값 : " + a);
			}
			void print(double a){
				System.out.println("실수 입력값 : " + a);
			}
			void print(String a){
				System.out.println("문자열 입력값 : " + a);
			}
		}
		
		System.out.println("실행 결과: 실제 코드 작성을 통한 값 출력 부분");
		
		Q2A q2a = new Q2A();
		q2a.print();
		q2a.print(3);
		q2a.print(5.8);
		q2a.print("안녕");
		
		
			
		// end
	}
	
}
