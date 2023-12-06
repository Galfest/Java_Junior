package l2.hw2;

class Dog extends Animal {
    private String breed;

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }

    @Override
    public String toString() {
        return super.toString() + ", Breed: " + breed;
    }
}