package examenElbueno;


import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Date;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class examen{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int puntaje;
		String nombre;
		Date fecha;

		 
		 Scanner name = new Scanner(System.in);
		 String nom;
		 
		 System.out.println("Ingresa tu nombre");
		 nom=name.nextLine();

	     //System.out.println("Ingrese su nombre");
	     //nombre =  sc.nextLine();

	     pregunta ArrayPreguntas[] =  new pregunta[41];

	 		try {
	 			FileInputStream f= new FileInputStream("/Users/melyjram/Desktop/sample-questions.xlsx");

	 			XSSFWorkbook libro = new XSSFWorkbook(f);

	 		XSSFSheet hoja = libro.getSheetAt(0);


	 		Iterator<Row> filas = hoja.iterator();
	 		Iterator<Cell> Celdas;

	 		 Row fila;
	         Cell celda;
	         int contador = 0; 

	         while(filas.hasNext()){
		         ArrayPreguntas[contador] =  new pregunta();
	             fila = filas.next();
	             ArrayPreguntas[contador].pregunta = fila.getCell(0).getStringCellValue();
	             ArrayPreguntas[contador].respuestaCorrecta = fila.getCell(1).getStringCellValue();
	             ArrayPreguntas[contador].index = contador;

	             System.out.println("pregunta " + ArrayPreguntas[contador].getPregunta() + "respuesta " + ArrayPreguntas[contador].getRespuestaCorrecta());
	             contador ++;
	                 }


	 		}catch (IOException ex) {
	 				System.out.println(ex.getMessage());
	 		}

	}
}	



		/*
		 * Int puntaje =0
			string nombre
			Fecha y hora 
			Aleatorias [n]  [preguntaPosible] [respuesta] 
			@Metodos
			Random de 10 preguntas 
			Aplicar examen (pregunta, respuesta){
			mostrar pregunta sola, con respuestas
			for (int preguntas; preguntas >0; preguntas ++){
			mostrar pregunta 
			mostrar posibles respuestas
			recibir la respuesta
			if(correcto){puntaje +1}
			Guardar Pregunta actual
			clear; 
		}
	systemout las 10 preguntas con sus respuestas
} 
	Write excel puntaje, nombre, fechayHora
		 */





     

