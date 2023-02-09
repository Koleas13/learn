package coding.oop;

public class One{
    public void process(){
        System.out.println("Parent process");
    }

    public void methodOfOne() {
        System.out.println("Not overriden method of one");
    }
}

class Two extends One{
    @Override
    public void process() {
        System.out.println("Child process");
    }

    public void methodOfTwo() {
        System.out.println("Not overriden method of two");
    }
}

class Main {
    public static void main(String[] args) {
        One obj = new Two();
        obj.process();
        obj.methodOfOne();


        One obj1 = new One();
        obj1.methodOfOne();

        ((Two)obj1).methodOfTwo(); //can't call method of two without cast
    }
}



