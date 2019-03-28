package HackerEarth.Others ;
import java.util.* ;

class TimeConversion{

    public static void main(String args[]){

        Scanner input = new Scanner(System.in) ;
        String[] timeInput = input.nextLine().trim().split(":");
        String amPm = timeInput[timeInput.length - 1].substring(2) ;

        StringBuilder finalString = new StringBuilder() ;
        if(amPm.equals("PM")){
            int toBeConverted = Integer.parseInt(timeInput[0]) ;
            toBeConverted+=12 ;
            timeInput[0] = Integer.toString(toBeConverted)  ;
            /*
            for(String counter: timeInput){
                finalString.append(counter) ;
            }
            */
            for(int counter = 0 ; counter< timeInput.length ; counter++){
                if(counter<timeInput.length-1){
                    finalString.append(timeInput[counter]+":") ;
                }
                else{
                    String seconds = timeInput[timeInput.length -1].substring(0,2) ;
                    finalString.append(seconds) ;
                }
            }
            System.out.println(finalString) ;
        }else{


            if(Integer.parseInt(timeInput[0])<12) {
                for (int counter = 0; counter < timeInput.length; counter++) {
                    if (counter < timeInput.length - 1) {
                        finalString.append(timeInput[counter] + ":");
                    } else {
                        String seconds = timeInput[timeInput.length - 1].substring(0, 2);
                        finalString.append(seconds);
                    }
                }
            }
            else{
                String toBeAdded = "00" ;
                finalString.append(toBeAdded+":") ;
                for (int counter = 1; counter < timeInput.length; counter++) {
                    if (counter < timeInput.length - 1) {
                        finalString.append(timeInput[counter] + ":");
                    } else {
                        String seconds = timeInput[timeInput.length - 1].substring(0, 2);
                        finalString.append(seconds);
                    }
                }

            }
            System.out.println(finalString) ;
        }


    }
}
