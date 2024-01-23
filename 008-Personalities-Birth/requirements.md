# Practical 008 - When were they born? : Concatenation Operator

## Goal
In this exercise, you will experience the use of the concatenation operator to combine strings and variables in Java.

## Requirements
Please refer to the requirements on the platform you subscribed to.

## Template
If you don't know where to start:
```java
public class Birth {
    public static void main(String[] args) {
        int year;
        String firstName, lastName, day, month;
        
    }
}
```

## Tip
To solve this exercise, you'll need to use string concatenation and variables.
Declare variables for the day, month, year, first name, and last name for each famous person.
Use the `+` operator to concatenate these variables into a complete sentence that describes when each person was born.
Make sure to use an `int` type for the year and `String` types for the other variables.

## Explanations
Declare variables for day, month, year, first name, and last name. The year should be of type int, and the rest should be of type String.

```java
int year;
String firstName, lastName, day, month;
```

Assign the appropriate values to these variables for each person.

```java
firstName = "Maryline"; lastName = "Monroe"; day = "01"; month = "06"; year = 1926;
```

Use string concatenation to form the sentence.
```java
System.out.println(firstName + " " + lastName + " was born on " + day + "/" + month + "/" + year);
```
Repeat steps 2 and 3 for each famous person.