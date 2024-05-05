package sec02_primarydatatype.EX03_PrimaryDataType_2;

public class PrimaryDataType_2 {

	public static void main(String[]args) {
		
		/* 2.3.6 문자 자료형
		   
		   char 자료형은 문자를 저장하는 자료형으로, 문자를 작은 따옴표(')안에 표기함. char 자료형은 정수를
		   저장할 수도 있지만, 그 정수를 숫자가 아닌 문자로 저장함. 만약 코드를 char a = 'A'; 와 같이 작성했다면
		   메모리에는 변수 a의 공간이 만들어지고, 그 안에 문자가 들어가야 함. 그러나 메모리에는 2진수 값만 저장이
		   가능하기 때문에 문자 저장이 불가능함. 그렇기에 자바는 모든 문자를 특정 정숫값으로 바꿔 저장함.
		   이렇게 대응하는 정숫값을 유니코드unicode라고 함.
		   
		   그렇기에 char 자료형에 문자 말고도 그 문자에 대응하는 정숫값을 직접 입력해도 동일한 문자를 출력함.
		   이러한 정숫값은 10진수, 16진수 등 다양한 진법으로 입력이 가능함. 또한 16진수 유니코드로도 입력 가능함.
		   여기에 유니 코드는 저장하고자 하는 문자의 유니 코드 값을 의미하나 오류로 인해 직접 표기는 불가능. 
		   
		   문자 A = 16진수 0x0041 = 10진수 65
		   이것을 직접 입력해보면 아래와 같음  
		 
		 */
		
		char a = 3; // 여기서 3은 숫자가 아닌 문자 3을 의미함.
		
		char b = 'A';
		char c = 0x0041;
		char d = 65;
		char e = '\u0041'; // 작은 따옴표에 주의할 것 
		
		System.out.println("문자로 입력한 A: "+b); // 문자로 저장하는 방법
		System.out.println("16진수로 입력한 A: "+c); // 16진수로 저장하는 방법
		System.out.println("10진수로 입력한 A: "+d); // 10진수로 저장하는 방법
		System.out.println("유니코드로 입력한 A: "+e); // 유니코드로 저장하는 방법
		
		/*코드에서 진법을 변환하는 방법
		  
		  자바에서는 정수를 다양한 진법으로 표현 할 수 있도록 지원함. 단 진법마다 숫자의 표현 방식이 다름.
		  10진수: 숫자(ex: int a = 11 -> 10진수 11)
		  2진수: 0b + 숫자(ex: int b = 0b1011 -> 10진수 11)
		  8진수: 0 + 숫자(ex: int c = 013 -> 10진수 11)
		  16진수: 0x + 숫자(ex: int d = 0xb -> 10진수 11)
		
		*/
		
		int data = 10;
		
		System.out.println(Integer.toBinaryString(data)); // 1010 // 10진수 -> 2진수
		System.out.println(Integer.toOctalString(data)); // 12/ // 10진수 -> 8진수
		System.out.println(Integer.toHexString(data)); // a // 10진수 -> 16진수
			
		System.out.println(Integer.parseInt("1010",2)); // 10에 대한 2진수 값 1010을 10진수로 반환
		System.out.println(Integer.parseInt("12",8)); // 10에 대한 8진수 값 12를 10진수로 반환
		System.out.println(Integer.parseInt("a",16)); // 10에 대한 16진수 값 a를 10진수로 반환
		
	}
}
