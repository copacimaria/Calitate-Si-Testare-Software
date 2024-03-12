interface Animal{
    void sound();
}

 class Cat implements Animal{
    @Override
    public void sound(){System.out.println("Meow");}
}


class Dog implements Animal{
    @Override
    public void sound(){System.out.println("Wof");}
}


class AnimalFactory{
    public static Animal createAnimal(String type){
        if("Dog".equalsIgnoreCase(type)){
            return  new Dog();
        }
        else if("Cat".equalsIgnoreCase(type)){
            return  new Cat();
        }
        else throw new IllegalArgumentException("Invalid animal type");
    }
}
