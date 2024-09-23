package Generics;

public class GenericExample1<T,U> {
	
	T obj;
	U value;

	public GenericExample1(T obj,U value) {
		this.obj  = obj;
		this.value = value;
	}

	
	public T getObj() {
		return this.obj;
	}	

	
}
