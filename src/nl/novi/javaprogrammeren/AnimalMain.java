package nl.novi.javaprogrammeren;

import nl.novi.javaprogrammeren.overerving.*;

public class AnimalMain {
    public static void main(String[] args) {
        Lion lion = new Lion("Simba", "Enclosure 1", "Male", "Monday", "Africa", 3);
        Tiger tiger = new Tiger("Raja", "Enclosure 2", "Male", "Tuesday", "Asia", 50);
        Dog dog = new Dog("Buddy", "John", "Pedigree", "Male", "Labrador");
        Cat cat = new Cat("Whiskers", "Emily", "Royal Canin", "Female", "Persian", true);
        Wolf wolf = new Wolf("Alpha", "Enclosure 3", "Male", "Wednesday", "North America", "Pack A");

        lion.move();
        lion.makeSound();
        lion.sleep();
        lion.eat("Meat");
        System.out.println("Number of Lion's Children: " + lion.getNumberOfChildren());
        System.out.println();

        tiger.move();
        tiger.makeSound();
        tiger.sleep();
        tiger.eat("Raw Meat");
        System.out.println("Number of Tiger's Stripes: " + tiger.getNumberOfStripes());
        System.out.println();

        dog.move();
        dog.makeSound();
        dog.sleep();
        dog.eat("Dog Food");
        System.out.println("Dog's Owner Name: " + dog.getOwnerName());
        System.out.println();

        cat.move();
        cat.makeSound();
        cat.sleep();
        cat.eat("Cat Food");
        System.out.println("Cat's Owner Name: " + cat.getOwnerName());
        System.out.println("Is the Cat Indoor? " + cat.getIndoorRemark());
        System.out.println();

        wolf.move();
        wolf.makeSound();
        wolf.sleep();
        wolf.eat("Wild Animals");
        System.out.println("Wolf's Pack Name: " + wolf.getPackName());
        System.out.println();
    }
}
