package sec02_method.EX03_ArrayArgumentMethod;

import java.util.Arrays;

public class ArrayArgumentMethod {

	public static void main(String[]args) {
		
		/* 입력매개변수가 배열인 메서드 호출하기 
		   앞에서 살표본 예제들의 입력매개변수는 모두 기본 자료형이었음. 이제 조금 더 나아가 입력매개변수가 배열일 때를 살펴보자.
		   먼저 메인 클래스 내부에, 그리고 메인 메서드 밖에 printArray 메서드를 작성해 줌. 
		   
		*/
		printArray(new int[] {1, 2, 3}); // 배열의 생성과 함께 printArray 메서드를 호출함.
		int[] a = new int[]{1, 2, 3};
		printArray(a);
		
		/* 위의 코드는 배열의 생성과 함께 printArray 메서드를 호출하는 상황임.그런데 printArray 메서드는 입력매개변수로 int 자료형을
		   받기 때문에, 생성과 동시에 int형의 초깃값을 입력할 수 있는 배열 생성 방법을 사용하거나, printArray 메서드를 호출하기 전에 미리
		   배열의 값을 넘겨준 이후라야 가능함. 배열의 생성 방법 3가지 중 3번째 방법 자료형[] 변수 = {1, 2, 3}; 에 대해 혼동이 있어서
		   코드를 잘못 입력했으니 추후에도 주의할 것.
		 */
		
	}
	
	public static void printArray(int[] a) { // printArray 메서드는 int 자료형만을 입력매개변수로 받음.
		System.out.println(Arrays.toString(a));
	}
	
}
