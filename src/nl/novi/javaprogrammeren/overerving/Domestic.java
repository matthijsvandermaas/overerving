package nl.novi.javaprogrammeren.overerving;

public class Domestic extends Animal {
    private String ownerName;

    public Domestic(String name, String enclosureName, String gender, String lastFedDay, String countryOfOrigin, String ownerName) {
        super(name, enclosureName, gender, lastFedDay, countryOfOrigin);
        this.ownerName = ownerName;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
}