package fileCreatorsEdriss;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReaderProduktTXT extends ReaderProduktEdriss{
	private BufferedReader ein;
	

	public ReaderProduktTXT() throws IOException{
		super();
		this.ein=new BufferedReader(new FileReader("Fahrrad.txt"));
	}

	@Override
	public String[] leseAusDatei() throws IOException {
		// TODO Auto-generated method stub
		String []ergebnisZeile=new String[5];
		String zeile=this.ein.readLine();
		int i=0;
		while (i<ergebnisZeile.length) {
			ergebnisZeile[i]=zeile;
			zeile=this.ein.readLine();
			i++;
		}
		return ergebnisZeile;
	}

	@Override
	public void schliesseDatei() throws IOException {
		// TODO Auto-generated method stub
		this.ein.close();
		
	}
	

}
