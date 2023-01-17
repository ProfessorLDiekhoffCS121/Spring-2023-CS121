
public class RecursionDemo
{
    public int calcFactorial(int number)
    {
        if (number == 1)
        {
            return 1;
        }
        else
        {
            return number * calcFactorial(number - 1);
        }

    }


    public void countDown(int number)
    {
        if (number == 0)
        {
            System.out.println("Go!");
        }
        else
        {
            System.out.println(number);
            countDown(number - 1);
        }
    }

    public void printBackwards(char letter)
    {
        if (letter == 'a')
        {
            System.out.println(letter);
        }
        else
        {
            System.out.println(letter);
            printBackwards(--letter);
        }
    }


}