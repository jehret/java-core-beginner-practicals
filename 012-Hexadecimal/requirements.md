# Practical 012 - Hexadecimal: The switch - case Conditional Structure
## Goal
The objective of this exercise is to implement the switch-case conditional structure in Java. As a practical example, we'll use the structure for handling hexadecimal values.

## Requirements
Please refer to the requirements on the platform you subscribed to.

## Template
If you don't know where to start:

```java
public class Hexadecimal {
    public static void main(String[] args) {
        char hexadecimalValue = 'C';
        switch (hexadecimalValue) {
            case '0':
            ...
            
        }
    }
}
```

## Tip
1. Use a switch statement to handle each possible hexadecimal character ('0' to '9' and 'A' to 'F').
2. For characters '0' to '9', simply return the character as it is.
3. For characters 'A' to 'F', return their corresponding decimal values.
4. Use a default case to handle invalid characters and display an error message.

## Explanations
1. The switch statement will be used to evaluate the given character.
2. Cases for '0' to '9' will simply return the character itself, as it's the same in both decimal and hexadecimal.
As the provided solution suggests, you can simply put this instruction for character '9' only, as long as there is no `break` to interrupt the processing of previous cases.
3. Cases for 'A' to 'F' will return their decimal equivalents (A=10, B=11, etc.).
4. A default case will catch any character that is not a valid hexadecimal digit and display an error message.
5. When the switch is applied to the character 'C', it will return 12, as 'C' in hexadecimal is equivalent to 12 in decimal.