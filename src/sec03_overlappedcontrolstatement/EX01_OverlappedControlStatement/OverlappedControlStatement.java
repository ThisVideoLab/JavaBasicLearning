package sec03_overlappedcontrolstatement.EX01_OverlappedControlStatement;

public class OverlappedControlStatement {

	public static void main(String[]args) {

		/* 4.1.7 제어문의 중복
		 
		 앞서 살펴 본 5개의 제어문 말고도, 각 제어문 내부에 또 다른 제어문의 포함이 가능함. 가령 if 문 내부에 if 문, for 문 내부에
		 for 문 등 제어문을 얼마든지 중복해서 사용 가능함. 3중, 4중을 넘어 다중에 대한 제약 없이 작성 가능함.
		*/
		
		/*- 실습 - 제어문의 중복*/System.out.println("- 실습 - 제어문의 중복");System.out.println();
		/*if-if 중복*/System.out.println("if-if 중복");
		
		int value1 = 5;
		int value2 = 3;
		if (value1 > 5) { // 조건식이 false 이므로 else 구문으로 넘어감
			if (value2 < 2) { 
				System.out.println("실행1");
			}else{
				System.out.println("실행2");
			}
		}else {
			System.out.println("실행3"); // else 구문 출력
		}
		System.out.println();
		
		/*switch-for 중복*/System.out.println("switch-for 중복");
		
		int value3 = 2;
		switch(value3) {
		case 1:
			for (int k = 0; k < 10; k++) {
				System.out.print(k + " ");
			}
			break;
		case 2: // value3 = 2이므로 case2 구문 실행
			for (int k = 10; k > 0; k--) {
				System.out.print(k + " "); // 10 9 ... 1 
			}
			break;
		}
		System.out.println();System.out.println();
		
		/*for-for-if 중복*/System.out.println("for-for-if 중복");
		
		for(int i = 0; i < 3; i++) { // 0, 1, 2 총 3회 반복
			for(int j =0; j < 5; j++) { // 0, 1, 2, 3, 4 총 5회 반복
				System.out.println(i + " " + j);
				if(i == j) { 
					System.out.println("i = j"); // 총 3회 출력
				}
			}
		}
	}
}
