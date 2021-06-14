package txt.ito.poo;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class lArchivo {

private Scanner lectorA=null;
	
	public lArchivo(String archivo) throws FileNotFoundException {
		lectorA= new Scanner(new File(archivo));
	}
	
	public byte readByte() {
		byte salida=0;
		if(lectorA.hasNextByte())
			salida=lectorA.nextByte();
		return salida;
	}
	
	public short readShort() {
		short salida=0;
		if(lectorA.hasNextShort())
			salida=lectorA.nextShort();
		return salida;
	}
	
	public int readInt() {
		int salida=0;
		if(lectorA.hasNextInt())
			salida=lectorA.nextInt();
		return salida;
	}
	
	public long readLong() {
		long salida=0;
		if(lectorA.hasNextLong())
			salida=lectorA.nextLong();
		return salida;
	}

	public float readFloat() {
		float salida=0;
		if(lectorA.hasNextFloat())
			salida=lectorA.nextFloat();
		return salida;
	}
	
	public double readDouble() {
		double salida=0;
		if(lectorA.hasNextDouble())
			salida=lectorA.nextDouble();
		return salida;
	}
	
	public String readString() {
		String salida="";
		if(lectorA.hasNext())
			salida=lectorA.next();
		return salida;
	}
	
	public boolean readBoolean() {
		boolean salida=false;
		if(lectorA.hasNextBoolean())
			salida=lectorA.nextBoolean();
		return salida;
	}
	
	public boolean isFinLinea() {
		boolean salida=false;
		if(lectorA.hasNext("\n")) {
			salida=true;
			lectorA.nextLine();
		}
		return salida;
	}
	
	public boolean isEOF() {
		boolean salida=false;
		if(!lectorA.hasNext())
			salida=true;
		return salida;
	}
	
	public void close() {
		lectorA.close();
	}

}
	
	
