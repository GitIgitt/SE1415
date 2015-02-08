package atmocalcgroup;
import org.junit.After;
import org.junit.Before;
import org.kramerlab.atmocalc.objects.*;
import org.kramerlab.atmocalc.database.accessors.*;


public class TestGroupMember {
  User user1;
  User user2;
  User user3;
  Group group1;
  Group group2;
  Group group3;
  ManagerAccessor ma = new ManagerAccessor();
  
  @Before
  public void setUp(){
    //Testbenutzer und Testgruppen anlegen
    user1 = ma.newUser("testUser1","abc@def.de","abc");
    user2 = ma.newUser("testUser2","def@ghi.de","def");
    user3 = ma.newUser("testUser3","ghi@jkl.de","ghi");
    group1 = ma.newGroup(user1);
    group2 = ma.newGroup(user2);
    group3 = ma.newGroup(user3);
  }
  
  @After
  public void tearDown(){
    //Testbenutzer und Testgruppen wieder aus Datenbank löschen
    group1.delete();
    group2.delete();
    group3.delete();
    user1.delete();
    user2.delete();
    user3.delete();
  }
  
  // Ein Nutzer, der nicht Member einer Gruppe ist, darf nicht aus dem Memberset geloescht werden koennen (existiert nicht)
  @org.junit.Test (expected = IllegalArgumentException.class)
  public void testGroupMember1() throws Exception {
    group1.removeMember(user2);
  }
  
  // Der gleiche Nutzer darf nicht einer Gruppe hinzugefuegt werden koennen, in der er schon Member ist
  @org.junit.Test (expected = IllegalArgumentException.class)
  public void testGroupMember2() throws Exception {
    group1.addMember(user2);
    group1.addMember(user2);
  }
  
  // Der Besitzer der Gruppe kann nicht nochmal als member hinzugefuegt werden
  @org.junit.Test (expected = IllegalArgumentException.class)
  public void testGroupMember3() throws Exception{
    group1.addMember(user1);
  }  
  
  // Das null-Objekt darf nicht dem Memberset hinzugefuegt werden koennen
  @org.junit.Test (expected = IllegalArgumentException.class)
  public void testGroupMember4() throws Exception {
    group1.addMember(null);
  }
  
  // Das null-Objekt darf nicht aus dem Memberset geloescht werden koennen
  @org.junit.Test (expected = IllegalArgumentException.class)
  public void testGroupMember5() throws Exception {
    group1.removeMember(null);
  }
  
  //Benutzer kann in mehreren Gruppen sein
  @org.junit.Test
  public void testGroupMember6() throws Exception {
    group1.addMember(user3);
    group2.addMember(user3);
    group3.addMember(user1);
    group1.removeMember(user3);
    group3.removeMember(user1);
  }
}  

