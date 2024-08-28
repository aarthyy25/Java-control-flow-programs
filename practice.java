import java.util.*;

class Practice{
    public static void main(String[] args){
        //Getting input from the user
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(n);

        //Checking whether the number is positive or negative or zero
        if(n==0){
            System.out.println("Zero");
        }
        else if(n>0){
            System.out.println("Positive");
        }
        else{
            System.out.println("Negative");
        }
        
        //weekbased Number
        switch(n){
            case 0:{
                System.out.println("Sunday");
                break;
            }
            case 1:{
                System.out.println("Monday");
                break;
            }
            case 2:{
                System.out.println("Tuesday");
                break;
            }
            case 3:{
                System.out.println("Wednesday");
                break;
            }
            case 4:{
                System.err.println("Thursday");
                break;
            }
            case 5:{
                System.out.println("Friday");
                break;
            }
            case 6:{
                System.out.println("Saturday");
                break;
            }
        }

        //The number from 1 to user's number
        for(int i=1;i<=n;i++){
            System.out.println(i);
        }

        //print the nummber in reverse from user number to 1
        for(int i=n;i>=1;i--){
            System.out.println(i);
        }

        //print the number from 1 to 3, demonstrate that the block execueted at least once
        int i=1;
        do{
            System.out.println(i);
            i++;
        }while(i<=n);
        sc.close();
    }
}