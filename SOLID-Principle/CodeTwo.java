interface Petable {
    void isPetable();
}

abstract class Animal {
    protected String name;

    public void getName() {
        System.out.println("The name of the animal is " + name);
    }
}

abstract class PetAnimal extends Animal implements Petable {

    @Override
    public void isPetable() {
        System.out.println("The Animal " + name + " is Petable");
    }
}

class Dog extends PetAnimal {
}

class Cat extends PetAnimal {
}

class Lion extends Animal {
}

public class Test {
    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.name = "Dog";
        dog.isPetable();

        Cat cat = new Cat();
        cat.name = "Cat";
        cat.isPetable();

        Lion lion = new Lion();
        lion.name = "Lion";

        // lion.isPetable(); // Compile-time error
        // or we can fix this by creating a new non petable interface.
    }
}