package src.decorator;

import src.model.Coffee;

public abstract class CoffeeDecorator implements Coffee {
    protected Coffee coffee;

    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }
    
    @Override 
    public abstract String getDescription();

    @Override 
    public abstract double cost();
}
