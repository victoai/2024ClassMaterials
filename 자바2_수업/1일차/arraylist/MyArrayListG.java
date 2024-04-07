package java2.generic.arraylist;

public class MyArrayListG<T> {

	private Object[] nums;
	private int current;

	public MyArrayListG() {
		nums = new Object[3];
		current = 0;
	}

	public void add(T obj) {
		nums[current] = obj;
		current++;

	}

	public void clear() {
		// current 초기화
		current = 0;
		// nums= new int[3];
	}

	public int size() {
		return current;
	}

	public T get(int index) {

		return (T) nums[index];

	}

	public void forEach(MyConsumerG<T> t) {

		for (int i = 0; i < current; i++) {
			t.accept(get(i));
		}

	}

	public void forEach2(MyConsumerG<? super T> t) {

		for (int i = 0; i < current; i++) {
			t.accept(get(i));
		}

	}

}
