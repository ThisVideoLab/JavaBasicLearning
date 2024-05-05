package sec02_primarydatatype.EX06_OperationBetweenDataType;

public class OperationBetweenDataType {

	public static void main(String[]args) {
		
		/* 2.4.2 기본 자료형 간의 연산
		   
		   boolean을 제외한 나머지 기본 자료형은 서로 연산이 가능함. 이때 모든 연산은 같은 자료형 끼리만 가능하며
		   연산 결과 역시 같은 자료형으로 나옴. 다만 int보다 작은 자료형 간의 연산 결과는 int로 일괄 출력 됨.
		   고로 byte, short 각각 동일 자료형끼리는 int 자료형으로 출력되는 것. 이는 CPU에서 최소 연산 단위가
		   int이기 때문에 그보다 작은 자료형도 일단 int로 불러와 연산하기 때문임. 즉 CPU 입장에선 int+int 연산이기에
		   결과물도 int로 출력되는 것. 나머지 int보다 큰 자료형은 해당 자료형의 상태로 출력됨.
		   
		   그렇다면 int + long과 같은 더 큰 자료형 간의 연산은 어찌 될까? 이를 해결하기 위한 것이 바로 타입캐스팅임.
		   업캐스팅의 경우는, 자바에서 자동 타입 변환을 수행하므로 별도의 품이 들지 않고 long 자료형이 나오게 됨.
		   반면 다운캐스팅을 위해서는 직접 자료형을 변경해줘야 한다는 것. 대신 데이터를 훼손하지 않는 조건에 한해 자료형의
		   크기를 줄일 수 있다는 장점이 있음.
		   
		 */
		
		// 같은 자료형 간의 연산
		
		int value1 = 3+5; // int + int = int
		int value2 = 8/5; // int / int = int
		float value3 = 3.0f + 5.0f;
		double value4 = 8.0/5.0;
		
		byte data1 = 3; // int -> byte로 자동 타입 변환이 되지만 범위 내이기 때문에 정상 작동
		byte data2 = 5;
		// byte value5 = data1 + data2; // data1 + data2는 int 형태이므로 오류 발생
		int value5 = data1 + data2;
				
		System.out.println("value1: "+value1);
		System.out.println("value2: "+value2);
		System.out.println("value3: "+value3);
		System.out.println("value4: "+value4);
		System.out.println("value5: "+value5);
				
		// 다른 자료형 간의 연산
	
		// int value6 = 5 + 3.5; // 3.5는 int 자료형이나범위 벗어나는 double 자로형이므로 오류 발생
		double value6 = 5 +3.5;
		int value7 = 5 + (int)3.5; // 3.5가 int 자료형으로 변환되면서 값의 변형이 일어남
		
		double value8 = 5/2.0;
		byte data3 = 3;
		short data4 = 5;
		int value9 = data3 + data4; // 선술한 바와 같이, byte와 short 자료형이 각각 CPU에서 연산될 경우에는
		// 처리 최소 단위인 int 자료형으로 변형되어 연산되므로, value9 또한 int 자료형임.
		double value10 = data3 + data4;
		
		System.out.println("value6: "+value6);
		System.out.println("value7: "+value7);
		System.out.println("value8: "+value8);
		System.out.println("value9: "+value9);
		System.out.println("value10: "+value10);
				
	}
	
}
