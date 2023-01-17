import java.util.Scanner;

public class RecursionTester
{
	public static void main(String[] args)
	{
		RecursionDemo demo = new RecursionDemo();
		
		Scanner console = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		int number = Integer.parseInt(console.nextLine());
		System.out.println(demo.calcFactorial(number));
		System.out.println();
        demo.countDown(3);
		System.out.println();
        demo.printBackwards('z');
        System.out.println();

        int x = 10;
        int y = 20;
        System.out.printf("Printing result of x + 1 = %d\n", x + 1);
        System.out.printf("Printing result of y - 1 = %d\n", y - 1);
        System.out.println();
        x = 10;
        y = 20;
        System.out.printf("Printing postfix x = %d\n", x++);
        System.out.printf("Printing postfix y = %d\n", y--);
        System.out.printf("Printing x after postfix increment: %d\n", x);
        System.out.printf("Printing y after postfix decrement: %d\n", y);
        System.out.println();
        x = 10;
        y = 20;
        System.out.printf("Printing prefix x = %d\n", ++x);
        System.out.printf("Printing prefix x = %d\n", --y);
	}
}

