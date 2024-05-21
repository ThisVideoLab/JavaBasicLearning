package sec02_method.EX04_EffectOfPrimaryDataArguement;

public class EffectOfPrimaryDataArguement {

	public static void main(String[]args) {
		
		/* 기본 자료형 입력매개변수와 참조 자료형 입력매개변수의 차이
		   
		   배열과 같은 참조 자료형이 입력 매개변수로 넘겨질 때 실제 객체가 전달되는 것이 아니라 객체의 위칫값이 전달된다는 것을 명심할 것.
		   그 결과 기본 자료형이 입력매개변수로 넘겨질 때와 다른 동작을 수행함. 먼저 기본 자료형이 입랙매개변수로 전달될 때를 살펴보자.
		 
		 */
		
		int a = 3;
		int k1 = twice(3);
		int k2 = twice(a);
		
		System.out.println(k1);
		System.out.println(k2);
		System.out.println(a);
		
		/* 위의 사례처럼 twice(3)의 호출로 넘겨진 값 3은 tiwce() 메서드의 지역 변수 a에 복사되고, a값을 두 배로 곱한 값을 a 값으로
		   저장한 후에 리턴함. 즉 k1의 값은 6이 됨. 두 번째를 주의해서 봐야 하는데, main() 함수 안의 a값을 twice() 메서드의 입력으로
		   넘겨줌. 그러면 twice() 메서드에서는 int a(twice() 메서드의 지역 변수) = a(main() 메서드의 지역 변수)를 가장 먼저
		   실행할 것임. 등호(=) 는 스택 메모리를 복사하라는 말이므로, main() 메서드의 지역 변수 a의 스택 메모리 값이 twice() 메모리의
		   지역 변수 a로 복사되는 것. 이후에 twice() 메서드는 자신의 a 값을 2배 곱한 후 변수 a 값에 넣었으므로, twice() 메서드의
		   a값에는 최종적으로 6이 저장되는 것.
		   이 후에 다시 main() 메서드로 돌아오더라도 main() 메서드의 지역 변수 a의 값은 변형이 없음. twice() 메서드의 a는 단순히
		   main() 메서드의 a 값을 복사한 것에 불구 하기 때문임. 이렇듯 기본 자료형을 입력매개변수로 전달하면 전달 받은 메서드는 값을 복사해
		   사용할 뿐, 그 대상의 값을 바꾸지 아니함.
		   
		 */
		
		/*- 실습 - 기본 자료형 입랙며개변숫값의 변화*/ System.out.println("- 실습 - 기본 자료형 입랙며개변숫값의 변화");
		
		int exa = 3;
		int result1 = twice(3);
		System.out.println(result1);
		
		int result2 = twice(exa);
		System.out.println(result2);
		System.out.println(exa);
		
	}
	
	public static int twice(int a) {
		a = a * 2;
		return a;
	}
	
}
