package CodeSmells.newLab6.part4.replaceParameterWithMethodCall;

public class Processor8 {
    private Calculator8 calculator8;

    public Processor8(Calculator8 calculator8){
        this.calculator8 = calculator8;
    }

    public int process(int x, int y){
        int result = calculator8.add(x,y);
        return result;
    }
}
