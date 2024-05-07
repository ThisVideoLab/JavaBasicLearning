package sec01_operator_1.EX08_BookPractice;

public class BookPractice {

	public static void main(String[]args) {
		
		/*Q1. 다음은 산술 연산에 관한 코드다. 출력값을 쓰시오. */ 
		System.out.println("Q1. 다음은 산술 연산에 관한 코드다. 출력값을 쓰시오.");System.out.println("");
		
		System.out.print("System.out.println(2+3/2); 의 값은 ");
		System.out.print(2+3/2); // 3
		System.out.println(": 3/2 연산에서 1.5가 나오지만 int 자료형이므로 0.5를 버리고 1만 더해서 3이 됨.");
		
		System.out.print("System.out.println(10 % 3 + 5 / 3); 의 값은 ");
		System.out.print(10 % 3 + 5 / 3); // 2
		System.out.println(": (10을 3으로 나눈 나머지: 1) + (5를 3으로 나눈 값의 정수 부분: 1) = 2");
		
		System.out.print("System.out.println(4 + 5 / 2); 의 값은 ");
		System.out.print(4 + 5 / 2); // 6
		System.out.println(": 4 + (5를 2로 나눈 값의 정수 부분: 2) = 6");
		System.out.println();
		
		/*Q2. 다음은 증감 연산에 관한 코드다. 출력값을 쓰시오 */ 
		System.out.println("Q2. 다음은 증감 연산에 관한 코드다. 출력값을 쓰시오");System.out.println("");
		
		int a = 5;
		int b = a++; // 이 곳에서 a는 증감 연산으로 +1, 그러나 b는 일단 a를 대입하고 난 뒤라서 그대로 5임.
		
		System.out.print("int a = 5;");
		System.out.println("int b = a++; 일 때");
		
		System.out.print("System.out.println(a); 의 값은 ");
		System.out.print(a); // 6
		System.out.println(": b 값을 대입하는 과정에서 a에 ++ 증감 연산이 일어나 a = 6이 됨.");
		
		System.out.print("System.out.println(b); 의 값은 ");
		System.out.print(b); // 5
		System.out.println(": b 값을 대입하는 과정에서 a에 ++ 증감 연산을 하기 전에 b값에 a = 5를 대입함.");
		
		System.out.print("System.out.println(++a); 의 값은 ");
		System.out.print(++a); // 7
		System.out.println(": 기존 a = 6에 ++ 증감 연산한 a의 값을 대입하기 때문에 a = 7");
		
		System.out.print("System.out.println(++b); 의 값은 ");
		System.out.print(++b); // 6
		System.out.println(": 기존 b = 5에 ++ 증감 연산한 a의 값을 대입하기 때문에 b = 6");
		
		System.out.print("System.out.println(a++ - --b); 의 값은 ");
		System.out.print(a++ - --b); // 2
		System.out.println(": 증감 연산보다 선행해서 a = 7로 대입됨, 반면 b = 6에서 -- 증감 연산을 통해 b = 5로 대입 되므로 7- -5 = 2");

		System.out.print("System.out.println(a+b); 의 값은 ");
		System.out.print(a+b);
		System.out.println(": 윗 행의 코드 연산 이후 결과적으로 a = 8, b = 5의 값을 지님");
		System.out.println();
		
		/*Q3. 다음은 비트 연산자에 관한 코드다. 출력값을 쓰시오. (3 = 0b00000011, 5 = 0b00000101이며 출력값은 2진수로 표현 가능) */ 
		System.out.println("Q3. 다음은 비트 연산자에 관한 코드다. 출력값을 쓰시오. ");
		System.out.println("(3 = 0b00000011, 5 = 0b00000101이며 출력값은 2진수로 표현 가능)");System.out.println("");
		
		System.out.println("System.out.println(5 & 3);");
		System.out.println("System.out.println(5 | 3);");
		System.out.println("System.out.println(5 ^ 3);");
		System.out.println("System.out.println(~5);");
		System.out.println();
		
		System.out.println("  0b00000101");
		System.out.println("& 0b00000011");
		System.out.println("------------");
		System.out.print("  0b00000001 = "); // 1
		
		System.out.println(5 & 3);
		System.out.println();
		
		System.out.println("  0b00000101");
		System.out.println("| 0b00000011");
		System.out.println("------------");
		System.out.print("  0b00000111 = "); // 7
		
		System.out.println(5 | 3);
		System.out.println();
		
		System.out.println("  0b00000101");
		System.out.println("^ 0b00000011");
		System.out.println("------------");
		System.out.print("  0b00000110 = "); // 6
		
		System.out.println(5 ^ 3);
		System.out.println();
		
		System.out.println("~ 0b00000101");
		System.out.println("------------");
		System.out.print("  0b1111010 = "); // -6 // 음수 전환할 때 -1 더해주는 것에 주의할 것
		
		System.out.println(~5);
		System.out.println();
		
		/*Q4. 다음은 시프트 연산자에 관한 코드다. 출력값을 쓰시오. */ 
		System.out.println("Q4. 다음은 시프트 연산자에 관한 코드다. 출력값을 쓰시오.");System.out.println();
		
		System.out.println("System.out.println(7<<2);");
		System.out.println("System.out.println(7>>2);");
		System.out.println("System.out.println(-7<<2);");
		System.out.println("System.out.println(-7>>2);");
		System.out.println("System.out.println(-1>>>30);");
		System.out.println();
		
		System.out.print("0b00..00111 << 2, 왼쪽으로 2자리를 시프트 연산하면 0b00..11100 의 값은 ");
		System.out.println(7<<2); // 28
		
		System.out.print("0b00..00111 >> 2, 오른쪽으로 2자리를 시프트 연산하면 0b00..0001 의 값은 ");
		System.out.println(7 >> 2); // 1
		
		System.out.print("0b11..11000 << 2, 왼쪽으로 2자리를 시프트 연산하면 0b11..00011 의 값은 ");
		System.out.println(-7 << 2); // -28
		
		System.out.print("0b11..11000 >> 2, 오른쪽으로 2자리를 시프트 연산하면 0b11..1110 의 값은 ");
		System.out.println((-7 >> 2)+" (이때 소수점 자리를 무조건 올림하여 -1이 -2가 됨)"); // -2
		
		System.out.print("0b11..1110 >>> 30, 30 자리를 논리 시프트 연산하면 0b00..1111 의 값은 ");
		System.out.print(-1 >>> 30); // 0
		System.out.println(" -> 그러나 답을 0이라고 생각함. 자세한 내용은 주석 참조");
		System.out.println();
		
		/* 편의를 위해 무한대처럼 표기해 준 교재와 달리(또한 산술 시프트 내용에서 별도의 언급이 없었음), int 자료형의 최대 자리수는
		   32자리임. 고로 30자리를 밀면 마지막 2자리 말고 새로 비워진 자리마다 0으로 채워져서 결국 다음과 같은 형태가 됨.
		   0b 1111 1111 1111 1111 1111 1111 1111 1111
           0b 0000 0000 0000 0000 0000 0000 0000 0011
           고로 답은 3이 됨. 그러나 교재 앞 부분에 int 형의 최대 자리 수에 대한 언급이 있긴 하므로 이를 앞서 숙지하고 본 문제에서
           연상하지 못한 점에서 책만을 탓할 것은 아님. 그러니 부단히 외우고 적용하자. */
		 
		/*Q5. 다음은 비교 연산자에 관한 코드다. 출력값을 쓰시오. */ 
		System.out.println("Q5. 다음은 비교 연산자에 관한 코드다. 출력값을 쓰시오.");System.out.println(); 
		 
		System.out.print ("System.out.println(3<3); 의 값은 "); 
		System.out.println(3<3); // false
		
		System.out.print ("System.out.println(5>=3); 의 값은 "); 
		System.out.println(5>=3); // true
		
		System.out.print ("System.out.println(5<=5); 의 값은 "); 
		System.out.println(5<=5); // true
		
		System.out.print ("System.out.println(5==5); 의 값은 "); 
		System.out.println(5==5); // true
		
        System.out.print ("System.out.println(5==5); 의 값은 "); 
		System.out.println(5!=5); // false
		System.out.println();
		
		/*Q6. 다음은 논리 연산자에 관한 코드다. 출력값을 쓰시오.*/ 
		System.out.println("Q6. 다음은 논리 연산자에 관한 코드다. 출력값을 쓰시오.");System.out.println(); 
		
		System.out.print("System.out.println(5==5); 의 값은 "); 
		System.out.print(false && true); // false - 쇼트 서킷 발동
		System.out.println(" - 전항, 후항 모두 true일 때 true 값이므로, 전항이 false로 연산 된 후 쇼트 서킷 발동"); 
		
		System.out.print("System.out.println((4 <= 4)|(6<3)); 의 값은 "); 
		System.out.print((4 <= 4)||(6<3)); // true
		System.out.println(" - OR 논리 연산자 연산에서 전항이 true를 만족하기 때문에 true가 성립하며 쇼크 서킷 발동"); 
		
		System.out.print("System.out.println(false ^ (3>= 4)); 의 값은 "); 
		System.out.print(false ^ (3>= 4)); // false
		System.out.println(" - XOR 논리 연산자는 서로 다른 불리언 값을 가져야 true인데 전후항 모두 false이므로 false"); 
		
		System.out.print("System.out.println(!(3<=3)); 의 값은 "); 
		System.out.print(!(3<=3)); // false
		System.out.println(" - 비교 연산의 값이 true이기 때문에, NOT 연산자는 false 값을 출력함"); 
		System.out.println();
		
		/*Q7. 다음은 논리 연산자와 비트 연산자로 논리 연산을 수행한 코드다. 출력값을 쓰시오.*/ 
		System.out.println("Q7. 다음은 논리 연산자와 비트 연산자로 논리 연산을 수행한 코드다. 출력값을 쓰시오.");System.out.println(); 
		
		System.out.println("int c = 4, d =5, e =7; 일 때");
		int c = 4, d =5, e =7;
		
		System.out.print("System.out.println(false && c-- > 6); 의 값은 ");
		System.out.print(false && c-- > 6); // false
		System.out.println(" - 전후항이 모두 true를 만족해야 true인데 전항에 false 값이 주어지는 즉시 쇼트 서킷이 발동하고 false 값 출력");
				
		System.out.print("System.out.println(true | d++ > 6); 의 값은 ");
		System.out.print(true | d++ > 6); // true
		System.out.println(" - OR 비트 연산자 이므로 전후항 중 하나라도 true일 경우 true");
		
		System.out.print("System.out.println(true ^ e++ > 6); 의 값은 ");
		System.out.print(true ^ e++ > 6); // 
		System.out.println(" - XOR 비트 연산자이므로 전후항의 값이 서로 달라야 하는데, e= 7이므로 모두 true이므로 false ");
		
		System.out.print("System.out.println(c); 의 값은 ");
		System.out.print(c);
		System.out.println(" - 2행의 코드에 증감 연산이 있으나 전항 연산 후에 쇼트 서킷 발동으로 연산 자체를 생략해서 그대로 c = 4");
		
		System.out.print("System.out.println(d); 의 값은 ");
		System.out.print(d);
		System.out.println(" - 3행에서 ++ 증감 연산 결과 d = 6");
		
		System.out.print("System.out.println(e); 의 값은 ");
		System.out.print(e);
		System.out.println(" - 4행에서 ++ 증감 연산 결과 e = 8");
		System.out.println();
		
		/*Q8. 다음은 대입 연산자에 관한 코드다. 출력값을 쓰시오.*/ 
		System.out.println("Q8. 다음은 대입 연산자에 관한 코드다. 출력값을 쓰시오.");System.out.println();
		
		System.out.println("int f = 3; 일 때");
		int f = 3;
		
		System.out.print("f <<= 1; 의 값은 ");
		f <<= 1;
		System.out.print(f);
		System.out.println("  -> f = 0b0011에서 왼쪽으로 1자리 연산 시프트를 실행하면 0b0110, 0b0110 = 6");
	
		System.out.print("f &=5; 의 값은 ");
		f &=5;
		System.out.print(f);
		System.out.println("  ->  f = 6 =0b0110, 5 = 0b0101 이므로");
		System.out.println("                  0b0110");
		System.out.println("                & 0b0101");
		System.out.println("                --------");
		System.out.println("                  0b0100 = 4");
		
		System.out.println("f -= 1;");
		System.out.print("f *= 2; 의 값은 ");
		f -= 1;
		System.out.print(f *= 2);
		System.out.println("  ->  3행의 연산 결과 f = 4 이므로, f = f - 1의 값은 3, 따라서 f = 3*2의 값은 6");
		System.out.println();
		
		/*Q9. 다음은 삼항 연산자에 관한 코드다. 출력값을 쓰시오.*/ 
		System.out.println("Q9. 다음은 삼항 연산자에 관한 코드다. 출력값을 쓰시오.");System.out.println();
		
		System.out.println("int g = 3;");
		System.out.println("int h = 5;");
		System.out.println("int i = 3; 일 때");
		System.out.println();
		
		int g = 3;
		int h = 5;
		int i = 7;   
		
		System.out.print("System.out.println((a>b) ? \"안녕하세요\" : \"반갑습니다\"); 의 값은 ");
		System.out.print((g > h) ? "안녕하세요" : "반갑습니다");
		System.out.println(": g > h의 값은 false이므로 후항의 '반갑습니다'가 출력됨.");
		
		System.out.print("System.out.println((g < h) ? (h > i) ?  \"타입 A\" : \"타입 B\" : (h > i) ? \"타입 C\" : \"타입 D\"); 의 값은 ");
		System.out.println((g < h) ? (h > i) ?  "타입 A" : "타입 B" : (h > i) ? "타입 C" : "타입 D"); // B 타입
		System.out.println();
		System.out.println("처음 문제를 보았을 땐, 혼동될 수 있으나, 자세히 보면 언어 문법의 안긴 문장과 같이 삼항 연산자 코드 안에 삼항 연산자 코드가 있는");
		System.out.println("안긴 문장과 같은 구조임을 알 수 있음. 따라서 연산 순서에 따라서 코드의 첫 부분인 (g < h)를 먼저 연산하면, true임이 출력됨.");
		System.out.println(" 고로 안긴 문장의 전항인 (h > i) ?  \"타입 A\" : \"타입 B\"를 연산하면 false가 되므로 후항인 타입B가 정답이 됨.");

	}
	
}
