import java.util.* ;
class LifeEverything {
    public static void main(String args[]) {

        int number = 0;
        Scanner input = new Scanner(System.in);
        String toBeProcessed = input.nextLine().trim();
        ArrayList<Integer> intArr = new ArrayList<Integer>() ;
        while (Integer.parseInt(toBeProcessed) != 42) {

            intArr.add(Integer.parseInt(toBeProcessed)) ;
            toBeProcessed = input.nextLine().trim();
            continue;

        }
        for(int i: intArr){
            System.out.println(i) ;
        }
    }

}

