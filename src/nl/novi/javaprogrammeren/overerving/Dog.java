package nl.novi.javaprogrammeren.overerving;

public class Dog extends Animal {
    String ownerName = "eduardo";
    private final String favoriteFoodBrand;
    private final String breed;

    public Dog(String name, String ownerName, String favoriteFoodBrand, String gender, String breed) {
        super(name, null, gender, null, null);
        this.ownerName = ownerName;
        this.favoriteFoodBrand = favoriteFoodBrand;
        this.breed = breed;
    }


    public String getOwnerName() {
        return ownerName =ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
}