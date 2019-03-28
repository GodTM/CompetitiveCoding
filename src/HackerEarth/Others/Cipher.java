package HackerEarth.Others ;

import java.util.* ;

class Cipher{

    public static void main(String args[]){

        Scanner input = new Scanner(System.in) ;

        String rawText = (input.nextLine().trim()) ;
        int numberOfShifts = Integer.parseInt(input.nextLine().trim()) ;

        char[] toBeModified = rawText.toCharArray();

        for(int counter = 0; counter<toBeModified.length; counter++){
            int number = (int) toBeModified[counter] ;
            if((number>=65 && number<91 )||(number>=48 && number<=57)||(number>96 && number<123)){

                int shifted = ((int)toBeModified[counter] + numberOfShifts)  ;
                if((number>= 65 && number<91) && shifted>90){

                    shifted = (65 + (shifted-90)%26) ;
                    toBeModified[counter] = (char) shifted ;
                }
                else if((number>96 && number<123) && shifted>122 ){
                    shifted = (97+ (shifted-122)%26) ;
                    toBeModified[counter] = (char) shifted ;
                }
                else if((number>47 && number<=57) && shifted>57){
                    shifted = (48+ (shifted-48)%10) ;
                    toBeModified[counter] = (char) shifted ;
                }
                else{
                    toBeModified[counter] = (char)shifted ;
                }
            }
        }
        String answer= new String(toBeModified) ;
        System.out.println(answer) ;
    }
}