package src.decorator;

import src.model.Coffee;

public class WhippedCreamDecorator extends CoffeeDecorator {
    
    public WhippedCreamDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", Whipped Cream";
    }

    @Override
    public double cost() {
        return coffee.cost() + 0.70;
    }
}
