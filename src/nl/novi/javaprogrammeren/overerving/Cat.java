package nl.novi.javaprogrammeren.overerving;

public class Cat extends Animal {
    private String ownerName;
    private final String favoriteFoodBrand;
    private final String breed;
    private boolean indoor;

    public Cat(String name, String ownerName, String favoriteFoodBrand, String gender, String breed, boolean indoor) {
        super(name, null, gender, null, null);
        this.ownerName = ownerName;
        this.favoriteFoodBrand = favoriteFoodBrand;
        this.breed = breed;
        this.indoor = indoor;
    }

    public boolean isIndoor() {
        return indoor;
    }

    public void setIndoor(boolean indoor) {
        this.indoor = indoor;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    // Additional Cat-specific properties and methods

    public String getIndoorRemark() {
        if (indoor) {
            return "Yes indoor.";
        } else {
            return "No outdoor.";
        }
    }
}