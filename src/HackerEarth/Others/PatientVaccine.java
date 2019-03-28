package HackerEarth.Others ;
import java.util.*  ;
class PatientVaccine{

    public static void main(String args[]){

        Scanner input = new Scanner(System.in) ;
        try{
            int numberOfEntries = Integer.parseInt(input.nextLine().trim()) ;

            String[] vaccineStrength = input.nextLine().trim().split(" ") ;
            String[] peopleStrength  = input.nextLine().trim().split(" ") ;

            /*
            if(vaccineStrength.length != numberOfEntries || peopleStrength.length != numberOfEntries){
                System.out.println("Invalid number of entries") ;
                System.exit(1) ;
            }*/

            int[] vStrength = new int[numberOfEntries] ;
            int[] pStrength = new int[numberOfEntries] ;

            for(int counter = 0 ;counter<numberOfEntries ; counter++){
                vStrength[counter] = Integer.parseInt(vaccineStrength[counter]) ;
                pStrength[counter] = Integer.parseInt(peopleStrength[counter]) ;
            }

            // now sorting both the arrays using bubble Sort

            // sorting the vaccine Strength
            for(int counter=0 ; counter<vStrength.length-1 ; counter++){
                for(int counter2= vStrength.length-1 ; counter2>= counter+1; counter2--){
                    if(vStrength[counter2]<vStrength[counter2-1]){

                        int exchange = vStrength[counter2] ;
                        vStrength[counter2] = vStrength[counter2 -1] ;
                        vStrength[counter2-1] = exchange ;
                    }
                }
            }

            // sorting the people Strength

            for(int counter= 0; counter<pStrength.length-1 ; counter++){
                for(int counter2=0 ; counter2>= counter+1; counter2--){
                    if(pStrength[counter2]<pStrength[counter2-1]){
                        int exchange = pStrength[counter2] ;
                        pStrength[counter2] =  pStrength[counter2 -1];
                        pStrength[counter2-1] = exchange ;
                    }
                }
            }

            boolean allSaved = true ;
            for(int counter= 0 ; counter<numberOfEntries ; counter++){
                if(vStrength[counter]<pStrength[counter]){
                    allSaved = false;
                    break ;
                }
            }
            if(allSaved){
                System.out.println("Yes") ;
            }else{
                System.out.println("No")  ;
            }

        }catch(NumberFormatException e){
            System.out.println(e+" is not a number") ;
        }

    }
}