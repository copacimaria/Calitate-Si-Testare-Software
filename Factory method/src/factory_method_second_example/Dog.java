package factory_method_second_example;

public class Dog implements Animal
{
    @Override
    public void sound() {
        System.out.println("Woof");
    }
}
