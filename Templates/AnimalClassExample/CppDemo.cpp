#include <iostream>

class Animal {
public:
    virtual void makeSound() = 0; // Pure virtual function
};

class Cat : public Animal {
public:
    void makeSound() override {
        std::cout << "Meow!" << std::endl;
    }
};

class Dog : public Animal {
public:
    void makeSound() override {
        std::cout << "Woof!" << std::endl;
    }
};

int main() {

    // Animal* animal = new Animal();
    Animal* cat = new Cat();
    Animal* dog = new Dog();
    
    // animal->makeSound();     This doesn't work because animal has no definition.
    cat->makeSound();
    dog->makeSound();

    delete cat;
    delete dog;

    return 0;
}
