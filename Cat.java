
public class Cat extends Animal {
    public void run() {
        System.out.println("cat is running");
    }

    public void makeSound() {
        System.out.println("Cat says meow once");
    }

    public void makeSound(int numberOfTime) {
        for (int i = 0; i < numberOfTime; i++) {
            System.out.println("Cat says meow");
        }
    }

}
