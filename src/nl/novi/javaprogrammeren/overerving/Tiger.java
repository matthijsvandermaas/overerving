package nl.novi.javaprogrammeren.overerving;

public class Tiger extends Animal {
    private final int numberOfStripes;

    public Tiger(String name, String enclosureName, String gender, String lastFedDay, String countryOfOrigin, int numberOfStripes) {
        super(name, enclosureName, gender, lastFedDay, countryOfOrigin);
        this.numberOfStripes = numberOfStripes;
    }

    public int getNumberOfStripes() {
        return numberOfStripes;
    }

    // Additional Tiger-specific properties and methods
}