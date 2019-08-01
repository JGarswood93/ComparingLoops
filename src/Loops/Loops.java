package Loops;

public class Loops {
    public Loops() {
    }

    public static void main(String[] args) {
        System.out.println("Result of do/while loop: ");
        int count = 0;

        do {
            System.out.println("Hello world");
            ++count;
        }while (count<2);

        System.out.println("Results of while loop: ");

        for(count = 0; count < 1; ++count) {
            System.out.println("Hello World");
        }
        System.out.println("Results of for loop: ");

        for(int i = 0; i < 3; ++i) {
            System.out.println("Hello World");
            ++count;
        }
    }
}
