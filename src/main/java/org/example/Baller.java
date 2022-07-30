package org.example;

public class Baller {

    double height;
    double weight;
    double distance;
    double time;

    public Baller(double height,
                  double weight,
                  double distance,
                  double time) {

        this.height = height;
        this.weight = weight;
        this.distance = distance;
        this.time = time;
    }

    public Baller() {

    }

    public double BMI(){
        double BMI = this.height/this.weight;
        return BMI;
    }

    public double ballerPotential() {
        double BMI = BMI();
        double speed = speed();
        double ballerPotential = BMI/speed;
        return ballerPotential;
    }

    public double speed(){
        double speed = this.distance/this.time;
        return speed;
    }
}
