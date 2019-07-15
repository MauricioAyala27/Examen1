package com.clases;

import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class Persona extends Categoria {
	
	private ArrayList<String> nombre = new ArrayList<String>();
	private ArrayList<String> apellido = new ArrayList<String>();
	private ArrayList<java.util.Date> fechaNacimiento = new ArrayList<>();
	private ArrayList<String> dui = new ArrayList<String>();
	private ArrayList<String> correoElectronico = new ArrayList<String>();
	private ArrayList<String> telefono = new ArrayList<String>();
	private ArrayList<String> categoria = new ArrayList<String>();
	private String p;
	

	
	public Persona() {
	
	}

	public Persona(ArrayList<String> nombre, ArrayList<String> apellido, ArrayList<java.util.Date> fechaNacimiento,
			ArrayList<String> dui, ArrayList<String> correoElectronico, ArrayList<String> telefono,
			ArrayList<String> categoria) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNacimiento = fechaNacimiento;
		this.dui = dui;
		this.correoElectronico = correoElectronico;
		this.telefono = telefono;
		this.categoria = categoria;
	}


	public ArrayList<String> getNombre() {
		return nombre;
	}
	public void setNombre(ArrayList<String> nombre) {
		this.nombre = nombre;
	}
	public ArrayList<String> getApellido() {
		return apellido;
	}
	public void setApellido(ArrayList<String> apellido) {
		this.apellido = apellido;
	}
	public ArrayList<java.util.Date> getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(ArrayList<java.util.Date> fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public ArrayList<String> getDui() {
		return dui;
	}
	public void setDui(ArrayList<String> dui) {
		this.dui = dui;
	}
	public ArrayList<String> getCorreoElectronico() {
		return correoElectronico;
	}
	public void setCorreoElectronico(ArrayList<String> correoElectronico) {
		this.correoElectronico = correoElectronico;
	}
	public ArrayList<String> getTelefono() {
		return telefono;
	}
	public void setTelefono(ArrayList<String> telefono) {
		this.telefono = telefono;
	}
	
	public ArrayList<String> getCategoria() {
		return categoria;
	}



	public void setCategoria(ArrayList<String> categoria) {
		this.categoria = categoria;
	}
	
	public void convertirFecha(String data) {
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		java.util.Date dt = null;
		try {
			dt = format.parse(data);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		fechaNacimiento.add(dt);
	}

	
	public void insertarPersona() {
		

		Scanner sc = new Scanner(System.in);
		System.out.println("\nIngrese el nombre:");
		nombre.add(sc.nextLine());
		System.out.println("\nIngrese el apellido:");
		apellido.add(sc.nextLine());
		System.out.println("\nIngrese la fecha de nacimiento:");
		String fec = sc.nextLine();
		convertirFecha(fec);
		System.out.println("\nIngrese el DUI:");
		dui.add(sc.nextLine());
		System.out.println("\nIngrese el correo electronico:");
		p = sc.nextLine();
		validarCorreo(p);
		System.out.println("\nIngrese el telefono:");
		telefono.add(sc.nextLine());
		System.out.println("\nDigite una categoria que le guste:");
		if(categorias.size()>0) {
			
			if(categorias.size()==1) {
				categorias.add("PELICULAS");
				categorias.add("SERIES");
				categorias.add("JUEGOS");
				categorias.add("DECORACION");
				categorias.add("ENTRETENIMIENTO");
				System.out.println("\n" + mostrar() + "\n");
			}
			else {
				System.out.println("\n" + mostrar() + "\n");
			}
			
		}
		else {
			System.out.println("\n" + llenar() + "\n");
		}
		categoria.add(sc.nextLine().toUpperCase());
	}
	
	public void validarCorreo(String data) {
		
		Scanner sc = new Scanner(System.in);
	
		if(correoElectronico.size()>0){
			
			if(correoElectronico.contains(data)){
				
				System.out.println("\nLo sentimos este correo ya esta en uso. Vuelva a intentarlo");
				System.out.println("\nIngrese el correo electronico:");
				correoElectronico.add(sc.nextLine());
			}
			else {
				correoElectronico.add(data);
			}
		}
		else {
			correoElectronico.add(data);
		}
						
	}

	
	 public void listarPersona() {

		 System.out.println("\n:::::::::::REGISTRO DE PERSONAS:::::::::::");	 
			 System.out.println("Nombre: " + nombre);
			 System.out.println("Apellido: " + apellido);
			 System.out.println("Fecha de nacimiento: " + fechaNacimiento);
			 System.out.println("DUI: " + dui);
			 System.out.println("Correo Electronico: " + correoElectronico);
			 System.out.println("Telefono: " + telefono);
			 System.out.println("Categoria: " + categoria);
			 System.out.println(":::::::::::::::::::::::::::::::::::::::");
		 
	 }
	 
	 public void buscarPersona() {
		 
		 Scanner sc = new Scanner(System.in);
		 String param;
		 int ix=0;

		 System.out.println("\nIngrese el nombre de la persona: ");
		 param = sc.nextLine();
		 
		 if(nombre.contains(param)) {
			 
			 ix = nombre.indexOf(param);
			 System.out.println("\nNombre: " + nombre.get(ix));
			 System.out.println("Apellido: " + apellido.get(ix));
			 System.out.println("Fecha Nacimiento: " + fechaNacimiento.get(ix));
			 System.out.println("DUI: " + dui.get(ix));
			 System.out.println("Correo Electronico: " + correoElectronico.get(ix));
			 System.out.println("Telefono: " + telefono.get(ix));
			 System.out.println("Categoria: " + categoria.get(ix));
		 }
		 else {
			 System.out.println("La persona que ingreso no existe...");
		 }
		 
	 }
	 
	/*
	 * public int calcularEdad(ArrayList<java.util.Date> fechaNacimiento2) {
	 * 
	 * String formato="yyyy"; SimpleDateFormat dateFormat = new
	 * SimpleDateFormat(formato); return 2019 -
	 * Integer.parseInt(dateFormat.format(fechaNacimiento2)); }
	 */
	 
	 
	

	

}

