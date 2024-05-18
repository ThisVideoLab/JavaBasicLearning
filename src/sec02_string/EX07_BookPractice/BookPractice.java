package sec02_string.EX07_BookPractice;

import java.util.Arrays;

public class BookPractice {

	public static void main(String[]args) {
		
		/*Q1 배열의 2가지 특징을 기술하시오.*/ System.out.println("Q1 배열의 2가지 특징을 기술하시오.");
		
		System.out.println();
		System.out.println("생성할 때 반드시 크기를 지정해야 함. 모든 크기는 아니더라도 일부의 크기는 꼭 지정해야 함");
		System.out.println("한 번 크기를 지정하면 절대 변경할 수 없는 특징이 있음");
		System.out.println();

		/*Q2 다음은 int[] 자료형에 3개의 정숫값 3, 4, 5를 저장하는 코드임. 각 코드가 어느 영역에 생성되는지를 쓰시오.
		     (이 때 객체가 생성되는 위칫값은 100번지라고 가정) */
		System.out.println("Q2 다음은 int[] 자료형에 3개의 정숫값 3, 4, 5를 저장하는 코드임. 각 코드가 어느 영역에 생성되는지를 쓰시오.");
		System.out.println("(이 때 객체가 생성되는 위칫값은 100번지라고 가정)");
		System.out.println();
		
		System.out.println("int[] a; -> 스택 영역에 배열 a 라는 객체만 생성됨");
		System.out.println("a = new int[3]; -> 힙 메모리 영역에 3개의 빈 방을 가진 배열이 생성됨.");
		System.out.println("a[0] = 3; -> int[] a객체의 힙 메모리 위치에 있는 배열의 첫 번째 방에 3이라는 값이 들어감");
		System.out.println("a[1] = 4; -> int[] a객체의 힙 메모리 위치에 있는 배열의 두 번째 방에 4이라는 값이 들어감");
		System.out.println("a[2] = 5; -> int[] a객체의 힙 메모리 위치에 있는 배열의 두 번째 방에 5이라는 값이 들어감");
		System.out.println();

		/*Q3 다음 코드의 출력 결과를 쓰시오.*/ System.out.println("Q3 다음 코드의 출력 결과를 쓰시오.");
		System.out.println();
		
		System.out.println("double[] a = {1.2, 3.4, 5.6};");
		System.out.println("double[] b = a; // 배열 a와 힙 메모리 위치 값을 공유, 동일한 배열 객체를 공유함");
		System.out.println("b[0] = 7.8; // 공유중인 배열 객체에 대한 직접적인 값 변경, a 또한 같은 객체를 공유하므로 값이 변경됨");
		System.out.println("System.out.println(Arrays.toString(a));");
		System.out.println("System.out.println(Arrays.toString(b));");
		System.out.println();
		
		double[] a = {1.2, 3.4, 5.6};
		double[] b = a;
		b[0] = 7.8;
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		System.out.println();
		
		/*Q4 다음과 같이 5개의 원소가 있는 1차원 배열의 모든 원소를 순서대로 출력하는 코드를 for-each 문을 이용해 작성하시오.*/
		System.out.println("Q4 다음과 같이 5개의 원소가 있는 1차원 배열의 모든 원소를 순서대로 출력하는 코드를 for-each 문을 이용해 작성하시오.");
		System.out.println();
		
		System.out.println("int[] q4 = new int[]{1, 2, 3, 4, 5};");
		System.out.println();
		
		int[] q4 = new int[]{1, 2, 3, 4, 5};
		
		for(int k: q4) {
			if(k == 1) {
				System.out.print("[");
			}
			System.out.print(k);
			if(k == q4.length) {
				System.out.println("]");
				break;
			}
			System.out.print(", ");
		}
		
		/*Q5 2차원 배열 객체를 생성하고 각 위치에 다음과 같이 값을 초기화하는 코드를 작성하시오.*/
		System.out.println("Q5 2차원 배열 객체를 생성하고 각 위치에 다음과 같이 값을 초기화하는 코드를 작성하시오.");
		System.out.println();
		
		System.out.println("int[][] a4 = new int[2][];");
		System.out.println();
		
		System.out.println("int[][] a4 = new int[2][];");
		System.out.println("a4[0] = new int[]{1, 3, 5};");
		System.out.println("a4[1] = new int[]{7, 9};");
		System.out.println();
		
		int[][] a4 = new int[2][];
		a4[0] = new int[]{1, 3, 5};
		a4[1] = new int[]{7, 9};
		
		/*Q6 이중 for 문을 이용해 위의 2차원 배열 a의 모든 원소를 출력하는 코드를 작성하시오.
		     (단, 2개의 for 문에 들어갈 조건식에는 반드시 .length를 사용해야 함.)*/
		System.out.println("Q6 이중 for 문을 이용해 위의 2차원 배열 a의 모든 원소를 출력하는 코드를 작성하시오.");
		System.out.println("(단, 2개의 for 문에 들어갈 조건식에는 반드시 .length를 사용해야 함.)");
		System.out.println();
		
		for(int i = 0; i < a4.length; i ++) {
			for(int j = 0; j < a4[i].length; j++) {
				if(j == 0) {
					System.out.print("[");
				}
				
				System.out.print(a4[i][j]);
				
				if(j == a4[i].length - 1) {
					System.out.println("]");
					break;
				}
				System.out.print(", ");
			}
		}
		
		/*Q7 다음 코드의 실행 결과를 쓰시오.*/ System.out.println("Q7 다음 코드의 실행 결과를 쓰시오.");
		System.out.println();
		
		System.out.println("String a7 = \"방가\";");
		System.out.println("String b7 = new String(\"방가\");");
		System.out.println("String c7 = \"방가\";");
		System.out.println("String d7 = new String(\"방가\");");
		System.out.println("String e7 = \"방가\";");
		System.out.println("String f7 = new String(\"방가\");");
		System.out.println();
		
		String a7 = "방가";
		String b7 = new String("방가");
		String c7 = "방가";
		String d7 = new String("방가");
		String e7 = "방가";
		String f7 = new String("방가");
		
		System.out.println("System.out.println(a7 == b7);");
		System.out.println(a7 == b7); // false // b7이 공유 불가능한 new 메서드를 사용한 객체이므로 불일치
		System.out.println("System.out.println(a7 == c7);");
		System.out.println(a7 == c7); // true // 공유 가능한 "방가" 객체를 a7과 공유하기 때문에 일치
		System.out.println("System.out.println(a7 == d7);");
		System.out.println(a7 == d7); // false // d7이 공유 불가능한 new 메서드를 사용한 객체이므로 불일치
		System.out.println("System.out.println(a7 == e7);");
		System.out.println(a7 == e7); // true // 공유 가능한 "방가" 객체를 e7과 공유하기 때문에 일치 
		System.out.println("System.out.println(a7 == f7);");
		System.out.println(a7 == f7);// false // f7이 공유 불가능한 new 메서드를 사용한 객체이므로 불일치
		System.out.println();
		
		/*Q8 String str = "내 이름은 [홍길동]입니다. 나이는 [15]살 입니다"라는 문자열이 있을 때 String 클래스의 메서드를 이용해
		     String name -> "홍길동", int age -> 15가 저장되도록 코드를 작성하시오(단, String 클래스의 indexOf(),
		     lastIndexOf(), substring() 메서드는 반드시 한 번 이상 사용해야 함.) */
 
		System.out.println("Q8 String str = \"내 이름은 [홍길동]입니다. 나이는 [15]살 입니다\"라는 문자열이 있을 때 String 클래스의");
		System.out.println("   메서드를 이용해 String name -> \"홍길동\", int age -> 15가 저장되도록 코드를 작성하시오.");
		System.out.println("   (단, String 클래스의 indexOf(), lastIndexOf(), substring() 메서드는 반드시 한 번 이상 사용해야 함.)");
		System.out.println();
		
		System.out.println("String str = \"내이름은 [홍길동]입니다. 나이는 [15]살 입니다\";");
		System.out.println("String name;");
		System.out.println("int age;");
		System.out.println();
		
		String str = "내이름은 [홍길동]입니다. 나이는 [15]살 입니다";
		String name;
		int age;
		
		name = str.substring(str.indexOf("홍길동"), str.indexOf("홍길동")+3);
		age = Integer.parseInt(str.substring(str.indexOf("15"), str.indexOf("15")+2));
		
		System.out.println(name);
		System.out.println(age);
		
	}
	
}
