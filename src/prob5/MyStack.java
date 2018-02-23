package prob5;

public class MyStack {
	private String[] buffer;
	private int top=-1;
	private int index;
	
	public int getTop() {
		return top;
	}

	public void setTop(int top) {
		this.top = top;
	}
	
	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public MyStack(int index) {
		this.index=index;
		buffer=new String[index];
	}
	
	public void push(String str) {
		top++;
		if(isFull()==true) {
			this.resize(buffer);
			this.buffer[top]=str;
		}else {
			this.buffer[top]=str; 
		}
	}
	
	public String pop() throws MyStackException {
		if(this.isEmpty()==false) {
			String pop_str=this.buffer[top];
			top--;
			return pop_str;
		}
		throw new MyStackException("Stack is empty");
	}
	
	public boolean isEmpty(){
		if(top>-1) {
			return false;
		}else {
			return true;
		}
	}
	
	public boolean isFull() {
		if(top==getIndex()) {
			return true;
		}else {
			return false;
		}
	}
	
	public void resize(String[] ex_stack) {
		this.index=top+3;
		this.buffer=new String[this.index];
		for(int i=0; i<ex_stack.length; i++) {
			buffer[i]=ex_stack[i];
		}
	}
}