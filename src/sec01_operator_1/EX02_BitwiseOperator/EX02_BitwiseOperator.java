package sec01_operator_1.EX02_BitwiseOperator;

public class EX02_BitwiseOperator {

	public static void main(String[]args) {
		
		/* 3.2.2 비트 연산자
		   
		   비트 연산을 하기 위해서는 우선 주어진 값을 2진수로 바꿀 수 있어야 함. 그리고 2진수로 표현된 값에 대해
		   아래에 설명된 각 비트 연산자의 연산 방식대로 계산 하면 나오는 값이 결과 값이 됨.
		   양수값과 음수값에 대한 표시가 다르다는 것에만 유의하면 2진수는 큰 문제 없을듯 함.
		   
		   00..0011 = 3
		   11..1100 = -4 (음수일 경우에는 뒤집어서 생각하되 1을 더해야 함. 외우자 그냥)
		   		   
		   비트 연산자는 말 그대로 비트 단위의 연산자로, AND(&), OR(|), XOR(^), NOT(~)이 있음.
		   연산 자체는 자바 가상머신이 하여도 맞는지 검수는 개발자가 하므로 스스로 계산을 할 수 있어야 함.
		   이해를 위해 3의 2진수 값인 0011과 13의 2진수 값인 1111 대한 비트 연산을 예로 듦.
		   
		   비트 AND(&)는 두 값이 모두 1일 때만 1, 나머지 경우는 0인 연산자.
		   
		   0011 = 3
		   & 1111 = 13
		   ----
		   0011 = 3 (각 자리의 두 값이 모두 1일 경우에만 1인 연산자이므로 첫째자리와 둘째자리만 1이 나옴)
		   
		   비트 OR(|)은 두 값이 모두 0일때만 0인 연산자.
		   
		   0011 = 3
		   | 1111 = 13
		   ----
		   1111 = 13 (두 값이 모두 0인 경우가 모든 자리에서 없기 때문에 모든 자리마다 1이 나옴)
		   
		   비트 XOR(^)은 두 값이 같을 때 0, 다를 때 1인 연산자.
		   
		   0011 = 3
		   1111 = 13
		   ----
		   1100 = 12 (두 값이 다른 경우에만 1이 나오므로 1100)
		   
		   비트 NOT(~)은 0은 1, 1은 0으로 반전하는 연산자. 이때 주의점은 앞에 무수히 많은 0들이 모두 1로 바뀌므로
		   자연스럽게 양수에서 음수로 전환이 된다는 것임. NOT 연산자의 가장 큰 주의점은 양수, 음수 전환에 있음.
		   
		   ~00..0011 = 3
		   --------
		    11..1100 = -4
		   
		   ~00..1111 = 13
		   --------
		    11..0000 = -14          */
		
		/* -자바 메서드로 진법 변환- */ System.out.println("-자바 메서드로 진법 변환-");System.out.println("");
		
		int data = 13;
		System.out.println("int data = 13 일 경우");
		System.out.println();
				
		System.out.print("data에 대한 2진수 변환: ");
		System.out.println(Integer.toBinaryString(data)); // 2진수
		
		System.out.print("data에 대한 8진수 변환: ");
		System.out.println(Integer.toOctalString(data)); // 8진수
		
		System.out.print("data에 대한 16진수 변환: ");
		System.out.println(Integer.toHexString(data)); // 16진수
		System.out.println();
		
		/*-다양한 진법 표현-*/ System.out.println("-다양한 진법 표현-");System.out.println("");
		
		System.out.println("10진수 13");
		System.out.println(13);
		
		System.out.println("2진수 13 // 0b = 2진수 // 1101 = 13");
		System.out.println(0b1101); 
		
		System.out.println("// 0 = 8진수 // 15 = 13");
		System.out.println(015); 
		
		System.out.println("// 0 = 16진수 // d = 13");
		System.out.println(0xd); 
		System.out.println(); 
		
		/*-비트 연산자-*/ System.out.println("-비트 연산자-");System.out.println("");
		/*-@AND 비트 연산자-*/ System.out.println("-@AND 비트 연산자-");System.out.println("");
		
		System.out.println("System.out.println(3&10)");
		System.out.println();
		System.out.println("  0011"); // 3의 2진수 형태
		System.out.println("& 1010"); // 10의 2진수 형태
		System.out.println("------"); 
		System.out.print("  0010 = "); 
		System.out.println(3&10); // 2
		System.out.println();
		
		System.out.println("System.out.println(0b0011&0b1010)"); // 0b -> 2진수
		System.out.println();
		System.out.println("  0b0011"); // 3의 2진수 형태
		System.out.println("& 0b1010"); // 10의 2진수 형태
		System.out.println("------");
		System.out.print("  0010 = ");
		System.out.println(0b0011&0b1010); // 2
		System.out.println();
		
		System.out.println("System.out.println(0x03&0xA)"); // 0x -> 16진수
		System.out.println();
		System.out.println("  0x03 =   0b0011"); // 3의 2진수 형태
		System.out.println("& 0x0A = & 0b1010"); // 10의 2진수 형태
		System.out.println("------     ------");
		System.out.print("           0010 = ");
		System.out.println(0x03&0xA); // 2
		System.out.println();
		
		/*-@OR 비트 연산자-*/ System.out.println("-@OR 비트 연산자-");System.out.println("");
		
		System.out.println("System.out.println(3|10)"); 
		System.out.println();
		System.out.println("  0011"); // 3의 2진수 형태
		System.out.println("| 1010"); // 10의 2진수 형태
		System.out.println("------");
		System.out.print("  1011 = "); // 11
		System.out.println(3|10);
		System.out.println();
		
		System.out.println("System.out.println(0b0011|0b1010)"); // 0b -> 2진수
		System.out.println();
		System.out.println("  0011"); // 3의 2진수 형태
		System.out.println("| 1010"); // 10의 2진수 형태
		System.out.println("------");
		System.out.print("  1011 = "); // 11
		System.out.println(0b0011|0b1010);
		System.out.println();
		
		System.out.println("System.out.println(0x03|0xA)"); // 0x -> 16진수
		System.out.println();
		System.out.println("  0x03 =   0011"); // 3의 2진수 형태
		System.out.println("| 0x0A = & 1010"); // 10의 2진수 형태
		System.out.println("------     ------");
		System.out.print("           1011 = ");
		System.out.println(0x03|0xA); // 11
		System.out.println();

		/*-@XOR 비트 연산자-*/ System.out.println("-@XOR 비트 연산자-");System.out.println("");		
		
		System.out.println("System.out.println(3^10)"); 
		System.out.println();
		System.out.println("  0011"); // 3의 2진수 형태
		System.out.println("^ 1010"); // 10의 2진수 형태
		System.out.println("------");
		System.out.print("  1001 = "); // 11
		System.out.println(3^10); // 9
		System.out.println();
		
		System.out.println("System.out.println(0b0011^0b1010)"); // 0b -> 2진수
		System.out.println();
		System.out.println("  0011"); // 3의 2진수 형태
		System.out.println("^ 1010"); // 10의 2진수 형태
		System.out.println("------");
		System.out.print("  1001 = "); // 11
		System.out.println(0b0011^0b1010); // 9
		System.out.println();
		
		System.out.println("System.out.println(0x03^0xA)"); // 0x -> 16진수
		System.out.println();
		System.out.println("  0x03 =   0011"); // 3의 2진수 형태
		System.out.println("^ 0x0A = & 1010"); // 10의 2진수 형태
		System.out.println("------     ------");
		System.out.print("           1001 = ");
		System.out.println(0x03^0xA); // 11
		System.out.println();
		
		/*-@NOT 비트 연산자-*/ System.out.println("-@NOT 비트 연산자-");System.out.println("");
		
		System.out.println("System.out.println(~3)");  // 0을 1로, 1을 0으로, 음수 전환 및 -1 에 주의
		System.out.println();
		System.out.println("~ 00..0011"); // 3의 2진수 형태
		System.out.println("------");
		System.out.print("  11..1100 = "); 
		System.out.println(~3); // -4 
		System.out.println();
		
		System.out.println("System.out.println(~0b0011)"); // 0을 1로, 1을 0으로, 음수 전환 및 -1 에 주의
		System.out.println("~ 00..0011"); //3의 2진수 형태
		System.out.println("------");
		System.out.print("  11..1100 = "); 
		System.out.println(~0b0011); // -4 
		System.out.println();
		
		System.out.println("System.out.println(~0x03)"); // 0을 1로, 1을 0으로, 음수 전환 및 -1 에 주의
		System.out.println();
		System.out.println("~ 00..0011"); //3의 2진수 형태
		System.out.println("------");
		System.out.print("  11..1100 = "); 
		System.out.println(~0x03); // -4 
		System.out.println();
		
	}
	
}
