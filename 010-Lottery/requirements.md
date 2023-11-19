# Practical 010 - Lottery Winnings, Version 1: First Conditional Statements

## Goal
To use if and else to control the flow of a program. This foundational skill is crucial for creating dynamic applications.

## Requirements
Please refer to the requirements on the platform you subscribed to.

## Template
If you don't know where to start:

```java
public class LotteryWinnings {
    public static void main(String[] args) {
        int electricityBill = 341;
    }
}
```

## Tip
1. Variables: Start by declaring variables for each of the amounts mentioned (lottery winnings, car price, rear parking sensor, alloy wheels, loan repayment, and electricity bill).
2. Calculation: Calculate the total amount left after all expenses. Store this in a variable named `total`.
3. Conditional Statements: Use an `if` statement to check whether the total is positive or negative.
4. Output: Print the appropriate message based on the condition.

## Explanations
1. Variables: We declare variables for each amount to keep track of them. This makes the code easier to read and modify later.

```java 
int lotteryWinnings = 25000;
int loanRepayment = 5000;
int electricityBill = 341;
int carPrice = 18000;
int backupSensorPrice = 450;
int rimPrice = 900;
```

2. Calculation: We calculate the total amount left after all expenses and store it in a variable named total.

```java
int total = lotteryWinnings - loanRepayment - electricityBill - (carPrice + rimPrice + backupSensorPrice);
```

3. Conditional Statements: We use the `if` to check if the total is positive or negative.

```java
if (total >= 0) {
   //
}
else {
    //
}
```

4. Output: Depending whether the condition is met or not, the program will print one of the two messages, either indicating that you can afford the car and how much you'll have left, or that you can't afford the car and how much more you need.