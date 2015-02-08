package manageraccessor;



import static org.junit.Assert.*;

import java.net.URI;
import java.net.URISyntaxException;

import org.junit.After;
import org.junit.Before;
import org.kramerlab.atmocalc.database.accessors.ManagerAccessor;
import org.kramerlab.atmocalc.objects.User;

public class GetUserbyIdTest{
	ManagerAccessor ac;
	User user1,user2,user3;
	@Before
	public void setUp(){
		ac = new ManagerAccessor();
		user1 = ac.newUser("test1", "test1@email.de", "test");
		user2 = ac.newUser("test2", "test2@email.de", "test");
		user3 = ac.newUser("test3", "test3@email.de", "test");
	}
	@After
	public void tearDown(){
		//Lösche die Nutzer
		user1.accessor.delete();
		user2.accessor.delete();
		user3.accessor.delete();
	}
	@org.junit.Test
	public void testGetUserbyId1(){
		assertTrue((user1==ac.getUserById(user1.getUri())));
		assertTrue((user2==ac.getUserById(user2.getUri())));
		assertTrue((user3==ac.getUserById(user3.getUri())));	
	}
	@org.junit.Test
	public void testGetUserbyId2(){
		assertFalse((user1==ac.getUserById(null)));
		assertFalse((user2==ac.getUserById(null)));
		assertFalse((user3==ac.getUserById(null)));	
	}
	@org.junit.Test
	public void testGetUserbyId3(){
		assertFalse((user1==ac.getUserById(user3.getUri())));
		assertFalse((user2==ac.getUserById(user1.getUri())));
		assertFalse((user3==ac.getUserById(user2.getUri())));	
	}
	@org.junit.Test(expected = IllegalArgumentException.class)
	public void testGetUserbyId4() throws URISyntaxException{
		ac.getUserById(new URI (""));
	}
	
	
}
