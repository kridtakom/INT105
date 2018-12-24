/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TrainerApp;

/**
 *
 * @author Kridtakom
 */
public class TrainerApp {

    private String name;
    private int kcal;
    private int weight;
    private Exercise exercise;
    private EatingFood eating;

    public TrainerApp(String name, int kcal, int weight) {
        this.name = name;
        this.kcal = kcal;
        this.weight = weight;
        this.eating = new EatingFood();
        this.exercise = new Exercise();

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKcal() {
        return kcal;
    }

    public void setKcal(int kcal) {
        this.kcal = kcal;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Exercise getExercise() {
        return exercise;
    }

    public void setExercise(Exercise exercise) {
        this.exercise = exercise;
    }

    public EatingFood getEating() {
        return eating;
    }

    public void setEating(EatingFood eating) {
        this.eating = eating;
    }

    public int exerciseCourse(char type) {

        if (type == 'a' || type == 'A') {
            if ((kcal - exercise.courseA()) < 1200) {
                return -1;

            } else {
                kcal -= exercise.courseA();
            }
        } else if (type == 'b' || type == 'B') {
            if ((kcal - exercise.courseB()) < 1200) {
                return -1;

            } else {
                kcal -= exercise.courseB();
            }
        }
        return kcal;
    }

    public int exerciseSpecific(String type, int amount) {
        if (type.equalsIgnoreCase("treadmill")) {
            if (kcal - exercise.playTreadmill(amount) >= 1200) {
                kcal -= exercise.playTreadmill(amount);
                return kcal;
            } else {
                return -1;
            }
        } else if (type.equalsIgnoreCase("elliptical")) {
            if (kcal - exercise.playElliptical(amount) >= 1200) {
                kcal -=   exercise.playElliptical(amount);
                return kcal;
            } else {
                return -1;
            }
        } else {
            if (kcal - exercise.sitUp(amount) >= 1200) {
                kcal -= exercise.sitUp(amount);
                return kcal;
            } else {
                return -1;
            }
        }

    }

    public int eatingFood(String type) {
        if (type.equalsIgnoreCase("normalfood")) {
            kcal += eating.getEnergy();
        } else {
            kcal += eating.getEnergyMore();
        }
        return kcal;
    }

    public int guessYourWeight() {
        return this.weight + (this.kcal / 7000);
    }

    @Override
    public String toString() {
        return "TrainerApp{" + "name=" + name + ", kcal=" + kcal + ", weight=" + weight + ", exercise=" + exercise + ", eating=" + eating + '}';
    }

}
