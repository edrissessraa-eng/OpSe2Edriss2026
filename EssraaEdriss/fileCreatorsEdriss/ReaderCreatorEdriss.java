package fileCreatorsEdriss;

import java.io.IOException;

public abstract class ReaderCreatorEdriss {
	public abstract ReaderProduktEdriss factoryMethod(String typ) throws IOException;

}
