
/*
import java.math.BigInteger;

public class AddNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        String intOne ="" ;
        String intTwo = "" ;
        for(int counter =l1.size()-1 ; counter>= 0 ; counter--){
            intOne = intOne.concat(l1.get(counter)) ;
        }
        for(int counter =l2.size()-1 ; counter>= 0 ; counter--){
            intTwo = intTwo.concat(l2.get(counter)) ;
        }
        BigInteger result = new BigInteger(String.valueOf(new BigInteger(intOne).add(new BigInteger(intTwo)))) ;
        String[] resultStr = result.toString().split("") ;
        ListNode<String> resultList = new ListNode<>() ;
        for(int counter = resultStr.length-1 ; counter>= 0 ; counter--){
            resultList.add(resultStr[counter]) ;
        }



    }
}
*/
