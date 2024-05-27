package CodeSmells.newLab6.part5.replaceDelegationWithInheritance;

public class SecurePrinter12 extends Printer12{
    public void printSecurely(String document) {
        System.out.println("Printing securely: " + document);
        print(document);
    }
}
