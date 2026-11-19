package fileCreatorsEdriss;

import java.io.IOException;

public abstract class ReaderProduktEdriss {
	public abstract String[] leseAusDatei() throws IOException;
	public abstract void schliesseDatei() throws IOException;

}
