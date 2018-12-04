/**
 * Write a description of class ArraySmallest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ArraySmallest
{
    public static int getSmallest(int[] ray)
    {
        // smallest will hold the current smallest value found.
        // initialize smallest to the first number in the array
        // rather than an arbitrary value.
        int smallest;
        // use a for loop to go through the array one item at a time.
            // if the array value is less than smallest then replace
            // smallest with the array value.

        return smallest;
    }

    public static void main( String args[] )
    {
        System.out.println( getSmallest( new int[]{-99,1,2,3,4,5,6,7,8,9,10,12345} ) );
        System.out.println( getSmallest( new int[]{10,9,8,7,6,5,4,3,2,1,-99} ) );
        System.out.println( getSmallest( new int[]{10,20,30,40,50,-11818,40,30,20,10} ) );
        System.out.println( getSmallest( new int[]{32767} ) );
        System.out.println( getSmallest( new int[]{255,255} ) );
        System.out.println( getSmallest( new int[]{9,10,-88,100,-555,1000} ) );
        System.out.println( getSmallest( new int[]{10,10,10,11,456} ) );
        System.out.println( getSmallest( new int[]{-111,1,2,3,9,11,20,30} ) );
        System.out.println( getSmallest( new int[]{9,8,7,6,5,4,3,2,0,-2,-989} ) );
        System.out.println( getSmallest( new int[]{12,15,18,21,23,1000} ) );
        System.out.println( getSmallest( new int[]{250,19,17,15,13,11,10,9,6,3,2,1,-455} ) );
        System.out.println( getSmallest( new int[]{9,10,-8,10000,-5000,1000} ) );
    }
}
