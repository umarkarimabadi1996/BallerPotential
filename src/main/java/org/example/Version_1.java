package org.example;

public class Version_1 {

    public static void main(String[] args) {

        double motoharHeight = 185;
        double motoharWeight = 80;
        double motoharDistance = 600;
        double motoharTime = 200;

        double ballerPotentialOfMotohar = ballerPotential(motoharHeight, motoharWeight, motoharDistance, motoharTime);

        System.out.println("That baller protential of Motohar is " + ballerPotentialOfMotohar);

        double umarHeight = 160;
        double umarWeight = 65;
        double umarDistance = 200;
        double umarTime = 60;

        double ballerPotentialOfUmar = ballerPotential(umarHeight, umarWeight, umarDistance, umarTime);

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


    public static double ballerPotential(double height, double weight, double distance, double time) {
        double BMI = BMI(height, weight);
        double speed = speed(distance, time);

        double ballerPotential = BMI/speed;

        return ballerPotential;

    }


    public static double ballerPotentialBad(double height, double weight, double distance, double time) {
        double BMI = height/weight;
        double speed =  distance /time;

        double ballerPotential = BMI/speed;

        return ballerPotential;


    }





}
