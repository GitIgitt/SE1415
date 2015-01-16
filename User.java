/* 
   
 */


abstract class User {

    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private Image profilePicture;

    public final boolean register(String firstName, String lastName, String email, String password, Image profilePicture) {
    
    }

    public final User login(String email, String password) {
    
    }

    public final User[] search(String query) {
    
    }

    public final boolean logout() {
    
    }

    public final boolean uploadProfilePicture(Image picture) {
    
    }

    public final boolean addToUserGroup(userGroup userGroup) {
    
    }


}
