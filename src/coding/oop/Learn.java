package coding.oop;

public class Learn {

}


class Mammal {

    protected String name;
    protected int age;

    public String colour = "Red";

    public Mammal(int age, String name) {
        this.name = name;
        this.age = age;
    }

    public void jump(int height) {
        System.out.println("Mammal jumps - " + height + "M");
    }

    public String getColour() {
        return this.colour;
    }

}

class Cat extends Mammal {

    private String species;

    public String colour = "Brown";

    public Cat(int age, String name, String species) {
        super(age, name);
        this.species = species;
        System.out.println("Cat: " + name + ", " + age + ", " + species);
    }

    public void jump(int height) {
        System.out.println("Cat jumps - " + height + "CM");
    }

    public String getColour() {
        return this.colour;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "colour='" + colour + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", colour='" + colour + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Mammal mammal = new Mammal(5,"Lion");
        Mammal cat = new Cat(6, "Mion", "superCat");
        mammal.jump(4);
        cat.jump(87);

        System.out.println(cat.colour);
        System.out.println(mammal.colour);

        System.out.println(mammal.getColour());
        System.out.println(cat.getColour());

        System.out.println(cat);

    }


}
