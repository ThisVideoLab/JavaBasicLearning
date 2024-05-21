package sec02_method.EX05_EffectOfReferenceDataArgument;

import java.util.Arrays;

public class EffectOfReferenceDataArgument {

	public static void main(String[]args) {
		
		/* 참조 자로형 입력매개변수의 전달
		   
		   참조 자료형을 입력매개변수로 넘기게 되면, 넘겨진 변수의 스택 메모리값이 복사되어 사용되는 것은 기본 자료형의 흐름과 동일함. 그러나
		   참조 자로형은 스택 메모리에 객체의 위치값을 저장하고 있으므로 실제 객체가 아닌 객체의 참조값이 전달돼 복사됨. 따라서 호출한 메서드와
		   호출된 메서드에서 모두 동일한 객체를 쳐다보고 있는 상황이 됨. 따라서 호출된 메서드에서 객체의 값을 변경한 후 다시 호출한 메서드로
		   돌아가게 되면 해당 객체값이 바뀌게 됨.
		   
		 */
		
		int[] array = new int[] {1, 2, 3};
		System.out.println(Arrays.toString(array));
		
		modifyData(array);
		printArray(array);
	
	}
	public static void modifyData(int[] a) {
		a[0] = 4;
		a[1] = 5;
		a[2] = 6;
	}
	public static void printArray(int[] a) {
		System.out.println(Arrays.toString(a));		
	}
	
}
