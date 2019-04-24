package advanced_object.animal_va_interface_edible.Comparator;

public class Chicken extends Animal implements Edible{
    @Override
    public String makeSound() {
        return "Chicken: Ò ó o";
    }

    @Override
    public String howToEat() {
        return "Có thể ăn";
    }
}
