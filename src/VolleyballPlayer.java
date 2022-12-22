import java.util.Random;
import java.util.Scanner;

public class VolleyballPlayer {


    public VolleyballPlayer(String name,int number, double height, double spike,String serviceType ,String gender ){
        System.out.println("\nPlayer info:");
        this.name = name;
        this.number = number;
        this.height = height;
        this.spike = spike;
        this.serviceType = serviceType;
        this.gender = gender;
        System.out.println(getResult());
    }

    public VolleyballPlayer(String name, int number, double height){
        System.out.println("\nPlayer info:");
        this.name = name;
        this.number = number;
        this.height = height;
        System.out.println(getResult());
    }

    public VolleyballPlayer(){
    }


    public String getResult(){
        String playerInfo = "Name:" + getName() + "\nNumber:" + getNumber() + "\nHeight:" + getHeight() + "\nSpike:" + getSpike() + "\nService Type" + getServiceType() + "\nGender:" + getGender();
        return playerInfo;
    }



    private String name;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }



    private int number;
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }


    private double height;
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }


    private double spike;
    public double getSpike(){
        return spike;
    }
    public void setSpike(double spike){
        this.spike = spike;
    }


    private String serviceType;
    public String getServiceType(){
        return serviceType;
    }
    public void setServiceType(String serviceType){
        this.serviceType = serviceType;
    }


    private String gender;
    public String getGender(){
        return gender;
    }
    public void setGender(String gender){
        this.gender = gender;
    }

    public void generateServe(){
        var random = new Random();
        int value = random.nextInt(4);
        if(value == 1){
            System.out.println("Zone 5");
        }else if (value == 2) {
            System.out.println("Zone 6");
        } else if (value == 3) {
            System.out.println("Zone 1");
        }
    }


    public int generateReceive(){
        var random = new Random();
        int value = random.nextInt(3);
        int result = 1;
        if (value == 1) {
            result++;
        }else{
            result--;
        }
        return result;
    }


    public String receiveServe(){
        return "Serve was received";
    }
    public String receiveNoServe(){
        return "Serve was not received";
    }

    @Override
    public String toString() {
        return
                '\n'+"Name=" + name + '.' +'\n' +
                "Number=" + number + '.' +'\n' +
                "Height=" + height +'.' +'\n' +
                "Spike=" + spike +'.' +'\n' +
                "ServiceType=" + serviceType +'.' + '\n' +
                "Gender=" + gender +'.' + '\n';

    }
}
