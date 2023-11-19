# Practical 011 - Lottery Winnings, Version 2: Use if, else if, and else.

## Goal
The learning objective for this exercise is to understand how to use if, else if, and else statements in Java for more complex conditional logic.

## Requirements
Please refer to the requirements on the platform you subscribed to.

## Template
If you don't know where to start:

```java
public class LotteryWinningsElseIf {
    public static void main(String[] args) {
        int electricityBill = 341;
    }
}
```

## Tip
1. Start by defining variables for all the amounts mentioned: the tax bill, the found 50-dollar bill, the car price, and the prices of optional features.
2. Calculate the total amount of money you have left after paying off the tax bill and adding the found 50-dollar bill.
3. Use `if-else if-else` statements to check the following conditions:
- If you have enough money to buy the car with all the options, display the first message.
- If you have enough money to buy just the car without the options, display the second message.
- If you can't afford the car at all, display the third message.

Remember to replace the "<>" in the messages with the actual amounts calculated.

## Explanations
The code calculates the remaining amount of money after various expenses and investments, with the same logic as the previous exercise. It then decides whether you can afford a car with additional features or not.
The code uses `if`, `else if`, and `else` statements to handle different scenarios:

If you have enough money for the car and the options, it prints how much will be left.
If you have enough for the car but not the options, it prints how much more you need for the options.
If you can't afford the car, it prints how much more you need.