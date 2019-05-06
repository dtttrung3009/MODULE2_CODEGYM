package advanced_object.animal2;

import advanced_object.animal2.animal.Animal;
import advanced_object.animal2.animal.Chicken;
import advanced_object.animal2.animal.Tiger;
import advanced_object.animal2.fruit.Apple;
import advanced_object.animal2.fruit.Fruit;
import advanced_object.animal2.fruit.Orange;

public class Main {
    public static void main(String[] args) {
        System.out.println("Các đối tượng trong animal: ");
        Animal[] animals= new Animal[2];
        animals[0]= new Tiger();
        animals[1]= new Chicken();
        for(Animal animal: animals){
            animal.makeSound();
            if(animal instanceof Chicken ){
                Edible edible= (Chicken) animal;
                edible.howToEat();
            }
        }
        System.out.println("Các đối tượng trong fruit: ");
        Fruit[] fruits= new Fruit[2];
        fruits[0]= new Apple();
        fruits[1]= new Orange();
        for(Fruit fruit: fruits){
            fruit.howToEat();
        }
    }
}
