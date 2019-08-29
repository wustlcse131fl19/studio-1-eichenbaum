package studio1;

import support.cse131.ArgsProcessor;

public class Average {
    public static void main(String[] args) {
        ArgsProcessor ap = new ArgsProcessor(args);
        int one = ap.nextInt("Number 1?");
        int two = ap.nextInt("Number 2?");
        System.out.print("Average = " + (one+two)*.5);
    }
}
