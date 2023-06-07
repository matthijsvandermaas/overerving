package nl.novi.javaprogrammeren.overerving;

public class Lion extends Animal {
    private final int numberOfChildren;

    public Lion(String name, String enclosureName, String gender, String lastFedDay, String countryOfOrigin, int numberOfChildren) {
        super(name, enclosureName, gender, lastFedDay, countryOfOrigin);
        this.numberOfChildren = numberOfChildren;
    }


    public void roar() {
        System.out.println("The lion roars loudly!");
    }

    public int getNumberOfChildren() {
        return 3;
    }

    // And any other Lion-specific properties and methods
}