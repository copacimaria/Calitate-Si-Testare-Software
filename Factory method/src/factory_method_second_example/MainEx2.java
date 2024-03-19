package factory_method_second_example;

public class MainEx2 {
    public static void main(String[] args){
        AnimalFactory dogFactory=new DogFactory();
        Animal dog=dogFactory.createAnimal();
        dog.sound();

        AnimalFactory catFactory=new CatFactory();
        Animal cat=catFactory.createAnimal();
        cat.sound();
    }
}
