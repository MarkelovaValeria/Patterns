package CodeSmells.lab5;

import java.util.ArrayList;
public class UserListProcessor {
    private ArrayList<String> usernames;
    public UserListProcessor(ArrayList<String> usernames) {
        this.usernames = usernames;
    }
    public void processUserList() {
        // Long method
        for (int i = 0; i < usernames.size(); i++) {
            String username = usernames.get(i);
            System.out.println("Processing user: " + username);
            // Some processing logic...
            if (username.contains("admin")) {
                System.out.println("Admin user detected!");
            }
        }
    }
    public int countAdminUsers() {
        // Primitive obsession
        int adminCount = 0;
        for (String username : usernames) {
            if (username.contains("admin")) {
                adminCount++;
            }
        }
        return adminCount;
    }
    // Long parameter list
    public void addUser(String username, String email, String password, String
            address) {
        // Adding user...
    }
    // Data clumps
    public void sendEmailToUser(String username, String email) {
        // Sending email...
    }
}