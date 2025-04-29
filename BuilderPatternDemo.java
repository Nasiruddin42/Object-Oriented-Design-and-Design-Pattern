
public class BuilderPatternDemo {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder() ;

        Meal vegMeal = mealBuilder.prepareVegMeal() ;
        System.out.println("VegMeal");
        vegMeal.ShowItem();
        System.out.println("Total cost : " + vegMeal.getCost());

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal() ;
        System.out.println("\nNonVegMeal");
        nonVegMeal.ShowItem();
        System.out.println("Total cost : " + nonVegMeal.getCost());
    }
}
