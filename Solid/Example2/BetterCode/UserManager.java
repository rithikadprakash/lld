package Solid.Example2.BetterCode;

public class UserManager {
    
    public void add(User user) {
        if(user.getAge() < 18) {
            throw new IllegalArgumentException("User not adult");
        }
        System.out.println("User added");
    }

    public void deleteUser(User user) {
        System.out.println("User deleted");
    }

    public void update(User user) {
        System.out.println("User updated");
    }

    public void getUser(User user) {
        System.out.println("User returned");
    }
    
}
