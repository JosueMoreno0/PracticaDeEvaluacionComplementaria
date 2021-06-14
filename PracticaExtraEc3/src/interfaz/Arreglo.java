package interfaz;

import excepcion.ito.poo.*;

public interface Arreglo<T> {
	
/////////////////////////////////////////////////7	
	public boolean addItem(T item) throws ExistCancion;
	public boolean clear(T item);
	public boolean isFree();
	public boolean isFull();
	public boolean existeItem(T item);
	
	public T getItem(int pos);
	public int getSize();
	
	
}