package CodeSmells.newLab6.part4.hideMethod;

public class HideMethod {
    public void publicMethod(){
        System.out.println("Use public method");
        privateMethod();
    }

    private void privateMethod(){
        System.out.println("Use private method");
    }
}
