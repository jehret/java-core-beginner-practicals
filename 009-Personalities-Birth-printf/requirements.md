# Practical 009 - When were they born? - String formatting

## Goal
We'll repeat the previous exercise, using string formatting to combine strings and variables in Java.

## Requirements
Please refer to the requirements on the platform you subscribed to.

## Template
If you don't know where to start:

```java
public class BirthFormatting {
    public static void main(String[] args) {
        int year;
        String firstName, lastName, day, month;
    }
}
```

## Tip
Use the placeholder `%d` for the year and `%s` for the other variables.
Please note that, unlike `println`, `printf` does not perform a line feed after display, so you'll need to add the line feed to the formatting string using a `\n`.

## Explanations
Declare variables for day, month, year, first name and last name. The year must be of type int, and the rest must be of type String.

```java
int year;
String first name, last name, day, month;
```

Create a format string that corresponds to the sentence to be displayed, remembering the line feed.

```java
String format = "%s %s was born on %s/%s/%d\n";
```

Assign the appropriate values to these variables for each person.

```java
first name = "Maryline"; last name = "Monroe"; day = "01"; month = "06"; year = 1926;
```

Display the sentence.

```java
System.out.printf(format,firstname,lastname,day,month,year);
```

Repeat steps 3 and 4 for each famous person.