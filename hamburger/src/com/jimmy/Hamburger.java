package com.jimmy;

public class Hamburger {
    private double cost;
    private int meat;
    private String patty;
    private String bread;
    private boolean lettuce;
    private boolean tomato;
    private boolean ketchup;
    private boolean egg;

    public Hamburger(int meat, String bread, boolean lettuce, boolean tomato, boolean ketchup, boolean egg) {
        this.cost = 2.99;
        this.meat = meat;
        this.patty = "regular patty";
        this.bread = bread;
        this.lettuce = lettuce;
        this.tomato = tomato;
        this.ketchup = ketchup;
        this.egg = egg;
        this.setPatty();
        this.updatePrice();
    }

    public Hamburger(){
        this.cost = 2.99;
        this.meat = 1;
        this.patty = "regular patty";
        this.bread = "white";
        this.lettuce = false;
        this.tomato = false;
        this.ketchup = false;
        this.egg = false;
        this.setPatty();
        this.updatePrice();
    }

    public void setPatty() {
        switch(meat){
            case 1:
                this.patty = "Quarter lb";
                break;
            case 2:
                this.patty = "1/2 lb";
                break;
            case 3:
                this.patty = "turkey";
                break;
            default:
                this.patty = "premium meat";
                break;
        }

    }

    private void updatePrice(){
        switch (this.meat){
            case 1:
                System.out.println("Quarter lb patty is an additional $0.50");
                this.cost += 0.50;
                break;
            case 2:
                System.out.println("1/2 lb patty is an additional $0.75");
                this.cost += 0.75;
                break;
            case 3:
                System.out.println("Turkey patty is an additional $1.00");
                this.cost += 1.00;
                break;
            default:
                System.out.println("Regular patty at no additional cost");
                break;
        }
        if(this.lettuce){
            System.out.println("extra lettuce at an additional $0.10");
            this.cost += 0.10;
        }
        if(this.tomato){
            System.out.println("extra tomato at an additional $0.15");
            this.cost += 0.15;
        }
        if(this.ketchup){
            System.out.println("extra ketchup at an additional $0.05");
            this.cost += 0.05;
        }
        if(this.egg){
            System.out.println("a fried egg at an additional $1.00");
            this.cost += 1.00;
        }
    }

    public void addToOrder(String item, double price){
        System.out.println("added " + item + " to your order for an additional " + price);
        this.cost += price;
    }

    public void callBackOrder(){
        System.out.println("You ordered a " + getClass().getSimpleName() + " with:");
        System.out.println(this.patty);
        System.out.println(" on a " + this.bread + " bun with ");
        if(this.lettuce){
            System.out.println(" extra lettuce ");
        }
        if(this.tomato){
            System.out.println(" extra tomato ");
        }
        if(this.ketchup){
            System.out.println(" extra ketchup ");
        }
        if(this.egg){
            System.out.println(" a fried egg ");
        }
        System.out.println("for $" + this.cost);
    }
}
