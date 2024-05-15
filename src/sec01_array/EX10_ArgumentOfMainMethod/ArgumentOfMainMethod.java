package sec01_array.EX10_ArgumentOfMainMethod;

public class ArgumentOfMainMethod {

	public static void main(String[]ar) { // 평소와는 다르게 args가 아닌 ar로 표시되어 있던 교재 내용
		
		/* 본문을 시작하기 앞서서 특이하게도 종전까지 모두 args 였던 교재가 별도의 설명 없이 ar로 표시되어 있던 고로 이 args에 대한
		   몇가지 검색을 통해 관련 내용을 공부해 봄. args란 arguments의 약자로 개발자 사이에서 통용되는 일종의 관례인 셈. 고로
		   이 args 뒤로 나오는 코드는 메인 메서드의 선언이며, 프로그램의 시작과 함께 실행되는 부분임을 나타내는 표시인 것. 그에 따라
		   arguments임을 연상할 수 있는 줄임말이면 대체적으로 가능하나, 보통 args로 쓰는 것이 관례이기에 args로 표기 한다는 것.
		   다만 이 args를 어떠한 방식으로 바꿔도, 심지어 생략해도 코드의 실행에는 문제가 없다는 GPT의 답변을 받음. 하지만 약속은 소중한 것.
		   
		 */
		
		/* 5.1.10 main() 메서드의 입력매개변수
		   
		   그동안 예제를 작성하면서 기계적으로 작성했던 main() 메서드를 살펴보면 String 매개 변수를 띤다는 것을 알 수 있음. 즉 자바 코드를
		   실행하면 자바 가상 머신은 제일 먼저 main() 메서드를 실행하는데, 이때 개발자는 main() 메서드를 실행하는 데 필요한 자료들을
		   배열 타입으로 넘겨 줄 수 있음. 풀어 표현하자면 프로그램에 명령을 입력하는 것을 커맨드 라인이라고 하는데, 이 커맨드 라인이 들어오면
		   이를 순차적으로 받아들여서 Java 상에서 활용 할 수 있도록(Java가 이해할 수 있도록) 변수로 만드는 매개체 역할을 하는 것이 바로
		   입력 매개 변수임.
		   
		   그동안은 한 번도 데이터를 넘겨 준 적이 없이, 코드 내에서 변수를 입력했기 때문에 아무런 데이터도 전달되지 않았을 것임.
		   데이터를 넘겨 주는 데는 콘솔을 이용하는 방법과 이클립스를 이용하는 방법이 있는데, 여기서는 이클립스를 이용하는 방법을 알아봄.
		   
		   상단 메뉴 run - run configurations 에서 ArgumentOfMainMethod 프로젝트를 클릭하고 [(x) =Arguments] 탭에
		   '안녕하세요 3 5.8'을 입력한 후에 run을 하면 각각 '안녕하세요', '3', '5.8'이 String 타입으로 받아짐. 이는 Java 표준에서
		   main 메서드의 타입이 반드시 String 타입이어야 하기 때문임. 고로 만약 입력된 String 타입의 숫자를 숫자 타입으로 쓰고 싶다면
		   별도로 자료형 변환 메서드를 사용해서 입력해야 함. 자세한 내용은 코드의 주석을 참조할 것.
		   
		 */
		
		String a = ar[0];
		String b = ar[1]; // String 타입의 3을 매개변수로 받아옴.
		String c = ar[2];
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		System.out.println(b + 1);
		System.out.println(c + 1);
		
		int d = Integer.parseInt(b);
		double e = Double.parseDouble(c);
		int f = Integer.parseInt(ar[1]); // String으로 받아 전환할 필요 없이 바로 전환해서 변수로 만들 수도 있음. 
		
		System.out.println(d + 1); // int 타입으로 전환되어 연산이 가능함
		System.out.println(c + 1); // double 타입으로 전환되어 연산이 가능함
		System.out.println(f + 1); // int 타입으로 전환되어 연산이 가능함
		
		/*- 실습 - main 메서드로의 입력매개변수 전달*/ System.out.println("- 실습 - main 메서드로의 입력매개변수 전달");
		/*args 배열의 길이 구하기*/ System.out.println("args 배열의 길이 구하기");
		
		System.out.println(ar.length); // 3 // 본문 교재에는 ar로 표기되어 있으므로 이를 따라 ar로 표기, 아무래도 오타 같음
		System.out.println();
		
		/*입력 매개변수 전체 출력1 - for 문 활용*/ System.out.println("입력 매개변수 전체 출력1 - for 문 활용");
		
		for(int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + " ");
		}
		System.out.println();
		System.out.println();
		
		/*입력 매개변수 전체 출력2 - for-each 문 활용*/ System.out.println("입력 매개변수 전체 출력2 - for-each 문 활용");
		
		for(String s: ar) {
			System.out.print(s + " ");
		}
		System.out.println();
		
	}
	
}
