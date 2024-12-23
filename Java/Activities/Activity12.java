package activities;

@FunctionalInterface

interface Addable {
	int add(int a, int b);
}

public class Activity12 {

	public static void main(String[] args) {
		Addable addobj = (int a, int b)-> {
			return a + b;
		};
		System.out.println(addobj.add(10, 10));

	}

}
