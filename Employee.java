package CoreJava;

import Utility.Util;

import java.util.Random;

public class Employee {
    public static void main(String[] args)
    {
        System.out.println("Welcome to employee wage computation program on master branch");
        Random random = new Random();
        int x = random.nextInt(1000);
        Util ref = new Util();
        ref.present(x);

    }
}
