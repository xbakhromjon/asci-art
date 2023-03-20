package uz.bakhromjon;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, InterruptedException {
        File file = new File("C:\\Users\\Bakhromjon\\IdeaProjects\\asci-art\\src\\main\\resources\\passvault.txt");
        Scanner reader = new Scanner(file);
        while (reader.hasNextLine()) {
            String line = reader.nextLine();
            System.out.println(line);
            Thread.sleep(50);
        }
    }
}

