package atmocalcobject.user;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.kramerlab.atmocalc.database.accessors.ManagerAccessor;
import org.kramerlab.atmocalc.objects.*;

/* Gültige Nutzernamen bestehen aus mindestens 3 und maximal 20 Zeichen 
 * zulässige Zeichen sind Buchstaben von a-z (keine Umlaute) und Ziffern von 0-9
 * zwischen Klein- und Großbuchstaben wird nicht unterschieden
 * unzulässig sind Sonderzeichen sowie Leerzeichen
 */
public class SetNameTest{
  
  final char[] zeichen = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".toCharArray();
  
  User user1, user2, user3;
  ManagerAccessor ac;
  @Before
  public void setUp(){
    ac = new ManagerAccessor();
    user1 = ac.newUser("test1", "test1@test.de", "test");
    user2 = ac.newUser("test2", "test2@test.de", "test");
  }
  @After
  public void tearDown(){
    //Löschen von dem Testnutzer 
    user1.delete();
    user2.delete();
  }
  
  //Nutzername darf nicht doppelt sein, damit Methode getUserByName funktioniert
  //--> Name darf nicht auf bereits vorhandenen geaendert werden
  @org.junit.Test (expected = IllegalArgumentException.class)
  public void testUser12(){
    user2.setName("test1");
  }
    
  @org.junit.Test (expected = IllegalArgumentException.class)
  public void testUser1() throws Exception {
    user1.setName(null);
  }
  
  @org.junit.Test (expected = IllegalArgumentException.class)
  public void testUser2() throws Exception {
    user1.setName("");
  }
  
  @org.junit.Test (expected = IllegalArgumentException.class)
  public void testUser3() throws Exception {
    user1.setName("t");
  }
  
  @org.junit.Test (expected = IllegalArgumentException.class)
  public void testUser4() throws Exception {
    user1.setName("te");
  }
  
  @org.junit.Test (expected = IllegalArgumentException.class)
  public void testUser5() throws Exception {
    user1.setName("&§$§$>/");
  }
  
  @org.junit.Test (expected = IllegalArgumentException.class)
  public void testUser6() throws Exception {
    user1.setName("test6@.");
  }
  
  @org.junit.Test (expected = IllegalArgumentException.class)
  public void testUser7() throws Exception {
    user1.setName("test 7");
  }
  
  @org.junit.Test (expected = IllegalArgumentException.class)
  public void testUser8() throws Exception {
    user1.setName("test8$");
  }
  
  @org.junit.Test (expected = IllegalArgumentException.class)
  public void testUser9() throws Exception {
    user1.setName("test123456891011121920");
  }
  @org.junit.Test (expected = IllegalArgumentException.class)
  public void testUser10() throws Exception {
    char[] test = new char[10000];
    for (int i = 0; i < 10000;i++){
      test[i] = zeichen[(int)(Math.random()*zeichen.length)];
    }
    user1.setName(new String(test));
  }
  
  @org.junit.Test
  public void testUser11() throws Exception {
    User test = user1;
    char[] testString;
    for (int i = 0;  i < 100; i++){
      testString = new char[(int)(Math.random()*17)+3];
      for (int j = 0; j < testString.length; j++){
        testString[j] = zeichen[(int)(Math.random()*zeichen.length)];
      }
      String s = new String(testString);
      test.setName(s);
      //Strings toLowercase eventuell noch ersetzen 
      assertEquals(s.toLowerCase(), test.getName().toLowerCase());
    } 
  }
}
