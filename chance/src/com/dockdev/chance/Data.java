package com.dockdev.chance;

import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;

import com.dockdev.chance.simulators.Jail;

public class Data {
	
	public static int chancecards = 0;
	public static int chestcards = 0;
	public static int finmon = 0;
	
	public static int medave = 0;
	public static int balave = 0;
	public static int oriave = 0;
	public static int verave = 0;
	public static int conave = 0;
	
	public static int chapla = 0;
	public static int staave = 0;
	public static int virave = 0;
	public static int jampla = 0;
	public static int tenave = 0;
	public static int newave = 0;
	
	public static int kenave = 0;
	public static int indave = 0;
	public static int illave = 0;
	public static int atlave = 0;
	public static int venave = 0;
	public static int margar = 0;
	
	public static int pacave = 0;
	public static int norave = 0;
	public static int penave = 0;
	public static int parpla = 0;
	public static int boardw = 0;
	
	public static int rerail = 0;
	public static int perail = 0;
	public static int borail = 0;
	public static int shline = 0;
	
	public static int elutil = 0;
	public static int wautil = 0;
	
	public static int inctax = 0;
	public static int luxtax = 0;
	
	public static int gojail = 0;
	public static int frepar = 0;
	
	public static int jailtu = 0;
	public static int jailsp = 0;
	
	public static void saveData(int space){
		if (space == 1)
			medave++;
		else if (space == 3)
			balave++;
		else if (space == 4)
			inctax++;
		else if (space == 5)
			rerail++;
		else if (space == 6)
			oriave++;
		else if (space == 8)
			verave++;
		else if (space == 9)
			conave++;
		else if (space == 10){
			if (Jail.jailed)
				jailtu++;
			else
				jailsp++;
		}else if (space == 11)
			chapla++;
		else if (space == 12)
			elutil++;
		else if (space == 13)
			staave++;
		else if (space == 14)
			virave++;
		else if (space == 15)
			perail++;
		else if (space == 16)
			jampla++;
		else if (space == 18)
			tenave++;
		else if (space == 19)
			newave++;
		else if (space == 20)
			frepar++;
		else if (space == 21)
			kenave++;
		else if (space == 23)
			indave++;
		else if (space == 24)
			illave++;
		else if (space == 25)
			borail++;
		else if (space == 26)
			atlave++;
		else if (space == 27)
			venave++;
		else if (space == 28)
			wautil++;
		else if (space == 29)
			margar++;
		else if (space == 30)
			gojail++;
		else if (space == 31)
			pacave++;
		else if (space == 32)
			norave++;
		else if (space == 34)
			penave++;
		else if (space == 35)
			shline++;
		else if (space == 37)
			parpla++;
		else if (space == 38)
			luxtax++;
		else if (space == 39)
			boardw++;
	}
	public void writeToFile(){
		PrintWriter writer = null;
		try {
			writer = new PrintWriter("bin/com/dockdev/chance/dataoutput.txt", "UTF-8");
		} catch (FileNotFoundException e) {
				File file = new File("bin/com/dockdev/chance/dataoutput.txt");
				
				try {
					if (file.createNewFile()){
						System.out.println("File not found, creating file...");
						writeToFile();
						return;
					}
				} catch (IOException e1) {
					
					e1.printStackTrace();
				}
		} catch (UnsupportedEncodingException e) {
			
			e.printStackTrace();
		}
	    writer.println(toString());
	    writer.close();
	}
	
	public String toString() {
		  StringBuilder result = new StringBuilder();
		  String newLine = System.getProperty("line.separator");

		  result.append( this.getClass().getName() );
		  result.append( " Object {" );
		  result.append(newLine);

		  //determine fields declared in this class only (no fields of superclass)
		  Field[] fields = this.getClass().getDeclaredFields();

		  //print field names paired with their values
		  for ( Field field : fields  ) {
		    result.append("  ");
		    try {
		      result.append( field.getName() );
		      result.append(": ");
		      //requires access to private field:
		      result.append( field.get(this) );
		    } catch ( IllegalAccessException ex ) {
		      System.out.println(ex);
		    }
		    result.append(newLine);
		  }
		  result.append("}");

		  return result.toString();
		}
	
	public void openFile() throws IOException{
		File file = new File("bin/com/dockdev/chance/dataoutput.txt");
		
		if(!Desktop.isDesktopSupported()){
            System.out.println("Desktop is not supported");
            return;
        }
        
        Desktop desktop = Desktop.getDesktop();
        if(file.exists()) desktop.open(file);
	}
}
