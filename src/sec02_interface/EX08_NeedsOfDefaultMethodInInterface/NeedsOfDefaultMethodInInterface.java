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
		   교재에는 포함되지 않은 내용임. 허나 이해를 돕기 위해 작성되었음. 
		  
		 */
		
		OnSaleList myClass = new OnSaleList();
		
        List<String> items = Arrays.asList("Item1", "Item2", "Item3");
        
        myClass.printItems(items);  // 출력: Item1 Item2 Item3
	}
	
}
