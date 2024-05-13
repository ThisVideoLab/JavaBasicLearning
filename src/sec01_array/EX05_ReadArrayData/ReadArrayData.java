package sec01_array.EX05_ReadArrayData;

import java.util.Arrays;

public class ReadArrayData {

	public static void main(String[]args) {

		/* 5.1.6 반복문을 이용해 배열 데이터 읽기
		   
		   배열은 동일한 자료형을 여러 개 묶어 저장하는 방식. 따라서 배열의 모든 데이터를 출력하려면 다음처럼 배열의 길이만큼 출력해야 함.
		   하지만 너무 번거롭기 때문에, 이를 위해 반복문을 사용하는 것이 좋음.
		   
		   int[] a = new int[100];
		   a[0] = 1, a[1] = 2, a[2] = 3, ...,  a[99] = 100;
		   
		   System.out.println(a[0];
		   System.out.println(a[1];
		   System.out.println(a[2];
		   ...
		   System.out.println(a[99]; // 인덱스는 n-1 
		   
		   배열의 길이
		   
		   반복문의 횟수를 결정하려면 먼저 배열의 길이를 알아야 함. 물론 배열을 생성할 때 길이가 결정되므로 그 길이만큼 반복문을 수행하면 되지만,
		   많은 배열을 사용할 때 모든 배열의 길이를 일일히 고려할 필요는 없음. 자바는 [배열 참조 변수.length]로 배열의 길이를 구할 수 있는
		   쉬운 방법을 제공함. 여기서 포인트 연산자(.)는 '해당 참조 변수가 가리키는 곳으로 가라.'는 의미임. length는 객체에 포함된 읽기
		   전용 속성으로, 배열 객체의 방 개수에 해당하는 값을 지님. 따라서 '배열 참조 변수.length'를 풀어 설명하면 '배열 참조 변수가 가리키는
		   곳에 가면 배열 객체가 있는데, 그 배열의 방의 개수를 가져오라.'는 의미임.
		   
		   배열의 길이 구하기
		   배열 참조 변수.length
		   ex) int[] a = new int[]{3, 4, 5, 6, 7, 8};
		   System.out.println(a.length); // = 5
		 */
		
		/*반복문을 이용한 1차원 배열의 값 출력*/ System.out.println("반복문을 이용한 1차원 배열의 값 출력");
		
		int[] ex1 = new int[100]; // 100칸 짜리 배열의 생성
		
		for(int i = 0; i < 100; i++){ // 교재는 직접 입력하라고 했으나 for 문으로 대체
			ex1[i] = i + 1;
		}
		
		/*for 문을 활용한 출력*/ System.out.println("for 문을 활용한 출력");
		
		for(int i = 0; i < 100; i++) { // 입력된 배열의 각 값을 for 문으로 전부 출력
			System.out.print(ex1[i] + " ");
		}
		System.out.println();
		System.out.println();
		
		/*for-each 문을 활용한 출력*/ System.out.println("for-each 문을 활용한 출력");
		
		for(int k: ex1) { // 배열이나 컬렉션 등의 집합 객체에서 원소들을 하나씩 꺼내는 과정을 반복하는 구문
			System.out.print(k + " ");
		}
		System.out.println();
		System.out.println();
		
		/*Arrays 클래스의 toString() 정적 매서드를 활용한 출력*/
		System.out.println("Arrays 클래스의 toString() 정적 매서드를 활용한 출력");
		
		System.out.println(Arrays.toString(ex1)); // 앞뒤로 대괄호가 나온다는 특징이 있음
		System.out.println();
		
		/*- 실습 - 1차원 배열의 원소값 출력*/ System.out.println("- 실습 - 1차원 배열의 원소값 출력");
		
		int[] array1 = new int[] {3, 4, 5, 6, 7};
		
		/*배열의 길이 구하기*/ System.out.println("배열의 길이 구하기");
		System.out.println(array1.length);
		System.out.println();
		
		/*배열 출력하기1 - 인덱스마다 출력 코드 작성*/ System.out.println("배열 출력하기1 - 인덱스마다 출력 코드 작성");
		System.out.print(array1[0] + " ");
		System.out.print(array1[1] + " ");
		System.out.print(array1[2] + " ");
		System.out.print(array1[3] + " ");
		System.out.print(array1[4] + " ");
		System.out.println();
		System.out.println();
		
		/*배열 출력하기2 - for 문으로 출력*/ System.out.println("배열 출력하기2 - for 문으로 출력");
		
		for(int i = 0; i < 5; i++) {
			System.out.print(array1[i] + " ");
		}
		System.out.println();
		System.out.println();
		
		/*배열 출력하기3 - for-each 문으로 출력*/ System.out.println("배열 출력하기3 - for-each 문으로 출력");
		
		for(int k: array1) {
			System.out.print(k + " ");
		}
		System.out.println();
		System.out.println();
		
		/*배열 출력하기4 - Arrays 클래스 내 toString() 메서드 사용*/
		System.out.println("배열 출력하기4 - Arrays 클래스 내 toString() 메서드 사용");
		
		System.out.println(Arrays.toString(array1));
		
	}
	
}
