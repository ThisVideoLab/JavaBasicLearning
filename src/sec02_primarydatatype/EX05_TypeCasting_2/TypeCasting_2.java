package sec02_primarydatatype.EX05_TypeCasting_2;

public class TypeCasting_2 {

	public static void main(String[]args) {
		
		/* 자동 타입 변환과 스동 타입 변환
		  
		  앞서 설명한대로 더 큰 메모리 할당 크기의 자료형에 더 작은 크기의 자료형을 넣으면 자바가 이를 자동으로 전환해서
		  문제 없이 작동하는데, 이를 업캐스팅up-casting이라고 함. 다만 업캐스팅이 아닌 경우에도 자동 타입 변환이
		  일어나는 경우가 있음. 사실 모든 정수 리터럴 값은 int 자료형으로 인식 됨. 허나 byte 및 short 자료형에
		  저장할 수 있는 범위 내의 정수 리터럴 값이 대입될 때는 자동 타입 변환이 각각 자료형으로 수행 됨.
		  
		  반대로 큰 자료형을 작은 자료형에 대입하는 것을 다운 캐스팅down-casting이라고 함. 이때 소수점의 뒷자리가
		  날아가는 등 데이터 손실이 발생할 수 있으므로 컴파일러에 따른 자동 타입 변환은 일어나지 않고, 개발자가 직접 명시적
		  타입 변환을 수행해야 함. 크기는 byte < short < char < int < long < float < double 순임.
		  		  
		*/
		
		// 자동 타입 변환
		
		float value1 = 3; // int -> float(업캐스팅)
		long value2 = 5; // int -> long (업캐스팅)
		double value3 = 7; // int -> double (업캐스팅)
		
		byte value4 = 9; // int -> byte (다운캐스팅) 
		short value5 = 11; // int -> short (다운캐스팅)
		// value4와 value5는 업캐스팅이 아닌데도 대입하는 값이 자료형의 저장 범위 내의 값이라 예외적 자동 변환이 일어남. 
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		System.out.println(value4);
		System.out.println(value5);
		
		// 수동 타입 변환
		
		byte value6 = (byte)129; // int -> byte (다운캐스팅)
		int value7 = (int)3.5; // double -> int (다운캐스팅)
		float value8 = (float)7.5; // double -> float (다운캐스팅)
		
		System.out.println(value6); // 128이 아닌 -128로 출력됨. 이유는 아래 상술.
		System.out.println(value7);
		System.out.println(value8);
		
		/* 이때 value6이 -128로 출력되는 이유는 정수형 자료형을 작은 범위의 자료형으로 다운캐스팅하는 경우에는, 한쪽 끝의
		   범위에 있는 값을 초과하면 반대쪽 값, 그러니까 128을 초과한 뒤에는 반대쪽인 -128부터 시작해서 차츰 증가하는
		   형식으로 값이 변환됨. 즉 byte 자료형 값의 범위인 2^7-1 = 128-1 = 127 만큼을 넘어서 다시 반대쪽 끝인
		   -128에서 점차 증가한다는 것. 만약 129라면 1 증가한 -127로 표기 됨.
		 
		*/
		
		
	}
	
}
