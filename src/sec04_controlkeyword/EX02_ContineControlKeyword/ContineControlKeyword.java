package sec04_controlkeyword.EX02_ContineControlKeyword;

public class ContineControlKeyword {

	public static void main(String[]args) {
		
		/* 4.2.2 Continue 제어 키워드
		   
		   continue는 반복 제어문의 닫힌 중괄호 (}) 역할을 하는 제어 키워드. 반복 제어문은 조건식이 true가 돼 실행 구문을 실행한 후
		   닫힌 중괄호를 만나면 다시 다음 반복을 위해 증감식을 수행하거나(for 문), 조건식을 검사(while 문)함. 즉, 반복문 실행 도중
		   continue를 만나면 실행해야 할 코드가 남아 있음에도 불구하고 마치 닫힌 중괄호를 만난 것처럼 다음 반복을 위한 절차를 수행함.
		   따라서 continue는 주로 반복 과정에서 특정 구문을 싱핼하지 않고 건너뛰고자 할 때 사용함.  
		 */
		
		for(int i = 0; i < 10; i++) {
			continue;
			// System.out.println(i); // continue를 통해 생략되므로, 이 실행문은 오류가 되어버림.
		}
		
		// 다만 continue를 위와 같이 사용하면 후행 코드들은 의미를 잃기 때문에, 보통은 반복 제어문 안의 if 문에서 특정 조건하에 쓰임.
		
		/*반복문 안에 if 문과 함께 continue가 사용된 예*/System.out.println("반복문 안에 if 문과 함께 continue가 사용된 예");
		
		for(int i = 0; i < 4; i++) {
			if(i == 2) {
				continue; // 이러한 continue 또한 break처럼 가장 가까운 중괄호의 닫힌 괄호 역할을 수행함.
			}
			System.out.print(i + " "); // i = 2일때 continue가 2의 출력을 생략해버려서 0, 1, 3 만 출력됨. 
		} // continue가 대체하는 중괄호
		System.out.println();System.out.println();
		
		/*이중 for 문 내에서 continue를 통한 실행 명령 건너뛰기*/
		System.out.println("이중 for 문 내에서 continue를 통한 실행 명령 건너뛰기");
		
		// 이중 for문에 대한 이해를 높이기 위해 교재의 예제와 다른 형태로, 변수들을 for 문 외부에서 선언함.
		int h;
		int g;
		for (h = 0; h < 3; h++) {
		    for (g = 0; g < 3; g++) {
		        if (g == 2) {
		            continue;
		        }
		        System.out.println(h + ", " + g);
		    } // continue의 탈출 위치
		}
		System.out.println(h); // h = 3의 값으로 외부 for 문이 종료되었기 때문에 3을 출력함.
		System.out.println();
	    // System.out.println(g);
		
		/* h와 다르게 g를 출력하려고 하면 오류가 발생함. 변수에 대한 초기값이 주어지지 않았다는 오류인데 이 오류가 발생하는 이유는, for 문의
		   작동 방식을 유심히 보면 이해 가능함. continue를 통해 탈출하면 외부 for문으로 다시 돌아감. 돌아가게 되면, g = 0이라는 변수의
		   초기값 부여가 백지화 됨. 그 상태에서 h > 3이 false가 되면 for 문이 종료되므로, 이중 for 문 중에서 내부 for 문에서 초기값을
		   부여받던 g의 초기 값이 사라진 체로, int g; 변수 선언 상태로만 존재하게 됨. 고로 뒤에서 g에 대한 값을 출력 할 수 없게 되는 것.
		 */
		
		/*continue Lable을 이용해 이중 for 문 내에서 여러 개의 반복문을 한 번에 건너뛰기*/
		System.out.println("continue Lable을 이용해 이중 for 문 내에서 여러 개의 반복문을 한 번에 건너뛰기");
		
		POS1: // 레이블 위치 지정 (continue하고자 하는 반복문 앞에 레이블 표기)
		for(int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if(j == 2) {
					continue POS1; // POS1과 가장 가까운 반복문의 닫힌 중괄호를 대체함.
				}
				System.out.println(i + ", " + j);
			}
		} // continue POS1으로 대체하는 중괄호
		
		/*- 실습 - continue 제어 키워드*/System.out.println("- 실습 - continue 제어 키워드");
		/*단일 반복문에서 continue 사용하기*/System.out.println("단일 반복문에서 continue 사용하기");
		
		for(int i =0; i < 10; i++) {
			continue;
			// System.out.println(i + " "); // unreachable code 발생
		}
		
		for(int i = 0; i < 10; i++){
			System.out.print(i + " "); 
			continue; // 영향 없음. 0, 1, ..., 8, 9 출력 후 for 문 종료 
		}
		System.out.println();
		
		for(int i = 0; i < 10; i++) {
			if(i == 5) {
				continue;
			}
			System.out.print(i + " "); // 1, 2, 3, 4, 6, 7, 8, 9 출력 -> 5 생략
		}
		System.out.println();System.out.println();
		
		/*다중 반복문에서 continue 사용하기*/System.out.println("다중 반복문에서 continue 사용하기");
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				if(j == 3) {
					continue;
				}
				System.out.println(i + ", " + j); // 0,0부터 4,4까지 j =3에 해당하는 값 빼고 모두 출력
			}
			
		}
		System.out.println();
		
		POS1:
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				if(j == 3) {
					continue POS1;
				}
				System.out.println(i + ", " + j);
			}
		}
		
	}
	
}
