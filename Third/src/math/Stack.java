package math;

public class Stack {

	private int[] elements;
	private int size;
	
	public Stack(){
		
		this(10);
	}
	
	public Stack(int capacity){
		
		this.elements = new int[capacity];
		this.size = 0;
	}
	
	public boolean isFull(){
		
		if(size == this.elements.length){
			return true;
		}
		else{
			return false;
		}
	}
	
}
