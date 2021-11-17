package pack;

public interface IPile<T> {
	boolean estVide();
	void empile(T a);
	T depile();
	int nbrElements();
	T sommet(); 	
}
