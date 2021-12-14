package algol;

public class recur2 {
	
	static void recur(int n) {
		stack s = new stack(n);

		while (true) {
			if (n > 0) {
				s.push(n);						
				n = n - 1;
				continue;
			}
			if (s.isEmpty() != true) {			
				n = s.pop();					
				System.out.println(n);
				n = n - 2;
				continue;
			}
			break;
		}
	}
}
