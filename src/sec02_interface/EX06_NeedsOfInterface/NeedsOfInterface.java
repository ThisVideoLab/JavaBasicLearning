package sec02_interface.EX06_NeedsOfInterface;

class Graphic_A { // 예시 - A사 그래픽 카드 드라이버 설치
	public void brightness_A(int value){};
	public void contrast_A(double value){};
	public void display_A(){};
}

class Graphic_B { // 예시 - B사 그래픽 카드 드라이버 설치
	public void brightness_B(int value){};
	public void contrast_B(double value){};
	public void display_B(){};
}

interface Graphic {
	void brightness(int value); // 인터페이스의 컴파일러 자동 지정은 public, 다만 클래스는 default이므로 명시적 지정 잊지말 것.
	void contrast(double value);
	void display(); 
}

class Graphic_Imple implements Graphic{
	public void brightness(int value) {};
	public void contrast(double value) {};
	public void display() {};
}

public class NeedsOfInterface {

	public static void main(String[]args) {
		
		/* 12.2.4 인터페이스의 필요성
		   
		   그렇다면 인터페이스는 어디에 사용할까? 이 절의 서두에서 이야기한 것처럼 일상생활에서 인터페이슥 입출력의 호환성을 의미함. 즉 냉장고든,
		   선풍기든 콘센트에 들어가는 플러그가 있는 가전 제품이라면 정상적으로 연결이 가능한 것. 이제 이 개념을 실제 프로그램에 적용해보자.
		   다양한 예가 있을 수 있겠지만, 여기서 그래픽 드라이버의 예를 들어 보자. A 사의 그래픽 카드와 B 사의 그래픽 카드는 서로 다른 하드웨어
		   구조를 띠고 있음. 당연히 기능을 구현하는 방법도 다를 것. 우선 인터페이스를 사용하지 않은 경우를 살펴보자. 만일 A 사의 그래픽카드를
		   활용한 애플리케이션을 만든 후 그래픽카드를 B 사의 제품으로 바꾸면 애플리케이션을 수정해야 함. 그래픽카드의 드라이버에 들어 있는 클래스명은
		   물론 메서드명도 서로 다를 것이기 때무임. 하드웨어 1개를 바꿀 때마다 애플리케이션을 다시 수정해야 한다면, 세상의 모든 하드웨어를 위해
		   가짓수만큼 만들어야 할 것임.  
		   
		 */
		
		// 그래픽 카드 A 그래픽 드라이버 설치
		Graphic_A ga = new Graphic_A();
		
		// 그래픽 카드 A에 애플리케이션 설치
		ga.brightness_A(80);
		ga.contrast_A(90.3);
		ga.display_A();
		
		// 그래픽 카드 B 그래픽 드라이버로 바꿔서 설치
		Graphic_B gb = new Graphic_B();
		
		// 그래픽 카드 B에 애플리케이션도 다시 설치		
		gb.brightness_B(80);
		gb.contrast_B(90.3);
		gb.display_B();
		
		/* 이렇듯 그래픽 카드를 바꿔 설치할 때마다 애플리케이션을 다시 깔고 같은 값을 계속 다시 설치해야 한다는 것. 앞서 말한 것과 같이 이 행위를
		   수십번, 수백번 반복해야 한다면 이만한 비효율도 없을 것. 이때 인터페이스의 용도가 빛을 발휘함. 다음 예시를 살펴보면 인터페이스의 필요성을
		   실감할 수 있을 것임. 이렇게 작성하면 새롭게 애플리케이션을 수정해야 하는 끔찍한 상황을 피할 수 있음.
		  
		 */
		
		Graphic g = new Graphic_Imple();
		g.brightness(80);
		g.contrast(90.3);
		g.display();
		
	}
	
}
