package org.example;

public class Version_5 {

    public static void main(String[] args) {

        Baller motohar = new Baller(185, 80, 600, 200);

        double ballerPotentialOfMotohar = motohar.ballerPotential();

        System.out.println("That baller protential of Motohar is " + ballerPotentialOfMotohar);

        Baller umar = new Baller(160, 65, 200, 60);

        double ballerPotentialOfUmar = umar.ballerPotential();

        System.out.println("That baller protential of Motohar is " + ballerPotentialOfUmar);

    }

}
