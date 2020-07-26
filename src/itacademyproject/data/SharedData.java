package itacademyproject.data;

public class SharedData {
    
    private static UserItem currentUser = new UserItem("DefaultUserName","DefaultPassword");

    private SharedData() {
        throw new UnsupportedOperationException();
    }
    
    public static UserItem getCurrentUser() {
        return currentUser;
    }

    public static void setCurrentUser(UserItem currentUser) {
        SharedData.currentUser = currentUser;
    }
}
