package CodeForcesSolutions.Div3;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class PolyCarp {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int numberOfElements = Integer.parseInt(input.nextLine().trim());
        String[] inStr = input.nextLine().trim().split("\\s");
        int oddCount = 0, evenCount = 0;
        boolean startOdd = false;
        boolean startEven = false;
        LinkedList<Long> numbers = new LinkedList<>();
        if (numberOfElements == inStr.length && numberOfElements <= 2000 && numberOfElements >= 1) {
                boolean allEven = true , allOdd = true ;
                for (String s : inStr) {
                    numbers.add(Long.parseLong(s));
                }
                Collections.sort(numbers);
                for (Long c : numbers) {
                    if (c % 2 == 0) {
                        evenCount += 1;
                        allOdd = false ;
                    } else {
                        oddCount += 1;
                        allEven = false ;
                    }
                }

                if ((oddCount == evenCount - 1) || (evenCount == oddCount - 1) || oddCount == evenCount) {
                    System.out.println(0);
                }
                else if(allEven || allOdd){
                    numbers.removeLast() ;
                    int sum= 0 ;
                    for(Long s: numbers){
                        sum+= s ;
                    }
                    System.out.println(sum);

                }

                else{
                    LinkedList<Long> even = new LinkedList<>() ;
                    LinkedList<Long> odd = new LinkedList<>() ;
                    for(Long c: numbers){
                        if(c%2==0){
                            even.add(c) ;
                        }
                        else{
                            odd.add(c) ;
                        }
                    }


                    boolean firstEven = false , firstOdd = false ;
                    if(numbers.get(numbers.size()-1)%2==0){
                        firstEven = true ;
                    }
                    else{
                        firstOdd = true ;
                    }

                    if(firstEven){

                        boolean currentEven = true , currentOdd = false ;
                        while((even.size()!= 0 && odd.size()!=0)){

                            if(currentEven){
                                even.removeLast()  ;
                                currentEven = false  ;
                                currentOdd = true ;
                            }
                            else if(currentOdd){
                                odd.removeLast() ;
                                currentEven = true ;
                                currentOdd = false ;
                            }
                        }

                        boolean evenEmpty = even.isEmpty() , oddEmpty = odd.isEmpty() ;
                        if(evenEmpty && !oddEmpty){
                            long sum = 0 ;
                            for(Long s: odd){
                                sum+= s ;
                            }
                            System.out.println(sum);
                        }
                        else if(!evenEmpty && oddEmpty){
                            long sum = 0 ;
                            for(Long s: even){
                                sum+= s ;
                            }
                            System.out.println(sum);
                        }
                    }
                    else{


                        for(int counter = numbers.size()-1 ; counter>= 0 ; counter--){
                            if(even.size()!=0 && odd.size()!=0) {
                                if (counter % 2 == 0) {
                                    odd.removeLast();
                                } else {
                                    even.removeLast();
                                }
                            }
                        }

                        boolean evenEmpty = even.isEmpty() , oddEmpty = odd.isEmpty() ;
                        if(evenEmpty && !oddEmpty){
                            long sum = 0 ;
                            for(Long s: odd){
                                sum+= s ;
                            }
                            System.out.println(sum);
                        }
                        else if(!evenEmpty && oddEmpty){
                            long sum = 0 ;
                            for(Long s: even){
                                sum+= s ;
                            }
                            System.out.println(sum);
                        }

                    }



                }


            }
    }




}

