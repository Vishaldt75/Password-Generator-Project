package MainClassPackage;

import java.util.Scanner;
import GeneratorPackage.*;

public class MainClass {

    public static final Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        Generator generator = new Generator(keyboard);
        generator.mainLoop();
        keyboard.close();
    }
}