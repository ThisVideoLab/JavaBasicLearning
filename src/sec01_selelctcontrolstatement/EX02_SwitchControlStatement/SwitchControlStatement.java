package sec01_selelctcontrolstatement.EX02_SwitchControlStatement;

public class SwitchControlStatement {

	public static void main(String[]args) {
		
		/* 4.1.3 stich 선택 제어문
		 
		 switch문은 점프 위치 변숫값에 따라 특정 위치case로 이동해 구문을 실행하는 선택 제어문임. 점프할 수 있는 위치는
		 'case 위칫값'으로 설정함. 이렇게 콜론(:) 문자가 붙은 값은 이동할 위치를 가리키는 일종의 팻말 역할을 수행함.
		 case 구문 말고 default 구문도 포함될 수 있는데, 이는 if문의 else 구문과 비슷한 기능으로, 일치하는 위칫값이
		 없을 때 점프할 위치를 나타냄. else 구문과 마찬가지로 default 구문 또한 생략 가능함.
		 
		 switch 문의 구조
		 
		 switch(점프 위치 변수){
		 case 위칫값 1:
		      실행 구문;
         case 위칫값 2:
		      실행 구문;
		      ...
		 case 위칫값 n:
		      실행 구문;
		 default:
		 	  실행 구문;
		 }
		 
		 이처럼 swtich 문의 역할은 특정 위치로 코드를 이동시키는 것 뿐임. 그러다보니 if문과는 조금 다르게 동작함. 
		 다음 예제에서 그러한 차이를 관찰 할 수 있음. */
		
		/*-기본적인 switch 문의 구조-*/ System.out.println("-기본적인 switch 문의 구조-");System.out.println();
		      
		int a = 2;
		switch (a) {
		case 1:
			System.out.println("A");
		case 2: // a =2 이므로 case2로 이동한 후에 차례대로 구문 실행. 단순히 팻말 역할만 할 뿐, case 구문은 아무런 실행이 없음.
			System.out.println("B");
		case 3:
			System.out.println("C");
		default:
			System.out.println("D");
		}
		System.out.println();
		
		/*-break 제어 키워드-*/ System.out.println("-break 제어 키워드-");
		 
		  
		   /*
		   이처럼 switch 문은 해당 위치로 이동한 후에 차례대로 따라오는 코드들을 실행하기 때문에 if 문과는 차이가 있음. 이 때 if 문과
		   비슷하게 동작하길 원한다면 break 제어 키워드를 통해서 작동하는 실행문의 갯수를 조절 할 수 있음. break 제어 키워드에는 다른
		   속성도 있지만, switch 문에 한해서는 if 문을 제외한 가장 가까운 중괄호를 탈출하는 키워드라고 할 수 있음. */
		
		int b = 2;
		switch (b) {
		case 1:
			System.out.println("A");
			System.out.println(" - case1의 break 제어 키워드 작동으로 인한 swtich 문 탈출");
			break;
		case 2: // b = 2이므로 case2로 이동
			System.out.print("B"); // 실행문 출력
			System.out.println(" - case2의 break 제어 키워드 작동으로 인한 swtich 문 탈출");
			break; // break 제어 키워드로 if 문을 제외한 가장 가까운 중괄호를 탈출
		case 3:
			System.out.print("C");
			System.out.println(" - case3의 break 제어 키워드 작동으로 인한 swtich 문 탈출");
			break; 
		default: 
			System.out.println("D"); // 당연하지만 default 실행문 바로 다음이 중괄호이므로 break가 필요 없음.
		} // case2 실행문의 break에서 가장 가까운 중괄호
		System.out.println();
		 
		/*-switch 문을 활용해 if 문처럼 출력하기-*/ System.out.println("-switch 문을 활용해 if 문처럼 출력하기-");
		//if 문처럼 넓은 범위를 지정하지 못하지만, switch 문 또한 if 문과 비슷한 구조로 출력이 가능함.
		
		int c = 3;
		switch (c) {
		case 5:
			System.out.println("Pass");
			break;
		case 4:
			System.out.println("Pass");
			break;
		case 3:
			System.out.println("Pass");
			break;
		case 2:
			System.out.println("Fail");
			break;
		default:
			System.out.println("Fail");
			break;
		}
		System.out.println();
		
		/* 그러나 한눈에 보기에도 중복 코드가 많아서 비효율 적으로 보임. 게다가 중복되는 구문도 많아서, 수십, 수천개에 달하는 경우에는
		   굉장히 비효율적일 수 밖에 없음. 그런 경우에는 다음과 같이 훨씬 간결한 코드 작성이 가능함. */
		
		/*-switch 문의 효율적인 작성-*/ System.out.println("-switch 문의 효율적인 작성-");
		
		int d = 3;
		switch (d) {
		case 5:
		case 4:
		case 3:
			System.out.print("Pass");
			break;
		case 2:
		default:
			System.out.print("Fail");
		}
		 
		/*-위의 switch 문과 동일한 기능을 수행하는 if 문-*/ System.out.println("-위의 switch 문과 동일한 기능을 수행하는 if 문-");
		/*switch 문*/ System.out.println("switch 문");
		
		int e = 8;
		switch (e) {
		
		case 10:
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		default:
			System.out.println("D");
			break;
		}
		
		/*if 문*/ System.out.println("if 문");
		
		if (e>= 9) {
			System.out.println("A");
		}else if(e == 8){
			System.out.println("B");
		}else if(e == 7){
			System.out.println("C");
		}else {
			System.out.println("D");
		}
		
		/* 이러한 switch 문과 if  문의 속도 차이는 사실 별로 없음. 다만 각 결과에 따른 속도 차이가 날 수 있음. 가령 if 문의 경우에는
		   만족하는 조건식을 찾기까지 그 이전 조건식을 모두 연산해야 하지만, switch 문의 경우에는 그냥 조건을 만족하는 조건식으로 바로 점프를
		   하기 때문에 모든 출력 속도가 동일하다는 장점이 있음. 다만 그 속도가 워낙 빠르기 때문에 수백만 개의 데이터를 처리하는 것이 아니라면
		   큰 차이는 없음.  
		 */
		
		/*-실습 - switch 문(break 포함, 미포함, if 문 변환-*/ System.out.println("-실습 - switch 문(break 포함, 미포함, if 문 변환-");
		
		/*break가 포함되지 않았을 때*/ System.out.println("break가 포함되지 않았을 때");
		
		int value1 = 2;
		switch (value1) {
		case 1:
			System.out.println("A");
		case 2:
			System.out.println("B"); // 여기서 부터 출력 시작
		case 3:
			System.out.println("C");
		default:
			System.out.println("D"); // break가 없기 때문에 마지막 조건식까지 출력됨
		}
		System.out.println();
		
		/*break가 포함되어 있을 때*/ System.out.println("break가 포함되어 있을 때");
		
		int value2 = 2;
		switch (value2) {
		case 1:
			System.out.println("A");
			break;
		case 2:
			System.out.println("B"); // 여기서 부터 출력 시작
			break; // break가 발동되어 가장 if 문 제외 가장 가까운 중괄호로 탈출
		case 3:
			System.out.println("C");
			break;
		default:
			System.out.println("D"); // 마지막이기 조건식이기 때문에 break 불필요
		}
		System.out.println();
		
		/*if else 문으로 전환*/ System.out.println("if else 문으로 전환");
		
		if (value2 == 3) {
			System.out.println("C");
		}else if (value2 == 2) {
			System.out.println("B"); // 실행 후 탈출
		}else if (value2 == 1) {
			System.out.println("A");
		}else{
			System.out.println("D");
		}
		
		
	}
	
}
