import java.util.Scanner;
class bankmanagementsystem{
    Scanner input = new Scanner(System.in);
    private static int accCounter = 1000001;
    int accountNumber;
    String Name;
    long mobilenumber;
    long addharnumber;
    double balance;
    void setAccount(){
        System.out.println("*****Create Account*****");
        System.out.println("Enter Account details");
        accountNumber=++accCounter;
        System.out.println("Enter Account holder Name : ");
        input.nextLine(); 
        Name=input.nextLine();
        System.out.println("Enter Account holder Mobile Number : ");
        mobilenumber=input.nextLong();
        System.out.println("Enter Account holder Addhar Number : ");
        addharnumber=input.nextLong();
        balance=0;
    }
    void getAccount(){
        System.out.println("*****Account holder details***** ");
        System.out.println("Account holder Number is : "+accountNumber);
        System.out.println("Account holder Name is : "+Name);
        System.out.println("Account holder Mobile Number is : "+mobilenumber);
        System.out.println("Account holder Addhar Number is : "+addharnumber);
    }
    void setdeposit(){
        System.out.print("Enter deposit amount : ");
        double amount;
        amount = input.nextDouble();
        balance+=amount;
        System.out.println("$ " + amount + " deposited successfully.");
        System.out.println("Current amount : "+balance);
    }
    void setwithdraw(){
        System.out.print("Enter Withdraw amount : ");
        double amount;
        amount = input.nextDouble();
        if (amount <= balance) {
            balance -= amount;
            System.out.println("$" + amount + " withdrawn successfully.");
        } else {
            System.out.println("Insufficient balance!");
        }
        System.out.println("Current amount : "+balance);
    }
    void currentBalance(){
        System.out.println("Current Balance is : "+balance);
    }
    public static void main(String[] args) {
        bankmanagementsystem bank = new bankmanagementsystem();
         while (true) {
            System.out.println("\n--- Bank Management System ---");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Display Account");
            System.out.println("5. Check Balance");
            System.out.println("6. Exit");
            System.out.print("Choose option: ");
            int choice = bank.input.nextInt();

            switch (choice) {
                case 1: 
                bank.setAccount(); 
                break;
                case 2: 
                bank.setdeposit(); 
                break;
                case 3: 
                bank.setwithdraw(); 
                break;
                case 4: 
                bank.getAccount(); 
                break;
                case 5: 
                bank.currentBalance(); 
                break;
                case 6: 
                    System.out.println("Exiting... Thank you!");
                    return;
                default: 
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
