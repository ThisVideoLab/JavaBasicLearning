package sec01_createobjectandusageofmembers.EX00_ConceptOfClassAndObject;

public class ConceptOfClassAndObject {

	public static void main(String[]args) {
		
		/* 6. 클래스와 객체
		   6.1 클래스와 객체의 개념
		   6.1.1 클래스의 개념 알아보기
		   
		   객체는 사용할 수 있는 실체를 의미하며, 클래스는 객체를 만들기 위한 설계도와 같음. 따라서 1개의 정의된 클래스를 이용해 여러 개의
		   객체를 만들 수 있음. 이런 클래스의 용도를 이해하기 위해서는 먼저 프로그램 문법 요소의 발전 과정을 살펴보면서 클래스가 만들어진
		   배경을 알아볼 필요가 있음. 변수부터 시작해 복잡다단한 클래스까지 문법 요소가 발전하는 과정은 다음과 같음.
		   
		   변수: 다양한 형태의 데이터를 저장하기 위해 각각의 데이터를 저장할 수 있는 변수라는 문법 요소를 사용함.
		   
		   배열: 데이터의 종류가 많아짐에 따라 데이터의 개수만큼 변수명을 짓거나 관리하는 일이 과중됨. 고로 이런 문제를 해결하기 위해 만들어진
		        문법 요소가 배열임. 배열을 사용하면 같은 자료형의 데이터들을 임의로 묶어 관리할 수 있어 관리해야 할 변수의 갯수를 현저하게
		        줄일 수 있게 됨.
		   
		   구조체: 배열이 같은 자료형만 묶을 수 있기 때문에, 상이한 자료형들을 한꺼번에 묶어 효율적으로 관리하기 위해 구조체struct가 생겨남.
		         가령 학생 A의 생활 기록부에는 개별 점수를 다루는 int, 평균 점수를 다루는 double, 인적 사항을 기록하는 String 등
		         여러 자료형을 묶어서 관리할 필요가 있는 것.
		         
		   클래스: 프로그래밍이 발전함에 따라, 기존에 요구했던 자료의 포괄적 관리 뿐만 아니라 이를 활용한 동적인 작용의 필요성이 대두됨. 가령
		         여러 학생의 점수를 합산해 반의 평균을 낸다던가, 학생의 과목별 전체 석차를 출력하는 등의 보다 복잡한 기능을 요구하게 됨.
		         이에 클래스는 다양한 자료형의 데이터 관리 뿐만 아니라 데이터를 처리하는 기능까지 포함된 문법 요소로 발전함.
		         
		   자바는 다른 오래된 프로그래밍 언어와 달리 클래스가 문법 요소로 만들어진 후에 개발된 언어이기 때문에 클래스를 기본 문법 요소로 사용함.
		   그러한 이유로 이제까지 자바 프로젝트를 생성할 때 클래스를 구성하면서 프로그램을 시작했던 것임.
		   
		   6.1.2 절차지향과 객체지향 이해하기
		   
		   객체지향의 개념을 사용하기 전에는 대부분의 프로그램은 절차지향형으로 구현했음. 절차지향형 프로그래밍(PP: Procedual Programming)은
		   순서에 맞춰 단계적으로 실행하도록 명령어를 나열하는 방식임. 반면 객체지향형 프로그래명(OOP: Object Oriented Programming)은 
		   클래스를 사용한 이후부터 사용되었는데, 이는 프로그램을 객체 단위로 수행하는 방식을 의미함.
		   
		   이러한 두 지향 차이는, 구조의 복잡성에서 차이를 보이는데, 절차지향형은 전지와 꼬마전구로만 이뤄진 단순한 전구 회로라면, 객체지향형은
		   스위치와 스피커, 전구 등을 부착한 아두이노 보드와 같은 복잡성을 지님. 그렇기 때문에 상대적으로 객체지향형 구조를 생성하는데는 복잡한
		   설계가 필요하지만, 상대적으로 기능의 확장이나 분리에 유리한 측면이 있음.
		   
		   자바에서 제공하는 객체지향 문법 요소
		   
		   객체지향 프로그래밍 언어인 자바는 프로그램을 객체 단위로 구성해 상호 연동시킴으로써 프로그램을 실행함. 자바에서 제공하는 객체지향
		   문법요소는 크게 클래스class와 인터페이스interface가 있고, 클래스에는 일반 클래스와 추상 클래스 abstract class가 있음
		   즉 크게 보면 2개(클래스, 인터페이스), 작게 보면 3개(일반 클래스, 추상 클래스, 인터페이스)의 객체지향 문법 요소를 사용함.
		   객체지향 문법 요소는 객체의 생성과 관련된 요소라고 생각하면 됨. 다시 말해 클래스나 인터페이스를 활용해 객체를 직,간접적으로
		   만들고, 이를 활용해 프로그램을 실행한다는 의미. 추상 클래스와 인터페이스는 다음에 자세히 다루도록 하고, 여기에서는 객체지향 
		   문법요소에는 클래스와 인터페이스가 있다는 것 위주로 기억할 것.
		   
		   6.1.3 클래스 구조 살펴보기
		   
		   클래스의 전체적인 구조를 살펴보기 전에 클래스를 정의하는 방법부터 알아보면, 클래스는 class 키워드와 함께 클래스명을 표기함.
		   클래스명은 대문자로 시작하는 것이 관례이니 꼭 외워둘 것. 사실 우리가 그동안 프로젝트 클래스 명 또한 모두 대문자였음.
		   이상으로 클래스의 정의를 알아보았으니 다음과 같이 A라는 클래스를 포함하는 기본적인 자바 소스파일 A.java의 구조를 살펴보자.
		   크게는 내부 구성 요소와 외부 구성요소로 나눌 수 있음.
		   
		   package ...;      // 1) 패키지
		   import ...;       // 2) 임포트
		   class 클래스명 {...} // 3) 외부 클래스  // 1~3) 외부 구성 요소, 클래스 밖에 올 수 있는 3가지
		   
		   public class A{ // public이라는 접근 제어자가 붙은 class의 이름은 반드시 java 파일의 파일명과 일치해야 함  
		      int a = 3;        // 1) 필드 
		      double abc(){...} // 2) 메서드
		      A(){...}          // 3) 생성자
		      class 클래스명 {...} // 4) 이너 클래스 // 1~4) 내부 구성 요소, 클래스 안에 올 수 있는 4가지
		   }
		   
		   클래스의 외부 구성 요소 살펴보기
		   
		   패키지: 프로젝트를 생성할 때 패키지를 지정했다면 이 구성 요소에 패키지명이 포함되며, 반드시 주석을 제외하고 첫 번째 줄에 위치함.
		         클래스의 생성 과정에서 패키지를 생성하지 않았다면, deafault 패키지를 사용하며, 이 때 표기는 생략 됨.
		         
		   임포트: 다른 패키지의 클래스를 사용하고자 할 때 포함됨. 이클립스에서는 ctrl + shift + O를 이용해 외부 패키지에 위치하고 있는
		         클래스를 자동으로 임포트 할 수 있으며, 패키지 다음에 표기됨. 
		         
		   외부 클래스: 클래스의 외부에 또 다른 클래스가 포함될 수 있음. 즉, 1개의 java 파일에 여러개의 클래스가 포함될 수 있다는 것.
		             단 외부 클래스에는 public 키워드를 붙일 수 없음.
		             
		   클래스의 내부 구성 요소 살펴보기
		             
		   필드: 클래스의 특징(속성)을 나타내는 변수임. 만일 이 클래스가 한 사람에 관련된 정보를 담고 있다면, 필드 값으로 나이(int age = 20)
		        등이 포함 될 수 있을 것.
		   
		   메서드: 클래스가 지니고 있는 기능(함수)를 나타냄. 한 사람에 관련된 클래스라면 일하기(void working(){...}등이 포함 될 수 있음.
		   
		   생성자: 생성자(A() {...})는 클래스의 객체를 생성하는 역할을 담당함. 아직 클래스나 객체에 관한 명확한 개념은 없더라도 생성자의
		         역할이 '객체를 생성한다.'라는 점까지 기억해 둘 것.
		         
		   이너 클래스: 클래스의 내부에도 클래스가 포함될 수 있음. 이 클래스를 특별히 '이너 클래스'라고 부름
		   
		   내부에 올 수 있는 4가지 구성 요소들 중 생성자를 제외한 3가지 요소를 '클래스의 멤버'라고 부름. 정리하자면 클래스의 외부에는
		   3가지 종류, 내부에는 4가지 종류만 올 수 있으며, 이들 모두 또는 일부만 있어도 되고, 심지어 하나도 포함되지 않아도 문법적으로
		   문제가 없음. 그러나 이들 이외의 요소가 한 글자라도 들어 있다면 컴파일러는 바로 오류를 발생시킴.
		   
		   6.1.4 클래스와 객체 구분하기
		   
		   클래스를 활용하는 방법을 본격적으로 다루기 전에 클래스와 객체의 개념을 구분할 수 있어야 함. 클래스와 객체를 구분할 때 예시로 가장 
		   많이 나오는 것이 붕어빵 기계와 붕어빵임. 우리가 붕어빵을 먹고 싶다고 해서 붕어빵 기계를 먹을 수 없듯이, 클래스를 직접 사용할 수는
		   없음. 클래스의 모든 특징(필드)과 기능(메서드)들을 사용하려면 먼저 클래스를 이용해 객체를 만든 후 그 객체 속의 필드와 메서드 등을
		   사용해야 하는 것임.
		   클래스에서 객체를 만드는 과정은 생성자가 수행함. 클래스의 생성자로 객체를 만드는 과정을 인스턴스화instantiation라고 하고
		   인스턴스화로 만들어진 객체를 인스턴스instance라고 함. 객체(붕어빵)속에는 클래스의 내부 구성 요소 중 생성자를 제외한 나머지
		   요소가 포함되어 있는데, 이를 인스턴스 멤버instance member라고 함. 이 시점에서 '클래스는 바로 사용할 수 없고 반드시 객체를
		   생성해 객체 안에 있는 필드, 메서드 및 이너 클래스를 사용해야 한다는 점을 기억할 것.
		   
		   
		   
		   
		   
		   
		   
		 */
		
	}
	
}
