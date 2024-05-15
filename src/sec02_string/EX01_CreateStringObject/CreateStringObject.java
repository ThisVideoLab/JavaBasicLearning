package sec02_string.EX01_CreateStringObject;

public class CreateStringObject {

	public static void main(String[]args) {
		
		/* 5.2 문자열을 저장하는 String
		   
		   5.2.1 문자열의 표현과 객체 생성
		   
		   문자열 String 클래스는 참조 자료형의 대표적인 클래스임. 문자열은 반드시 큰따음표(String a = "문자열") 안에 표기해야 함.
		   큰따옴표 안에는 String a = ""와 같이 아무런 문자열이 오지 않아도 상관 없음. 다만 큰따옴표는 절대 생략할 수 없음. String 객체를
		   생성하는 데는 크게 2가지 방법이 있음. 첫 번째 방법은 new 키워드를 사용하는 방법으로, 생성자의 입력매개변수로 저장할 문자열을 입력함.
		   
		   String 참조 변수명 = new String("문자열") // String 클래스의 생성자
		   
		   String a = new String("하이");
		   
		   아직 클래스를 학습하기 전의 진행도이므로 해당 내용이 그간 사용했던 모습과 생소하긴 하나, 대부분의 클래스가 이 방법으로 객체를 생성함.
		   생성자의 개념은 추후 학습할 예정이지만, 클래스명과 동일하면서 뒤에 소괄호가 있는 형태임. new 키워드는 배열에서 배웠으므로 실제 데이터가
		   힙메모리에 위치한다는 것을 예측할 수 있을 것.
		   두번째 방법은 간단히 문자열 리터럴, 즉 문자열 값만 입력하는 방법임. 이제까지 사용해왔던 방법이 바로 이 방법.
		   
		   String 참조 변수명 = "문자열"
		   
		   String b = "바이";
		   
		   다만 첫 번째 방법과 두 번째 방법 모두 메모리에 저장되는 방식은 동일함. 실제 데이터값은 힙 메모리에 저장되고, 그 저장된 주소를 다시 스택
		   메모리에 저장한다는 것. 다만 이 2가지 방법 사이에는 결정적 차이가 있으나, 후술할 예정. 여기서는 단순히 2가지 방법만을 익혀둘 것.
		 
		 */
		
		/*- 실습 - String 객체를 생성하는 2가지 방법*/ System.out.println("- 실습 - String 객체를 생성하는 2가지 방법");
		
		/*String 객체 생성1*/ System.out.println("String 객체 생성1");
		
		String str1 = new String("안녕");
		System.out.println(str1);
		
		/*String 객체 생성2*/ System.out.println("String 객체 생성2");
		
		String str2 = "안녕하세요";
		System.out.println(str2);
		
	}
		
}
