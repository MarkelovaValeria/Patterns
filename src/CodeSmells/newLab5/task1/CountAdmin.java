package CodeSmells.newLab5.task1;


import java.util.ArrayList;

public class CountAdmin {
    public int countAdmin(ArrayList<User> userList){
        int count = 0;
        for (User user:userList){
            if(user.username.contains("admin")){
                count++;
            }
        }
        return count;
    }
}
