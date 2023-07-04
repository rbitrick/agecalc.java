import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class Main {
    // public, static, void, etc. is used to talk to the compliler

    public static void main(String[] args) {
        String ans1 = "Test";
        int sup = 0;
        int userage = 0;
        int newnumber = 0;
        System.out.println("Hello everyone! This program was developed by Ryan Bitrick");
        System.out.println("This is my first Java program");
        System.out.println("In this example, I will be re-creating my world famous Age Calulator program that I created in Python");
        System.out.println("Please start by entering your name: ");
        Scanner input = new Scanner(System.in);
        String username = input.nextLine();
        System.out.println("Now enter you current age:");
        while(true) {
            try {
                Scanner userageinput = new Scanner(System.in);
                String useragein = userageinput.nextLine(); 
                userage = Integer.parseInt(useragein); 
                break;
                

            }
            catch (Exception e) {
                System.out.println("You've entered a letter or symbol. Please try again");
                continue;
            }
        }
        System.out.println("Enter another number!");

        while(true) {
            try {
                Scanner anothernumberin = new Scanner(System.in);
                String anothernumber = anothernumberin.nextLine();
                newnumber = Integer.parseInt(anothernumber);
                break;

            }
            catch (Exception ex) {
                System.out.println("You've entered a number or symbol. Please try again");
                continue;
            }
        }        
            sup = Integer.sum(newnumber,userage);
            if (sup >= 99) 
            {
                ans1 = "dead";
            } 
            else 
            {
                ans1 = Integer.toString(sup);
            }
        System.out.println("Your name is " + username + ". ");
        System.out.println("you are currently " + userage + " years old.");
        System.out.println("In " + newnumber + " years, you will be " + ans1);
        input.close();
    }
    /*
    public void inttest(String useragein) {
        try {
            Integer.parseInt(useragein);
        }
        catch (Exception e) {
            System.out.println("You've entered a number of symbol. Please try again");
            inttest(String);             
        }
    }*/
}