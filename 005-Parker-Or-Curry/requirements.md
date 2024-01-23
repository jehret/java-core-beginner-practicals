# Practical 005 - Stephen Curry or Tony Parker: Relational Operators

## Goal
By the end of this exercise, you will be able to understand and apply relational operators in Java to compare variables and make decisions.

## Requirements
Please refer to the requirements on the platform you subscribed to.

## Template
If you don't know where to start:

```java
public class CurryOrParker {
    public static void main(String[] args) {
        
    }
}
```

## Tip
To compare the heights of Stephen Curry and Tony Parker, you'll first need to convert both measurements to the same unit.
You can convert Stephen Curry's height from feet to millimeters using the conversion factor of 1 foot = 304.8 mm.
Once both heights are in the same unit, you can then use a relational operator to compare them and determine if the statement "Stephen Curry is taller than Tony Parker" is true or false.

# Explanation
1. Unit Conversion: The first step is to convert Stephen Curry's height to centimeters so that we can compare it with Tony Parker's height. The conversion factor is 1 foot = 304.8 mm.
- Formula: Stephen Curry's height in mm = 6.3 ft * 304.8 mm/ft

2. Comparison: After converting the height to the same unit, we use a relational operator to compare the two heights.
- Formula: Stephen Curry's height in mm > Tony Parker's height in mm

