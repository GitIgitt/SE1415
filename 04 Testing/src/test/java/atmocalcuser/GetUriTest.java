package atmocalcuser;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.kramerlab.atmocalc.manager.AtmoCalcManager;
import org.kramerlab.atmocalc.objects.*;

public class GetUriTest {
	final char[] zeichen = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".toCharArray();
	ArrayList<User> testuser;
	AtmoCalcManager ma = new AtmoCalcManager(null);
	@Before
	public void setUp(){
		testuser = new ArrayList<User>();
		char[] testname;
		for (int i = 0; i < 100; i++){
			testname = new char[(int)(Math.random()*17+3)];
			for(int j = 0; j < testname.length;j++){
				testname[j] = zeichen[(int)(Math.random()*62)]; 
			}
			String s = new String(testname);
			testuser.add(ma.newUser(s, s+"@test.de", "test"));
		}
	}
	@After
	public void tearDown(){
		//Delete User
		while(testuser.size()>0){
			testuser.get(0).accessor.delete();
			testuser.remove(0);
		}
	}
	
	@org.junit.Test
	public void testGetUser() throws Exception {
		for (int i = 0; i < testuser.size(); i++){
			assertTrue((testuser.get(i).databaseId) == testuser.get(i).getUri());
		}
			
	}
	
}
