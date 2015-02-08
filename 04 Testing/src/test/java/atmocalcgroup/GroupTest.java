package atmocalcgroup;
import static org.junit.Assert.*;

import org.kramerlab.atmocalc.objects.*;
import org.kramerlab.atmocalc.accessors.*;


public class GroupTest {
  User user1;
  User user2;
  Group group1;
  ManagerAccessor ma = new ManagerAccessor();
  
  @Before
  public void setUp(){
    //Testbenutzer und Testgruppen anlegen
    user1 = ma.newUser("testUser1";"abc@def.de";"abc");
    user2 = ma.newUser("testUser2";"def@ghi.de";"def");
    user3 = ma.newUser("testUser3";"ghi@jkl.de";"ghi");
    group1 = ma.newGroup(user1);
    group2 = ma.newGroup(user2);
    group3 = ma.newGroup(user3);
  }
  
  @After
  public void tearDown(){
    //Testbenutzer und Testgruppen wiedeer aus Datenbank löschen
    group1.accessor.delete();
    group2.accessor.delete();
    group3.accessor.delete();
    user1.accessor.delete();
    user2.accessor.delete();
    user3.accessor.delete();
  }
  
  // Ein Nutzer, der nicht Member einer Gruppe ist, darf nicht aus dem Memberset geloescht werden koennen (existiert nicht)
  @org.junit.Test (expected = IllegalArgumentException.class)
  public void testGroup1() throws Exception {
    group1.removeMember(user2);
  }
  
  // Der gleiche Nutzer darf nicht einer Gruppe hinzugefuegt werden koennen, in der er schon Member ist
  @org.junit.Test (expected = IllegalArgumentException.class)
  public void testGroup2() throws Exception {
    group1.addMember(user2);
    group1.addMember(user2);
  }
  
  // Der Besitzer der Gruppe kann nicht nochmal als member hinzugefügt werden
  @org.junit.Test (expected = IllegalArgumentException.class)
  public void testGroup3() throws Exception{
    group1.addMember(user1);
  }  
  
  // Das null-Objekt darf nicht dem Memberset hinzugefügt werden koennen
  @org.junit.Test (expected = IllegalArgumentException.class)
  public void testGroup4() throws Exception {
    group1.addMember(null);
  }
  
  // Das null-Objekt darf nicht aus dem Memberset geloescht werden koennen
  @org.junit.Test (expected = IllegalArgumentException.class)
  public void testGroup5() throws Exception {
    group1.removeMember(null);
  }
  
  //Benutzer kann in mehreren Gruppen sein
  @org.junit.Test
  public void testGroup6() throws Exception {
    group1.addMember(user3);
    group2.addMember(user3);
    group3.addMember(user1);
    group1.removeMember(user3);
    group3.removeMember(user1);
  }
  
  //Der Besitzer einer Gruppe darf nicht aus der Gruppe gelöscht werden
  @org.junit.Test (expected = IllegalArgumentException.class)
  public void testGroup7() throws Exception{
    group2.removeMember(user2);
  }
  
  //Solange ein Benutzer Besitzer einer Gruppe ist, darf er nicht gelöscht werden
  @org.junit.Test (expected = IllegalArgumentException.class)
  public void testGroup8() throws Exception{
    user3.accessor.delete();
  }
}  

