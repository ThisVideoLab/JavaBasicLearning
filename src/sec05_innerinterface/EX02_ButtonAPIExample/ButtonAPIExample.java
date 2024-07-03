package sec05_innerinterface.EX02_ButtonAPIExample;

class Button {
	OnClickListener ocl;
	void setOnClickListener(OnClickListener ocl) {
		this.ocl = ocl;
	}
	
	interface OnClickListener{
		public abstract void OnClick();
	}
	void click() {
		ocl.OnClick();
	}
}

public class ButtonAPIExample {

	public static void main(String[]args) {
		
		/* 13.3.2 이벤트 처리 기능 작성하기
		   
		   이번에는 사용자 인터페이스에서 사용되는 일반적인 이벤트 처리 기능을 이너 인터페이스를 이용해 작성해보자.
		   이제까지 배운 문법만으로 충분히 가능함. 먼저 Button  클래스를 살펴보자. Button 등과 같은
		   기본적인 사용자 인터페이스 클래스는 API로 제공됨. 기본 적인 구조는 위와 같음.
		   
		   먼저 위의 Button 클래스처럼 내부에 OnClickListener라는 이너 인터페이스가 정의돼 있고,
		   ocl 필드는 이 인터페이스의 타입임. setOnClickListener() 메서드는 이 인터페이스 객체를
		   입력매개변수로 넘겨받아 필드를 초기화하는 기능을 수행함. 마지막으론 click() 메서드는 초기화된
		   필드 객체 내부의 onClick() 메서드를 실행시킴. 즉, Button은 기능은 내부에서 정해지는 것이
		   아니라 외부에서 정해 입력받는 것임. 이제 이렇게 API에서 제공받은 Button 클래스를 사용해 개발자가
		   Button에 기능을 부여하는 경우를 살펴보자.
		   
		 */
		
		// 개발자1. 클릭하면 음악 재생
		System.out.println("버튼1");
		
		Button button1 = new Button();
				
		button1.setOnClickListener(new Button.OnClickListener() {
			@Override
			public void OnClick() {
				System.out.println("개발자 1. 음악 재생");
			}
		});
		
		button1.click();
		
		System.out.println();
		
		/* 먼저 개발자1은 버튼을 클릭했을 때 음악을 재생하는 기능을 구현하기 위해 버튼 객체를 생성함. 이후
		   익명 이너 클래스를 활용해 onClick() 메서드를 오버라이딩함. 이때 메서드의 내부에서는 음악을
		   재생하도록 작성함. 물론 이것은 매우 단순화도니 코드임. 아무튼 이렇게 생성한 객체를 
		   setOnClickListener() 메서드의 입력매개변수로 전달한 후 Button 객체의 click() 메서드를
		   호출함. 이 버튼에는 음악 재생 기능이 부여됏으므로 click() 메서드가 호출되면 "개발자1. 음악재생"
		   문구가 출력될 것임. 아래의 경우 또한 출력 문구 말고는 상동함.
		  
		 */
		
		// 개발자2. 클릭하면 네이버 접속
		System.out.println("버튼2");
		
		Button button2 = new Button();
		
		button2.setOnClickListener(new Button.OnClickListener() {
			public void OnClick() {
				System.out.println("개발자2. 클릭하면 네이버 접속");
			}
		});
		
		button2.click();
		
		/* 즉 API는 음악을 재생하는 버튼과 네이버를 접속하는 버튼을 따로 만들어 제공하는 것이 아니라 버튼의 
		   기능을 정의할 수 있는 인터페이스를 클래스 내부에 정의해 제공함. 그러면 이 버튼을 사용하는 개발자가
		   이 인터페이스를 구현함으로써 버튼의 기능을 정의할 수 있는 것임. 즉, 1개의 버튼 클래스로 수천개의
		   기능을 수행하는 버튼을 만들 수 있는 것. 이는 초기에 클래스와 메서드등의 개념을 통해 설명했던
		   붕어빵론을 상기시킴. 안드로이드를 포함해 일반적인 사용자 인터페이스 API는 이러한 구조를 지님.
		   
		 */
	}
	
}
