import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

// Base class
class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void introduce() {
        System.out.println("Hi, my name is " + name + " and I am " + age + " years old.");
    }
}

// Inheritance
class Student extends Person {
    String school;

    Student(String name, int age, String school) {
        super(name, age);
        this.school = school;
    }

    // Polymorphism (Overriding)
    @Override
    void introduce() {
        System.out.println("Hi, I am " + name + ", " + age + " years old, studying at " + school);
    }
}

// Interface
interface Sports {
    void play();
}

class Athlete implements Sports {
    String sportName;

    Athlete(String sportName) {
        this.sportName = sportName;
    }

    @Override
    public void play() {
        System.out.println("Playing " + sportName);
    }
}

public class Main {
    public static void main(String[] args) {
        // Variables and Data types
        int number = 42;
        double pi = 3.14159;
        char grade = 'A';
        boolean isJavaFun = true;
        String greeting = "Hello, Java World!";

        System.out.println(greeting);
        System.out.println("Number: " + number + ", Pi: " + pi + ", Grade: " + grade + ", Java Fun? " + isJavaFun);

        // Arrays
        int[] nums = {1, 2, 3, 4, 5};
        System.out.println("Array Elements:");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();

        // ArrayList
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        System.out.println("Fruits: " + fruits);

        // Conditionals
        if (number > 50) {
            System.out.println("Number is greater than 50");
        } else {
            System.out.println("Number is 50 or less");
        }

        // Loops
        System.out.println("While loop from 1 to 5:");
        int i = 1;
        while (i <= 5) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();

        // Methods
        int sum = add(5, 10);
        System.out.println("Sum of 5 and 10 is: " + sum);

        // Objects and Classes
        Person person = new Person("Alice", 25);
        person.introduce();

        Student student = new Student("Bob", 20, "XYZ University");
        student.introduce();

        // Interface and Polymorphism
        Athlete athlete = new Athlete("Football");
        athlete.play();

        // Exception Handling
        try {
            int division = number / 0;
            System.out.println(division);
        } catch (ArithmeticException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        }

        // File I/O
        try {
            FileWriter writer = new FileWriter("example.txt");
            writer.write("This is a sample text written to a file.\nJava File I/O Example.");
            writer.close();
            System.out.println("File written successfully.");

            BufferedReader reader = new BufferedReader(new FileReader("example.txt"));
            String line;
            System.out.println("Reading file content:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("File I/O Exception: " + e.getMessage());
        }

        // Scanner (User Input)
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String userName = sc.nextLine();
        System.out.println("Hello, " + userName + "!");
        sc.close();
    }

    // Static Method
    public static int add(int a, int b) {
        return a + b;
    }
}
