import java.util.* ;

class ChanduGFReturns{

    public static long[] merge(long[] array1 , long[] array2){
        int firstArrSize = array1.length , secondArrSize = array2.length ;
        long[] finalArr = new long[firstArrSize + secondArrSize] ;

        long[] tempArr1 = new long[firstArrSize] ;
        long[] tempArr2 = new long[secondArrSize] ;

        for(int counter = tempArr1.length -1 ; counter>= 0 ; counter--){
            tempArr1[tempArr1.length -1 - counter] = array1[counter] ;

        }
        for(int counter = tempArr2.length -1; counter >= 0 ; counter--){
            tempArr2[tempArr2.length-1 - counter] = array2[counter];
        }

        int i = 0 , j = 0 , k = 0 ;


        while(i<firstArrSize && j<secondArrSize){
            if(array1[i]<= array2[j]){
                finalArr[k] = tempArr1[i] ;
                i+=1 ;
            }
            else{
                finalArr[k] = tempArr2[j] ;
                j++  ;
            }
            k++ ;
        }

        //copying rest of the elements
        while(i<firstArrSize){
            finalArr[k] = tempArr1[i] ;
            i+= 1;
            k+= 1;

        }

        while(j<secondArrSize){
            finalArr[k] = tempArr2[j] ;
            j+= 1 ;
            k+= 1 ;

        }

        return finalArr;

    }

    public static void printArray(long[] arr){

        for(int counter = arr.length -1 ; counter>= 0 ; counter--){
            System.out.print(arr[counter]+" ");
        }
    }

    public static void main(String args[]){

        Scanner input = new Scanner(System.in) ;
        try{
            int numberOfIterations = Integer.parseInt(input.nextLine().trim());

            while(numberOfIterations >0){
                String[] arrSizeStrs = (input.nextLine().trim().split(" "));
                // sizes of both the arrays
                int firstArrSize  = Integer.parseInt(arrSizeStrs[0].trim()) ;
                int secondArrSize = Integer.parseInt(arrSizeStrs[1].trim()) ;
                // declaring both the arrays
                long[] firstArray  = new long[firstArrSize]  ;
                long[] secondArray = new long[secondArrSize] ;

                String[] firstArrStr  = input.nextLine().trim().split(" ");
                String[] secondArrStr = input.nextLine().trim().split(" ") ;

                if(firstArrSize!= firstArrStr.length || secondArrSize!= secondArrStr.length){

                    System.out.println("Incorrect number of elements .. exiting") ;
                    System.out.println(1) ;
                }

                // declaring both the arrays
                for(int counter= 0  ;counter<firstArrStr.length ; counter++){
                    firstArray[counter] = Long.parseLong(firstArrStr[counter].trim());
                }
                for(int counter=0; counter<secondArrStr.length ; counter++){
                    secondArray[counter] = Long.parseLong(secondArrStr[counter].trim());
                }
                long[] finalArr = ChanduGFReturns.merge(firstArray, secondArray) ;
                ChanduGFReturns.printArray(finalArr);


                numberOfIterations -= 1 ;
            }

        }catch(NumberFormatException e){
            System.out.println(e+" is not an exception..") ;
        }
    }
}