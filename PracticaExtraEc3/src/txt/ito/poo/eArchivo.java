package txt.ito.poo;

import java.io.FileNotFoundException;
import java.util.Formatter;

public class eArchivo {

private Formatter escritorA;
	
	public eArchivo(String escritorA) throws FileNotFoundException{
		this.escritorA= new Formatter(escritorA);
	}
	
	public  void writeByte(byte item) {
		this.escritorA.format("%d ", item);
	}
	
	public void writeByteLn(byte item) {
		this.escritorA.format("%d\n", item);
	}
	
	public void writeShort(short item) {
		this.escritorA.format("%d ", item);
	}
	
	public void writeShortLn(short item) {
		this.escritorA.format("%d\n", item);
	}
	
	public void writeInt(int item) {
		this.escritorA.format("%d ",item);
	}
	
	public void writeIntLn(int item) {
		this.escritorA.format("%d\n", item);
	}
	
	public void writeLong(long item) {
		this.escritorA.format("%d ",item);
	}
	
	public void writeLongLn(long item) {
		this.escritorA.format("%d\n", item);
	}
	
	public void writeString(String item) {
		this.escritorA.format("%s ", item);
	}
	
	public void writeStringLn(String item) {
		this.escritorA.format("%s\n", item);
	}
	
	public void writeFloat(float item) {
		this.escritorA.format("%.2f ", item);
	}
	
	public void writeFloatLn(float item) {
		this.escritorA.format("%f\n", item);
	}
	
	public void writeDouble(double item) {
		this.escritorA.format("%f ", item);
	}
	
	public void writeDoubleLn(double item) {
		this.escritorA.format("%f\n", item);
	}
	
	public void writeBoolean(boolean item) {
		this.escritorA.format("%b ", item);
	}
	
	public void writeBooleanLn(boolean item) {
		this.escritorA.format("%b\n", item);
	}
	
	
	
	public void close() {
		this.escritorA.close();
	}
}