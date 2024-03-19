package factory_method_second_example;

public class CatFactory implements AnimalFactory{
    @Override
    public Animal createAnimal() {
        return new Cat();
    }
}
