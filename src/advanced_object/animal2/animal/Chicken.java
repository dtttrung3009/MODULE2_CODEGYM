package advanced_object.animal2.animal;

import advanced_object.animal2.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public void makeSound() {
        System.out.println("Chicken sound ò ó o");
    }

    @Override
    public void howToEat() {
        System.out.println("Gà nướng ăn là hợp lí");
    }
}
