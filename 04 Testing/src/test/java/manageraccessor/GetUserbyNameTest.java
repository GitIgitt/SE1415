package manageraccessor;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.kramerlab.atmocalc.database.accessors.ManagerAccessor;
import org.kramerlab.atmocalc.objects.User;

public class GetUserbyNameTest {
	ManagerAccessor ac;
	User user1, user2, user3;

	@Before
	public void setUp() {
		ac = new ManagerAccessor();
		user1 = ac.newUser("test1", "test1@email.de", "test");
		user2 = ac.newUser("test2", "test2@email.de", "test");
		user3 = ac.newUser("test3", "test3@email.de", "test");
	}

	@After
	public void tearDown() {
		// Lösche die Nutzer
		user1.delete();
		user2.delete();
		user3.delete();
	}

	@org.junit.Test
	public void testGetUserbyName1() {
		assertTrue((user1 == ac.getUserByName("test1")));
		assertTrue((user2 == ac.getUserByName("test2")));
		assertTrue((user3 == ac.getUserByName("test3")));
	}

	@org.junit.Test
	public void testGetUserbyName2() {
		assertFalse((user1 == ac.getUserByName("test2")));
		assertFalse((user1 == ac.getUserByName("test3")));
		assertFalse((user2 == ac.getUserByName("test1")));
		assertFalse((user2 == ac.getUserByName("test3")));
		assertFalse((user3 == ac.getUserByName("test1")));
		assertFalse((user3 == ac.getUserByName("test2")));
	}

	@org.junit.Test
	public void testGetUserbyName3() {
		user1.setName("test4");
		assertFalse((user1 == ac.getUserByName("test1")));
		assertTrue((user1 == ac.getUserByName("test4")));
	}
	
	@org.junit.Test
	public void testGetUserbyName4() {
		user1.setName("test4");
		user2.setName("test1");
		assertTrue(user2 == ac.getUserByName("test1"));
		assertFalse(user1 == ac.getUserByName("test1"));
		assertTrue(user1 == ac.getUserByName("test4"));
	}
	
	@org.junit.Test
	public void testGetUserbyName5() {
		user1.setName("test4");
		assertFalse(user1 == ac.getUserByName("test1"));
		assertTrue(user1 == ac.getUserByName("test4"));
		user1.setName("test1");
		assertFalse(user1 == ac.getUserByName("test4"));
		assertTrue(user1 == ac.getUserByName("test1"));
	}
	
}
