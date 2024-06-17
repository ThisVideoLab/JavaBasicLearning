package sec02_interface.EX08_NeedsOfDefaultMethodInInterface;

import java.util.Arrays;
import java.util.List;

interface ProductInterface {
    default void printItems(List<String> items) {
        items.forEach(System.out::println);
    }
}

class OnSaleList implements ProductInterface {
    // OnSaleList는 printItems 메서드를 구현하지 않아도 됨
}

public class NeedsOfDefaultMethodInInterface {

	public static void main(String[]args) {
		
		/* 이 소스 파일은 앞선 defaultmethod_1 파일에서 다루었던 인터페이스 내부에 default 메서드의 필요성에 대한 추가 학습으로,
		   교재에는 포함되지 않은 내용임. 허나 이해를 돕기 위해 작성되었음. 아래 예제를 보면 클래스 OnSaleList는 인터페이스의 default
		   메서드 덕분에 따로 클래스 내부에 메서드를 구현하지 않아도 해당 메서드의 기능을 끌어다 쓰고 있음. 이는 구현을 해야지만 사용할 수 있었던
		   기존 버전에서, 자바 8을 통해 추가된 기능임. 이를 통해서 interface는 일일히 구현해야 하는 번거로움을 탈피할 수 있었음. 아래에는
		   자바 8에서 interface 내부에 default 메서드 기능을 추가한 이유와 그 필요성에 대해서 설명함.
		   
		 */
		
		OnSaleList onSale = new OnSaleList();
		
        List<String> items = Arrays.asList("Item1", "Item2", "Item3");
        
        onSale.printItems(items);  // 출력: Item1 Item2 Item3
        
        /* 자바 8에서 interface 내부에 default 메서드 기능을 추가한 이유와 그 필요성
           
           기존 인터페이스와의 호환성 유지:
           
           자바 8 이전에는 인터페이스에 새로운 메서드를 추가하면 해당 인터페이스를 구현한 모든 클래스가 그 메서드를 구현해야 했음. 이는 많은 기존
           코드를 깨뜨릴 수 있는 문제를 일으킬 수 있었음. default 메서드를 사용하면 인터페이스에 새로운 메서드를 추가하면서도 기존 구현 클래스와의
           호환성을 유지할 수 있게 됨.
           
           API 진화:
           
           인터페이스는 API를 정의하는 데 널리 사용됨. 시간이 지나면서 API를 개선하고 확장할 필요가 생기기 마련임. default 메서드는 
           인터페이스를 진화시키고 새로운 기능을 추가할 수 있게 하면서도 기존 클라이언트 코드에 영향을 주지 않음.
           
           다중 상속 문제 해결:
           
           자바는 클래스 다중 상속을 지원하지 않지만, 인터페이스를 통해 다중 상속 비슷한 기능을 제공함. default 메서드를 통해 인터페이스는 기본 구현을 제공할
           수 있고, 다중 상속 시 발생할 수 있는 메서드 충돌 문제를 해결할 수 있음. 클래스는 필요에 따라 default 메서드를 오버라이드하여 자신만의 구현을 제공함.
           
           람다와 스트림 API 지원:
           
		   자바 8은 람다 표현식과 스트림 API를 도입했음. 이러한 기능을 효과적으로 사용하려면 여러 인터페이스에 새로운 메서드를 추가해야 함.
		   default 메서드를 통해 스트림 API와 같은 기능이 기존의 컬렉션 인터페이스에 쉽게 추가할 수 있게 됨.
           
         */
	}
	
}
