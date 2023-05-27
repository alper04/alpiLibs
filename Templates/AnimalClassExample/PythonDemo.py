class Animal:
    def __init__(self, name):
        self.name = name

    def make_sound(self):
        return "sound"

class Cat(Animal):
    def __init__(self, name):
        super().__init__(name)

    def make_sound(self):
        return "Meow"

class Dog(Animal):
    def __init__(self, name):
        super().__init__(name)

    def make_sound(self):
        return "Woof"

def main():
    # Create a cat and a dog
    my_animal = Animal("Animus")
    my_cat = Cat("Fluffy")
    my_dog = Dog("Fido")

    # Make them speak
    print(f"{my_animal.name} says {my_animal.make_sound()}")
    print(f"{my_cat.name} says {my_cat.make_sound()}")
    print(f"{my_dog.name} says {my_dog.make_sound()}")

if __name__ == "__main__":
    main()