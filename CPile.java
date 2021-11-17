package pack;

import java.util.LinkedList;

public class CPile<T> implements IPile<T> {

	private LinkedList<T> list ;
	
	
	
	public CPile() {
		 list = new LinkedList<T>();
	}

	 public CPile(LinkedList<T> list) {
	
		this.list = list;
	}

	@Override
	public boolean estVide() {
		
		return list.size()==0;
	}

	@Override
	public void empile(T a) {
        list.addFirst(a);		
	}

	@Override
	public T depile() {
		
		return list.removeFirst();
	}

	@Override
	public T sommet() {
		
		return list.getFirst();
	}

	@Override
	public int nbrElements() {
		
		return list.size();
	}

	@Override
	public String toString() {
		return " [" + list + "]";
	}
	

}
