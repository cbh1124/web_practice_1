package algol;

public class stack {
	private int max;			// 스택 용량
	private int ptr;			// 스택 포인터
	private int[] stk;			// 스택 본체

	// 스택이 비어 있습니다. 
	public class EmptyIntStackException extends RuntimeException {
		public EmptyIntStackException() { }
	}

	// 스택이 가득차면 예외 
	public class OverflowIntStackException extends RuntimeException {
		public OverflowIntStackException() { }
	}

	// 생성자
	public stack(int capacity) {			// stacktest에서 생성자에 값을 대입
		ptr = 0;							// 저장소 개념으로 봤음 
		max = capacity;						// 용량 
		try {
			stk = new int[max];				// 스택 배열 생성
		} catch (OutOfMemoryError e) {		// 생성 에러 시 max = 0
			max = 0;
		}
	}

	// 스택에 x를 푸시
	public int push(int x) throws OverflowIntStackException {
		if (ptr >= max)									// 스택이 가득 참
			throw new OverflowIntStackException();
		return stk[ptr++] = x;
	}

	// 가장 위에 위치한 데이터를 빼버린다. 
	public int pop() throws EmptyIntStackException {
		if (ptr <= 0)									// 스택이 비어 있음
			throw new EmptyIntStackException();
		return stk[--ptr];
	}

	// 스택에서 데이터를 피크한다 제일 위에있는 데이터를 살펴본다 
	public int peek() throws EmptyIntStackException {
		if (ptr <= 0)									// 스택이 비어 있음
			throw new EmptyIntStackException();
		return stk[ptr - 1];
	}

	// 스택에서 x를 찾아 인덱스(없으면 –1)를 반환 
	public int indexOf(int x) {
		for (int i = ptr - 1; i >= 0; i--)				// 정상 쪽에서 선형 검색
			if (stk[i] == x)
				return i;								// 검색 성공
		return -1;										// 검색 실패
	}

	// 스택을 비우겠다.
	public void clear() {
		ptr = 0;
	}

	// 스택의 용량을 확인
	public int capacity() {
		return max;
	}

	// 스택에 쌓여 있는 데이터 수를 확인
	public int size() {
		return ptr;
	}

	// 스택이 비어있는지 확인
	public boolean isEmpty() {   //true false로 반환해서 확인
		return ptr <= 0;
	}

	// 스택이 가득 찼는지 확인 
	public boolean isFull() {	//true false로 반환해서 확인
		return ptr >= max;
	}

	// 스택 안의 모든 데이터를 출력 // 만약 가져오게되면 밑에서부터 꼭대기 순으로 표시함 
	public void dump() {
		if (ptr <= 0)
			System.out.println("스택이 비어 있습니다.");
		else {
			for (int i = 0; i < ptr; i++)
				System.out.print(stk[i] + " ");
			System.out.println();
		}
	}
}
