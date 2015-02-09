package atmocalcobject.packages;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.kramerlab.atmocalc.objects.*;
import org.kramerlab.atmocalc.objects.Package;
import org.kramerlab.atmocalc.database.accessors.*;

public class ReaderWriterTest {
	User user1;
	Package package1;
	ManagerAccessor ma = new ManagerAccessor();  
	@Before
	public void setUp(){
	    //Testbenutzer und Testgruppen anlegen
	    user1 = ma.newUser("testUser1","abc@def.de","abc");
	    package1 = ma.newPackage(user1);
	
	}
	  
	@After
	public void tearDown(){
	    //Testbenutzer und Testgruppen wieder aus Datenbank löschen
	    package1.delete();
	    user1.delete();
	}
	
	//Packagebesitzer sollte Lese- und Schreibrechte haben
	@org.junit.Test
	public void testGroupMember6() throws Exception {
		assertTrue(package1.isReader(user1));
		assertTrue(package1.isWriter(user1));
	}
}
