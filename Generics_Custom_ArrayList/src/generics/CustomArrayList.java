package generics;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomArrayList {
	
	private int[] data;
	private static int DEFAULT_SIZE = 10;
	private int size = 0; // also working as index value
	
	public CustomArrayList() {
		this.data = new int[DEFAULT_SIZE];
	}
	
	public void add(int num) {
		if(isFull()) {
			resize();
		}
		data[size++] = num;
	}
	
	private void resize() {
		int[] temp = new int[data.length*2];
		for(int i=0;i<data.length;i++) {
			temp[i] = data[i];
		}
		data = temp;
	}
	
	private boolean isFull() {
		return size == data.length;
	}
	
	private int remove() {
		int remove = data[--size];
		return remove;
	}
	
	public int get(int index) {
		return data[index];
	}
	
	public int size() {
		return size;
	}
	
	public void set(int index,int value) {
		data[index] = value;
	}
	
	public void printData() {
		for(int ele : data) {
			System.out.println(ele + " ");
		}
		
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
		
		CustomArrayList cusArr = new CustomArrayList();
		cusArr.add(34);
		cusArr.add(4);
		cusArr.add(3);
		System.out.println(cusArr.toString());
		
		ArrayList<Integer> list2 = new ArrayList<>();
		list2.add(1);
	}
}
