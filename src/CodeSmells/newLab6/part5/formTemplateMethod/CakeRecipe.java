package CodeSmells.newLab6.part5.formTemplateMethod;

public class CakeRecipe extends CookingRecipe{
    @Override
    protected void addIngredients() {
        System.out.println("Adding flour, sugar, eggs, etc.");
    }

    @Override
    protected void cook() {
        System.out.println("Baking the cake in the oven");
    }
}
