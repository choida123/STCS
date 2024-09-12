/**
 * @author Daniel Choi attests that this code is their original work and was written in compliance with the class Academic Integrity and Collaboration Policy found in the syllabus. 
 */

//It was really hard to get the import statement to work because it would not recognize the package :(
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord {
    public static void main(String[] args) {
        String picked = "";
        int count = 1;
        String current = "";
        while (!StdIn.isEmpty()){
            current = StdIn.readString();
            if (StdRandom.bernoulli(1.0/count)) { 
                picked = current;
            }
            count += 1;
        }
        System.out.println(picked);
    } 
}
