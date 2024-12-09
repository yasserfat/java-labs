
abstract class Animal {
    protected int legs;

    protected Animal(int legs) {
        this.legs = legs;
    }

    public abstract void eat();

    public void walk() {
        System.out.println("This animal walks on " + legs + " legs.");
    }
}


class Spider extends Animal implements Hunter {
    public Spider() {
        super(8); 
    }

    @Override
    public void eat() {
        System.out.println("Spider eats insects.");
    }

    @Override
    public void hunts() {
        System.out.println("Spider hunts insects.");
    }
}


interface Pet {
    String getName();
    void setName(String name);
    void play();
}


class Cat extends Animal implements Pet, Hunter {
    private String name;

    public Cat(String name) {
        super(4); 
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println(name + " is playing.");
    }

    @Override
    public void eat() {
        System.out.println(name + " eats cat food.");
    }

    @Override
    public void hunts() {
        System.out.println(name + " hunts mice.");
    }
}


class Fish extends Animal implements Pet, Hunter {
    public Fish() {
        super(0); 
    }

    @Override
    public void eat() {
        System.out.println("Fish eats smaller fish.");
    }

    @Override
    public void walk() {
        System.out.println("Fish can't walk.");
    }

    @Override
    public String getName() {
        return "Generic Fish";
    }

    @Override
    public void setName(String name) {
        
    }

    @Override
    public void play() {
        System.out.println("Fish is swimming and playing.");
    }

    @Override
    public void hunts() {
        System.out.println("Fish hunts smaller fish.");
    }
}


interface Hunter {
    void hunts();
}


public class TestAnimals {
    public static void main(String[] args) {
        Fish d = new Fish();
        Cat c = new Cat("Fluffy");
        Animal a = new Fish();//casting
        Animal e = new Spider();//casting
        Pet p = new Cat("Whiskers");

        d.eat();
        d.walk();
        d.hunts();

        c.eat();
        c.walk();
        c.play();
        c.hunts();

        a.eat();
        e.walk();

        p.play();
    }
}
