package atmocalcuser;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.kramerlab.atmocalc.manager.AtmoCalcManager;
import org.kramerlab.atmocalc.objects.*;

public class GetMailTest {
	final char[] zeichen = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".toCharArray();
	ArrayList<String> vergleich;
	ArrayList<User> testuser;
	AtmoCalcManager ma = new AtmoCalcManager(null);
	@Before
	public void setUp(){
		vergleich = new ArrayList<String>();
		testuser = new ArrayList<User>();
		char[] testname;
		for (int i = 0; i < 100; i++){
			testname = new char[(int)(Math.random()*17+3)];
			for(int j = 0; j < testname.length;j++){
				testname[j] = zeichen[(int)(Math.random()*62)]; 
			}
			String s = new String(testname);
			vergleich.add(s);
			testuser.add(ma.newUser(s, s+"@test.de", "test"));
		}
	}
	@After
	public void tearDown(){
		//Delete User
	}
	
	@org.junit.Test
	public void testGetUser() throws Exception {
		for (int i = 0; i < testuser.size(); i++){
			assertTrue((vergleich.get(i)+"@test.de").toLowerCase() == testuser.get(i).getMail().toLowerCase());
		}
			
	}
	
}
