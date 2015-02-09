package atmocalcobject.analysis;
import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.kramerlab.atmocalc.objects.Analysis;
import org.kramerlab.atmocalc.analysis.Analyzer;


public class GetUriTest {
  
  final char[] zeichen = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".toCharArray();
  ArrayList<Analysis> analysis;
  Analyzer an = new Analyzer();
  
  @Before
  public void setUp(){
	  for (int i = 0; i < 100; i++){
		analysis.add(an.createAnalysis());  
	  }
    
  }
  
  @After
  public void tearDown(){
    //Delete Analysis
	  while(analysis.size()>0){
		  analysis.get(0).delete();
		  analysis.remove(0);
	  }
  }
  
  @org.junit.Test
  public void testAnalysisGetUri1() throws Exception {
	  for(int i = 0; i < analysis.size(); i++){
		  assertTrue((analysis.get(i).getUri()== analysis.get(i).databaseId));
	  }
  }
}
