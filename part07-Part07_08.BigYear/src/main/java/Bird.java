
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Bird {
    private ArrayList<String> birds;
    private String name;
    private String latinName;
    private int observations;
    
    public Bird(String name, String latinName) {
        this.birds = new ArrayList<>();
        this.name = name;
        this.latinName = latinName;
        this.observations = 0;
    }
    
    public String getBird() {
        return this.name;
    }
    
    public void addObservation() {
       this.observations += 1;
    }
    
    public int getObservation() {
        return this.observations;
    }
    
    public String toString() {
        return this.name + " (" + this.latinName + "): " + getObservation() + " observations";
    }
}
