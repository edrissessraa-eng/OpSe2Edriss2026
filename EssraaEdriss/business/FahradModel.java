package business;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


import fileCreatorsEdriss.ReaderCreator;
import fileCreatorsEdriss.ReaderCreatorEdriss;
import fileCreatorsEdriss.ReaderProductCSV;
import fileCreatorsEdriss.ReaderProduktEdriss;



public class FahradModel {
	private Fahrrad fahrrad;
	

	public Fahrrad getFahrrad() {
		return fahrrad;
	}

	public void setFahrrad(Fahrrad fahrrad) {
		this.fahrrad = fahrrad;
	}
	
	public void schreibeFahrraederInCsvDatei() throws IOException{
		BufferedWriter aus 
		= new BufferedWriter(new FileWriter("FahrraederAusgabe.csv", true));
	aus.write(fahrrad.gibFahrradZurueck(';'));
	aus.close();
	}
	
	
	public void leseAusDatei(String typ)throws IOException{
    	
      		
      			ReaderCreatorEdriss creator=new ReaderCreator(typ);
      			ReaderProduktEdriss product=creator.factoryMethod(typ);
      			String[] zeile =product.leseAusDatei();
      			
      			this.fahrrad = new Fahrrad(zeile[0], 
      				zeile[1], 
      				zeile[2], 
      				zeile[3].charAt(0), 
      				zeile[4].split("_"));
      	//		ReaderProduktEdriss product= new ReaderProduktEdriss() ;
					
					
      				product.schliesseDatei();
      	  			
      		
       
		}
		
	

}
