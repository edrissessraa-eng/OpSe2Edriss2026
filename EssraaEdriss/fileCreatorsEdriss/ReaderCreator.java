package fileCreatorsEdriss;

import java.io.IOException;

public class ReaderCreator extends ReaderCreatorEdriss{

	private String typ;
	
	public ReaderCreator(String typ) throws IOException {
		this.typ=typ;
	}

	@Override
	public ReaderProduktEdriss factoryMethod(String typ)throws IOException {
		// TODO Auto-generated method stub
		if("csv".equals(typ)) {
			return new ReaderProductCSV();
		}else {
		return new ReaderProduktTXT();
		}
	}
	

}
