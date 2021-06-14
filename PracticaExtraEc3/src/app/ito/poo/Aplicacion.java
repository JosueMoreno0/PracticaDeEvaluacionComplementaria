package app.ito.poo;

import java.util.Scanner;
import java.awt.HeadlessException;
import java.io.FileNotFoundException;
import java.time.LocalDate;

import excepcion.ito.poo.*;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import clases.ito.poo.*;

import txt.ito.poo.*;



public class Aplicacion {
	
	static Scanner lector= new Scanner(System.in);
	static Cancion e;
	static Composicion c;
	static eArchivo escritorA;
	static lArchivo lectorA;
	
	
	static void menuPrincipal() throws  HeadlessException, interprete, tituloComp, borrarComposicion, ExistCancion, consultaComposicion, borrarInterprete, FileNotFoundException {	 Comenzar();  IniciarP();
		
		final JPanel 
		panel=new JPanel();
		boolean error=true;
		while(error) {
		try {
		boolean periodo=true;
		int respuesta=0;
		while(periodo) {
		String opciones=
				" << Indique la acción que desea realizar >> \n"
				+ "1) - Añadir cancion -\n"
				+ "2) - Consultar composicion -\n"
				+ "3) - Borrar interprete -\n"
				+ "4) - Borrar cancion -\n"
				+ "5) - Exit -\n";
		
		respuesta=Integer.parseInt(JOptionPane.showInputDialog(opciones));
		switch(respuesta) {
		case 1:adicionarComposicion();break;
		case 2:muestraComposicion();break;
		case 3:System.out.print("Inserta la posicion en donde se encuentre el nombre del interprete que deseas borrar");
		
		for(int i=0;i<=e.getSize();i++)
			System.out.println("lugar que ocupa el interprete"
		        +(i+1)+e.getItem(i));
		    System.out.println("Que interprete desea borrar");
		        int m = lector.nextInt();
		borrarInterprete(m);break;
		
		case 4:borrarCancion();break;
		case 5:guardaRegistro();periodo=false;error=false;break;
		default:JOptionPane.showMessageDialog(null,"Ingresar opcion");
		case 6:break;
		  }
		}

///////////////////////////////////////////////////////////////////////////////////////////////////
		
		}catch(tituloComp e){
			JOptionPane.showMessageDialog(panel,e.getMessage(),"Error del sistema!", JOptionPane.ERROR_MESSAGE);
			
		}catch(interprete e ) {
			JOptionPane.showMessageDialog(panel,e.getMessage(),"Error del sistema!", JOptionPane.ERROR_MESSAGE);
			
		}catch(	ExistCancion e) {
			JOptionPane.showMessageDialog(panel,e.getMessage(),"Error del sistema!", JOptionPane.ERROR_MESSAGE);
			
		}catch(borrarInterprete e) {
			JOptionPane.showMessageDialog(panel,e.getMessage(),"Error del sistema!", JOptionPane.ERROR_MESSAGE);
			
		}catch(borrarComposicion e) {
			JOptionPane.showMessageDialog(panel,e.getMessage(),"Error del sistema!", JOptionPane.ERROR_MESSAGE);
			
		}catch(consultaComposicion e) {
			JOptionPane.showMessageDialog(panel,e.getMessage(),"Error del sistema!", JOptionPane.ERROR_MESSAGE);
			
		    }
		}
	}
	
	
///////////////////////////////////////////////////////////////////////////////////////////////////
	
	static Composicion encapsularcomposicion()throws tituloComp, interprete , ExistCancion, borrarInterprete,borrarInterprete, consultaComposicion  {
	Composicion c= new Composicion(null, null, 0, 0, null, null, null, null);
	
			String t, interSoli, genero, fechaRegis, fechaEstreno;int minutos, segundos;
			t=JOptionPane.showInputDialog("Inserte el titulo de la composicion:");
			interSoli=JOptionPane.showInputDialog("Inserte el nombre de interprete:");
			genero=JOptionPane.showInputDialog("Inserte el genero:");
			fechaRegis=JOptionPane.showInputDialog("Inserte fecha en la que se registro la composicion: (AAAA-MM-DD)");
			fechaEstreno=JOptionPane.showInputDialog("Inserte la fecha que en la que se estreno la composicion: (AAAA-MM-DD)");
			minutos=Integer.parseInt(JOptionPane.showInputDialog("Inserte duracion de la composicion en minutos: (MM)"));
			segundos=Integer.parseInt(JOptionPane.showInputDialog("Inserte duracion de la composicion en segundoss: (SS)"));
			
			c.setTitulo(t);
			c.setInterpretesSoli(interSoli);
			c.setGenero(genero);
			c.setFechaRegistro(LocalDate.parse(fechaRegis));
			c.setFechaEstreno(LocalDate.parse(fechaEstreno));
			c.setMinutos(minutos);
			c.setSegundos(segundos);
			
			return c;
					
		}
	
	
///////////////////////////////////////////////////////////////////////////////////////////////////
	
