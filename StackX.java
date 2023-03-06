package LAB_test;

public class StackX {
	 private int maxSize;    // size of stack array
	    private int[] stackArray;
	    private int top;           //top of the stack

	    public StackX(int s) // constructor
	    {      
	    	maxSize = s;       // set array size
	    	stackArray = new int[maxSize];
	    	top = -1;             
	    }
	    public void push(int j) 
	    { 
	    	// check whether stack is full
	    	if (top == maxSize- 1)
	    		System.out.println("Stack is full");
	    	else
	    		stackArray[++top] = j;
	   }
	    public int pop() 
	    {
	    	if (top == -1)
		      return -99;
	        else
		      return stackArray[top--];
	    }

	    public int peek() 
	    {
	    	if (top == -1)
		      return -99;
	        else
		      return stackArray[top];
	    	
	    	
	    }
	    public boolean isEmpty() {
	    	return (top == -1);
	    }
}
