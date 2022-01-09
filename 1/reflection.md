# Reflection

## Day 1: DataTypes

*Language: Java*

*IDE: IntelliJ*

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