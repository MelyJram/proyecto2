package examenElbueno;

import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class test {

	
	public static void leerPreguntas() throws IOException {

	
			
			try {
				FileInputStream f= new FileInputStream("/Users/melyjram/Desktop/sample-questions.xlsx");
				
				XSSFWorkbook libro = new XSSFWorkbook(f);
			
			XSSFSheet hoja = libro.getSheetAt(0);
			
			Iterator<Row> filas = hoja.iterator();
			Iterator<Cell> Celdas;
			
			Row fila;
			Cell celda;
			while(filas.hasNext()){
				
				fila = filas.next();
				
				Celdas = fila.cellIterator();
				
				while (Celdas.hasNext()) {
					celda = Celdas.next();
					
					switch(celda.getCellType()) {
						
					case Cell.CELL_TYPE_STRING:;
					
						System.out.println(celda.getStringCellValue());
						
						break;
					
					
					}
					
				
				}
			}
			
			((Closeable) libro).close() ;
			
		} catch (IOException ex) {
				System.out.println(ex.getMessage());
			}
		}
	
			
			
		

	
	public static void guardarPreguntas() {
		
		
		
	}
}
