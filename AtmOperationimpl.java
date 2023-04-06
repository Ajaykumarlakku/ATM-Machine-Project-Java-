import java.util.HashMap;
public class AtmOperationimpl implements AtmOperationsInterf {
      ATM atm = new ATM();
      HashMap<Double,String> miniStatement = new HashMap<>();
    @Override
    public void depositAmount(double depositAmount) {
        // TODO Auto-generated method stub
        miniStatement.put(depositAmount,"Depsite Ammount");
        System.out.println(depositAmount + "Deposite Successfull !!");
        atm.setBalance(atm.getBalance()+ depositAmount);
        viewBalance();
        
    }

    @Override
    public void viewBalance() {
        // TODO Auto-generated method stub
        System.out.println("Available Balance is : " +atm.getBalance());

        
    }

    @Override
    public void viewMinistatement() {
        // TODO Auto-generated method stub
        for(HashMap.Entry<Double,String> m : miniStatement.entrySet()){
            System.out.println(m.getKey()+ "" + m.getValue() );
        }
        
    }

    @Override
    public void withdrawAmount(double withdrawAmount) {
        // TODO Auto-generated method stub
        if(withdrawAmount %500 == 0){
            if(withdrawAmount <= atm.getBalance()){
            miniStatement.put(withdrawAmount,"WithDraw Ammount");
        System.out.print("Collect The Cash" + withdrawAmount);
        atm.setBalance(atm.getBalance()- withdrawAmount);
         viewBalance();
        }else{
            System.out.println("Insufficient Balance");
        }
        }else{
            System.out.println("Plese Enter Amount in Multiple of 500 ");
        }
        
    }
    
}
