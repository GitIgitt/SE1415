package atmocalcgroup;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.kramerlab.atmocalc.database.accessors.*;
import org.kramerlab.atmocalc.objects.*;

/* Gültige Gruppennamen bestehen aus mindestens 3 und maximal 20 Zeichen 
 * zulässige Zeichen sind Buchstaben von a-z (keine Umlaute) und Ziffern von 0-9
 * zwischen Klein- und Großbuchstaben wird nicht unterschieden
 * unzulässig sind Sonderzeichen sowie Leerzeichen
 */

public class TestGroupSetName {
	
	final char[] zeichen = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".toCharArray();
	ManagerAccessor ma = new ManagerAccessor();
	Group group1;
	User user1;
	
	@Before
	public void setUp(){
		user1 = ma.newUser("abc", "abc@mail.de", "abc");
		group1 = ma.newGroup(user1);
	}
	
	@After
	public void tearDown(){
		group1.delete();
		user1.delete();
	}	
	@org.junit.Test (expected = IllegalArgumentException.class)
	public void testGroup1() throws Exception {
		group1.setName(null);
	}
	
	@org.junit.Test (expected = IllegalArgumentException.class)
	public void testGroup2() throws Exception {
		group1.setName("");
	}
	
	@org.junit.Test (expected = IllegalArgumentException.class)
	public void testGroup3() throws Exception {
		group1.setName("t");
	}
	
	@org.junit.Test (expected = IllegalArgumentException.class)
	public void testGroup4() throws Exception {
		group1.setName("te");
	}
	
	@org.junit.Test (expected = IllegalArgumentException.class)
	public void testGroup5() throws Exception {
		group1.setName("&§$§$>/");
	}
	
	@org.junit.Test (expected = IllegalArgumentException.class)
	public void testGroup6() throws Exception {
		group1.setName("test6@.");
	}
	
	@org.junit.Test (expected = IllegalArgumentException.class)
	public void testGroup7() throws Exception {
		group1.setName("test 7");
	}
		
	@org.junit.Test (expected = IllegalArgumentException.class)
	public void testGroup8() throws Exception {
		group1.setName("test8$");
	}
	
	@org.junit.Test (expected = IllegalArgumentException.class)
	public void testGroup9() throws Exception {
		group1.setName("test123456891011121920");
	}
	
	@org.junit.Test (expected = IllegalArgumentException.class)
	public void testGroup10() throws Exception {
		char[] test = new char[10000];
		for (int i = 0; i < 10000;i++){
			test[i] = zeichen[(int)(Math.random()*zeichen.length)];
		}
		group1.setName(new String(test));
	}
	
	@org.junit.Test
	public void testGroup11() throws Exception {
		char[] testString;
		for (int i = 0;  i < 100; i++){
			testString = new char[(int)(Math.random()*17)+3];
			for (int j = 0; j < testString.length; j++){
				testString[j] = zeichen[(int)(Math.random()*zeichen.length)];
			}
			String s = new String(testString);
			group1.setName(s);
			//assertEquals(s, test.getName());
			assertTrue(s.equalsIgnoreCase(group1.getName()));
		}	
	}
}
	

