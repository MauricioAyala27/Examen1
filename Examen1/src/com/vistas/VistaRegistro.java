package com.vistas;

import java.util.Scanner;

import com.clases.Persona;

public class VistaRegistro {

	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner(System.in);
		Persona p = new Persona();
		int op = 0;
		
		try {
			
			do {
				
			 System.out.println(":::::::::Bienvenido al registro:::::::::");
			 System.out.println("Que opcion desea realizar?" +
					 			"\n1.Agregar Persona." +
					 		    "\n2.Mostrar Listado de Personas." + 
					 			"\n3.Buscar Persona y Mostrarla." +
					 		    "\n4.Agregar una nueva categoria." +
					 			"\n5.Salir");
			 	op = Integer.parseInt(sc.nextLine());
			 	
			 switch(op)
			 {
			 	 case 1:
			 		 p.insertarPersona();
			 		 break;
			 	 case 2:
			 		 p.listarPersona();
			 		 break;
			 	 case 3:
			 		 p.buscarPersona();
			 		 break;
			 	 case 4:
			 		 Persona.insertaCategoria();
			 		 break;
			 	 default:
			 		 if(op>5){
			 			 System.out.println("Selecciono una opcion incorrecta");
			 		 }
			 		 break;
			 }
			 
			  System.out.println("\n");
			  
			}while(op!=5);
			
		}catch(Exception e){
			
			System.out.println("Ocurrio un error " + e.getMessage());
		}
		
		sc.close();

	}

}
