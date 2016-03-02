
public class Main {
	public static int f2(int a, int b, int c) {
		return a * b * c;
	}

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			
			System.out.println(f2((int) (Math.random() * 10), +(int) (Math.random() * 15), (int) (Math.random() * 20)));
		}

	}

}
