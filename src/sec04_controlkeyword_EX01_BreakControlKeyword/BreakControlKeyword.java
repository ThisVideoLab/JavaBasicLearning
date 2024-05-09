package sec04_controlkeyword_EX01_BreakControlKeyword;

public class BreakControlKeyword {

	public static void main(String[]args) {
		
		/* 4.2.1 break 제어 키워드
		 
		 break는 if 문을 제외한 가장 가까운 중괄호 ({})를 탈출하는 제어 키워드임. 이미 switch 문에서 본 적이 있음. 당시에는 switch 문을
		 탈출하는 용도로만 사용했지만, 일반적으로 break 제어 키워드는 반복문에서 특정 조건을 만족할 때 반복문을 탈출하는 데 사용함.
		
		for(int i = 0; i < 10 ; i ++) {
			System.out.print(i + " ");
			break;
		}
		
		위와 같이 코드를 작성할 경우, 원래 의도는 for 문의 연속적인 출력이었으나, break 키워드로 인해 1회 반복 후에 for 문을 탈출해버림.
		1회만 출력하고 끝낼 것이면 굳이 for 문을 작성할 이유가 없으므로 이는 break의 잘못된 사용 예로 생각할 수 있음.
		 */
		
		/*- 반복문 안에 if 문과 함께 break가 사용된 예*/System.out.println("- 반복문 안에 if 문과 함께 break가 사용된 예");
		
		for(int i = 0; i < 10; i++) {
			if ( i == 5) {
				break;
			}
			System.out.print(i + " ");
		} // break 탈출 위치
		System.out.println();System.out.println();
		
		/* 여기서 꼭 기억해야 하는 점은 break를 이용해 탈출하는 것은 if 문을 제외한 가장 가까운 중괄호 하나라는 것임. 따라서 이중으로 중복된
		for 문 내부에서 break를 사용할 때 안쪽 for 문만 탈출하게 됨. 예제를 보자. */
		
		/*- 이중 for 문 내에서 break를 통한 반복문의 탈출*/System.out.println("- 이중 for 문 내에서 break를 통한 반복문의 탈출");
		
		for (int i = 0; i < 10; i++) {
			for(int j = 0; j < 10; j++) {
				if (j == 3)  // 중괄호가 생략된 if 제어문
					break; // 컴파일러가 자동으로 실행문 1개만을 중괄호 처리하여 break까지만 if문에 포함시킴
					System.out.println(i + ", " + j); // if 문 외부로 컴파일되므로 if 문이 fasle 일때도 출력이 가능함.
			} // for 문을 닫는 중괄호, break 대상에서 제외
		} // break로 탈출하는 중괄호
		 
		
	}
	
}
