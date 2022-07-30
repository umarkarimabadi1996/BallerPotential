package org.example;

public class Version_4 {


    public static void main(String[] args) {

        Baller motohar = new Baller(185, 80, 600, 200);

        double ballerPotentialOfMotohar = ballerPotential(motohar);

        System.out.println("That baller protential of Motohar is " + ballerPotentialOfMotohar);

        Baller umar = new Baller(160, 65, 200, 60);

        double ballerPotentialOfUmar = ballerPotential(umar);

        System.out.println("That baller protential of Motohar is " + ballerPotentialOfUmar);

    }


    public static double BMI(Baller baller) {
        double bmi = baller.height/ baller.weight;
        return bmi;
    }

    public static double speed(Baller baller) {
        double speed =  baller.distance / baller.time;
        return speed;
    }



    public static double ballerPotential(Baller baller) {
        double BMI = BMI(baller);
        double speed = speed(baller);

        double ballerPotential = BMI/speed;

        return ballerPotential;


    }



}
