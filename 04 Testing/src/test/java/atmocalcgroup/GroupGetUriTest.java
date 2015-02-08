package atmocalcgroup;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.kramerlab.atmocalc.manager.AtmoCalcManager;
import org.kramerlab.atmocalc.objects.*;

public class GroupGetUriTest {

	ArrayList<Group> testgroups;
	AtmoCalcManager ma = new AtmoCalcManager(null);
	User testuser;
	
	@Before
	public void setUp(){
		testgroups = new ArrayList<Group>();
		testuser = ma.newUser("test", "test@email.de", "test");
		for(int i = 0; i < 100; i++){
			testgroups.add(ma.newGroup(testuser));
		}
		
	}
	
	@After
	public void tearDown(){
		//Delete User
		while(testgroups.size()>0){
			testgroups.get(0).delete();
		}
	}
	
	@org.junit.Test
	public void testGetUser() throws Exception {
		for (int i = 0; i < testgroups.size(); i++){
			assertTrue((testgroups.get(i).databaseId) == testgroups.get(i).getUri());
		}
			
	}
	
}
