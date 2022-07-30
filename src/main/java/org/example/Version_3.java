package org.example;

public class Version_3 {

    public static void main(String[] args) {

        Baller motohar = new Baller(185, 80, 600, 200);

        double ballerPotentialOfMotohar = ballerPotential(motohar.height, motohar.weight, motohar.distance, motohar.time);

        System.out.println("That baller protential of Motohar is " + ballerPotentialOfMotohar);

        Baller umar = new Baller(160, 65, 200, 60);

        double ballerPotentialOfUmar = ballerPotential(umar.height, umar.weight, umar.distance, umar.time);

        System.out.println("That baller protential of Motohar is " + ballerPotentialOfUmar);

    }


    public static double BMI(double height, double weight) {
        double bmi = height/weight;
        return bmi;
    }

    public static double speed(double distance, double time) {
        double speed =  distance / time;
        return speed;
    }


    public static double ballerPotentialBad(double height, double weight, double distance, double time) {
        double BMI = height/weight;
        double speed =  distance /time;

        double ballerPotential = BMI/speed;

        return ballerPotential;


    }

    public static double ballerPotential(double height, double weight, double distance, double time) {
        double BMI = BMI(height, weight);
        double speed = speed(distance, time);

        double ballerPotential = BMI/speed;

        return ballerPotential;


    }


}
