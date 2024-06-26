package CodeSmells.newLab6.part5.formTemplateMethod;

public abstract class CookingRecipe {
    public final void prepareRecipe() {
        boilWater();
        addIngredients();
        cook();
        serve();
    }
    private void boilWater() {
        System.out.println("Boiling water");
    }
    protected abstract void addIngredients();
    protected abstract void cook();
    private void serve() {
        System.out.println("Serving");
    }
}
