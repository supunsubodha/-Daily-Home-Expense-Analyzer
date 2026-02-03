
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("====DAILY HOME EXPENSE ANALYZER====");
        System.out.println("Expense Categories: ");
        System.out.println(" 1 - Food\n 2 - Transport\n 3 - Bills\n 4 - Other" );
        System.out.println("-----------------------------------");
        System.out.print("Enter name: ");
        String personName = sc.nextLine();
        System.out.print("Enter number of expenses: ");
        int numOfExpenses = sc.nextInt();

        float total = 0;
        int category;
        float amount;
        int amountCount=0;
        for(int i=0;i<numOfExpenses;i++){
            System.out.print("Enter expense "+ (i+1) +" amount: ");
            amount = sc.nextFloat();
            if(amount>1000){
                System.out.println("High expenses detected!");
            } else if (amount == 0) {
                continue;
            } else if (amount<0) {
                System.out.println("Expense entry stopped due to invalid amount.");
                break;
            }
            amountCount++;
            System.out.print("Select category (1-4): ");
            category = sc.nextInt();
            if(category<0 || category > 5){
                System.out.println("Invalid category - counted as other.");
            }
            total = total+amount;
        }
        float average = total/amountCount;
        System.out.println("----- DAILY EXPENSE SUMMARY ------");
        System.out.println("Name: "+personName);
        System.out.println("Total expense: Rs. "+total);
        System.out.println("Average expense: Rs. "+average);
        if(total>5000){
            System.out.println("You exceeded your daily budget");
        }else{
            System.out.println("Expenses are withing budget.");
        }
        sc.close();
    }
}