package nl.novi.javaprogrammeren.overerving;

public class Wolf extends Animal {
    private final String packName;

    public Wolf(String name, String enclosureName, String gender, String lastFedDay, String countryOfOrigin, String packName) {
        super(name, enclosureName, gender, lastFedDay, countryOfOrigin);
        this.packName = packName;
    }

    public String getPackName() {
        String packname = "beta's";
        return (packName);
    }

    // Additional Wolf-specific properties
}
