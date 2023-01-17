/*  This is a  class called Test
*   This class creates a main() method and
*   creates an instance of the BigO class
*   Finally, it uses the instances of the class to call the
*   three methods from the class.
*
* */
public class Test{
    public static void main(String[] args) {
        // bigO is an instance of the BigO class.
        BigO bigO = new BigO();
        //uses the bigO instance to  call the printOnce method.
        // This method will print "Firefly" One time.
        bigO.printOnce("Firefly");
        //uses the bigO instance to  call the printNTimes method.
        // This method will print "Internet Historian" two times.
        bigO.printNTimes(2);
        //uses the bigO instance to  call the printNSquaredTimes method.
        // This method will print " The Magicians" n squared times--> in this case 9 times.
        bigO.printNSquaredTimes(3);
    }
}
