# Reflection

## Day 4: Review

*Language: Java*

*IDE: Coderunner*


### Solving the problem

Identify the subtasks! In this instance we were to:

- For a string `S`, print its even indexed characters, a space, then its odd indexed characters where 0 is considered an even index

*Game Plan*

> Write a loop that will iterate over the string
> If the character at index `i` is even, then print it
> If it is odd, collect it
> After the loop is done print a space
> Then print the collected odd characters

### C vs. Java
|  | Java | C |
|---|---|---|
| Array Instantiation  | `char[] c = new char[n]` | `char* c = (char*)malloc(n*sizeof(char))` |
| String Manipulation | `String s = "Hello World"`<br><br>`s.length()`<br><br>`char c = s.charAt(i)`<br><br>`s += c` | `char* s = "Hello World"`<br><br>`strlen(s)`<br><br>`char c = s + i`<br><br>must use a custom function which manipulates the array directly (no built-in function) |
| Reading from STDIN | `BufferedReader br = new BufferedReader(new InputStreamReader(System.in));`<br>`String line = br.readLine() \\throws IOException`<br><br>`int N = Integer.parseInt(line) \\throws NumberFormatException` | `scanf("%s %d", &line, &N)` |
| Output to STDOUT | `System.out.println(line)` | `printf("%s",line)` |

### Choosing a language

For testing that is *timed* use a language you know best. While it's good to challenge yourself in a *practice* environment, when time is more important and a specified language is not a requirement, use something you're familiar with to show your ability to solve the problem without syntax interfering.
