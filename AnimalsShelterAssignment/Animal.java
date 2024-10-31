package AnimalsShelterAssignment;

public class Animal {

    private String name;
    private int age;
    private String species;
    private String breed;

    public Animal(String name, int age, String species, String breed) {
        this.name = name;
        this.age = age;
        this.species = species;
        this.breed =  breed;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }


}
