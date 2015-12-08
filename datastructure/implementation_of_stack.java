package com.datastructure;

//Return the minimum and maximum element in O(1) time 

public class implementation_of_stack {
	private int maxSize;
	private long[] stackArray;
	private long[] minarray;
	private long[] maxarray;
	private int top;
	private int min = -1;
	private int max=-1;
	long flag = Integer.MAX_VALUE;
	long flagmax=Integer.MIN_VALUE;

	public implementation_of_stack(int s) {
		maxSize = s;
		stackArray = new long[maxSize];
		minarray = new long[maxSize];
		maxarray=new long[maxSize];
		top = -1;
	}

	public void push(long j) {
		stackArray[++top] = j;
		pushforMINMAX(j);
	}

	private void pushforMINMAX(long j) {
		if (j < flag) {
			minarray[++min] = j;
			flag = j;
		}
		if(j>flagmax){
			maxarray[++max]=j;
			flagmax=j;
		}
	}

	public long pop() {
       
		return stackArray[top--];
	}

	private long min_pop() {
		if (stackArray[++top] == minarray[min])
			return minarray[min--];
		else
			return 0;

	}
	
	private long max_pop() {
		if (stackArray[top] == maxarray[max])
			return maxarray[max--];
		else
			return 0;

	}

	public long peek() {
		return stackArray[top];
	}

	public long peekmin() {
		return minarray[min];
	}
	
	public long peekmax() {
		return maxarray[max];
	}
	
	

	public boolean isEmpty() {
		return (top == -1);
	}

	public boolean isFull() {
		return (top == maxSize - 1);
	}

	public static void main(String[] args) {
		implementation_of_stack theStack = new implementation_of_stack(10);
		theStack.push(10);
		theStack.push(20);
		theStack.push(60);
		theStack.push(80);
		long i = theStack.peekmin();
		System.out.println(i);
		long j = theStack.peekmax();
		System.out.println(j);
		long ii = theStack.pop();
		System.out.println(ii);
		long ti = theStack.min_pop();
		System.out.println(ti);
		long iu = theStack.max_pop();
		System.out.println(iu);
		long jk = theStack.peekmax();
		System.out.println(jk);
	}
}