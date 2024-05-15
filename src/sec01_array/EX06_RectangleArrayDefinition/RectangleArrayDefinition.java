package sec01_array.EX06_RectangleArrayDefinition;

import java.util.Arrays;

public class RectangleArrayDefinition {

	public static void main(String[]args) {
		
		/* 5.1.7 2차원 정방 행렬 배열
		   
		   가로 및 세로 방향의 2차원으로 데이터를 저장하는 배열을 2차원 배열, 그 중 직사각형의 형태(모든 행의 길이가 같은 배열)를 
		   '2차원 정방 행렬 배열'이라고 함. 말이 그렇지 우리가 흔히 보는 엑셀표같은 형태라고 생각하면 친숙함. 아무튼 이 2차원 배열을 선언할
		   때도 1차원처럼 ([])대괄호를 사용하지만, 2차원 행렬임을 나타내기 위해 다음과 같이 포시함.
		   
		   자료형[][] 변수명 // 자료형 변수명[][] // 자료형[] 변수명[]
		   
		   e)
		   int[][]a // int a[][] // int[] a[]
		   double[][]b // doubleb[][] // double[] b[]
		   String [][] c // String c[][] // String[] c[] 
		   
		   2차원 배열의 선언을 보면 차원이 1개씩 늘어날 때마다 대괄호가 1개씩 늘어난다는 것을 이ㅏㄹ 수 있음. 따라서 3차원 이상의 배열을
		   선언하는 방법도 쉽게 유추가 가능함. 대괄호 안에는 배열의 인덱스가 들어가는데, 2차원 배열은 각 위치 정보가 2개의 인덱스 쌍으로
		   이뤄져 있음. 배열의 위치 표현은 세로 방향으로 숫자가 늘어나는 행row 번호와 가로 반향으로 숫자가 늘어나는 열columm 번호로 구성되어
		   있으며, 각 방향의 인덱스는 0부터 시작함. 가령 a[2][1]은 2차열 배열에서 세번째 세번째 행과 2번째 열을 의미함.
		   
		 */
		
		/*- 실습 - 2차원 배열의 3가지 선언 방법과 다양한 배열 선언*/
		System.out.println("- 실습 - 2차원 배열의 3가지 선언 방법과 다양한 배열 선언");
		
		/*배열의 선언 방법1*/ System.out.println("배열의 선언 방법1");
		
		int[][] array1 = new int[3][4]; // 대괄호를 자료형 뒤에
		int[][] array2; // 선언과 초기화 분리도 가능
		array2 = new int[3][4]; //
		System.out.println();
		
		/*배열의 선언 방법2*/ System.out.println("배열의 선언 방법2");
		
		int array3[][] = new int [3][4]; // 대괄호를 변수명 뒤에
		int array4[][]; // 선언과 초기화 분리도 가능
		array4 = new int [3][4];
		System.out.println();
		
		/*배열의 선언 방법3*/ System.out.println("배열의 선언 방법3");
		
		int[] array5[] = new int[3][4]; // 자료형과 변수명 뒤에 각각 대괄호 하나씩 표기
		int[] array6[]; // 선언과 초기화 분리도 가능
		array6 = new int[3][4];
		System.out.println();
		
		/*다양한 배열 선언(기본 자료형 배열, 참조 자료형 배열)*/ 
		System.out.println("다양한 배열 선언(기본 자료형 배열, 참조 자료형 배열)");
		
		boolean[][] array7 = new boolean[3][4];
		int[][] array8 = new int[2][4];
		double[][] array9 = new double[3][5];
		String[][] array10 = new String[2][6]; // 참조 자료형 배열
		System.out.println();
		
		/* 2차원 정방 행렬은 객체를 생성하는데도 4가지 방법이 있음. 각 방법을 이해하는 것보다 더욱 중요한 사실은, '메모리는 2차원 데이터를
		   바로 저장할 수 없다는 것. 실제로 메모리는 1차원 형태의 데이터만 저장이 가능함. 그렇다면 어떻게 2차우너 데이터를 저장할까?
		   정답은 2차원 데이터의 1차원화를 통한 저장에 있음. 즉 2차원 배열은 결국 2개 이상의 1차원 배열들의 합이기 때문에 이런 특성을 활용해
		   1차원 배열을 원소로 하는 1차원 배열을 생성한 뒤에 그것을 충분히 풀어 헤친다면 다시금 2차원 배열의 형태를 만들어 낼 수 있다는 것.
		   3차원 배열 또한 이와 마찬가지로 1차원 배열을 원소로하는 1차원 배열을 다시 원소로 쓰는 1차열 배열로 이해가 가능해짐. 이러한 개념을
		   이해해야 2차원 정방행렬 배열의 4가지 객체 생성 방법을 익힐 수 있음.

		   방법1) 배열 객체를 생성하고 값 대입하기
		   
		   첫번째 방법은 2차원 배열 객체를 선언한 후 각각의 인덱스 위치에 값을 하나씩 대입하는 것. 가장 직관적이지만 가장 노동이 많이 들어가는
		   방법으로 우선 어떤 자료형을 저장하는지가 선언에 나와 있고, 객체를 생성할 때 배열의 길이를 지정함.
		   
		   2차원 정방 행렬 배열 객체를 생성하고 값 대입하기
		   
		   자료형[][] 참조 변수명 = new 자료형[행의 길이][열의 길이];
		   참조 변수명[0][0] = 값;
		   참조 변수명[0][1] = 값;
		   ...
		   참조 변수명[행의 길이 - 1][열의 길이 - 1] = 값;
		*/
		
		/*방법1) 2차원 정방 행렬 배열 객체를 생성하고 값 대입하기*/ 
		System.out.println("방법1) 2차원 정방 행렬 배열 객체를 생성하고 값 대입하기");
		
		int[][] ex1 = new int[2][3];
		ex1[0][0] = 1; ex1[0][1] = 2; ex1[0][2] = 3;
		ex1[1][0] = 4; ex1[1][1] = 5; ex1[1][2] = 6;
		System.out.println(Arrays.toString(ex1[0]));
		System.out.println(Arrays.toString(ex1[1]));
		System.out.println();
		
		/* 여기서 중요점은 메모리를 이해하는 것. 위 예제에서 2차원 배열은 길이가 3인 1차원 배열 2개로 이루어진 1차원 배열로 볼 수 있음.
		   즉 int[]가 int를 저장하는 1차원 배열인 것처럼 int[]는 int[]를 저장하는 1차우너 배열로 볼 수 있다는 것. 따라서 몇 차원의
		   배열이든 최종적으로는 1차원 배열로 분할할 수 있으며, 이것이 바로 1차원 데이터만 저장할 수 있는 메모리에 다차원 배열을 저장할 수 있는
		   이유가 됨. 이를 힙메모리 구조로 풀어 설명하면 좀 더 명확함. 기존 참조 자료형의 경우에는 스택 영역에는 힙 실제 값이 들어있는 힙
		   메모리의 위치 값을 저장하게 됨. 1차원 행렬 또한 이러한 구조와 동일하게 힙 영역에 1차원 배열의 값이 저장되는 구조임. 그런데 2차원을
		   포함한 다차원 배열은 스택 메모리의 위치값 자리에 실제 값 대신에 다차원 배열을 1차원으로 풀어 저장한 각각의 단일 행렬의 값이 저장된
		   위치를 가진다는 것. 결국 동일한 힙 영역 내의 다른 위치에 저장된 값들을 1차원 행렬의 수만큼 담고 있다는 것. 만약 다차원이라면 이와
		   같은 절차를 n-1회 만큼 거친 다는 이야기이기도 함.
		   
		  2차원 배열의 length 속성값
		  
		  위의 내용에 대한 이해를 바탕으로 이전에 다뤘던 length의 작동 원리를 떠올려 보면, 2차원 배열에 대한 length의 값을 어렵지 않게
		  계산할 수 있음. length의 경우에는 대상이 되는 참조 변수에 대해 변수가 가지고 있는 위치값으로 넘어가 해당 위치에 있는 방의 갯수에
		  대해 셈을 한다고 익혔음. 그러므로 2차원 배열 변수를 length로 출력하면 변수의 위치값 자리에 있는 방의 갯수를 읽게 되는데, 앞서
		  말한 것처럼 2차원 배열의 위치값 자리에는 2차원 배열에 포함된 다른 1차원 행렬들 각각의 위치값이 방마다 담겨있고 그 갯수를 읽게 되는 것.
		  결과적으로 이 숫자는 2차원 배열의 열columm값과도 같게 됨. 그리고 각 방의 인덱스 번호는 n+1 번째 열이기 때문에 해당 인덱스를 넣고
		  값을 출력하면 각 열의 원소들을 출력함을 알 수 있음.
		 */
		
		/*2차원 배열의 길이 가져오기, length에 대한 이해*/ System.out.println("2차원 배열의 길이 가져오기, length에 대한 이해");
		
		System.out.println(ex1.length); // 2 // ex1이 3x2 행렬이므로 열들의 갯수인 2가 출력됨.
		System.out.println(ex1[0].length); // 3 // 인덱스 0은 n+1 번째 열의 갯수를 나타내므로 1열의 갯수인 3이 출력됨
		System.out.println(ex1[1].length); // 마찬가지로 3
		// System.out.println(ex1[2].length); // 상에는 안잡히지만 3열이 없기 때문에 컴파일러 runtime exception이 발생함
		
		/* 방법2) 배열 객체의 행 성분부터 생성하고 열 성분 생성하기
		   
		   두번째 방법은 2차원 배열의 행 성분만 먼저 생성하고, 각 행에 열 성분을 생성하는 것. 일견 복잡해 보이지만, 앞서 설명한 2차원 배열의
		   메모리 구조를 이해하면 쉽게 이해할 수 있을 것. 쉽게 말하자면 크레이프 케이크를 한층 한층 쌓아 올리는 것. 처음 2차원 배열을 만들 때
		   행 성분만 먼저 생성하고, 열의 갯수는 공란으로 채워 넣음. 그 후 열을 1개 단위로 추가하고 해당 열의 성분들을 하나씩 채워 넣으면서
		   크레이프 케이크에 한장씩 쌓아 올리듯이 행렬을 생성 가능함. 이러한 가변적 특징을 활용하면 회사원 명단에 쉽게 사원을 추가하는 등으로
		   활용할 수 있을 것임.
		   
		 */
		
		/*방법2) 배열 객체의 행 성분부터 생성한 뒤, 개별적으로 열 성분 생성하기*/
		System.out.println("방법2) 배열 객체의 행 성분부터 생성한 뒤, 개별적으로 열 성분 생성하기");
		
		int[][] ex2 = new int[2][]; // 행성분 생성 - 행을 총 2칸으로 선언
		
		ex2[0] = new int[3]; // ex2 행렬의 1번째 행의 열 생성
		ex2[0][0] = 1; ex2[0][1] = 2; ex2[0][2] = 3; // 열 성분 생성
		// ex2[0][3] = 4; // 1행은 3열이므로 4번째 방에 대한 값을 집어 넣으려고 하면 exception이 발생함.
		
		ex2[1] = new int[3]; // ex2 행렬의 2번째 행의 열 생성
		ex2[1][0] = 4; ex2[1][1] = 5; ex2[1][2] = 6; // 열 성분 생성
		
		// ex2[2] = new int[4]; // ex2는 2행만을 가진다고 선언했으므로 3번째 행을 입력하면 exception 발생 

		System.out.println(ex2.length);
		System.out.println(ex2[0].length);
		System.out.println(Arrays.toString(ex2[0]));
		System.out.println(ex2[1].length);
		System.out.println(Arrays.toString(ex2[1]));
		System.out.println();
		
		/* 이 코드를 작성하고 나면 이전에 배웠던 배열은 한번 생성할 때 크기를 정해야 하고 한번 생성하고 나면 바꿀 수 없다는 규칙과 상호
		   충돌한다고 느낄 수 있겠으나, 1차원 배열 안의 1차원 배열이라는 구조를 완전히 이해한다면, 위의 작성법 또한 완벽하게 그 규칙을
		   따른 다는 것을 이해할 수 있음. 먼저 1차적으로 ex2 2차원 배열의 행성분을 생성하는 1차원 행렬을 만들고 나면 그 각각의 방 안에
		   값은 null로 없을 지언정 구조적인 무결성을 가지고 있음. 그리고 주석으로 표시해둔 것처럼 각 행마다의 열을 생성하면 그 생성된
		   열의 위치값이 다시 행을 구성하는 1차원 행렬의 각 방마다 들어가게 된다는 것. 마찬가지로 열 성분 생성 부분을 총해서 해당 값이
		   들어가게 되므로 배열 생성의 규칙에 부합하는 모습을 보인다는 것. 고로 이러한 구조적 이해를 동반해야 코드가 어떠한 방식으로 작동하는지
		   충분히 이해하고 기초를 탄탄히 할 수 있게 됨.
		 */
		
		/* 방법3) 배열의 자료형과 함께 대입 할 값 입력하기
		   
		   2차원 정방 행렬의 객체를 생성하는 세번째 방법은 자료형과 함께 대입할 값을 입력하는 것. 여기서 배열의 크기가 대입되는 초깃값의
		   수에 따라 결정되므로 대괄호 안에는 반드시 크기를 지정하지 말아야 함.
		   
		   자료형[][] 참조 변수명 = new 자료형[][]{{값, 값, ..., 값}, {값, 값, ..., 값} ..., {값, 값, ..., 값}};
		   
		   1차원 배열 광 동일한 형태이며, 차이점은 초깃밗을 구성할 때 중괄호 안에 각각의 중괄호를 넣어 각 행의 데이터를 표현한다는 것.
		   최종적으로 메모리에 저장되는 값은 앞의 2가지 방법과 동일함. 또한 초깃값과 함께 자료형을 표현하는 방법3은 다음과 같이 선언과
		   객체의 대입을 분리해 표현할 수 있음.
		   
		 */
		
		/*방법3) 배열의 자료형과 함께 대입할 값 입력하기*/ System.out.println("방법3) 배열의 자료형과 함께 대입할 값 입력하기");
		
		int[][] ex3 = new int[][] {{1,2,3},{4,5,6}};
		
		int[][] ex4; // 선언 및 대입 분리 가능
		ex4 = new int[][] {{1,2,3},{4,5,6}};
		
		System.out.println(Arrays.toString(ex3[0]));
		System.out.println(Arrays.toString(ex3[1]));
		System.out.println();
		
		System.out.println(Arrays.toString(ex4[0]));
		System.out.println(Arrays.toString(ex4[1]));
		System.out.println();
		
		/* 방법4) 대입할 값만 입력하기
		   
		   마지막 방법은 2차원 정방 행렬 데이터에 대입할 값만 입력하는 방식. 이 역시 1차원 배열과 동일한 방식에 중괄호만 이중으로 추가된
		   형태이므로 쉽게 이해가 가능함. 다만 이렇게 작성하는 경우에는 앞선 1차원 배열의 입력처럼, 선언과 값 대입을 분리할 수 없음.
		   
		   자료형[][] 참조 변수명 = {{값, 값, 값}, ..., {값, 값, 값}};
		   
		 */
		
		/*방법4) 대입할 값만 입력하기*/ System.out.println("방법4) 대입할 값만 입력하기");
		
		int[][] ex5 = {{1, 2, 3}, {4, 5, 6}}; // 선언과 대입을 한번에
		int[][] ex6;
		// ex6 = {{1, 2, 3}, {4, 5, 6}}; // 대입을 분리해서 입력은 불가능함.
		
		System.out.println(Arrays.toString(ex5[0]));
		System.out.println(Arrays.toString(ex5[1]));
		System.out.println();
		
		/*- 실습 - 2차원 정방 행렬 배열의 4가지 배열 객체 생성 및 원소 값 대입 방법*/
		System.out.println("- 실습 - 2차원 정방 행렬 배열의 4가지 배열 객체 생성 및 원소 값 대입 방법");
		/*방법1) 배열 객체의 생성 및 원소 값 대입*/ System.out.println("방법1) 배열 객체의 생성 및 원소 값 대입");
		
		int[][] parray1 = new int[2][3];
		parray1[0][0] = 1;
		parray1[0][1] = 2;
		parray1[0][2] = 3;
		parray1[1][0] = 4;
		parray1[1][1] = 5;
		parray1[1][2] = 6;
		
		System.out.println(Arrays.toString(parray1[0]));
		System.out.println(Arrays.toString(parray1[1]));
		System.out.println();
		
		int[][] parray2;
		parray2 = new int[2][3];
		parray2[0][0] = 1;
		parray2[0][1] = 2;
		parray2[0][2] = 3;
		parray2[1][0] = 4;
		parray2[1][1] = 5;
		parray2[1][2] = 6;
		
		System.out.println(Arrays.toString(parray2[0]));
		System.out.println(Arrays.toString(parray2[1]));
		System.out.println();
		
		/*방법2) 배열 객체의 생성 및 원소 값*/ System.out.println("방법2) 배열 객체의 생성 및 원소 값");
		
		int[][] parray3 = new int[][] {{1, 2, 3}, {4, 5, 6}};
		
		for (int i = 0; i < 2; i++) { // for 문을 활용해 Arrays.toString처럼 출력하기
			System.out.print("[");
			for(int j = 0; j < 3; j++) {
				System.out.print(parray3[i][j]);
				if(j == 2) {
					break;
				}
				System.out.print(", ");
			}
			System.out.println("]");
		}
		System.out.println();
		
		int[][] parray4;
		parray4 = new int[][] {{1, 2, 3}, {4, 5, 6}};
		
		for (int i = 0; i < 2; i++) { // for 문을 활용해 Arrays.toString처럼 출력하기
			System.out.print("[");
			for(int j = 0; j < 3; j++) {
				System.out.print(parray4[i][j]);
				if(j == 2) {
					break;
				}
				System.out.print(", ");
			}
			System.out.println("]");
		}
		System.out.println();
		
		
		/*방법3) 배열의 객체 생성 및 원소 값 대입*/ System.out.println("방법3) 배열의 객체 생성 및 원소 값 대입");
		
		int[][] parray5 = {{1, 2, 3}, {4, 5, 6}};
		
		System.out.println(Arrays.toString(parray5[0]));
		System.out.println(Arrays.toString(parray5[1]));
		System.out.println();
		
		// int[][] parray6;
		// parray6 = {{1, 2, 3}, {4, 5, 6}}; // 배열의 객체 생성과 동시에 원소값을 대입하는 방법은 선언과 대입의 분리가 불가능
		
		
	}
	
}
