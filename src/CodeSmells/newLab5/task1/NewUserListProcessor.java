package CodeSmells.newLab5.task1;

import java.util.ArrayList;

public class NewUserListProcessor {
    private ArrayList<User> users;
    private CountAdmin countAdmin;

    public NewUserListProcessor(ArrayList<User> users) {
        this.users = users;
        countAdmin = new CountAdmin();
    }


    public void processUserList() {
        for (User user : users) {
            processUser(user);
        }
    }

    private void processUser(User user) {
        System.out.println("Processing user: " + user.username);
        // Some processing logic...
        checkAdmin(user);
    }
    private void checkAdmin(User user){
        if (user.isAdmin()) {
            System.out.println("Admin user detected!");
        }
    }


    public void addUser(User user) {
        users.add(user);
    }

    public String adminCount(){
        return "Count - " + countAdmin.countAdmin(users);
    }


    public void sendEmailToUser(User user) {
        // Sending email...
        System.out.println("The message was sent to the mail - " + user.email);
    }


}
