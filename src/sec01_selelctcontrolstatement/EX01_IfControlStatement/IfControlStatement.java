package sec01_selelctcontrolstatement.EX01_IfControlStatement;

public class IfControlStatement {

	public static void main(String[]args) {
		
		/* 4.1 제어문
		   4.1.1 제어문의 개념
		   
		   제어문과 제어 키워드를 이용하면 프로그램의 실행 순서를 다양한 방법으로 제어 가능함. 즉 제어문은 프로그램의 처리 순서를 바꾸는 것.
		   자바에는 2개의 선택 제어문(if, switch)과 반복 제어문(for, while, do-while)으로 구성된 5개의 제어문과 2개의 제어
		   키워드(break, continue)가 있음.
		   5개 제어문의 공통적인 특징은 모두 중괄호가 있다는 것. 다만 중괄호 안에 실행문이 1개 일때는 중괄호를 생략 가능함.
		   생략하더라도 컴파일러가 하나의 실행문만 감싸는 중괄호를 자동으로 삽입해 줌. 다만 컴파일러가 삽입하는 중괄호는 반드시 하나의
		   실행 구문만을 감싸기 때문에 여러줄인 경우에는 오류가 발생할 수 있음.
		   
		   4.1.2 if 선택 제어문
		   
		   if문은 조건식에 따라 실행문의 실행 여부를 결정하는 선택 제어문임. 기본적인 문법 구조는 크게 3가지 유형으로 나뉨.*/
		
	   
		   /*
		   -------------------------------------------------
		   if 조건식 { // 조건식은 boolean 타입(true, false)만 가능함
		      실행 구문; // 조건식이 true일 경우에만 발동함
		   }
		   -------------------------------------------------
		   
		   상기 단일 구문은 if문의 가장 간단한 형태 */
		   
         /*-유형1. if 단일 구문-*/ System.out.println("-유형1. if 단일 구문-");System.out.println();
           
         if (5 > 3) {
            System.out.println("출력1"); // 실행됨.
         }
         if (5 < 3) {
            System.out.println("출력1"); // 실행 안 됨.
         }
         int a = 3;
         if (a == 3) {
        	System.out.println("출력3");
         }
         boolean b = false;
         if(b) {
        	 System.out.println("출력4"); // 실행 안 됨
         }
         
         /* 중괄호를 생략했을 때 제어문의 동작
            if 문을 포함한 모든 제어문은 중괄호를 포함하며, 생략했을 때는 컴파일러가 자동으로 삽입해 줌. 이때 주의점으로는 컴파일러가 삽입하는
            중괄호는 반드시 하나의 실행 구문만 감싼다는 것임. 다음 예제를 보며 이해해보자.
            
            if (3 > 5) { // 이 if 문의 경우는 조건식이 false이므로 아래 2개의 실행문이 모두 출력이 되지 않음.
            	System.out.println("안녕");
           		System.out.println("하이");
            }
            
            if (3 > 5)  // 그러나 중괄호가 생략된 경우라면 컴파일러가 자동으로 실행문 하나까지만 중괄호로 묶어줌
            	System.out.println("안녕"); // 따라서 이 실행문까지만 if 문에 연결된 {}로 묶어서 자동 입력을 해서 출력되지 않음
           		System.out.println("하이"); // 다만 이 실행문은 중괄호 밖에 위치하므로 출력이 가능해짐.
           		
           	고로 이러한 차이를 숙지하고 있어야 중괄호가 생략된 제어문을 보아도 파악이 가능해지니 주의할 것.
           		
          */
         
         /*-유형2. if-else 구문-*/ System.out.println("-유형2. if-else 구문-");System.out.println();
         
         /* 유형2는 if 구문의 조건식이  true일 때만 if 구문의 중괄호 내 코드가 싱행되고, false일 때는 else 구문의 중괄호가 살행됨.
            모든 조건식은 true가 아니면 false이므로 둘 중 하나만 무조건 실행 됨. 다만 else 구문이 필수적인 것은 아님.
            이렇듯 true, false에 따라 다른 값을 도출하므로 삼항 연산자와 상호 전환이 가능함. */
         
         if (5 > 3) { // true
        	 System.out.println("실행1"); // 실행됨
         }else {
        	 System.out.println("실행2"); // 실행이 안되기 때문에 용도가 없다는 이유로 노란 줄 표기됨.
         }
         
         int c, d;
         c= 5; d = 0;
         if (c > 5) { // false
        	 d = 10; // 실행 안 됨
         }else {
        	 d = 20; // 실행 됨
         }
         System.out.println(d); // 20
         System.out.println();
            
         /*if-else 구문의 삼항 연산자와의 변환*/ System.out.println("if-else 구문의 삼항 연산자와의 변환");System.out.println();
         
         c = 5; d = 0;
         d = (c > 5) ? 10 : 20;
         System.out.println(d);
         System.out.println();
         
         /*-유형3. if-else if-else 구문-*/ System.out.println("-유형3. if-else if-else 구문-");System.out.println();
         
         /* 유형3은 N개의 조건식과 N+1개의 중괄호를 포함하고 있는 형태로, if-else if-else의 구조임. 중간 else if 구문도 생략 가능하며,
            이를 생략하면 유형 2의 형태가 됨. 즉 단순 if, if else, if 다중 else의 구조 이렇게 3가지로 나뉘는 꼴.
            else 구문은 개수에 상관 없이 계속 추가가 가능하며, if 구문처럼 소괄호 안에 조건식을 넣음. 조건식은 위에서부터 순차적으로 검색하며
            true인 조건식이 나오면 해당 if 또는 else 구문을 실행한 뒤 if문을 탈출하며 종료됨. 
         */
         
         System.out.println("학생이 85점을 획득했을 때, 학점을 쓰시오");
         System.out.print("학생 학점: ");
         int e = 85;
         if (e >= 90) {
        	 System.out.println("A학점");
         }else if(e >= 80) {
        	 System.out.println("B학점");
         }else if(e >= 70) {
        	 System.out.println("C학점");
         }else{ // 여기부터 아래까지를 날리고 점수를 70 점 밑으로 낮추면 아예 학점 자체가 출력되지 않음.
        	 System.out.println("F학점");
         }
         System.out.println();
         // 위 구문에서 처음으로 참이 나오는 조건식은 e >= 80이므로 B 학점이 출력되고 나머지 if문을 탈출함.
		 
         /*변수의 범위 표현*/ System.out.println("변수의 범위 표현");System.out.println();
         
         /* 변수의 범위 표현을 수학식에서는 보통 80 >= e >= 70으로 표현하지만, 자바 코드에서는 반드시 전후항을 분리한 후에
         	논리 연산자로 연결해야 함. */
         
         if (e >= 90 && e <= 100) { // 전항부터 false이므로 쇼트 서킷 발동
        	 System.out.println("1급");
         }else if( e<= 80 && 70 <= e ) { // 전항부터 false이므로 쇼트 서킷 발동 
        	 System.out.println("2급");
         }else { // 따로 조건식이 없으므로 보든 선행 조건식을 만족하지 못하는 값들은 마지막 else 구문 출력
        	 System.out.println("탈락");
         }
         System.out.println();
         
         /*실습 - 3가지 유형의 if문*/ System.out.println("실습 - 3가지 유형의 if문");
         /*실습 - 유형1: if*/ System.out.println("실습 - 유형1: if");System.out.println();
         
         int value1 = 5;
         if (value1 > 3){ // 조건식이 true를 만족하므로 구문을 출력하고 if문 탈출
        	System.out.println("실행1"); 
         }
         if (value1 < 5){
         	System.out.println("실행2"); 
         }
         
         boolean bool1 = true;
         boolean bool2 = false;
         if (bool1) { // bool1 = true이기 때문에 바로 조건식을 만족하고 구문을 출력한 뒤 if문 탈출
        	 System.out.println("실행3");
         }
         if (bool2) {
        	 System.out.println("실행4");           
         }
         System.out.println();

         /*실습 - 유형2: if-else*/ System.out.println("실습 - 유형2: if-else");System.out.println();
        
         int value2 = 5;
         if (value2 > 3){ // true
        	 System.out.println("실행5");
         }else {
        	 System.out.println("실행6");
         }
         System.out.println();
         
         /*cf. 유형2의 삼항 연산자와 변환 가능*/ System.out.println("cf. 삼항 연산자와 변환 가능");System.out.println();
         
         System.out.println((value2 > 3)? "실행5" : "실행6");
         
         /*실습 - 유형3: if-else if-else if-...-else*/ System.out.println("실습 - 유형3: if-else if-else if-...-else");System.out.println();
         
         int value3 = 85;
         if(value3 >= 90) {
        	 System.out.println("A학점");
         }else if(value3 >= 80) { // 조건식이 참이므로 구문 실행 후 탈출
        	 System.out.println("B학점");
         }else if(value3 >= 70) {
        	 System.out.println("C학점");
         }else {
        	 System.out.println("F학점");
         }
         
         if(value3 >= 70 && value3 > 80) {
        	 System.out.println("C학점");
         }else if(value3 >= 80 && value3 > 90) { // 조건식이 참이므로 구문 실행 후 탈출
        	 System.out.println("B학점"); 
         }else if(value3 >= 90) {
        	 System.out.println("A학점");
         }else {
        	 System.out.println("F학점");
         }

	}
	
}
