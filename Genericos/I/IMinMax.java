package genericos.lista;

public interface IMinMax<T extends Comparable<T>> {
	
	T max();
	T min();
}
