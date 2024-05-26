package CodeSmells.newLab6.part3.decomposeConditional;

public class AccessManager {

    public boolean isAccessAllowed(User3 user3, Resource resource){
        return user3 != null && user3.isLoggedIn() && resource!= null && user3.hasPermission(resource);
    }
    public void checkAccess(User3 user3, Resource resource){
        if (isAccessAllowed(user3, resource)){
            accessMessage(true);
        }else{
            accessMessage(false);
        }
    }

    private void accessMessage(boolean accessGranted){
        if(accessGranted){
            System.out.println("Access granted");
        }
        else{
            System.out.println("Access denied");
        }
    }
}