   static void adicionarComposicion() throws tituloComp, interprete, HeadlessException , ExistCancion, consultaComposicion, ExistCancion, borrarInterprete, FileNotFoundException {
	   Composicion adiciona;
	   adiciona=encapsularcomposicion();
	   
	   e.addItem(adiciona);
	   JOptionPane.showMessageDialog(null, "Su composicion se agrego exitosamente");
	       if(e.isFull())
		       e.incrementaArreglo();

    }
	
   
///////////////////////////////////////////////////////////////////////////////////////////////////
	
   static void muestraComposicion() {

   if(e.isFree())
       JOptionPane.showMessageDialog(null,"Ups!, No se encontro ninguna composicion");
     
       else {
            String pistas="";
            for(int i=0;i<e.getSize();i++)
            pistas=pistas+"\n"+(e.getItem(i));
            JOptionPane.showMessageDialog(null,pistas);

         }
      }
   
///////////////////////////////////////////////////////////////////////////////////////////////////
   
    static void borrarInterprete(int b) {
       String compositor = "";
      e.getItem(b).setInterpretesSoli(compositor);

     }
    
    
///////////////////////////////////////////////////////////////////////////////////////////////////
	
		static void borrarCancion() throws borrarComposicion {
			int pos=0;
			if(e.isFree())
				JOptionPane.showMessageDialog(null,"Aun no hay composiciones");
			else {
				boolean COM=true; 
				while(COM) {
			    String pistas="";
			    
			    for(int i=0;i<e.getSize();i++)
				    pistas=pistas+"\n"+(i+1)+")"
			        +(e.getItem(i));
			    pos=Integer.parseInt(JOptionPane.showInputDialog("Seleccione la composicion que desea borrar\n"
				    + pistas));
			    if((e.getSize())>=pos&&pos>0) {
			    	e.borrarComposicion(e.getItem(pos-1));
			    	e.clear(e.getItem(pos-1));
			    	
			    	JOptionPane.showMessageDialog(null,"Composicion borrada exitosamente!");
			    	COM=false;
			    }	
			    else
			    	
			    	JOptionPane.showMessageDialog(null,"Ups!, Aun no hay composiciones registradas");
			    }
			}
		}
    
	
///////////////////////////////////////////////////////////////////////////////////////////////////
	
	static void guardaRegistro() throws FileNotFoundException , ExistCancion , borrarInterprete, consultaComposicion {
		if (e.isFree()) {
			
		}
		else {
			escritorA=new eArchivo(""); 
			for(int i=0;i<e.getSize();i++) {
				escritorA.writeString(e.getItem(i).getGenero());
				escritorA.writeString(e.getItem(i).getTitulo());
				escritorA.writeString(e.getItem(i).getInterpretesSoli());
				if(e.getItem(i).getFechaRegistro()==null) {
					escritorA.writeString(e.getItem(i).getFechaEstreno().toString());
					escritorA.writeStringLn("null");	
				}
				else {
					escritorA.writeString(e.getItem(i).getFechaRegistro().toString());
					escritorA.writeStringLn(e.getItem(i).getFechaEstreno().toString());	
				}
				
			}
			escritorA.close();
		}
					
	}
	
   
///////////////////////////////////////////////////////////////////////////////////////////////////
	
	  static void Comenzar() {
		e=new Cancion();
	   }
		
				
///////////////////////////////////////////////////////////////////////////////////////////////////
		
		static void IniciarP() throws FileNotFoundException, tituloComp ,ExistCancion {
			boolean existe=false;
			try {
				lectorA= new lArchivo("...");
				existe=true;
			}catch(FileNotFoundException e) {
				System.err.println("");  
			}
			if(existe)
				LTexto();
			
		}
		
		
///////////////////////////////////////////////////////////////////////////////////////////////////
		
		@SuppressWarnings("null")
		static void LTexto() throws tituloComp ,ExistCancion {
			
			while(!lectorA.isEOF()) {
				Composicion n=null;
				n.setTitulo(lectorA.readString());
				n.setMinutos(lectorA.readInt());
				n.setSegundos(lectorA.readInt());
				n.setGenero(lectorA.readString());
				n.setFechaRegistro(LocalDate.parse(lectorA.readString()));
				n.setInterpretesSoli(lectorA.readString());
				String fechaAct;
				fechaAct=lectorA.readString();
				if(fechaAct.equals("null")) 
					n.setFechaEstreno(null);
				else
					n.setFechaEstreno(LocalDate.parse(fechaAct));
				e.addItem(c);
				lectorA.isFinLinea();
				
		}
	}
}


