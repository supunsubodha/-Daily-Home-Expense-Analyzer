🏠 Daily Home Expense Analyzer
A Java-based utility designed to help users log daily expenditures, categorize them, and monitor their budget limits in real-time.

🌟 Key Features
Categorization: Supports four main categories: Food, Transport, Bills, and Other.
Smart Alerts: Automatically flags individual expenses over Rs. 1,000 as "High Expense."
Input Validation: * Skips zero-value entries.
Terminates entry if a negative value is detected to prevent data corruption.
Budget Monitoring: Compares total daily spending against a Rs. 5,000 limit and provides a status report.
Statistical Summary: Calculates both total and average spending per session.

📊 System Logic
The program follows a linear flow to ensure data integrity before calculating the final summary.

Validation Rules:

Amount > 1000	Triggers "High expenses detected!" warning
Amount == 0	Entry is skipped
Amount < 0	Program stops taking new entries
Total > 5000	Flagged as "Exceeded daily budget"

💻 How to Use
Setup
Ensure you have the JDK installed.
Save the code as Main.java.

Execution
javac Main.java
java Main

User Journey

Enter your name.
Define how many items you want to log.
For each item, enter the Amount and the Category ID (1-4).
View the generated Daily Expense Summary.

📝 Sample Output

====DAILY HOME EXPENSE ANALYZER====
Expense Categories: 
 1 - Food
 2 - Transport
 3 - Bills
 4 - Other
-----------------------------------
Enter name: John Doe
Enter number of expenses: 2

Enter expense 1 amount: 1200
High expenses detected!
Select category (1-4): 1

Enter expense 2 amount: 300
Select category (1-4): 2

----- DAILY EXPENSE SUMMARY ------
Name: John Doe
Total expense: Rs. 1500.0
Average expense: Rs. 750.0
Expenses are within budget.
