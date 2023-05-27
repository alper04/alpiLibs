// Animal class
open class Animal(val name: String) {
    open fun makeSound() {
        println("The animal makes a sound.")
    }
}

// Cat class
class Cat(name: String) : Animal(name) {
    override fun makeSound() {
        println("Meow!")
    }
}

// Dog class
class Dog(name: String) : Animal(name) {
    override fun makeSound() {
        println("Woof!")
    }
}

// Main function
fun main() {
    val cat = Cat("Whiskers")
    val dog = Dog("Buddy")

    cat.makeSound()
    dog.makeSound()
}
