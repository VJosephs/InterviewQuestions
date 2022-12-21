        /* You’re are given a list of pin codes that can be between 3 - 10 numbers.  A PIN code

        * is considered a duplicate of another PIN code if it is in the same or reversed order.

        *

        *  Example:

        *     123 is a duplicate of 123

        *     123 is a duplicate of 321

        *     123 is not a duplicate of 213 or 312, etc

        *

        * Given pin codes 123,213,321, there are a total of 2 distinct pin codes, 123 and 213

        *

        * Write a function that will return the count of distinct PIN codes

        *

        * The ideal time complexity for a solution is O(n)

        *

        * public int solve(String[] codes);
         */
import java.util.HashMap;
public class PinCodes {

    public int uniquePINCodes(int[] PINCodes){
        // Hashmaps prevent duplication of keys, so if we add both the PIN and the reverse of the pin we can divide
        // the resulting size of the hashmap by 2 and get the true number of unique PIN codes
        HashMap x = new HashMap<Integer, Integer>();
        for(int y: PINCodes){
            x.put(y, 1);
            x.put(reversePin(y), 1);
        }
        return x.size()/2;
    }

    public int reversePin(int x){
        int reverse = 0;
        while(x != 0){
            int y = x % 10;
            reverse = reverse + y * 10;
            x /= 10;
        }
        return reverse;
    }

}
