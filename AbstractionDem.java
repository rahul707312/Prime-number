
abstract class Animal {
    // Abstract method (does not have a body)
    public abstract void makeSound();

    // Regular method
    public void sleep() {
        System.out.println("Zzz...");
    }
}

class Dog extends Animal {
    // Providing implementation for the abstract method
    public void makeSound() {
        System.out.println("Woof!");
    }
}
class Bird extends Animal { 
    // Providing implementation for the abstract method
    public void makeSound() {
        System.out.println("Tweet!");
    }
}

public class AbstractionDem {
    public static void main(String[] args) {
        Dog dog = new Dog();
        // statement before = is object of the class and 
        // after = is constructor of the class
        Bird bird = new Bird();

        dog.makeSound(); // Output: Woof! coming from child  class method
        dog.sleep();     // Output: Zzz... coming from parent clasds method


        bird.makeSound(); // Output: Tweet!
        bird.sleep();     // Output: Zzz...
    }
}

















