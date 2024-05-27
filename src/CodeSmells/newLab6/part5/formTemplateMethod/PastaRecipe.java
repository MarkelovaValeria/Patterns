package CodeSmells.newLab6.part5.formTemplateMethod;

public class PastaRecipe extends CookingRecipe{
    @Override
    protected void addIngredients() {
        System.out.println("Adding pasta");
    }

    @Override
    protected void cook() {
        System.out.println("Cooking pasta");
    }
}
