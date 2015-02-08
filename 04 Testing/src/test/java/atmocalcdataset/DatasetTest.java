package atmocalcdataset;

import static org.junit.Assert.*;

import org.kramerlab.atmocalc.objects.*;

import org.junit.After;
import org.junit.Before;

public class DatasetTest {
	Dataset d1, d2;
	@Before
	public void setUp(){
		d1 = new Dataset();
	}
	
	@After
	public void tearDown(){
		d1.delete();
		d2.delete();
	}
	
	
	// Copy muss das Dataset korrekt kopieren
	@org.junit.Test
	public void testDataset1() throws Exception {
		d2 = d1.copy();
		assertEquals("Copy korrekt", (d1.getRawData() == d2.getRawData() && d1.getColumnNames() == d2.getColumnNames() && d1.getName() == d2.getName() && d1.getUri() == d2.getUri()));
	}

	// colCount entspricht der Anzahl der Namen in columnNames
	@org.junit.Test
	public void testDataset2() throws Exception {
		assertEquals("colCount korrekt", d1.colCount() == d1.getColumnNames().size());
	}
}
