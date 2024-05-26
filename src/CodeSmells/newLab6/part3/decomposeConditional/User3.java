package CodeSmells.newLab6.part3.decomposeConditional;

public class User3 {
    private String name;
    private boolean loggedIn;

    public User3(String name, boolean loggedIn) {
        this.name = name;
        this.loggedIn = loggedIn;
    }
    public boolean isLoggedIn(){
        return loggedIn;
    }

    public boolean hasPermission(Resource resource){
       return true;
    }
}
