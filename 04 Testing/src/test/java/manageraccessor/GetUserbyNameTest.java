package manageraccessor;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.kramerlab.atmocalc.database.accessors.ManagerAccessor;
import org.kramerlab.atmocalc.objects.User;

public class GetUserbyNameTest{
	ManagerAccessor ac;
	User user1,user2,user3,user4;
	@Before
	public void setUp(){
		ac = new ManagerAccessor();
		user1 = ac.newUser("test1", "test1@email.de", "test");
		user2 = ac.newUser("test2", "test2@email.de", "test");
		user3 = ac.newUser("test3", "test3@email.de", "test");
		user4 = ac.newUser("test3", "test4@email.de", "test");
	}
	@After
	public void tearDown(){
		//Lösche die Nutzer
		user1.delete();
		user2.delete();
		user3.delete();
		user4.delete();
	}
	@org.junit.Test
	public void testGetUserbyName1(){
		assertTrue((user1==ac.getUserByName("test1")));
		assertTrue((user2==ac.getUserByName("test2")));
	}
	
	//Exception falls Username doppelt vorhanden
	@org.junit.Test (expected = IllegalArgumentException.class)
	public void testGetUserbyName2() throws Exception{
		ac.getUserByName("test3");
	}
	
	
}
