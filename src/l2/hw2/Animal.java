package l2.hw2;

abstract class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void makeSound();

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }
}