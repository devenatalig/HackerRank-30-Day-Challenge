# Reflection

## Day 2: Operators

*Language: Java*

*IDE: HackerRank in Browser IDE*


### Solving the problem

Identify the subtasks! In this instance we were to:

1) Find tax dollar amount from percent
2) Find tip dollar amount from percent
3) Find the total cost of the meal
4) Print the total cost of the meal

### Math.round()

The datatype of the parameter determines the datatype of the output! For instance:

```java
int i = Math.round(float f) //YAY!
long l = Math.round(double d) //YAY!
int j = Math.round(double d) //BOO! Error!
```
You will get a lossy conversion error if parameters are not matching!

