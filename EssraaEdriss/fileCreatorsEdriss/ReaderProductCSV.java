package fileCreatorsEdriss;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReaderProductCSV extends ReaderProduktEdriss{
	private BufferedReader ein;
	public ReaderProductCSV() throws IOException{
		this.ein= new BufferedReader(new FileReader("Fahrrad.csv"));
	}

	
	@Override
	public String[] leseAusDatei() throws IOException {
		// TODO Auto-generated method stub
		return this.ein.readLine().split(";");
	}

	@Override
	public void schliesseDatei() throws IOException {
		this.ein.close();
		
	}

}
