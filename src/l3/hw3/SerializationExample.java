package l3.hw3;

import java.io.*;

public class SerializationExample {
    public static void main(String[] args) {
        Student student = new Student("Alice", 20, 3.8);

        // Сериализация объекта в файл
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("student.ser"))) {
            outputStream.writeObject(student);
            System.out.println("Object serialized.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Десериализация объекта из файла
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("student.ser"))) {
            Student deserializedStudent = (Student) inputStream.readObject();
            System.out.println("\nObject deserialized. Info:");
            deserializedStudent.displayInfo();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}