package NGS.NHN.code.day09.fifth;

public class Algorithm {
	
	public static int addFrom1To10() {
		int sum = 0;
		for (int i = 0; i < 10; i++) {
			sum += i;
		}
		return sum;
	}
	
	public static int sigma(int start, int end, int step) {
		return accumlate((x, y) -> (x + y), 0, start, end, step);
	}
	
	public static int pow(int start, int end, int step) {
		return accumlate((x, y) -> (x * y), 1, start, end, step);
	}
	
	public static int accumlate(BinaryOp binder, int init, int begin, int end, int step) {
		int result = init;
		for (int next = begin; next <= end; next += step) {
			result = binder.apply(result, next);
			
		}
		return result;
	}
	
	
	public static void main(String[] args) {
		System.out.println(sigma(1, 10, 1));
		System.out.println(pow(1, 10, 1));
		
	}

}
