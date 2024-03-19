package factory_method_second_example;

public class DogFactory implements AnimalFactory{
    @Override
    public Animal createAnimal() {
        return new Dog();
    }
}
