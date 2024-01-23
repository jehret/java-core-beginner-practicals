# Practical 007 - A game of marbles: Increment / Decrement Operators

## Goal
In this exercise, you will be able and apply increment and decrement operators in Java.

## Requirements
Please refer to the requirements on the platform you subscribed to.

## Template
If you don't know where to start:

```java
public class Marbles {
    public static void main(String[] args) {
        
    }
}
```

## Tip
To solve this exercise, you'll need to use a single integer variable to keep track of the number of marbles Louis has.
You'll start by initializing this variable to 10.
Then, you'll use the decrement (`--`) operator to subtract 2 marbles that Peter takes and the increment (`++`) operator to add the 1 marble that Louis gains back from Tom.
Finally, you'll print the initial and final number of marbles using `System.out.println()`.

## Explanations
1. Declare an integer variable, let's call it `marbles`, and initialize it to 10.
2. Print the initial number of marbles with the message "N`umber of marbles at the beginning of the game:`".
3. Use the decrement operator `--` twice to represent the 2 marbles that Peter takes from Louis.
4. Use the increment operator `++` once to represent the 1 marble that Louis gains back from Tom.
5. Print the final number of marbles with the message "`Number of marbles at the end of the game:`".