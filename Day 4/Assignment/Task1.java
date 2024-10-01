//Task 1: Develop a class Transaction with final attributes transactionId and amount.
//Implement multiple constructors for initializing transactions with different parameters
//        (e.g., ID and amount, or just amount). Ensure that transactionId is set only once
//and print the transaction details for different transaction objects.


public class Task1 {
    public static void main(String[] args) {
        Transaction a=new Transaction(2,56);
        a.print();
        Transaction b=new Transaction(1200);
        b.print();

    }
}

class Transaction{
 final int transactionId;
    final int amount;


    private static int count=0;

    Transaction(int transactionId,int amount){
        this.transactionId=transactionId;
        this.amount=amount;
    }



    Transaction(int amount){

        this(++count,amount);
    }
    public void print(){
        System.out.println("the id is "+transactionId+" and the amount transferred is "+amount);
    }

}