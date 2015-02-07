package atmocalcdataset;

import static org.junit.Assert.*;

import org.kramerlab.atmocalc.objects.*;


public class DatasetTest {

	// Copy muss das Dataset korrekt kopieren
	@org.junit.Test
	public void testDataset1() throws Exception {
		Dataset d1 = new Dataset();
		Dataset d2 = d1.copy();
		assertEquals("Copy korrekt", (d1.getRawData() == d2.getRawData() && d1.getColumnNames() == d2.getColumnNames() && d1.getName() == d2.getName() && d1.getUri() == d2.getUri()));
	}

	// colCount entspricht der Anzahl der Namen in columnNames
	@org.junit.Test
	public void testDataset2() throws Exception {
		Dataset d1 = new Dataset();
		assertEquals("colCount korrekt", d1.colCount() == d1.getColumnNames().size());
	}
}
