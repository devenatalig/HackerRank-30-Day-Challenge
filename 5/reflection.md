# Reflection

## Day 5: Loops

*Language: Python*

*IDE: CodeRunner*


### Solving the problem

Identify the subtasks! In this instance we were to:

- Given an integer `n`, print the first 10 multiples

### String formatting

Python uses `{}` as placeholders for arguments to be specified in `format()`
*Example:*

```python
myString = "The number {} and my message {}"
myNumber = 100
myMessage = "Hello World"

print(myString.format(myNumber, myMessage)
# The number 100 and my message Hello World
```

### For-loops

For-loops have the form:

```python
for i in range(start,stop,steps):
	# do something
```

> Note: `range` increments from `start` and not inclusive of `stop`
> i.e. start ≤ i < stop
