import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AtmOperationsInterf op = new AtmOperationimpl();
        int atmNumber = 12345;
        int atmPin = 123;
        Scanner sc = new Scanner(System.in);
        System.out.println("!!! Wellcome to ATM Machine !!!");
        System.out.println("enter atmNumber: ");
        int atmnumber = sc.nextInt();
        System.out.println("enter pin: ");
        int pin = sc.nextInt();

        if(atmNumber == atmnumber && atmPin == pin){
            while(true){
            System.out.println("Validation Succesfull");
            System.out.println("1.View Available Balance\n2.Withdraw Ammount\n3.Deposite Ammount\n4.View MiniStatement\n5.Exit");
            System.out.println("Enter Choice");
            int Choice = sc.nextInt();
            if(Choice == 1){
                op.viewBalance();

            }else if(Choice == 2){
                System.out.println("Enter Amount to Withdraw");
            Double withdrawamount = sc.nextDouble();
            op.withdrawAmount(withdrawamount);


            }else if(Choice ==3){
                System.out.println("Enter Ammount to Deposite : ");
                Double depositeAmount = sc.nextDouble();
                op.depositAmount(depositeAmount);

            }else if(Choice == 4){
                op.viewMinistatement();

            }else if(Choice == 5){
                System.out.println("Collect Your ATM card\nThank Yor for your visit");
                System.exit(0);
            }else{
                System.out.println("Plese Enter Correct Choice");
            }
        }
    }else{
            System.out.println("Incorrect AtmNumber or pin");
        }
    System.exit(0);
    }


        
    

    }
