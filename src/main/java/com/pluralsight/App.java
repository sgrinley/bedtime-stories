package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
//  Create Scanner
       Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter the name of the story: ");
            String fileName = scanner.nextLine();

            FileReader fileReader = new FileReader("goldilocks.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String storyLine = bufferedReader.readLine();

            int number = 1;

            // Read each line until end of file
            while (storyLine != null) {
                System.out.print(number++ + ": ");
                System.out.println(storyLine);
                storyLine = bufferedReader.readLine();
            }
// Important to always close the Buffer Reader
            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("The file could not be read. Please make sure the file is available and not locked and then try again.");
            e.printStackTrace();
        }
    }
}