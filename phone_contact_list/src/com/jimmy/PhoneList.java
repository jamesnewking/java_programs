package com.jimmy;

import java.util.ArrayList;

public class PhoneList {
    private ArrayList<Contact> phoneBook;

    public PhoneList(Contact contact){
        this.phoneBook = new ArrayList<>();
        this.phoneBook.add(contact);
    }

    public PhoneList(){
        this.phoneBook = new ArrayList<>();
    }

    public void addContact(Contact contact){
        phoneBook.add(contact);
        System.out.println("added " + contact.getName() + " at index " + (phoneBook.size() -1));

    }

    public void removeContact(Contact contact){
        int index;
        index = this.phoneBook.indexOf(contact);
        if(index>-1){
            this.phoneBook.remove(index);
            System.out.println("removed " + contact.getName() + " at position " + index);
        }

    }

    public void printList(){
        for (int i=0; i< phoneBook.size();i++){
            System.out.println(i+ ") Name: " + this.phoneBook.get(i).getName() );
            System.out.println("   Phone: " + this.phoneBook.get(i).getPhoneNumber() );
        }
    }
}
