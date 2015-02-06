import static org.junit.Assert.*;

import org.kramerlab.atmocalc.objects.*;

/* Anforderungen an eine E-Mail-Adresse:
 * - muss genau einmal das Zeichen @ enthalten
 * - muss nach dem @ einen Punkt enthalten
 * - muss vor dem @ mindestens ein Zeichen besitzen
 * - muss zwischen dem @ und dem Punkt mindesetens ein Zeichen besitzen
 * - ...
 * 
 * x@y.z mit |x| >= 1, |y| >= 1 und |z| >= 2
 * 
 * Strings generieren?
 */

public class TestUserSetMail {
	
	
	@org.junit.Test (expected = IllegalArgumentException.class)
	public void test1() throws Exception{
		(new User()).setMail(null);
	}
	
	@org.junit.Test (expected = IllegalArgumentException.class)
	public void test2() throws Exception{
		(new User()).setMail("");
	}
	
	@org.junit.Test (expected = IllegalArgumentException.class)
	public void test3() throws Exception{
		(new User()).setMail("test3");
	}
	
	@org.junit.Test (expected = IllegalArgumentException.class)
	public void test4() throws Exception{
		(new User()).setMail("test3@");
	}
	
	@org.junit.Test (expected = IllegalArgumentException.class)
	public void test5() throws Exception{
		(new User()).setMail("test5@test5");
	}
	
	@org.junit.Test (expected = IllegalArgumentException.class)
	public void test6() throws Exception{
		(new User()).setMail("test6@.");
	}
	
	@org.junit.Test (expected = IllegalArgumentException.class)
	public void test7() throws Exception{
		(new User()).setMail("test7@.test7");
	}
	
	@org.junit.Test
	public void test8() throws Exception{
		User test = new User();
		test.setMail("test@test.de");
		assertEquals("test@test.de", test.email);
	}
	
}
