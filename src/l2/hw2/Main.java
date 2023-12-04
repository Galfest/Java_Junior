package l2.hw2;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = {
                new Dog("Buddy", 5, "Labrador"),
                new Cat("Whiskers", 3, "White")
        };

        // Вывод информации о каждом объекте и вызов метода makeSound()
        Arrays.stream(animals)
                .forEach(animal -> {
                    System.out.println(animal);
                    invokeMakeSound(animal);
                });
    }

    // Вызов метода makeSound() с использованием Reflection API
    private static void invokeMakeSound(Animal animal) {
        try {
            Method makeSoundMethod = animal.getClass().getMethod("makeSound");
            makeSoundMethod.invoke(animal);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            // Обработка ошибок, если метод не найден или не может быть вызван
            System.out.println("No sound available for this animal");
        }
    }
}