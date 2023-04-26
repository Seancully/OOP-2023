package ie.tudublin;

import processing.core.PApplet;
import processing.data.TableRow;

public class Nematodes extends PApplet{

    // write appropiate fields
    private String name;
    private int length;
    private int limbs;


    public int getLimbs() {
        return limbs;
    }

    public void setLimbs(int limbs) {
        this.limbs = limbs;
    }

    private int gender;
    private int eyes;

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public int getEyes() {
        return eyes;
    }

    public void setEyes(int eyes) {
        this.eyes = eyes;
    }

    // create acessor methods for the .csv file for this class
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    // write a toString() method 
    @Override
    public String toString() {
        return "Nematodes [name=" + name + ", length=" + length + ", limbs=" + limbs + ", gender=" + gender + ", eyes="
                + eyes + "]";
    }

    // Constructor
    public Nematodes(String name, int length, int limbs, int gender, int eyes) {
        this.name = name;
        this.length = length;
        this.limbs = limbs;
        this.gender = gender;
        this.eyes = eyes;
    }

    // write a constructor to take TableRow parameters
    public Nematodes(TableRow row) {
        this.name = row.getString("name");
        this.length = row.getInt("length");
        this.limbs = row.getInt("limbs");
        this.gender = row.getInt("gender");
        this.eyes = row.getInt("eyes");
    }
    
    

}
