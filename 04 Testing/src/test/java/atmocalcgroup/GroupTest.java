package atmocalcgroup;
import static org.junit.Assert.*;

import org.kramerlab.atmocalc.objects.*;

public class GroupTest {

  // Der gleiche Nutzer darf nicht einer Gruppe hinzugefuegt werden koennen, in der er schon Member ist
  @org.junit.Test (expected = IllegalArgumentException.class)
  public void testGroup1() throws Exception {
    User user = new User();
    Group group = new Group();
    group.addMember(user);
    group.addMember(user);
  }
  
  // Ein Nutzer, der nicht Member einer Gruppe ist, darf nicht aus dem Memberset geloescht werden koennen (existiert nicht)
  @org.junit.Test (expected = IllegalArgumentException.class)
  public void testGroup2() throws Exception {
    User user = new User();
    (new Group()).removeMember(user);
  }
  
  // Das null-Objekt darf nicht dem Memberset hinzugefügt werden kšnnen
  @org.junit.Test (expected = IllegalArgumentException.class)
  public void testGroup4() throws Exception {
    (new Group()).addMember(null);
  }
  
  // Das null-Objekt darf nicht aus dem Memberset geloescht werden kšnnen
  @org.junit.Test (expected = IllegalArgumentException.class)
  public void testGroup5() throws Exception {
    (new Group()).removeMember(null);
  }
  
  @org.junit.Test
  public void testGroup6() throws Exception {
    User user1 = new User();
    User user2 = new User();
    User user3 = new User();
    Group group = new Group();
    group.addMember(user1);
    group.addMember(user2);
    group.removeMember(user1);
    group.addMember(user3);
  }
}
