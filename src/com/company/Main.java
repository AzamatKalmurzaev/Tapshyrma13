package com.company;

public class Main {

    public static void main(String[] args) {
	Balyk balyk = new Balyk();
    balyk.setName("Kit");
    balyk.SetAge(10);
    balyk.setcolor("Red");

        System.out.println(" Name: " + balyk.getName());
        System.out.println(balyk.getAge());
        System.out.println(balyk.getColor());
        balyk.swim();



        Popugay popugay = new Popugay();
        popugay.setName("Kargusha");
        popugay.setAge(2);
        popugay.setColor("multicolor");

        System.out.println(" Name: " + "Kargusha");
        System.out.println(popugay.getAge());
        System.out.println(popugay.getColor());

        It it = new It();
        it.setName("Boya");
        it.setAge(5);
        it.setGavGav("Yrot");
        it.setColor("Black");

        System.out.println("Name: " + "Boya");
        System.out.println(it.getAge());
        System.out.println(it.getGavGav());
        System.out.println(it.getColor());












    }
}
