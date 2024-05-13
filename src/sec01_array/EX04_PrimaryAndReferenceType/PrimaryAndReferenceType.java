package sec01_array.EX04_PrimaryAndReferenceType;

public class PrimaryAndReferenceType {

	public static void main(String[]args) {

		/* 5.1.5 참조 자료형으로서 배열의 특징
		   
		   지금까지 기본 자료형과 참조 자료형의 차이를 익혔다면, 이를 통해 기본 자료형과 참조 자료형에서 변수를 복사할 때를 비교해 보자.
		   먼저 대입 연산자(=)를 이용해 변수가 복사되는 과정을 이해해야 함. '변수의 복사'라는 말에는 목적어가 빠져 있음. 그렇다면 어떤
		   변수를 복사한다는 의미일까? 바로 변수에 포함되어 있는 스택 메모리의 값임. 그런데 기본 자료형과 참조 자료형이 스택 메모리에 저장하는
		   값의 의미가 다르므로, 자연스럽게 둘 사이에 차이가 발생하는 것임.
		   먼저 기본 자로형은, 스택 메모리에 실제 데이터 값을 저장하고 있으므로 기본 자료형 변수를 복사하면 실제 데이터 값 1개가 추가로 복사됨.
		   이후 복사된 값을 아무리 변경해도 원본 값은 아무런 영향을 받지 않음.
		 */
		
		/*기본 자료형 변수 복사*/ System.out.println("기본 자료형 변수 복사");
		
		int ex1 = 3;
		int ex2 = ex1; // 변수 ex1의 데이터 값 복사
		ex2 = 7; // 변수 ex2의 데이터 값 변형
		System.out.println(ex1); // 3 // 변수 ex2의 값 변형이 ex1에 어떠한 영향도 없음
		System.out.println(ex2); // 7
		
		/* 참조 자로형은 스택 메모리에 실제 데이터 값이 아닌 힙 메모리에 저장된 객체의 위치를 저장하고 있음. 따라서 참조 자료형 변수를 복사하면
		   실제 데이터가 복사되는 것이 아니라 실제 데이터의 위칫값을 복사함. 고로 하나의 참조 변수를 이용해 데이터를 수정하면 다른 참조 변수가
		   가리키는 데이터도 변하게 되는 것.
		 */
		
		int[] ex3 = {3,4,5};
		int[] ex4 = ex3;
		ex4[0] = 7;
		System.out.println(ex3[0]); // 7 // ex4를 통해서 실제 데이터 위치에 있는 값을 바꿨기 때문에 ex[0]도 7로 바뀜 
		System.out.println(ex4[0]); // 7
		
		/*기본 자료형의 대입 연산*/ System.out.println("기본 자료형의 대입 연산");
		
		int value1 = 3;
		int value2 = value1;
		value2 = 7;
		System.out.println(value1); // 3 //value1은 value2의 데이터 값 변경과 무관함
		System.out.println(value2); // 
		System.out.println(); 
		
		/*참조 자료형의 대입 연산*/ System.out.println("참조 자료형의 대입 연산");
		
		int[] array1 = new int[] {3,4,5};
		int[] array2 = array1; // 힙 메모리의 위치값을 복사함
		array2[0] = 7;
		System.out.println(array1[0]); // array2[0] = 7로 해당 위치에 있는 실제 데이터값을 바꾸었기 때문에 array1의 값도 바뀜
		System.out.println(array2[0]);
		
	}
	
}
