package atmocalcuser;
import static org.junit.Assert.*;

import org.kramerlab.atmocalc.objects.*;

/* Gültige Nutzernamen bestehen aus mindestens 3 und maximal 20 Zeichen 
 * zulässige Zeichen sind Buchstaben von a-z (keine Umlaute) und Ziffern von 0-9
 * zwischen Klein- und Großbuchstaben wird nicht unterschieden
 * unzulässig sind Sonderzeichen sowie Leerzeichen
 */
public class SetNameTest {
	
	final char[] zeichen = "acdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".toCharArray();
	
	
	@org.junit.Test (expected = IllegalArgumentException.class)
	public void testUser1() throws Exception {
		(new User()).setName(null);
	}
	
	@org.junit.Test (expected = IllegalArgumentException.class)
	public void testUser2() throws Exception {
		(new User()).setName("");
	}
	
	@org.junit.Test (expected = IllegalArgumentException.class)
	public void testUser3() throws Exception {
		(new User()).setName("t");
	}
	
	@org.junit.Test (expected = IllegalArgumentException.class)
	public void testUser4() throws Exception {
		(new User()).setName("te");
	}
	
	@org.junit.Test (expected = IllegalArgumentException.class)
	public void testUser5() throws Exception {
		(new User()).setName("&§$§$>/");
	}
	
	@org.junit.Test (expected = IllegalArgumentException.class)
	public void testUser6() throws Exception {
		(new User()).setName("test6@.");
	}
	
	@org.junit.Test (expected = IllegalArgumentException.class)
	public void testUser7() throws Exception {
		(new User()).setName("test 7");
	}
	
	@org.junit.Test (expected = IllegalArgumentException.class)
	public void testUser8() throws Exception {
		(new User()).setName("test8$");
	}
	
	@org.junit.Test (expected = IllegalArgumentException.class)
	public void testUser9() throws Exception {
		(new User()).setName("test123456891011121920");
	}
	@org.junit.Test (expected = IllegalArgumentException.class)
	public void testUser10() throws Exception {
		char[] test = new char[10000];
		for (int i = 0; i < 10000;i++){
			test[i] = zeichen[(int)(Math.random()*zeichen.length)];
		}
		(new User()).setName(new String(test));
	}
	
	@org.junit.Test
	public void testUser11() throws Exception {
		User test = new User();
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
