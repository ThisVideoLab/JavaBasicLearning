package sec01_operator_1.EX05_LogicalOperator;

public class LogicalOperator {

	public static void main(String[]args) {
		
		/*
		 
		 3.2.5 논리 연산자
		 
		 논리 연산자는 비트 연산자와 매우 비슷하지만, 피연산자로 불리언값만 올 수 있고, 연산 결과 또한 불리언 타입만을 가짐. 논리 AND(&&)는
		 두 값이 모두 true일 때만 true, 나머지 모두 false 값을 가짐. 반면 논리 OR(||)은 두 값이 모두 false일 때만 false이며
		 나머지는 모두 true임. 
		 
		 쇼트 서킷
		 
		 이러한 논리 연산은 비트 연산자로도 수행이 가능함. 일반적으로 비트 연산자의 양쪽에 위치하고 있는 피연산자는 정숫값이지만, 양쪽 피연산자의
		 자리에 불리언 값이 위치하면 비트 연산자는 비트 연산이 아닌 논리 연산을 진행함.
		 여기서 논리 연산자로 논리 연산을 수행하는 것과, 비트 연산자로 논리 연산을 수행하는 것의 차이는, 바로 쇼트 서킷의 적용 여부임. 쇼트 서킷은
		 연산을 수행하는 과정에서 결과가 이미 확정됐을 때 나머지 연산 과정을 생략하는 것을 의미함. 예를 들어 (5>3)||(3<2)를 수행하고자 할 때
		 왼쪽의 (5>3)을 먼저 연산해 이미 true인 값을 얻었을 때 오른쪽 항의 결과와 상관 없이 결과는 항상 true임. 이렇듯 자명한 경우에 오른쪽
		 항을 아예 읽지도 않는 것이 바로 쇼트 서킷임.
		 논리 연산자로 논리 연산을 수행할 때는 쇼트 서킷이 적용되지만, 비트 연산자로 논리 연산을 수행하면 쇼트 서킷은 적용되지 아니함. 일괄적으로
		 모든 연산을 수행하는 것. 그 결과를 도출하는데는 전혀 차이가 없지만, 쇼트 서킷은 불필요한 연산 과정을 생략하는데 그 강점이 있음. 
		 그렇다고 항상 논리 연산자가 좋다는 것은 아님. 의도적으로 쇼트 서킷을 배제해야 하는 경우 또한 있음. 다음 코드를 살펴보자. */
		 
		 int a, b, c;
		 
		 /*-논리 연산자-*/ System.out.println("-논리 연산자-");System.out.println("");
		 a = 3; b = 3; c=3;
		 
		 System.out.println(false && a++ > 6); // false // 증감 연산을 하기 전에 쇼트 서킷 수행
		 System.out.println(true||b ++ >6 ); // true // 증감 연산을 하기 전에 쇼트 서킷 수행
		 System.out.println(true^c ++ >6 ); // true // 상호 비교를 위해 후항 또한 연산해야 하므로 증감 연산 수행
		 System.out.println(a); // 3
		 System.out.println(b); // 3
		 System.out.println(c); // 4
		 System.out.println();
		
		 /*-비트 연산자-*/ System.out.println("-비트 연산자-");System.out.println("");

		 a = 3; b = 3; c=3; // 계산을 위한 자료형 값 재대입
		 
		 System.out.println(false & a++ > 6); // false// 비트 연산자는 모든 연산을 하므로 증감 연산도 수행함, a의 값 1증가
		 System.out.println(true|b ++ >6 ); // true // 비트 연산자는 모든 연산을 하므로 증감 연산도 수행함, a의 값 1증가
		 System.out.println(true^c ++ >6 ); // true, 상호 비교를 위해 후항 또한 연산해야 하므로 증감 연산 수행
		 System.out.println(a); // 4
		 System.out.println(b); // 4
		 System.out.println(c); // 4
		 System.out.println();
		 
		 /* 한가지 위 코드에서 상기할 점은, 논리 XOR 연산자와 비트 XOR 연산자는 논리 연산을 위해 항상 양쪽 값을 비교해야 하기 때문에
		    쇼트 서킷이 발생할 구조적 여지가 없다는 것. 따라서 연산자의 기호 또한 동일하게 표시함. */
		 
		 /*-논리 연산자-*/ System.out.println("-논리 연산자-");System.out.println("");
		 /*@AND(&&)*/ System.out.println("@AND(&&)");System.out.println("");
		 
		 System.out.println(true&&true); // true // 쇼트 서킷 미발동
		 System.out.println(true&&false); // false // 쇼트 서킷 미발동
		 System.out.println(true&&(5<3)); // false // 쇼트 서킷 미발동
		 System.out.println((5<=5)&&(7>2)); // true // 쇼트 서킷 미발동
		 System.out.println();

		 /*@OR(||)*/ System.out.println("@OR(||)");System.out.println("");
		 
		 System.out.println(true||true); // true // 쇼트 서킷 발동
		 System.out.println(true||false); // true // 쇼트 서킷 발동
		 System.out.println(false||(5<3)); // false // 앞 항의 피연산자만으로 연산이 완료되지 못했으므로 쇼트 서킷 발동 불가
		 System.out.println((5<=5)||(7>2)); // true // 쇼트 서킷 발동
		 System.out.println();
		 		 
		 /*@XOR(^)*/ System.out.println("@XOR(^)");System.out.println("");
		 
		 System.out.println(true^true); // false // 연산의 구조적 이유로 쇼트 서킷 발동 불가
		 System.out.println(true^false); // true // 연산의 구조적 이유로 쇼트 서킷 발동 불가
		 System.out.println(false^(5<3)); // false // 연산의 구조적 이유로 쇼트 서킷 발동 불가
		 System.out.println((5<=5)^(7>2)); // false // 연산의 구조적 이유로 쇼트 서킷 발동 불가
		 System.out.println();
		 
		 /*@NOT(!)*/ System.out.println("@NOT(!)");System.out.println("");
		 
		 System.out.println(!true); // false // 연산의 구조적 이유로 쇼트 서킷 발동 불가
		 System.out.println(!false); // true // 연산의 구조적 이유로 쇼트 서킷 발동 불가
		 System.out.println(false||!(5<3)); // true // 앞 피연산자의 연산만으로 연산 결과를 도출하지 못했으므로 쇼크 서킷 발동 불가
		 System.out.println((5<=5)||!(7>2)); // true // 앞 피연산자의 연산만으로 연산 결과를 도출했으므로 쇼크 서킷 발동
		 System.out.println();
		 
		 /*-비트 연산자로 논리 연산 수행-*/ System.out.println("-비트 연산자로 논리 연산 수행-");System.out.println("");
		 
		 System.out.println(true&true); // true
		 System.out.println(true&false); // true
		 System.out.println(true|(5<3)); // true
		 System.out.println((5<=5)|(7>2)); // true
		 System.out.println(); // true
		 
		 /*-@쇼트서킷 사용 여부(논리 연산자는 0, 비트 연산자 x)-*/
		 System.out.println("@쇼트서킷 사용 여부(논리 연산자는 0, 비트 연산자 x)-");System.out.println("");
		 
		 int value1 = 3;
		 System.out.println(false && ++value1> 6); // 둘 다 참인지 연산해야 하는데, 앞 피연산자부터 false라서 쇼트서킷 발동
		 System.out.println(value1); // 쇼트 서킷 발동으로 증감 연산 없이 그대로 3을 출력함.
		 
		 int value2 = 3;
		 System.out.println(false & ++value2> 6); // false, 비트 연산자이므로 모든 연산을 수행하면서 증감 연산까지 수행
		 System.out.println(value2); // 4, 비트 연산자에는 쇼트 서킷이 없으므로 증감 연산이 적용되어 1 증가했음.
		 
		 int value3 = 3;
		 System.out.println(true || ++value3> 6); // 둘 중 하나라도 true이면 무조건 결과 값이 true이기 때문에 쇼트 서킷 발동
		 System.out.println(value3); // 3, 앞 피연산자의 연산만으로도 결과 값이 나왔으므로 쇼트서킷 발동에 따른 증감 연산 미수행
		 
		 int value4 = 3;
		 System.out.println(true | ++value4> 6); // 둘 중 하나라도 true이면 무조건 결과 값이 true이기 때문에 쇼트 서킷 발동
		 System.out.println(value4); // 4, 비트 연산자에는 쇼트 서킷이 없으므로 증감 연산이 적용되어 1 증가했음.
		 		 
	}
	
}
