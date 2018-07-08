import java.util.* ;
class Monk {
    public static void main(String args[]){

            Scanner input = new Scanner(System.in) ;
            int numberOfTestCases = 0 ;
            try{
                 numberOfTestCases = Integer.parseInt(input.nextLine()) ;
            }catch(NumberFormatException e){
                System.out.println(e+" is not a number") ;
            }
            int i  = 0 ;
            String[] testCases = new String[numberOfTestCases] ;

            for(int counter = 0 ; counter<numberOfTestCases ; counter++){
                String testCase = input.nextLine().trim();
                testCases[counter] = testCase ;
            }
            /*
            while(numberOfTestCases>0){
                String testCase = input.nextLine().trim();
                testCases[i] = testCase ;
                numberOfTestCases-- ;
                i++ ;
            }*/

            // checking strings for prescence of vowels
            int[] numberOfVowels = new int[numberOfTestCases] ;
            char[] vowels = {'a','e','i','o','u'} ;
            //iterate over individual test cases
            for(int counter = 0 ; counter<testCases.length ; counter++){
                int vowelCount = 0 ;
                // convert each testcase  String to lowerCase
                String temp = testCases[counter].toLowerCase() ; // converting everything into downcase

                for(int testCaseChar= 0 ; testCaseChar<temp.length(); testCaseChar++){
                    for(int vowel = 0 ; vowel< vowels.length ; vowel++){
                        // why expecting a array here
                        if(temp.charAt(testCaseChar) ==(vowels[vowel])){

                            vowelCount++ ;
                        }
                    }

                }
                numberOfVowels[counter] = vowelCount ;
            }
            for(int counter = 0 ; counter<numberOfVowels.length ; counter++){
                System.out.println(numberOfVowels[counter]) ;
            }

        }

    }

