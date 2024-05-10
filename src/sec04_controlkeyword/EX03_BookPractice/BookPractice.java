package sec04_controlkeyword.EX03_BookPractice;

public class BookPractice {
	
	public static void main(String[]args){
		
		/*Q1. 다음과 같이 점수(score)에 따라 학점이 부여되는 코드를 작성하고자 한다. if 선택 제어문의 조건식을 완성하시오(단 0<= score <= 100)*/
		System.out.println("Q1. 다음과 같이 점수(score)에 따라 학점이 부여되는 코드를 작성하고자 한다. if 선택 제어문의 조건식을 완성하시오(단 0<= score <= 100)");
		
		int score = 72;
		
		if(80 <= score && score <90){ // && 논리 연산자로 두 범위를 만족하는 값을 조건식에 반영 가능함 
			System.out.println("B학점");
		}else if(score >= 90) {
			System.out.println("A학점");
		}else if(70 <= score && score <80){
			System.out.println("C학점"); // C 학점 출력
		}else {
			System.out.println("F학점");
		}
		System.out.println();
		
		/*Q2. 문제 1에서 완성한 코드와 동일한 기능을 수행하는 switch 구문을 작성하시오*/
		System.out.println("Q2. 문제 1에서 완성한 코드와 동일한 기능을 수행하는 switch 구문을 작성하시오");
		
		switch (score/10) {
		case 9:
			System.out.println("A학점");
			break;
		case 8:
			System.out.println("B학점");
			break;
		case 7:
			System.out.println("C학점");
			break;
		default:
			System.out.println("D학점");
			break;
		}
		System.out.println();
		
		/*Q3. 다음과 같이 출력되도록 if 문과 break, continue를 이용해 for 문 코드를 완성하시오.*/
		System.out.println("Q3. 다음과 같이 출력되도록 if 문과 break, continue를 이용해 for 문 코드를 완성하시오.");
		System.out.println();
		
		System.out.println("for(int i = 0; ; i++) {");
		System.out.println();
		System.out.println("이 사이에 알맞은 코드를 작성할 것");
		System.out.println();
		System.out.println("    System.out.println(i); // 0, 2, 4, 6, 8, 10");
		System.out.println("}");	
		System.out.println();

		for(int i = 0; ; i++) {
			if(i%2 == 1) { // 홀수일 경우에는 나머지를 생략, 즉 홀수는 건너 뛰고 다시 for 문 반복
				continue;
			}else if(i > 10){ // 11은 건너뛴 뒤에 i = 12가 되면 for 문을 탈출함.
				break; 
			}
			System.out.println(i); // 0, 2, 4, 6, 8, 10
		} // break로 탈출하는 위치
		System.out.println();
		
		/*Q4. 다음  for 문과 동일한 기능을 수행하는 while 문을 작성하시오.*/
		System.out.println("Q4. 다음  for 문과 동일한 기능을 수행하는 while 문을 작성하시오.");
		
		System.out.println("for(int i = 10; i > 0; i -= 2) {");
		System.out.println("    System.out.println(i);");
		System.out.println("}");
		System.out.println();
		
		int i = 10; // do-while 문은 반드시 변수를 외부에서 정의해야 함.
		while(i > 0) {
			System.out.println(i);
			i -= 2;
		}
		System.out.println();
		
		/*Q5. 다음 이중 for 문을 실행했을 때 'A'는 몇 회 출력되는지 쓰시오.*/
		System.out.println("Q5. 다음 이중 for 문을 실행했을 때 'A'는 몇 회 출력되는지 쓰시오.");
		System.out.println();
		
		System.out.println("for(int i = 0; i < 5; i++) {");
		System.out.println("    for(int j = 0; j < 3; j++) {");
		System.out.println("        if(i == 2) {");
		System.out.println("            continue;");
		System.out.println("        }");
		System.out.println("        if(j == 1) {");
		System.out.println("            break;");
		System.out.println("        }");
		System.out.println("        System.out.println(\"A\");");
		System.out.println("    }");
		System.out.println("}");
		System.out.println();
		
		int Q4 = 0; // 카운팅을 위한 외부 변수 선언
		for(i = 0; i < 5; i++) { // int i 를 위 문제에서 이미 선언했으므로 변수 초기화만 실행
			for(int j = 0; j < 3; j++) {
				if(i == 2) {
					continue;
				}
				if(j == 1) {
					break;
				}
				System.out.print("A(" + i + "," + j + ") "); // 어떤 값의 조합에서 A가 출력되었는지 추가
				Q4 ++; // A가 출력된 횟수 만큼 카운팅 증가
			}
		}
		System.out.println("= " + Q4 + "회");
		
		/*Q6 ~ Q7. 다음은 바깥쪽 10회, 안쪽 5회를 반복하는 이중 for 문이다. 다음 물음에 답하시오.*/
		System.out.println("Q6 ~ Q7. 다음은 바깥쪽 10회, 안쪽 5회를 반복하는 이중 for 문이다. 다음 물음에 답하시오.");
		System.out.println();
		
		System.out.println("for(int i = 0; i < 10; i++){");
		System.out.println("    for(int j = 0; j < 5; j++){");
		System.out.println("        //...");
		System.out.println("    }");
		System.out.println("}");
		System.out.println();
		
		
		for(i = 0; i < 10; i++){
			for(int j = 0; j < 5; j++) {
				//...
			}
		}
		
		/*Q6. 레이블을 사용하지 않고, i = 3; j = 2일 때 이중 for 문을 한 번에 탈출하는 코드를 완성하시오.*/
		System.out.println("Q6. 레이블을 사용하지 않고, i = 3; j = 2일 때 이중 for 문을 한 번에 탈출하는 코드를 완성하시오.");
		
		for(i = 0; i < 10; i++){
			for(int j = 0; j < 5; j++) {
				if(i == 3 && j == 2) {
					System.out.println("i = " + i + ", j = " + j + ": 조건 만족, for 문 탈출" );
					i = 10;
					break;
				};
				System.out.println("i = " + i + ", j = " + j + ": 조건 불만족, for 문 반복" );
			}
		}
		System.out.println();
		
		/*Q7. 레이블을 사용해, i = 3; j = 2일 때 이중 for 문을 한 번에 탈출하는 코드를 완성하시오.*/
		System.out.println("Q7. 레이블을 사용해, i = 3; j = 2일 때 이중 for 문을 한 번에 탈출하는 코드를 완성하시오.");
		
		POS1:
		for(i = 0; i < 10; i++){
			for(int j = 0; j < 5; j++) {
				if(i == 3 && j == 2) {
					System.out.println("i = " + i + ", j = " + j + ": 조건 만족, for 문 탈출" );
					break POS1;
				};
				System.out.println("i = " + i + ", j = " + j + ": 조건 불만족, for 문 반복" );
			}
		}
		
	}

}
