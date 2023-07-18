public class BankBalance {
    private float balance;
    public BankBalance(){
        balance = 0;
    }
    public void balanceOfAccount(float a,float b){
        for(int i=1;i<4;i++) {
            float interest = a * (b / 100);
            a = a + interest;
            System.out.println("Balance of the account in " + i + "th month is " + a);
        }
    }
}
