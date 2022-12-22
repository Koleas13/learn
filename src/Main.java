import util.Helper;


public class Main {
    public static void main(String[] args) {

       VolleyballPlayer nicolai = new VolleyballPlayer();
//        System.out.println("123");
//       VolleyballPlayer iuna = new VolleyballPlayer();
//        iuna.setServiceType(Helper.scanLine());
//
//        iuna.setName(Helper.scanLine());
//        iuna.setNumber(Helper.scanInt());
//        iuna.setHeight(Helper.scanDouble());
//        iuna.setSpike(Helper.scanDouble());
//
//
//        System.out.println("Service type: ");
//        System.out.println("Done");
//
//        iuna.generateServe();
//        System.out.println(iuna);




        int valueServe = Helper.scanInt();
        if (valueServe == 1) {
            System.out.println(nicolai.receiveServe());
            System.out.println(nicolai.generateReceive());
        }else {
            System.out.println(nicolai.receiveNoServe());
        }

       //VolleyballPlayer pasha = new VolleyballPlayer();


    }
}