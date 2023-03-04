package NGS.NHN.code.day09.third;

public interface Stackable<T> {
	void push(T item);
	T pop();
}