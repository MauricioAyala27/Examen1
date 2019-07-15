package com.clases;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class Categoria implements Metodos {
	
	protected static ArrayList<String> categorias = new ArrayList<String>();
	
	
	
	public static ArrayList<String> llenar() {
		
		categorias.add("PELICULAS");
		categorias.add("SERIES");
		categorias.add("JUEGOS");
		categorias.add("DECORACION");
		categorias.add("ENTRETENIMIENTO");

		return categorias;
	}
	
	public static ArrayList<String>mostrar(){
		
		return categorias;
	}
	
	
	public static ArrayList<String> insertaCategoria(){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("\nIngrese la nueva categoria: ");
		categorias.add(sc.nextLine().toUpperCase());

		
		return categorias;
		
	}
	
	
	
	
	
	
	

}
