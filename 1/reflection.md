# Reflection

## Day 1: DataTypes

*Language: Java*

*IDE: IntelliJ*

### Completing HackerRank Prompts

Avoid latest Java version. It can be kinda confusing O_O Use earlier java versions your more familiar with.

### Solving the problem

Identify the subtasks! In this instance we were to:

1) collect and store three values from standard input (an int, a double, and a string)
2) use the `+` operator to sum our variables `myInt` and `myDouble` with `i` and `d` respectively as well as concat our string `myString` with `s`
3) print the result of using the `+` operator

### Scanner.nextLine()

When the `nextLine()` method is invoked after several other single character methods like `next()` and `nextInt()`, it will return an empty string. To get a non-empty string, you must invoke another `nextLine()` so that it will read to the end of the next line, and not the end of the current line which is after the character captured by `next()`.

**Example:**

```java
//Read lines from stdin
Scanner stdin = new Scanner(System.in);

System.out.print("Enter a double: ");
myDouble = stdin.nextDouble();

stdin.nextLine(); //Skip empty string line
System.out.print("Enter a string: ");
myString = stdin.nextLine();

stdin.close();

```
