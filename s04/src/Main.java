public class Main {
    public static void main(String[] args) {
        // Get an instance of Singleton
        Singleton singleton1 = Singleton.getInstance("Data from singleton1");
        // Call a method on the singleton instance
        singleton1.doSomething();

        // Get another instance of Singleton
        Singleton singleton2 = Singleton.getInstance("Data from singleton2");
        // Call a method on the singleton instance
        singleton2.doSomething();

        // Check if both instances are the same
        System.out.println("Are singleton1 and singleton2 the same instance? " + (singleton1 == singleton2));


        Animal dog=AnimalFactory.createAnimal("Dog");
        dog.sound();

        Animal cat=AnimalFactory.createAnimal("Cat");
        cat.sound();

        Animal animal=AnimalFactory.createAnimal("Dog");
        animal.sound();

        animal=AnimalFactory.createAnimal("Cat");
        animal.sound();

        Shape square=ShapeFactory.createShape("Square");
        square.draw();

        Shape circle=ShapeFactory.createShape("Circle");
        circle.draw();

    }
}
