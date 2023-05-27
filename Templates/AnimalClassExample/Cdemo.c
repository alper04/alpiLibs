#include <stdio.h>

// Animal class
typedef struct {
    void (*speak)();
} Animal;

// Cat class, extending Animal
typedef struct {
    Animal base;
} Cat;

// Dog class, extending Animal
typedef struct {
    Animal base;
} Dog;

// Method to make a cat speak
void catSpeak() {
    printf("Meow!\n");
}

// Method to make a dog speak
void dogSpeak() {
    printf("Woof!\n");
}

int main() {
    // Create instances of cat and dog objects
    Cat myCat;
    Dog myDog;

    // Set the speak method of the cat object
    myCat.base.speak = catSpeak;

    // Set the speak method of the dog object
    myDog.base.speak = dogSpeak;

    // Call the speak method of the cat object
    printf("The cat says: ");
    myCat.base.speak();

    // Call the speak method of the dog object
    printf("The dog says: ");
    myDog.base.speak();

    return 0;
}
