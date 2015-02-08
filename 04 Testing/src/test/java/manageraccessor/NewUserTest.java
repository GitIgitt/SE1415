package manageraccessor;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.kramerlab.atmocalc.database.accessors.ManagerAccessor;
import org.kramerlab.atmocalc.objects.User;

public class NewUserTest {
	ManagerAccessor ac;
	ArrayList<User> testuser;
	User user1;

	@Before
	public void setUp() {
		ac = new ManagerAccessor();
		user1 = ac.newUser("test1", "test1@test.de", "test1");
		testuser = new ArrayList<User>();
	}

	@After
	public void tearDown() {
		// Lösche die Nutzer
		user1.delete();
		while (testuser.size() > 0) {
			testuser.get(0).delete();
			testuser.remove(0);
		}
	}

	// --> Es darf kein neuer Nutzer mit bereits belegtem Namen angelegt werden
	@org.junit.Test(expected = IllegalArgumentException.class)
	public void testUser1() {
		testuser.add(ac.newUser("test1", "test2@test.de", "test2"));
	}

	// --> Es darf kein neuer Nutzer mit bereits vorhandener E-Mailadresse
	// angelegt werden
	@org.junit.Test(expected = IllegalArgumentException.class)
	public void testUser2() {
		testuser.add(ac.newUser("test2", "test1@test.de", "test2"));
	}

	// --> Es darf kein neuer Nutzer mit leerem Passwort angelegt werden
	@org.junit.Test(expected = IllegalArgumentException.class)
	public void testUser3() {
		testuser.add(ac.newUser("test2", "test3@test.de", ""));
	}

	// --> Es darf kein neuer Nutzer mit null als Passwort angelegt werden
	@org.junit.Test(expected = IllegalArgumentException.class)
	public void testUser4() {
		testuser.add(ac.newUser("test2", "test4@test.de", null));
	}

	// --> Es darf kein neuer Nutzer mit leerem Benutzernamen angelegt werden
	@org.junit.Test(expected = IllegalArgumentException.class)
	public void testUser5() {
		testuser.add(ac.newUser("", "test5@test.de", "test2"));
	}

	// --> Es darf kein neuer Nutzer mit null als Benutzernamen angelegt werden
	@org.junit.Test(expected = IllegalArgumentException.class)
	public void testUser6() {
		testuser.add(ac.newUser(null, "test6@test.de", "test2"));
	}

	// --> Es darf kein neuer Nutzer mit einem Zeichen als Benutzernamen
	// angelegt werden
	@org.junit.Test(expected = IllegalArgumentException.class)
	public void testUser7() {
		testuser.add(ac.newUser("t", "test7@test.de", "test2"));
	}

	// --> Es darf kein neuer Nutzer mit einem Zeichen als Benutzernamen
	// angelegt werden
	@org.junit.Test(expected = IllegalArgumentException.class)
	public void testUser8() {
		testuser.add(ac.newUser("t", "test8@test.de", "test2"));
	}

	// --> Es darf kein neuer Nutzer mit zwei Zeichen als Benutzernamen
	// angelegt werden
	@org.junit.Test(expected = IllegalArgumentException.class)
	public void testUser9() {
		testuser.add(ac.newUser("te", "test9@test.de", "test2"));
	}

	// --> Es darf kein neuer Nutzer mit Sonderzeichen als Benutzernamen
	// angelegt werden
	@org.junit.Test(expected = IllegalArgumentException.class)
	public void testUser10() {
		testuser.add(ac.newUser("&§$§$>/", "test10@test.de", "test2"));
	}

	// --> Es darf kein neuer Nutzer mit Sonderzeichen im Benutzernamen
	// angelegt werden
	@org.junit.Test(expected = IllegalArgumentException.class)
	public void testUser11() {
		testuser.add(ac.newUser("test11@.", "test11@test.de", "test2"));
	}

	// --> Es darf kein neuer Nutzer mit Leerzeichen im Benutzernamen
	// angelegt werden
	@org.junit.Test(expected = IllegalArgumentException.class)
	public void testUser12() {
		testuser.add(ac.newUser("test 12", "test12@test.de", "test2"));
	}

	// --> Es darf kein neuer Nutzer mit Sonderzeichen im Benutzernamen
	// angelegt werden
	@org.junit.Test(expected = IllegalArgumentException.class)
	public void testUser13() {
		testuser.add(ac.newUser("test13$", "test13@test.de", "test2"));
	}

	// --> Es darf kein neuer Nutzer mit mehr als 20 Zeichen im Benutzernamen
	// angelegt werden
	@org.junit.Test(expected = IllegalArgumentException.class)
	public void testUser14() {
		testuser.add(ac.newUser("test1234567891011121920", "test14@test.de",
				"test2"));
	}
	

	
	@org.junit.Test (expected = IllegalArgumentException.class)
	public void testUser15() throws Exception {
		user1.setMail(null);
	}
	
	@org.junit.Test (expected = IllegalArgumentException.class)
	public void testUser16() throws Exception {
		user1.setMail("");
	}
	
	@org.junit.Test (expected = IllegalArgumentException.class)
	public void testUser17() throws Exception {
		user1.setMail("test3");
	}
	
	@org.junit.Test (expected = IllegalArgumentException.class)
	public void testUser18() throws Exception {
		user1.setMail("test3@");
	}
	
	@org.junit.Test (expected = IllegalArgumentException.class)
	public void testUser19() throws Exception {
		user1.setMail("test5@test5");
	}
	
	@org.junit.Test (expected = IllegalArgumentException.class)
	public void testUser20() throws Exception {
		user1.setMail("test6@.");
	}
	
	@org.junit.Test (expected = IllegalArgumentException.class)
	public void testUser21() throws Exception {
		user1.setMail("test7@.test7");
	}
	
	@org.junit.Test (expected = IllegalArgumentException.class)
	public void testUser22() throws Exception {
		user1.setMail("te st8@.test8.de");
	}
	
	@org.junit.Test (expected = IllegalArgumentException.class)
	public void testUser23() throws Exception {
		user1.setMail("test9@.te_st9.de");
	}
	
	@org.junit.Test
	public void testUser24() throws Exception {
		user1.setMail("test@test.de");
		assertEquals("test@test.de", user1.getMail());
	}
	
}
