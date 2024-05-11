package CodeSmells.newLab5.task1;

public class User {
    String username;
    String email;
    String password;
    String address;

    public User(String username, String email, String password, String address) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.address = address;
    }

    public boolean isAdmin() {
        return username.toLowerCase().contains("admin");
    }
}
