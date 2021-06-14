package app.ito.poo;
import java.awt.HeadlessException;
import java.io.FileNotFoundException;


import txt.ito.poo.*;
import clases.ito.poo.Cancion;
import excepcion.ito.poo.*;

public class MyApp {
	
		static Cancion e=new Cancion();
		static lArchivo lectorA;
		static eArchivo escritorA;
		
		
///////////////////////////////////////////////////////////////////////////////////////
		static void run() throws HeadlessException, ExistCancion, borrarComposicion, FileNotFoundException, tituloComp, interprete , consultaComposicion, borrarInterprete {
			Aplicacion.menuPrincipal();
	    }
		

///////////////////////////////////////////////////////////////////////////////////////
		static void crearArchivo() throws FileNotFoundException {
				lectorA = new lArchivo ("Almacena composiciones");
			}
		
		
///////////////////////////////////////////////////////////////////////////////////////
		public static void main(String[] args) throws HeadlessException, ExistCancion, borrarComposicion, FileNotFoundException, tituloComp, interprete , consultaComposicion, borrarInterprete  {
				run();
			}
}

