package sec01_array.EX09_ReadArrayData;

public class ReadArrayData {

	public static void main(String[]args) {
		
		/* 5.1.9 2차원 배열의 출력
		   
		   2차원 배열은 가로, 세로 방향으로 데이터가 분포되어 있어, 2개의 인덱스를 사용함. 따라서 2차원 배열의 모든 데이터를 출력하기 위해서는
		   기본적으로 이중 for 문을 사용해야 함. 여기서 중요한 것은 반복 횟수를 지정하는 것임. 앞서 살펴본 2차원 비정방 배열의 예제에서는
		   2개의 행(0행, 1행)에 대해 각각 2회(a[0].length) 및 3회(a[1].length)를 반복해야 함. 따라서 바깥쪽 for  문에는 행의
		   갯수를 나타내는 a.length, 안쪽에는 각 행별 열의 개수를 나타내는 a[i].length를 사용해야 함.
		   
		   이중 for 문을 이용한 2차원 배열 원소 출력
		   
		   int[][] a = {{1,2}, {3, 4, 5}};
		   
		   for(int i = 0; i < a.length; i++){
		      for(int j = 0; j < a[i].length; j++){
				 System.out.print(a[i][j] + " ");
		      }
		      System.out.println();
		   }
		   
		   앞서 1차원 배열에서 살펴본 집합 객체(배열, 컬렉션)의 원소를 1개씩 모두 꺼낼때까지 반복하는 for-each 문을 사용할 수 도 있음.
		   여기서도 이중 for-each문을 사용해야 함. 2차원 배열에 꺼낸 하나의 원소가 1차원 배열이기 때문에, 다시 이 1차월 배열의 원소들을
		   꺼내야 재대로 된 2차원 배열을 출력할 수 있음.
		   
		   이중 for-each 문을 이용한 2차원 배열 원소 출력
		   
		   int[][] a = {{1, 2}, {3, 4, 5}};
		   
		   for(int[] m: a) { // 배열 a에 대해 인덱스 0부터 n까지 차례대로 출력함
		      for(int n: m) { // 가졍 a[0]을 출력한 경우 이는 다시 a[0][0] 1차원 행렬 배열임.
		                      // 같은 방식으로 for-each 문을 사용해 각 방의 원소들을 차례로 꺼낼 수 있음.
		      	  System.out.println(n); // 차례대로 행에 있는 각 열의 원소들을 출력함.
		      }
		   }
		 
		 */
		
		/*- 실습 - 2차원 배열의 원소값 출력*/ System.out.println("- 실습 - 2차원 배열의 원소값 출력");
		System.out.println();
		
		/*2차원 데이터의 배열의 길이*/ System.out.println("2차원 데이터의 배열의 길이");
		
		int[][] array1 = new int[2][3]; // 2차원 정방형 행렬 배열의 생성
		
		System.out.println(array1.length); // array1의 행의 갯수
		System.out.println(array1[0].length); // array1의 1행의 열의 갯수
		System.out.println(array1[1].length); // array1의 2행의 열의 갯수
		System.out.println();
		
		int[][] array2 = new int[][] {{1, 2}, {3, 4, 5}};
		
		System.out.println(array2.length); // array2의 행의 갯수
		System.out.println(array2[0].length); // array2의 1행의 열의 갯수
		System.out.println(array2[1].length); // array2의 2행의 열의 갯수
		System.out.println();
		
		/*2차원 데이터의 배열의 기본적인 출력 방법*/ System.out.println("2차원 데이터의 배열의 기본적인 출력 방법");
		
		System.out.print(array2[0][0] + " ");
		System.out.print(array2[0][1] + " ");
		System.out.println();
		
		System.out.print(array2[1][0] + " ");
		System.out.print(array2[1][1] + " ");
		System.out.print(array2[1][2] + " ");
		System.out.println();
		System.out.println();
		
		/*2차원 데이터의 배열의 for 문을 활용한 출력 방법*/ System.out.println("2차원 데이터의 배열의 for 문을 활용한 출력 방법");
		
		for(int i = 0; i < array2.length; i++) {
			System.out.print("[");
			for(int j = 0; j < array2[i].length; j++) {
				System.out.print(array2[i][j]);
					if(j  == (array2[i].length-1)) {
						break;
					}
				System.out.print(", ");
			}
			System.out.println("]");
		}
		
		/*2차원 데이터의 배열의 for-each 문을 활용한 출력 방법*/
		System.out.println("2차원 데이터의 배열의 for-each 문을 활용한 출력 방법");
		
		for(int[] array: array2) { // for-each 내부에서 사용할 원소 자료형 변수명: 참조할 집합 객체
			int row = 0; // 행을 세어 줄 변수 생성
				System.out.print("["); // 행이 시작되므로 대괄호 열기
			for(int columm: array) {
				System.out.print(columm);
				if(columm == array2[row].length) { // 지금 n번째 방이 마지막이라면 뒤에 쉼표를 생략하고 break
					break;
				}
				System.out.print(", ");
			} // break 위치
			System.out.println("]"); // 한 행이 종료되었으므로 대괄호 닫기
			row++; // 다음 for-each 문 반복에서 다음 행을 출력하기 위해 행 변수에 증가 적용.
		}

	}// end
	
}
