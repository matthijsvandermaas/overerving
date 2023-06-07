package nl.novi.javaprogrammeren.overerving;
//fearture overerving
public abstract class Animal {
    protected boolean Indoor;
    private final String name;
    final String enclosureName;
    private final String gender;
    public final String lastFedDay;
    private final String countryOfOrigin;

    public Animal(String name, String enclosureName, String gender, String lastFedDay, String countryOfOrigin) {
        this.name = name;
        this.enclosureName = enclosureName;
        this.gender = gender;
        this.lastFedDay = lastFedDay;
        this.countryOfOrigin = countryOfOrigin;
    }

    public void move() {
        System.out.println("The animal has moved 0.25 meters.");
    }

    public void makeSound() {
        // Implementation for making sound
    }

    public void sleep() {
        System.out.println("The animal sleeps for 8 hours a day.");
    }

    public void eat(String food) {
        System.out.println("The animal is eating " + food);
    }

    // Getters and setters for the properties
}





