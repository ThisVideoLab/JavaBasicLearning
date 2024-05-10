package sec04_controlkeyword.EX01_BreakControlKeyword;

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
		} 
		System.out.println();
		
		/*-변수값 조정을 통한 이중 for 문 한번에 탈출하기*/System.out.println("-변수값 조정을 통한 이중 for 문 한번에 탈출하기");
		
		/* 위와 같이 break로 탈출하게 되면, 내부 for 문을 탈출하긴 했지만, 외부 for 문은 탈출하지 못해 i 값의 변화에 따른 반복은 여전히
		   유효함. 만약 외부 for 문까지 동시에 탈출하고 싶다면, 한가지 간ㄷ나한 아이디어가 있음. 그 방법은 다음과 같이 break를 수행하기 전에
		   바깥쪽 조건식이 false가 되도록 i 값을 외부 for 문의 조건식보다 크게 설정하는 것임.
		 */
		
		for (int i = 0; i < 10; i++) {
			for(int j = 0; j < 10; j++) {
				if (j == 3) { // 중괄호가 생략된 if 제어문
					i = 100;
					break; // 컴파일러가 자동으로 실행문 1개만을 중괄호 처리하여 break까지만 if문에 포함시킴
				}
					System.out.println(i + ", " + j); // if 문 외부로 컴파일되므로 if 문이 fasle 일때도 출력이 가능함.
			} // for 문을 닫는 중괄호, break 대상에서 제외
		} 
		System.out.println();
		
		/*-레이블을 이용해 이중 for 문 한 번에 탈출하기*/System.out.println("-레이블을 이용해 이중 for 문 한 번에 탈출하기");
		
		/* break로 다중 반복문을 한 번에 탈출하는 자바의 공식적인 방법은 break + lable(레이블) 문법임. break 다음에 레이블을 지정하면
		   미리 입력해둔 레이블의 위치로 다중 반복문을 탈출 할 수 있음. 레이블은 임의 명명이 가능하며, 레이블의 이름 뒤에 반드시 콜론(:)을 붙임.
		   교재에 없는 내용을 첨언하자면, break는 가장 가까운 다중 반복문을 탈출하기 때문에, 탈출하고자 하는 다중 반복문의 가장 외부 반복문을
		   대상으로 해야함. 그렇기 때문에 보통 다중 반복문의 바로 위에 적고, 그 가장 외부에 있는 반복문을 탈출하는 것. 
		 */
		
		out: // 레이블 위치 지정 (break하고자 하는 반복문 앞에 레이블 표기)	
		for (int i = 0; i < 10; i ++) {
			for (int j = 0; j < 10; j++) {
				if ( j == 3) 
					break out;
				System.out.println(i + ", " + j);
			}
		}
		System.out.println();
		
		/*- 실습 - break를 이용한 반복문 탈출*/System.out.println("- 실습 - break를 이용한 반복문 탈출");
		/*단일 반복문 탈출*/System.out.println("단일 반복문 탈출");
		
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			break; // 1 출력 후 탈출. 사실상 for문의 의미가 없는 코드라서 i++에도 용도가 없다는 노란 밑줄이 처짐
		}
		
		for (int i = 0; i < 10; i++) {
			if (i == 5) {
				break;
			}
			System.out.print(i + " "); // 0, ... 4까지 출력
		}
		System.out.println();System.out.println();
		
		/*다중 반복문 탈출*/System.out.println("다중 반복문 탈출");
		/*@1개의 반복문만 탈출할 때*/System.out.println("@1개의 반복문만 탈출할 때");
		
		for( int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				if(j == 2) {
					break;
				}
				System.out.println(i + ", "+ j); 
			}
		} 
		System.out.println();
		
		/*@break + label 문으로 다중 반복문 탈출*/System.out.println("@break + label 문으로 다중 반복문 탈출");
		
		POS1:
		for( int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				if(j == 2) {
					break POS1;
				}
				System.out.println(i + ", "+ j); 
			}
		} 
		System.out.println();
		
		/*@break + label 문으로 다중 반복문 탈출*/System.out.println("@break + label 문으로 다중 반복문 탈출");
		
		for (int i = 0; i < 10; i++) {
			for(int j = 0; j < 10; j++) {
				if(j == 2) {
					i = 100;
					break;
				}
				System.out.println(i + ", " + j);
			}
			
		}
		
		
	}
	
}
