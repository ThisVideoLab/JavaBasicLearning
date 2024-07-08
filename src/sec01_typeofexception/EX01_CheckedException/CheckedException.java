package sec01_typeofexception.EX01_CheckedException;

import java.io.FileInputStream;
import java.io.InputStreamReader;

class A implements Cloneable {
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

public class CheckedException {

	public static void main(String[]args) {
		
		/* 14.1.3 일반 예외 클래스
		   
		   앞에서 설명한 것처럼 일반 예외는 예외 처리를 하지 않으면 문법 오류를 발생시켜 컴파일 자체가 불가능함.
		   이러한 일반 예외를 처리하는 일반 예외 클래스에 대해 알아보자.
		   
		   InterruptedException
		   
		   Thread.sleep(시간) 메서드는 일정 시간 동안 해당 쓰레드를 일시정지 상태로 만드는 Thread 클래스의
		   정적 메서드임. 이 메서드는 일반 예외가 발생할 수 있기 때문에 반드시 예외 처리를 해야 함. 이를 생략하면
		   문법 오류가 발생해 컴파일 자체가 불가능해짐.
		   
		   Thread.sleep(1000);
		   
		   참고로 쓰레드는 프로그램 실행 과정에서 CPU를 사용하는 최소 단위로, 프로세스 내에 존재함. 여기서는
		   예외 처리에만 초점을 맞춰 살펴봄. 좀 더 자세한 내용은 15장에서 다룰 예정임.
		   
		   ClassNotFoundException
		   
		   Class.forName("패키지명.클래스명")은 클래스를 동적으로 메모리에 로딩하는 메서드로, 해당 클래스의
		   정보를 담고 있는 Class 타입의 객체를 리턴함. 만일 클래스를 메모리에 동적으로 로딩하는 과정에서 해당
		   클래스가 존재하지 않을 때는 ClassNotFoundException이 발생하므로 이에 대한 예외 처리를 반드시
		   포함해야 함.
		   
		   Class cls = Class.forName("java.lang.Object");
		   
		   한편 실제 java.lang.Object 클래스가 존재한다하더라도 예외 처리를 하지 않으면 문법 오류가 발생함.
		   즉, 실제 클래스의 존재 유무와 상관없이 예외가 발생할 수 있는 코드인지가 중요함.
		   
		   FileNotFoundException
		   
		   파일을 읽을 때 해당 경로에 파일이 없으면 FileNotFoundException이 발생함. 이 또한 실제 파일의
		   존재 유무완 상관없이 파일이 존재하지 않을 가능성이 있는 코드이기 때문에 반드시 예외 처리를 해야 문법
		   오류가 발생하지 않음.
		   
		   FileInputStream fis = new FileInputStream("text.text");
		   
		   CloneNotSupportedException
		   
		   자바의 모든 클래스는 Object 클래스를 상속함을 학습했음. 이는 즉, Object의 모든 메서드를 사용할 수
		   있다는 뜻임. Object 클래스의 메서드 중 clone()은 자신의 객체를 복사한 클론 객체를 생성해 리턴하는
		   메서드임. 다만 이를 위해 복사의 대상이 되는 클래스는 반드시 Clonable 인터페이스를 상속해야 함.
		   수비게 말해, 해당 클래스가 복사 기능을 제공해야 한다는 것. a만약 Clonable 인터페이스를 상속하지
		   않는 클래스의 객체를 복사하기 위해 clone() 메서드를 호출하면 CloneNotSupportedException이
		   발생함. 참고로 다음 예제에서 class B의 내부에 추가 기능이 없는데도 Object 클래스의 clone() 메서드를
		   오버라이딩한 이유는 protected의 접근 지정자를 갖는 clone() 메서드를 클래스 A 내부에서 호출할 수 
		   있도록 하기 위해서임.
		   
		   class B{
		       @Override
		       protected Object clone() throws CloneNotSupportedException{
		           return super.clone();
		       }
		   }
		   
		   B b1 = new B();
		   B b2 = (B) b1.clone();
		   
		   참고로 clonable는 내부에 추상 메서드를 포함하고 있지 않으며, 단순히 해당 클래스가 복사 기능을 제공함을
		   나타내는 마커 marker의 기능만을 수행하는 인터페이스임.
		   
		   위에서 알아본 5가지의 일반 예외 중에는 아직 배우지 않은 클래스와 메서드가 다수 포함돼있음. 사용된
		   클래스나 메서드에 대해서는 차차 알아보기로 하고, 여기서는 일반 예외 자체가 문법으로 예외처리를
		   요구한다는 것만을 기억하자. 이클립스에서는 예외 처리를 하지 않아 발생하는 오류 부분에 마우스 커서를
		   올려 놓으면 'add throws declaration'과 'Surround with try/catch'중에서 선택할
		   수 있는 창이 나타남. 이 중 두번째 항목을 선택하면 예외 처리 구문을 쉽게 추가 가능함.
		   
		 */
		
		// Checked Exception(일반 예외)
		// 아래 항목은 모두 오류가 발생함.
		
		// 1. InterruptedException
		
		// Thread.sleep(1000);
		
		// 2. ClassNotFoundException
		
		// Class cls = Class.forName("java.lang.Object");
		
		// 3. IOExcepton
		
		// InputStreamReader in = new InputStreamReader(System.in);
		//in.read();
		
		// 4. FileNotFoundException
		
		// FileInputStream fis = new FileInputStream("text.txt");
		
		// 5. CloneNotSupportedException
		
		//A a1 = new A();
		// A a2 = new (A)a1.clone();
		
		// 모두 오류가 발생함.
		
	}
	
}
