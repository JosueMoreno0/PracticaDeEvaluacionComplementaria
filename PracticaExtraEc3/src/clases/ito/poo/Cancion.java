package clases.ito.poo;

import interfaz.Arreglo;
import excepcion.ito.poo.*;


public class Cancion implements Arreglo <Composicion>{

	static Composicion c;
	
	private Composicion pistas[]=null;
	private int ultimo=0; 
	private final int INC=5; 
	
	public Cancion() {
		super();
		this.pistas=new Composicion[INC];  
		this.ultimo=-1; 
	}
	
	
/////////////////////////////////////////////////////////////////
		
	public void borrarComposicion (Composicion item) throws borrarComposicion {
		if(item.getInterpretesSoli()=="") {
			throw new borrarComposicion("Lo sentimos, No es posible borrar una composicion que contiene interpretes");		
		}
	}
		
	
/////////////////////////////////////////////////////////////////
	
	public boolean existeItem(Composicion item) {
			boolean existe=false;
			for(int i=0;i<=this.ultimo;i++)
				if(item.compareTo(this.pistas[i])==0) {
					existe=true;
					break;
				}
						
			return existe;
		}
		
	
/////////////////////////////////////////////////////////////////
	
	public void incrementaArreglo() {
			Composicion incrementa[]=new Composicion[this.pistas.length+INC];
			for(int i=0;i<pistas.length;i++)
				incrementa[i]=this.pistas[i];
			pistas= incrementa;
		}
		
	
/////////////////////////////////////////////////////////////////
	
	public boolean addItem(Composicion item) throws ExistCancion {
		boolean add=false;
		
		if(this.isFull()) 
			incrementaArreglo();
		int j=0;
		for(;j<=this.ultimo;j++)
			if(item.compareTo(this.pistas[j])<0) {
				break;
				}
				
				for(int i=this.ultimo;i>=j;i--)
					pistas[i+1]=pistas[i];
				this.pistas[j]=item;
				this.ultimo++;
				add=true;
			
		return add;
	}
	
		
/////////////////////////////////////////////////////////////////
	
	public Composicion getItem(int pis) {
			Composicion cb=null;
			if(pis<=this.ultimo&&!this.isFree())
				cb=this.pistas[pis];
			return cb;
		}
		
	
/////////////////////////////////////////////////////////////////
	
	public int getSize() {
		return this.ultimo+1;
	}
	
		
/////////////////////////////////////////////////////////////////
	
	public boolean clear(Composicion item) {
			boolean borra=false;
			if(this.existeItem(item)) {
				int i=0;
				for(;i<=this.ultimo;i++)
					if(item.compareTo(this.pistas[i])==0)
						break;
				for(;i<=this.ultimo;i++)
					pistas[i]=pistas[i+1];
				this.ultimo--;
				borra=true;
			}
			return borra;
		}
		
		
/////////////////////////////////////////////////////////////////
	
	public boolean isFree() {
			return this.ultimo==-1;
		}
	
	
/////////////////////////////////////////////////////////////////
	
	public boolean isFull() {
			return this.ultimo+1==this.pistas.length;
		}

}		
		


