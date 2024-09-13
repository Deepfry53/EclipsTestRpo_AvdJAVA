package Generics;

public class GenericExample1<T> {
	
	T obj;

	public GenericExample1(T obj) {
		this.obj  = obj;
	}
	
	public T getObj() {
		return this.obj;
	}	

}
