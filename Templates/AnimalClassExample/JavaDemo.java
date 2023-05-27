public class JavaDemo {
    public static void main(String[] args) {
        Animal animal = new Animal("Fluffy", 5);
        Cat cat = new Cat("Fluffy", 5);
        Dog dog = new Dog("Fluffy", 5);

        animal.makeSound(); // Output: The animal makes a sound.
        cat.makeSound(); // Output: The cat meows.
        dog.makeSound(); // Output: The dog barks.
    }
}

class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}

class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("The cat meows.");
    }
}

class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("The dog barks.");
    }
}

