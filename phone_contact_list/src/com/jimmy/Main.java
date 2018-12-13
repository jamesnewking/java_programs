package com.jimmy;


public class Main {

    public static void main(String[] args) {
	// write your code here
        PhoneList iPhone = new PhoneList();
        Contact henry = new Contact("Henry", "949-555-1212");
        Contact frank = new Contact("Frank Happy", "949-555-1212");
        Contact yuri = new Contact("Yuri Much", "949-555-1212");
        iPhone.addContact(henry);
        iPhone.addContact(frank);
        iPhone.addContact(yuri);
        iPhone.addContact(henry);
        iPhone.printList();
        iPhone.removeContact(henry);
        iPhone.removeContact(henry);
        iPhone.removeContact(henry);
        iPhone.printList();
    }
}
