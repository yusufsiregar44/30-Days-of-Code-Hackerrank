public class DataTypes {

    //first program!

    int maxSpeed = 69;
    int minSpeed = 0;
    double weight = 1000;
    boolean isTheCarOn = false;
    char condition = 'A';
    String nama = "Nama Gua Admin";

    public void printVariables(){

        System.out.println("ini maxSpeed tot! " + maxSpeed);
        System.out.println(minSpeed);
        System.out.println(weight);
        System.out.println(isTheCarOn);
        System.out.println(condition);
        System.out.println(nama);
    }

    public void upgradeCar(){
        minSpeed = maxSpeed;
        maxSpeed = maxSpeed + 1;
    }

    public static void main(String[] args){

    //Do application logic here

        /* hai first time!

         */

        DataTypes familyCar = new DataTypes();
        System.out.println("Family's Car grade is: ");
        familyCar.printVariables();
        familyCar.upgradeCar();
        System.out.println("My Car's grade is: ");
        familyCar.printVariables();
    }
}
