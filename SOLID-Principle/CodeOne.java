class Animal{
    public String name;

    public void getName(){
        System.out.println("The name of the animal is - ", name);
    }

    public void isPetable(){
        System.out.println("The Animal - ", name, "is Petable");
    }
}

class Dog extends Animal{

}

class Cat extends Animal{

}

class Lion extends Animal{

}


class Test{
    public static void main(String[] args) {
        
        Dog dog = new Dog();
        dog.name = "dog";
        dog.isPetable();   // output: The Animal dog is petable

        Cat cat = new Cat();
        cat.name = "cat";
        cat.isPetable();   // output: The Animal cat is petable

        Lion lion = new Lion();
        lion.name = "Lion";
        lion.isPetable();   // output: The Animal lion is petable

        // but as a programmer i want to control this as lion should not be petable
        // how we can do that ?
    }
}