package CodeForcesSolutions.A;
import java.util.Scanner;
public class ChoosingTeams432A {


    public static void merge(int[] array , int left , int right , int middle){
        int leftArrSize = middle - left +1 ;
        int rightArrSize = right - middle ;
        int[] leftArr = new int[leftArrSize] ;
        int[] rightArr= new int[rightArrSize] ;

        for(int counter = 0 ; counter< leftArrSize ; counter++){ leftArr[counter] = array[left+counter] ; }
        for(int counter = 0 ; counter< rightArrSize ; counter++){rightArr[counter] = array[middle+counter +1] ; }
        int i = 0 , j = 0 , k =left ;
        while(i < leftArrSize && j< rightArrSize){
            if(leftArr[i]<= rightArr[j]){
                array[k] = leftArr[i] ;
                i++ ;
            }
            else {
                array[k] = rightArr[j] ;
                j++ ;
            }
            k++ ;
        }

        while(i<leftArrSize){
            array[k]  = leftArr[i] ;
            i++ ;
            k++ ;
        }

        while(j<rightArrSize){
            array[k] = rightArr[j] ;
            j++ ;
            k++ ;
        }
    }

    public static void mergeSort(int[] array , int left , int right){
        int middle=  (left+right)/2 ;
        if(left< right) {
            ChoosingTeams432A.mergeSort(array , left , middle);
            ChoosingTeams432A.mergeSort(array , middle+1 , right);
            ChoosingTeams432A.merge(array , left , right, middle) ;
        }
    }
    public static void main(String args[]){
        Scanner input = new Scanner(System.in) ;
        String[] inStr = input.nextLine().trim().split("\\s") ;
        int numberOfTeams = Integer.parseInt(inStr[0]);
        int minNumberOfYears = Integer.parseInt(inStr[1]) ;
        String[] numStr = input.nextLine().trim().split("\\s") ;
        int[] numbers = new int[numStr.length] ;
        for(int c = 0 ;  c< numbers.length ; c++){ numbers[c] = Integer.parseInt(numStr[c]) ; }
        ChoosingTeams432A.mergeSort(numbers , 0 , numbers.length -1);

        int count = 0 ;
        for(int counter = 0 ; counter< numbers.length ; counter++){ numbers[counter]+= minNumberOfYears ; if(numbers[counter]<=5){ count+=1 ; }}
        int teams = count/3 ;
        System.out.println(teams);



    }}
