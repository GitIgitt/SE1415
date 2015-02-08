package atmocalcanalysis;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.kramerlab.atmocalc.objects.Analysis;
import org.kramerlab.atmocalc.objects.Package;
import org.kramerlab.atmocalc.analysis.Analyzer;
import org.kramerlab.atmocalc.manager.*;

/* Gültige Nutzernamen bestehen aus mindestens 3 und maximal 20 Zeichen 
 * zulässige Zeichen sind Buchstaben von a-z (keine Umlaute) und Ziffern von 0-9
 * unzulässig sind Sonderzeichen sowie Leerzeichen
 */
public class SetNameTest {
	
	final char[] zeichen = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".toCharArray();
	Analysis analysis;
	Analyzer an = new Analyzer();
	
	@Before
	public void setUp(){
		analysis = an.createAnalysis();
	}
	
	@After
	public void tearDown(){
		//Delete Analiysis
	}
	
	@org.junit.Test (expected = IllegalArgumentException.class)
	public void testPackage1() throws Exception {
		(analysis).setName(null);
	}
	
	@org.junit.Test (expected = IllegalArgumentException.class)
	public void testPackage2() throws Exception {
		(analysis).setName("");
	}
	
	@org.junit.Test (expected = IllegalArgumentException.class)
	public void testPackage3() throws Exception {
		(analysis).setName("t");
	}
	
	@org.junit.Test (expected = IllegalArgumentException.class)
	public void testPackage4() throws Exception {
		(analysis).setName("te");
	}
	
	@org.junit.Test (expected = IllegalArgumentException.class)
	public void testPackage5() throws Exception {
		(analysis).setName("&§$§$>/");
	}
	
	@org.junit.Test (expected = IllegalArgumentException.class)
	public void testPackage6() throws Exception {
		(analysis).setName("test6@.");
	}
	
	@org.junit.Test (expected = IllegalArgumentException.class)
	public void testPackage7() throws Exception {
		(analysis).setName("test 7");
	}
	
	@org.junit.Test (expected = IllegalArgumentException.class)
	public void testPackage8() throws Exception {
		(analysis).setName("test8$");
	}
	
	@org.junit.Test (expected = IllegalArgumentException.class)
	public void testPackage9() throws Exception {
		(analysis).setName("test123456891011121920");
	}
	@org.junit.Test (expected = IllegalArgumentException.class)
	public void testPackage10() throws Exception {
		char[] test = new char[10000];
		for (int i = 0; i < 10000;i++){
			test[i] = zeichen[(int)(Math.random()*zeichen.length)];
		}
		(analysis).setName(new String(test));
	}
	
	@org.junit.Test
	public void testPackage11() throws Exception {
		char[] testString;
		for (int i = 0;  i < 100; i++){
			testString = new char[(int)(Math.random()*17)+3];
			for (int j = 0; j < testString.length; j++){
				testString[j] = zeichen[(int)(Math.random()*zeichen.length)];
			}
			String s = new String(testString);
			analysis.setName(s);
			assertEquals(s, analysis.getName());
		}	
	}
}
