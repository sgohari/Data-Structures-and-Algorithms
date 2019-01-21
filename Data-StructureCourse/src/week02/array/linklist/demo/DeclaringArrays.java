package week02.array.linklist.demo;

public class DeclaringArrays {

	public static void main(String[] args) {

		int[] age = new int[10];

		for (int i = 0; i < 10; ++i) {
			age[i] = i * 3;
			System.out.println(age[i]);
		}
	}

}
