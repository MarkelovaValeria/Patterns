package CodeSmells.newLab5.task2.largeClass;

import java.util.ArrayList;
import java.util.List;

public class Friends {
    private List<String> friends;

    public Friends() {
        this.friends = new ArrayList<>();
    }

    public void addFriend(String friend) {
        this.friends.add(friend);
    }

    public void removeFriend(String friend) {
        this.friends.remove(friend);
    }

    public List<String> getFriends() {
        return friends;
    }
    public void displayInfo() {
        System.out.println("Friends: " + this.friends);
    }
}
