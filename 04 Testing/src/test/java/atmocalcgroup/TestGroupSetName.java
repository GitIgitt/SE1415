package SetName;

import static org.junit.Assert.*;

import org.kramerlab.atmocalc.objects.*;

/* Gültige Gruppennamen bestehen aus mindestens 3 und maximal 20 Zeichen 
 * zulässige Zeichen sind Buchstaben von a-z (keine Umlaute) und Ziffern von 0-9
 * zwischen Klein- und Großbuchstaben wird nicht unterschieden
 * unzulässig sind Sonderzeichen sowie Leerzeichen
 */

public class TestGroupSetName {
	
	final char[] zeichen = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".toCharArray();
		
	@org.junit.Test (expected = IllegalArgumentException.class)
	public void testGroup1() throws Exception {
		(new Group()).setName(null);
	}
	
	@org.junit.Test (expected = IllegalArgumentException.class)
	public void testGroup2() throws Exception {
		(new Group()).setName("");
	}
	
	@org.junit.Test (expected = IllegalArgumentException.class)
	public void testGroup3() throws Exception {
		(new Group()).setName("t");
	}
	
	@org.junit.Test (expected = IllegalArgumentException.class)
	public void testGroup4() throws Exception {
		(new Group()).setName("te");
	}
	
	@org.junit.Test (expected = IllegalArgumentException.class)
	public void testGroup5() throws Exception {
		(new Group()).setName("&§$§$>/");
	}
	
	@org.junit.Test (expected = IllegalArgumentException.class)
	public void testGroup6() throws Exception {
		(new Group()).setName("test6@.");
	}
	
	@org.junit.Test (expected = IllegalArgumentException.class)
	public void testGroup7() throws Exception {
		(new Group()).setName("test 7");
	}
		
	@org.junit.Test (expected = IllegalArgumentException.class)
	public void testGroup8() throws Exception {
		(new Group()).setName("test8$");
	}
	
	@org.junit.Test (expected = IllegalArgumentException.class)
	public void testGroup9() throws Exception {
		(new Group()).setName("test123456891011121920");
	}
	
	@org.junit.Test (expected = IllegalArgumentException.class)
	public void testGroup10() throws Exception {
		char[] test = new char[10000];
		for (int i = 0; i < 10000;i++){
			test[i] = zeichen[(int)(Math.random()*zeichen.length)];
		}
		(new Group()).setName(new String(test));
	}
	
	@org.junit.Test
	public void testGroup11() throws Exception {
		Group test = new Group();
		char[] testString;
		for (int i = 0;  i < 100; i++){
			testString = new char[(int)(Math.random()*17)+3];
			for (int j = 0; j < testString.length; j++){
				testString[j] = zeichen[(int)(Math.random()*zeichen.length)];
			}
			String s = new String(testString);
			test.setName(s);
			//assertEquals(s, test.getName());
			assertTrue(s.equalsIgnoreCase(test.getName()));
		}	
	}
}
	

