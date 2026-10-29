package gui;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import business.FahradModel;
import business.Fahrrad;
import javafx.stage.Stage;

public class FahradControl {
	private FahradModel fModel;
	private FahradView fView;
	
	public FahradControl(Stage primaryStage) {
		this.fModel=new FahradModel();
		this.fView=new FahradView(this, primaryStage, fModel);
	}
	
		
	
	public void nehmeFahrradAuf(){
	try{ 
		this.fModel.setFahrrad(new Fahrrad(
			fView.getTxtName().getText(), 
			fView.getTxtRahmennummer().getText(),
			fView.getTxtFahrradtyp().getText(),
			fView.getTxtDamenHerrenKinder().getText().charAt(0),
		    fView.getTxtGroessen().getText().split(";")));
		
		fView.zeigeInformationsfensterAn("Das Fahrrad wurde aufgenommen!");
   	}
   	catch(Exception exc){
   		fView.zeigeFehlermeldungsfensterAn(exc.getMessage());
 	}
}
	public void schreibeFahrraederInCsvDatei() {
		try {
			this.fModel.schreibeFahrraederInCsvDatei();
   			fView.zeigeInformationsfensterAn(
	   			"Die Fahrraeder wurden gespeichert!");
		}	
		catch(IOException exc){
			fView.zeigeFehlermeldungsfensterAn(
				"IOException beim Speichern!");
		}
		catch(Exception exc){
			fView.zeigeFehlermeldungsfensterAn(
				"Unbekannter Fehler beim Speichern!");
		}
	}
	public void leseAusDatei(String typ){
    	try {
    		if("csv".equals(typ)){
    		this.fModel.leseAusDatei(typ);
    		fView.zeigeInformationsfensterAn(
  	  	   			"Das Fahrrad wurde gelesen!");
    		}else{
	   			fView.zeigeInformationsfensterAn(
		   				"Noch nicht implementiert!");
		   		}
    		}catch(IOException exc){
    			fView.zeigeFehlermeldungsfensterAn(
    					"IOException beim Lesen!");
    			}
    			catch(Exception exc){
    				this.fView.zeigeFehlermeldungsfensterAn(
    					"Unbekannter Fehler beim Lesen!");
    			}
    	}

}
