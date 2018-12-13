package com.jimmy;

public class HealthyChoice extends Hamburger {
    private boolean sprouts;
    private boolean wheatGerm;

    public HealthyChoice(int meat, boolean lettuce, boolean tomato, boolean ketchup, boolean egg, boolean sprouts, boolean wheatGerm) {
        super(meat, "wheat rye roll", lettuce, tomato, ketchup, egg);
        this.sprouts = sprouts;
        this.wheatGerm = wheatGerm;
        if(sprouts){
            super.addToOrder("sprouts", 1.00);
        }
        if(wheatGerm){
            super.addToOrder("wheatGerm", 1.00);
        }
    }
}
