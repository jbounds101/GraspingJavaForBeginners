package lesson_13.tutorial;

/*
This is the Dog object we want to create
 */

public class Dog {

    // This is the object we want, of type Dog (notice how Dog is really just built out of primitive data types)
    public String name; // Notice how this is public!
    private String breed;
    private boolean isMale;
    private int age;

    public static int numberBarks = 0; // This is static, it belongs to the Dog.java class, rather than an instance
    // of the class

    public Dog(String name, String breed, boolean isMale, int age) { // This function is a constructor, this is
        // what is used to create a Dog object
        this.name = name;
        this.breed = breed;
        this.isMale = isMale;
        this.age = age;
    }

    public void bark() {
        numberBarks += 2;
        System.out.println(this.name + " says: Woof woof!");
    }

    public String getBreed() {
        return breed;
    }

    public boolean isMale() {
        return isMale;
    }

    public int getAge() {
        return age;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setMale(boolean male) {
        isMale = male;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
