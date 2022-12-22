import util.Helper;


public class Main {
    public static void main(String[] args) {

       //VolleyballPlayer nicolai = new VolleyballPlayer("Nicolai", 9, 3.00, 50.63, "Striker","M");
        System.out.println("123");
       VolleyballPlayer iuna = new VolleyballPlayer();
        iuna.setServiceType(Helper.scanLine());

        iuna.setName(Helper.scanLine());
        iuna.setNumber(Helper.scanInt());
        iuna.setHeight(Helper.scanDouble());
        iuna.setSpike(Helper.scanDouble());


        System.out.println("Service type: ");
        System.out.println("Done");

        iuna.generateServe();
        System.out.println(iuna);

       //VolleyballPlayer pasha = new VolleyballPlayer();


    }
}