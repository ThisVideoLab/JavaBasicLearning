package sec02_string.EX02_ModificationOfStringData;

import java.util.Arrays;

public class ModificationOfStringData {

	public static void main(String[]args) {
		
		/* 5.2.2 String 클래스의 2가지 특징
		   
		   String 클래스도 당연히 클래스이므로 다른 클래스들의 특징을 모두 지니고 있음. 하지만 워낙 자주 사용되는 클래스이다 보니 다른
		   클래스에는 없는 2개의 특징이 있음. 
		   첫번째 특징은 한 번 정의된 문자열은 변경할 수 없다는 것. 만일 문자열의 내용을 변경하자면 자바 가상 머신은 기존의 문자열을
		   수정하는 것이 아니라, 새로운 무자열을 포함하고 있는 객체를 생성해 사용하고, 기존의 객체는 버림. 일단 이 개념부터 빠르게 익혀보자.
		   
		   */
		   
		/*특징1) 객체 안의 값을 변경하면 새로운 객체를 생성*/ System.out.println("특징1) 객체 안의 값을 변경하면 새로운 객체를 생성");
		
		String str1 = new String("안녕");
		String str2 = str1; // str1의 힙 메모리 위치값을 복사, str1과 str2가 동일한 대상을 가리킴
		System.out.println(str1); 
		System.out.println(str2); 
		
		str1 = "안녕하세요"; // str1의 힙 메모리 위치값 변경, str1과 str2가 서로 다른 값을 가리킴
		System.out.println(str1);
		System.out.println(str2);
		str2 = str1; // 기존 "안녕"이라는 문자열을 홀로 사용하고 있던 str2도 더이상 사용하지 않는 순간, "안녕"이라는 문자열은 사용하지 않게
	 	System.out.println(); // 되고, 캐시 해제나 가비지 컬렉터에 의해 정리 될 수 있음.
		
		/*String 클래스의 특징과 배열의 특징 비교*/ System.out.println("String 클래스의 특징과 배열의 특징 비교");
		
		/* 값을 변경할 때 새로운 객체를 생성하는 String 클래스의 특징을 앞에서 배운 배열의 특징과 비교해보자. 배열은 객체의 값 자체가 
		   수정되므로 참조 변수 복사 이후 하나의 변수에서 수정하면 나머지 변수에도 적용됨.
		 */
		
		int[] array1 = new int[] {3, 4, 5};
		int[] array2 = array1; 
		array1[0] = 6; array1[1] = 7; array1[2] = 8;
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(array2));
		
		/*- 실습 - String 객체의 문자열 수정 및 다른 참조 자료형과의 비교*/
		System.out.println("- 실습 - String 객체의 문자열 수정 및 다른 참조 자료형과의 비교");
		
		/*문자열 수정*/ System.out.println("문자열 수정");
		
		String estr1 = new String("안녕"); // 힙 메모리에 새로운 문자열을 만들고 스택 메모리에 해당 문자열의 위치를 저장
		String estr2 = estr1; // 스택 메모리에 str1이 정한 위치값을 복사함.
		
		estr1 = "안녕하세요"; // 새로운 문자열을 만들어서 위치값을 저장.
		
		System.out.println(estr1); // 안녕하세요
		System.out.println(estr2); // 안녕
		System.out.println();
		
		/*문자열 수정*/ System.out.println("문자열 수정");
		
		int[] earray1 = new int[]{1, 2, 3};
		int[] earray2 = earray1; // earray1 배열의 위치값을 복사해서 그대로 사용함
		earray1[0] = 6; 
		earray1[1] = 7;
		earray1[2] = 8;
		
		System.out.println(Arrays.toString(earray1)); // [6, 7, 8]
		System.out.println(Arrays.toString(earray2)); // 위치값을 복사했기 때문에 새로 추가된 원소가 그대로 출력됨

	}
	
}
