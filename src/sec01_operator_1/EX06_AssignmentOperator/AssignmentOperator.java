package sec01_operator_1.EX06_AssignmentOperator;

public class AssignmentOperator {

	public static void main(String[]args) {
		
		/* 3.2.6 대입 연산자
		 		 
		 대입 연산자(=)는 오른쪽 피연산자의 연산 결과를 왼쪽 변수에 대입하는 연산자로, 가장 많이 사용하는 연산자 중 하나임. 가령 a = 3이라는
		 코드는 오른쪽 값인 3을 왼쪽 변수 a에 대입하라는 명령임. 그렇다면 a = a + 3은 어떨까. 수학적으로는 말도 안되는 수식이지만 자바에서는
		 실행이 가능함. 그 이유는 등호의 오른쪽을 먼저 계산 한 후에, 왼쪽에 그 결과 값을 대입하기 때문임.
		 
		 이러한 대입 연산자는 축약형으로 사용이 가능함. 일반적으로 a = a + 3의 코드에서 왼쪽 변수 a와 중복되는 오른쪽 변수 a를 생략해서
		 표현이 가능함. 이를 표현하면 a += 3으로 표현할 수 있음. 오른쪽 변의 중복된 변수를 생략하고 연산자를 등호= 연산자의 왼쪽 편으로
		 넘기는 것으로 축약형을 표현함. 으레 그렇듯이 이것은 코드적 약속이기 때문에 수식과는 무관함.
		 
		 a = a + b -> a += b
		 a = a - b -> a -= b
		 a = a * b -> a *= b
		 a = a / b -> a /= b
		 a = a & b -> a &= b
		 a = a | b -> a |= b
		 a = a >> b -> a >>= b
		 a = a << b -> a >>= b
		 a = a>>>b -> a >>>= b
		 
		 말 그대로 축약 표현이기 때문에, 결과 값에는 아무런 영향을 미치지 않음.  */
		
		/*-대입 연산자와 축약 표현-*/ System.out.println("-대입 연산자와 축약 표현-");System.out.println("");
		/*@대입 연산자*/ System.out.println("@대입 연산자");System.out.println("");
		
		int value1= 3;
		value1 = value1 + 3; // 오른쪽 항부터 계산하여 value1 값에 3을 더한 후에 다시 그 값을 value1에 대입해 6이 됨.
		System.out.println(value1); // 6
		System.out.println();
		
		/*@축약 표현*/ System.out.println("@축약 표현");System.out.println("");
		
		int value2;
		value2 = 5; System.out.println(value2 +=2); // 7
		value2 = 5; System.out.println(value2 -=2); // 3
		value2 = 5; System.out.println(value2 *=2); // 10
		value2 = 5; System.out.println(value2 /=2); // 2 // 이때 2.5는 int 자료형이므로 소수점 소실
		value2 = 5; System.out.println(value2 %=2); // 1 // 5를 2로 나눈 후의 나머지		
		value2 = 5; System.out.println(value2 |=2); // 7 // 101(5) | 010(2) = 111(7)
		value2 = 5; System.out.println(value2<<=2); // 20 // value2 << 2하면 101 -> 10100 되어서 20
		value2 = 5; System.out.println(value2>>=2); // 1 // value2 >> 2하면 101 -> 001 되어서 1
		value2 = 5; System.out.println(value2>>>=2); // 1 // value2 >> 2하면 101 -> 1 되어서 1
		
	}
	
}
