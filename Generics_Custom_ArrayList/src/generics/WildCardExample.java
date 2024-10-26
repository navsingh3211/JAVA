package generics;

import java.util.Arrays;
import java.util.List;


//here T should either be Number or its subclasses
public class WildCardExample<T extends Number> {
	private Object[] data;
	private static int DEFAULT_SIZE = 10;
	private int size = 0; // also working as index value
	
	public WildCardExample() {
		this.data = new Object[DEFAULT_SIZE];
	}
	
	//if you want to pass number type and sub-classes of it
	//wild card example
	public void getList(List<? extends Number> list) {
		//do something
		
	}
	
	public void add(T num) {
		if(isFull()) {
			resize();
		}
		data[size++] = num;
	}
	
	private void resize() {
		Object[] temp = new Object[data.length*2];
		for(int i=0;i<data.length;i++) {
			temp[i] = data[i];
		}
		data = temp;
	}
	
	private boolean isFull() {
		return size == data.length;
	}
	
	private T remove() {
		T remove = (T)(data[--size]);
		return remove;
	}
	
	public T get(int index) {
		return (T)data[index];
	}
	
	public int size() {
		return size;
	}
	
	public void set(int index,T value) {
		data[index] = value;
	}
	
	
	
	public String toString() {
		return "CustomArrayList{" + 
	            "data=" + Arrays.toString(data) + 
	            ", size=" + size + "}";
	}
	
	public static void main(String[] args) {
//		ArrayList list = new ArrayList();//type safety is missing
//		list.add(25);
//		System.out.println(list);
		
		WildCardExample<Integer> cusArr = new WildCardExample<>();
		for(int i=0;i<14;i++) {
			cusArr.add(2*i);
		}
		System.out.println(cusArr.toString());
		
//		ArrayList<Integer> list2 = new ArrayList<>();
//		list2.add(1);
	}
}
