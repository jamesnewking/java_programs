package com.jimmy;

public class Main {

    public static void main(String[] args) {
		Hamburger superStar = new Hamburger();
		superStar.callBackOrder();
		Hamburger royalWithEgg = new Hamburger(2, "chibata", false, false, false, true);
		royalWithEgg.callBackOrder();

		HealthyChoice lowFat = new HealthyChoice(3, true, true, false, false, true, true);
		lowFat.callBackOrder();
    }
}
