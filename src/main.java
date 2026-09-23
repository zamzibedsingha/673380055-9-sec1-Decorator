package src;

import src.decorator.MilkDecorator;
import src.decorator.SugarDecorator;
import src.decorator.WhippedCreamDecorator;
import src.model.Americano;
import src.model.Coffee;
import src.model.Espresso;

public class main {
    public static void main(String[] args) {
        // Test Case 1
        Coffee order1 = new Espresso();

        System.out.println("Test Case 1");
        System.out.println("Configuration: Espresso");
        System.out.println("Description: " + order1.getDescription());
        System.out.printf("Total Cost: $%.2f%n%n", order1.cost());

        // Test Case 2
        Coffee order2 = new MilkDecorator(new Espresso());
        System.out.println("Test Case 2");
        System.out.println("Configuration: Espresso + Milk");
        System.out.println("Description: " + order2.getDescription());
        System.out.printf("Total Cost: $%.2f%n%n", order2.cost());

        // Test Case 3
        Coffee order3 = new WhippedCreamDecorator(new  SugarDecorator(new MilkDecorator(new Americano())));
        System.out.println("Test Case 3");
        System.out.println("Configuration: Americano + Milk + Sugar + Whipped Cream");
        System.out.println("Description: " + order3.getDescription());
        System.out.printf("Total Cost: $%.2f%n", order3.cost());
    }
}
