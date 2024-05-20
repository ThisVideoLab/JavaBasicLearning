package sec02_method.EX03_ArrayArgumentMethod;

import java.util.Arrays;

public class ArrayArgumentMethod {

	public static void main(String[]args) {
		
		/* 입력매개변수가 배열인 메서드 호출하기 
		   
		   앞에서 살표본 예제들의 입력매개변수는 모두 기본 자료형이었음. 이제 조금 더 나아가 입력매개변수가 배열일 때를 살펴보자.
		   
		 */
		
		printArray(new int[] {1, 2, 3}); // 배열의 생성과 함께 printArray 메서드를 호출함.
		
		/* 위의 코드는 배열의 생성과 함께 printArray 메서드를 호출하는 상황임.그런데 printArray 메서드는 입력매개변수로 int 자료형을
		   받기 때문에, 생성과 동시에 int형의 초깃값을 입력할 수 있는 배열 생성 방법만이 사용 가능함. 다른 2가지의 배열 생성 방법을 사용하면
		   오류가 발생하거나, 다른 방식으로 코드를 짜야 함.
		   
		   int[] a= new int[2]; 
		   a[0] = 1;
		   a[1] = 2;
		   
		   int[] a;
		   a = {1, 2, 3};
		   
		 */
		
		
	}
	
	public static void printArray(int[] a) { // printArray 메서드는 int 자료형만을 입력매개변수로 받음.
		System.out.println(Arrays.toString(a));
	}
	
	
	
}
