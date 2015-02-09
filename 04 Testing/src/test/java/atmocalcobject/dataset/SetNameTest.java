package atmocalcobject.dataset;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.kramerlab.atmocalc.objects.*;

/* Gültige Namen für einen Datensatz bestehen aus mindestens 3 und maximal 20 Zeichen 
 * zulässige Zeichen sind Buchstaben von a-z (keine Umlaute) und Ziffern von 0-9
 * zwischen Klein- und Großbuchstaben wird nicht unterschieden
 * unzulässig sind Sonderzeichen sowie Leerzeichen
 */

public class SetNameTest {
	
	final char[] zeichen = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".toCharArray();
	Dataset d1;
	
	@Before
	public void setUp(){
		d1 = new Dataset();
	}
	
	@After
	public void tearDown(){
		d1.delete();
	}
	
	@org.junit.Test (expected = IllegalArgumentException.class)
	public void testDataset1() throws Exception {
		d1.setName(null);
	}
	
	@org.junit.Test (expected = IllegalArgumentException.class)
	public void testDataset2() throws Exception {
		d1.setName("");
	}
	
	@org.junit.Test (expected = IllegalArgumentException.class)
	public void testDataset3() throws Exception {
		d1.setName("t");
	}
	
	@org.junit.Test (expected = IllegalArgumentException.class)
	public void testDataset4() throws Exception {
		d1.setName("te");
	}
	
	@org.junit.Test (expected = IllegalArgumentException.class)
	public void testDataset5() throws Exception {
		d1.setName("&§$§$>/");
	}
	
	@org.junit.Test (expected = IllegalArgumentException.class)
	public void testDataset6() throws Exception {
		d1.setName("test6@.");
	}
	
	@org.junit.Test (expected = IllegalArgumentException.class)
	public void testDataset7() throws Exception {
		d1.setName("test 7");
	}
		
	@org.junit.Test (expected = IllegalArgumentException.class)
	public void testDataset8() throws Exception {
		d1.setName("test8$");
	}
	
	@org.junit.Test (expected = IllegalArgumentException.class)
	public void testDataset9() throws Exception {
		d1.setName("test123456891011121920");
	}
	
	@org.junit.Test (expected = IllegalArgumentException.class)
	public void testDataset10() throws Exception {
		char[] test = new char[10000];
		for (int i = 0; i < 10000;i++){
			test[i] = zeichen[(int)(Math.random()*zeichen.length)];
		}
		d1.setName(new String(test));
	}
	
	@org.junit.Test
	public void testDataset11() throws Exception {
		char[] testString;
		for (int i = 0;  i < 100; i++){
			testString = new char[(int)(Math.random()*17)+3];
			for (int j = 0; j < testString.length; j++){
				testString[j] = zeichen[(int)(Math.random()*zeichen.length)];
			}
			String s = new String(testString);
			d1.setName(s);
			assertTrue(s.equalsIgnoreCase(d1.getName()));
		}	
	}
}
