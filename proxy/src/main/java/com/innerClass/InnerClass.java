package com.innerClass;

public class InnerClass {
    public static void main(String[] args) {
        Animal.Bird bird = new Animal.Bird();
        bird.sing();

        Animal animal = new Animal();
        Animal.Dog dog = animal.new Dog();
        dog.sing();
        dog.display("KeJi");
    }

}


//Field inner class
class Animal{
    String name = "littlePig";
    int age;

    //Static inner class
    static class Bird{
        String name;
        public void sing(){
            System.out.println("The bird is singing!");
        }
    }

    //normal inner class
    class Dog{
        String name="bigYellow";
        public void sing(){
            System.out.println("The dog is singing!");
        }

        public void display(String name){
            System.out.println(name);
            System.out.println(this.name);
            System.out.println(Animal.this.name);
        }
    }
}
