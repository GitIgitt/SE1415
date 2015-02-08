package atmocalcpackages;
import static org.junit.Assert.*;

import org.junit.Before;
import org.kramerlab.atmocalc.objects.Package;
import org.kramerlab.atmocalc.objects.User;
import org.kramerlab.atmocalc.manager.*;

/* Gültige Nutzernamen bestehen aus mindestens 3 und maximal 20 Zeichen 
 * zulässige Zeichen sind Buchstaben von a-z (keine Umlaute) und Ziffern von 0-9
 * unzulässig sind Sonderzeichen sowie Leerzeichen
 */
public class SetNameTest {
	
	final char[] zeichen = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".toCharArray();
	Package testpackage;
	AtmoCalcManager ma = new AtmoCalcManager(null);
	User user = ma.newUser("test", "test@te.de", "test");
	@Before
	public void setUp(){
		testpackage = ma.newPackage(user);
	}
	
	@org.junit.Test (expected = IllegalArgumentException.class)
	public void testPackage1() throws Exception {
		(testpackage).setName(null);
	}
	
	@org.junit.Test (expected = IllegalArgumentException.class)
	public void testPackage2() throws Exception {
		(testpackage).setName("");
	}
	
	@org.junit.Test (expected = IllegalArgumentException.class)
	public void testPackage3() throws Exception {
		(testpackage).setName("t");
	}
	
	@org.junit.Test (expected = IllegalArgumentException.class)
	public void testPackage4() throws Exception {
		(testpackage).setName("te");
	}
	
	@org.junit.Test (expected = IllegalArgumentException.class)
	public void testPackage5() throws Exception {
		(testpackage).setName("&§$§$>/");
	}
	
	@org.junit.Test (expected = IllegalArgumentException.class)
	public void testPackage6() throws Exception {
		(testpackage).setName("test6@.");
	}
	
	@org.junit.Test (expected = IllegalArgumentException.class)
	public void testPackage7() throws Exception {
		(testpackage).setName("test 7");
	}
	
	@org.junit.Test (expected = IllegalArgumentException.class)
	public void testPackage8() throws Exception {
		(testpackage).setName("test8$");
	}
	
	@org.junit.Test (expected = IllegalArgumentException.class)
	public void testPackage9() throws Exception {
		(testpackage).setName("test123456891011121920");
	}
	@org.junit.Test (expected = IllegalArgumentException.class)
	public void testPackage10() throws Exception {
		char[] test = new char[10000];
		for (int i = 0; i < 10000;i++){
			test[i] = zeichen[(int)(Math.random()*zeichen.length)];
		}
		(testpackage).setName(new String(test));
	}
	
	@org.junit.Test
	public void testPackage11() throws Exception {
		Package test = testpackage;
		char[] testString;
		for (int i = 0;  i < 100; i++){
			testString = new char[(int)(Math.random()*17)+3];
			for (int j = 0; j < testString.length; j++){
				testString[j] = zeichen[(int)(Math.random()*zeichen.length)];
			}
			String s = new String(testString);
			test.setName(s);
			assertEquals(s, test.getName());
		}	
	}
}
