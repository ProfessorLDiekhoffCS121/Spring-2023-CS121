public class BigO {
	/*This method  runs in O(1) time
    *printOnce takes in one parameter of a string
    *This method prints the phrase Firefly one time. 
    */
    public void printOnce(String string)
    {
        System.out.println(string);
    }
    /*This method  runs in O(n) time
    *printNTimes takes in one parameter of int n
    *This method prints the phrase Internet Historian n times. 
    */
    public void printNTimes(int n)
    {
        for (int i = 1; i <= n; i++)
        {
            System.out.println("Internet Historian");
        }
    }
  
   /*This method  runs in O(n^2) time
    *printNSquaredTimes takes in one parameter of int n
    *This method prints the phrase The magicians n^2 times. 
    */
    public void printNSquaredTimes(int n)
    {
        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= n; j++)
            {
                //System.out.println("The Magicians");
                System.out.printf("i."+ i +"   The Magicians  "+"j:"+ j+"%n");
            }
        }
    }
}