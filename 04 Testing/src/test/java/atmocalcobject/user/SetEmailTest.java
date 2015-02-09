package atmocalcobject.user;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.kramerlab.atmocalc.database.accessors.*;
import org.kramerlab.atmocalc.objects.*;

/* Anforderungen an eine E-Mail-Adresse:
 * - muss genau einmal das Zeichen @ enthalten
 * - muss nach dem @ einen Punkt enthalten
 * - muss vor dem @ mindestens ein Zeichen besitzen
 * - muss zwischen dem @ und dem Punkt mindesetens ein Zeichen besitzen
 * - darf keine Sonderzeichen wie z.B. ein Leerzeichen enthalten
 * 
 * x@y.z mit |x| >= 1, |y| >= 1 und |z| >= 2
 * 
 */

public class SetEmailTest {
	final char[] zeichen = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".toCharArray();
	User user1;
	ManagerAccessor ma = new ManagerAccessor();
	@Before
	public void setUp(){
		user1 = ma.newUser("abc","abc@mail.de","abc");
	}
	
	@After
	public void tearDown(){
		user1.delete();
	}
	
	@org.junit.Test (expected = IllegalArgumentException.class)
	public void testUser1() throws Exception {
		user1.setMail(null);
	}
	
	@org.junit.Test (expected = IllegalArgumentException.class)
	public void testUser2() throws Exception {
		user1.setMail("");
	}
	
	@org.junit.Test (expected = IllegalArgumentException.class)
	public void testUser3() throws Exception {
		user1.setMail("test3");
	}
	
	@org.junit.Test (expected = IllegalArgumentException.class)
	public void testUser4() throws Exception {
		user1.setMail("test3@");
	}
	
	@org.junit.Test (expected = IllegalArgumentException.class)
	public void testUser5() throws Exception {
		user1.setMail("test5@test5");
	}
	
	@org.junit.Test (expected = IllegalArgumentException.class)
	public void testUser6() throws Exception {
		user1.setMail("test6@.");
	}
	
	@org.junit.Test (expected = IllegalArgumentException.class)
	public void testUser7() throws Exception {
		user1.setMail("test7@.test7");
	}
	
	@org.junit.Test (expected = IllegalArgumentException.class)
	public void testUser8() throws Exception {
		user1.setMail("te st8@.test8.de");
	}
	
	@org.junit.Test (expected = IllegalArgumentException.class)
	public void testUser9() throws Exception {
		user1.setMail("test9@.te_st9.de");
	}
	
	@org.junit.Test
	public void testUser10() throws Exception {
		user1.setMail("test@test.de");
		assertEquals("test@test.de", user1.getMail());
	}
	
	@org.junit.Test
	public void testUser11(){
		ArrayList<String> mails = new ArrayList<String>();
		ArrayList<User> testuser = new ArrayList<User>();
		char[] testname;
		for (int i = 0; i < 100; i++) {
			testname = new char[(int) (Math.random() * 17 + 3)];
			for (int j = 0; j < testname.length; j++) {
				testname[j] = zeichen[(int) (Math.random() * 62)];
			}
			String s = new String(testname);
			mails.add(s+"@test.de");
			testuser.add(ma.newUser(s, s + "@test.de", "test"));
		}
		for (int i = 0; i < testuser.size(); i++){
			assertTrue((testuser.get(i).getMail() == mails.get(i)));
		}
		while(testuser.size()>0){
			testuser.get(0).delete();
			testuser.remove(0);
		}
	}
	
}
