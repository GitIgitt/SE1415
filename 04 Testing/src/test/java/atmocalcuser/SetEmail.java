package atmocalcuser;
import static org.junit.Assert.*;

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

public class SetEmail {
	
	
	@org.junit.Test (expected = IllegalArgumentException.class)
	public void testUser1() throws Exception {
		(new User()).setMail(null);
	}
	
	@org.junit.Test (expected = IllegalArgumentException.class)
	public void testUser2() throws Exception {
		(new User()).setMail("");
	}
	
	@org.junit.Test (expected = IllegalArgumentException.class)
	public void testUser3() throws Exception {
		(new User()).setMail("test3");
	}
	
	@org.junit.Test (expected = IllegalArgumentException.class)
	public void testUser4() throws Exception {
		(new User()).setMail("test3@");
	}
	
	@org.junit.Test (expected = IllegalArgumentException.class)
	public void testUser5() throws Exception {
		(new User()).setMail("test5@test5");
	}
	
	@org.junit.Test (expected = IllegalArgumentException.class)
	public void testUser6() throws Exception {
		(new User()).setMail("test6@.");
	}
	
	@org.junit.Test (expected = IllegalArgumentException.class)
	public void testUser7() throws Exception {
		(new User()).setMail("test7@.test7");
	}
	
	@org.junit.Test (expected = IllegalArgumentException.class)
	public void testUser8() throws Exception {
		(new User()).setMail("te st8@.test8.de");
	}
	
	@org.junit.Test (expected = IllegalArgumentException.class)
	public void testUser9() throws Exception {
		(new User()).setMail("test9@.te_st9.de");
	}
	
	@org.junit.Test
	public void testUser10() throws Exception {
		User test = new User();
		test.setMail("test@test.de");
		assertEquals("test@test.de", test.getMail());
	}
	
}
