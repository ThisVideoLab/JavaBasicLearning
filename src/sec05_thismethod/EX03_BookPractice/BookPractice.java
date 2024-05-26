package sec05_thismethod.EX03_BookPractice;

import java.util.Arrays;

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
		System.out.println();
		
		/*Q3 다음의 클래스 A 내부에는 int[] 객체를 입력매개변수로 입력받아 배열의 모든 원소를 합한 후 리턴하는 arraySum() 메서드가 정의되어 있다.*/
		System.out.println("Q3 다음의 클래스 A 내부에는 int[] 객체를 입력매개변수로 입력받아 배열의 모든 원소를 합한 후 리턴하는 arraySum() 메서드가 정의되어 있다.");
		System.out.println();
		
		class Q3A{
			int arraySum(int[] array) {
				int sum = 0;
				for(int i = 0; i <array.length; i++) {
					sum += array[i];
				}
				return sum;
			}
		}
		System.out.println("class Q3A{");
		System.out.println("	int arraySum(int[] array) {");
		System.out.println("		for(int i = 0; i <array.length; i++) {");
		System.out.println("	 	   sum += array[i];");
		System.out.println("		}");
		System.out.println("		return sum;");
		System.out.println("	}");
		System.out.println("}");
		System.out.println();
		
		/*다음과 같이 4가지 장법으로 arraySum() 메서드를 호출할 때 오류가 발생하는 코드와 그 이유를 설명하시오.*/
		System.out.println("다음과 같이 4가지 장법으로 arraySum() 메서드를 호출할 때 오류가 발생하는 코드와 그 이유를 설명하시오.");
		System.out.println();
		

		Q3A q3a = new Q3A();
		int[] data1 = new int[] {1, 2, 3};
		int[] data2 = {1, 2, 3};
		
		System.out.println("Q3A q3a = new Q3A();");
		System.out.println("int[] data1 = new int[] {1, 2, 3};");
		System.out.println("int[] data2 = {1, 2, 3};");
		System.out.print("System.out.println(q3a.arraySum(data1)); = ");
		System.out.println(q3a.arraySum(data1));
		System.out.print("System.out.println(q3a.arraySum(data2)); = ");
		System.out.println(q3a.arraySum(data2));
		System.out.print("System.out.println(q3a.arraySum(new int[]{1, 2, 3})); = ");
		System.out.println(q3a.arraySum(new int[]{1, 2, 3}));
		System.out.println("System.out.println(q3a.arraySum({1, 2, 3})); -> 오류 발생");
		System.out.println("오류가 발생하는 이유는, 해당 코드는 배열의 선언과 객체값 대입이 한번에 이뤄지는 배열의 3번째 생성 방법에서");
		System.out.println("객체값 대입만을 떼어놓은 것으로 올바른 배열의 생성 방법이라고 볼 수 없기 때문");
		
		System.out.println();
		
		/*Q4 클래스 A 내부에는 다음과 같이 기본 자료형과 참조 자료형을 입력매개변수로 하는 abc(), bcd() 메서드가 정의돼 있다.*/
		System.out.println("Q4 클래스 A 내부에는 다음과 같이 기본 자료형과 참조 자료형을 입력매개변수로 하는 abc(), bcd() 메서드가 정의돼 있다.");
		System.out.println();
		
		System.out.println("class A{");
		System.out.println("	void abc(int m) {");
		System.out.println("		m = 8;");
		System.out.println("	}");
		System.out.println("	void bcd(int[] n) {");
		System.out.println("		n[0] = 4; n[1] = 5; n[2] = 6;");
		System.out.println("	}");
		System.out.println("}");
		System.out.println();
		
		class Q4A{
			void abc(int m) {
				m = 8;
			}
			void bcd(int[] n) {
				n[0] = 4; n[1] = 5; n[2] = 6;
			}
		}
		
		/*이때 다음 코드의 출력값을 쓰시오.*/ System.out.println("이때 다음 코드의 출력값을 쓰시오.");
		System.out.println();
		
		int m = 5;
		int[] n = {1, 2, 3};
		
		Q4A q4a = new Q4A();
		q4a.abc(m);
		q4a.bcd(n);
		
		System.out.println("Q4A q4a = new Q4A();");
		System.out.println("int m = 5;");
		System.out.println("int[] n = {1, 2, 3};");
		System.out.println("q4a.abc(m);");
		System.out.println("q4a.bcd(n);");
		System.out.print("System.out.println(m); = ");
		System.out.println(m);
		System.out.print("System.out.println(Arrays.toString(n)); = ");
		System.out.println(Arrays.toString(n));
		System.out.println();
		
		/*Q5 가변 길이 자료형을 이용해 여려 개의 정수를 개수와 상관없이 입력받아 평균값을 출력하는 averageScore() 메서드를 클래스 A안에 정의하시오.*/
		System.out.println("Q5 가변 길이 자료형을 이용해 여려 개의 정수를 개수와 상관없이 입력받아 평균값을 출력하는 averageScore() 메서드를 클래스 A안에 정의하시오.");
		System.out.println();
		
		System.out.println("class Q5A{");
		System.out.println("");
		System.out.println("	// 클래스 내용");
		System.out.println("");
		System.out.println("}");
		System.out.println("Q5A q5a = new Q5A();");
		System.out.println("q5a.averageScore(1);");
		System.out.println("q5a.averageScore(1, 2);");
		System.out.println("q5a.averageScore(1, 2, 3);");
		System.out.println("q5a.averageScore(1, 2, 3, 4);");
		System.out.println();
		
		class Q5A{
			public static void averageScore(double... values) {
				double s = 0;
				for(int i = 0; i < values.length; i++) {
					s += values[i]; 
				}
				System.out.println(s/values.length);
			}
		}
		
		Q5A q5a = new Q5A();
		
		q5a.averageScore(1);
		q5a.averageScore(1, 2);
		q5a.averageScore(1, 2, 3);
		q5a.averageScore(1, 2, 3, 4);
		System.out.println();
		
		/*Q6 클래스 A에 생성자가 2개 정의돼 있다. 각각의 생성자를 이용해 객체를 생성하시오(단, 입력값은 자유롭게 지정).*/
		System.out.println("Q6 클래스 A에 생성자가 2개 정의돼 있다. 각각의 생성자를 이용해 객체를 생성하시오(단, 입력값은 자유롭게 지정).");
		System.out.println();
		
		System.out.println("class Q6A{");
		System.out.println("	Q6A(int k){");
		System.out.println("	}");
		System.out.println("	Q6A(double a, double b){");
		System.out.println("	}");
		System.out.println("}");
		System.out.println("");
		System.out.println("Q6A q6a1 = ?? // 첫 번째 생성자 이용");
		System.out.println("Q6A q6a2 = ?? // 두 번째 생성자 이용");
		System.out.println();
		System.out.println("Q6A q6a1 = new Q6A(3);");
		System.out.println("Q6A q6a2 = new Q6A(2.5, 3.7);");
		System.out.println();
		
		class Q6A{
			Q6A(int k){
			}
			Q6A(double a, double b){
			}
		}
		
		Q6A q6a1 = new Q6A(3);
		Q6A q6a2 = new Q6A(2.5, 3.7);
		
		/*Q7 클래스 A를 다음과 같이 정의했을 때 다음 코드의 출력 결과를 쓰시오.*/
		System.out.println("Q7 클래스 A를 다음과 같이 정의했을 때 다음 코드의 출력 결과를 쓰시오.");
		System.out.println();
		
		System.out.println("class Q7A{");
		System.out.println("	int m = 3;");
		System.out.println("	int n = 5;");
		System.out.println("	void abc(int m, int n){");
		System.out.println("		m = this.m;");
		System.out.println("		n = n;");
		System.out.println("	}");
		System.out.println("}");
		System.out.println("");
		System.out.println("Q7A q7a = new Q7A();");
		System.out.println("q7a.abc(7, 8);");
		System.out.println("System.out.println(\"q7a.m\");");
		System.out.println("System.out.println(\"q7a.n\");");
		System.out.println("");
		
		class Q7A{
			int m = 3;
			int n = 5;
			void abc(int m, int n){
				m = this.m; // 메스드에 입력된 값에 상관 없이 Q7A 클래스에서 입력한 m = 3 값을 대입함.
				n = n;
			}
		}
		
		Q7A q7a = new Q7A();
		q7a.abc(7, 8);
		System.out.println("출력값");
		System.out.println(q7a.m);
		System.out.println(q7a.n);
		
		/*Q8 클래스 a 내부에는 2개의 생성자가 정의돼 있다.*/ System.out.println("Q8 클래스 a 내부에는 2개의 생성자가 정의돼 있다.");
		System.out.println();
		
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
		class Q8A {
			int a, b, c, d;
			Q8A(){
				
				// 생성자 내용
				this.a = b = c = d = 5;
			}
			Q8A(int k){
				
			}
		}
		
		/*다음과 같이 객체를 생성하고 각 필드값을 출력했을 때 모든 필드값으로 5가 출력되도록 Q8A() 내부에 1줄의 코드를 추가하시오.*/
		System.out.println("다음과 같이 객체를 생성하고 각 필드값을 출력했을 때 모든 필드값으로 5가 출력되도록 Q8A() 내부에 1줄의 코드를 추가하시오.");
		System.out.println();
		
		Q8A q8a = new Q8A();
		System.out.println(q8a.a);
		System.out.println(q8a.b);
		System.out.println(q8a.c);
		System.out.println(q8a.d);
		
		// end
	}
	
}
