package atmocalcobject.group;

import org.junit.After;
import org.junit.Before;
import org.kramerlab.atmocalc.objects.*;
import org.kramerlab.atmocalc.database.accessors.*;

public class OwnerTest {
	User user1;
	User user2;
	Group group1;
	Group group2;
	ManagerAccessor ma = new ManagerAccessor();
	  
	@Before
	public void setUp(){
		//Testbenutzer und Testgruppen anlegen
		user1 = ma.newUser("testUser1","abc@def.de","abc");
	    user2 = ma.newUser("testUser2","def@ghi.de","def");
	    group1 = ma.newGroup(user1);
	    group2 = ma.newGroup(user2);
	    group1.addMember(user2);
	    group2.addMember(user1);
	}
	  
	@After
	public void tearDown(){
	    //Testbenutzer und Testgruppen wieder aus Datenbank loeschen
	    group1.delete();
	    group2.delete();	    
	    user1.delete();
	    user2.delete();
	}
	
	//Das null-Objekt darf nicht als owner gesetzt werden
	@org.junit.Test (expected = IllegalArgumentException.class)
	public void testGroupOwner1() throws Exception{
	    Group group3 = ma.newGroup(null);
	    group3.delete();
	}
	
	//Der Besitzer einer Gruppe darf nicht aus der Gruppe geloescht werden
	@org.junit.Test (expected = IllegalArgumentException.class)
	public void testGroupOwner2() throws Exception{
	    group1.removeMember(user1);
	}
	  
	//Solange ein Benutzer Besitzer einer Gruppe ist, darf er nicht geloescht werden
	@org.junit.Test (expected = IllegalArgumentException.class)
	public void testGroupOwner3() throws Exception{
		user2.delete();
	}
}
