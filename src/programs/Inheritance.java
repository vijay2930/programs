package programs;
class Animal{
    public String color;
    public float weight;
    Animal(String color, float weight)
    {
        this.color=color;
        this.weight=weight;
    }
    public void eat(){
        System.out.println("Animal eats.");
    }
}

class Cat extends Animal
{
    Cat(String color,float weight){
        super(color,weight);
    }
    public void eat(){ 
        System.out.println("Cat eats fish");
    }
}

class Dog extends Animal{
    Dog(String color,float weight){
        super(color,weight);
    }
    public void eat(){
        System.out.println("Dog eats meat");
    }
}
public class Inheritance {
    public static void main(String[] args) {

        Animal dog=new Dog("black",9.5f);
        Animal cat=new Cat("brown",9.5f);
        dog.eat();
        cat.eat();
    }
}
