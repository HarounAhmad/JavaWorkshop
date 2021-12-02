# Java Basics


1. Variables and data types
2. Methods
3. If, else if, else
4. Switch Statements
5. Loops
6. Operators
7. Arrays
8. OOP (Object Oriented Programming)
9. Classes and Objects








## Variables and data types

Variables are containers for storing data values.
In Java there are different types of variables (defined with different keywords), for example:
- int - stores integers without decimal places, e.g. 123 or -123
- double - stores floating point numbers with decimal places, e.g. 19.99 or -19.99
- char - stores single characters, e.g. 'a' or 'B'. Character values are surrounded by single quotes.
- string - stores text, e.g. "Hello World". String values are surrounded by double quotes. boolean - stores values with two states: true or false.

***Syntax***

` type variableName = value; `

***Examples***

` int myNum = 15; `

` String word = "You can write anything here" `



**Constants**

However, you can add the const keyword if you don't want others (or yourself) to overwrite existing values 
(this declares the variable as "constant", which means it is immutable and read-only):

```

    const int myNum = 15;
    
    myNum = 20; // throws error

```


## Methods


A method is a block of code that is executed only when it is called. You can pass data, called parameters, to a method.
Methods are used to perform certain actions, and they are also called functions.
Why use methods? To reuse code: define the code once and then use it multiple times.
All methods require a return, except those that use the void type.
Returning data from a function can be used in several ways, as you will see in the following examples
the keyword "static" means that the function is the same in all instances, e.g. in a Video Game, if you create the function enemyDeath(), each enemy will have the same death behavior, but each enemy can die individually, but if you add the keyword "static": static enemyDeath(), then all enemies with this function in the script will die simultaneously when an enemy reaches this function

***Syntax***

```

    class Program{
        AccessModifier type name() {
        // code to be executed
        }
    }

```


***Examples***

```
   
    public void MyMethod() {
        System.out.println("this is a void so there will not be a return");
    }

```


```
    int MyMethod() { 
        int i = 5
        System.out.println("this is an int method so if there is no return you will get an error");
        return i;
    }
```

This method can be used as follows:

```
    void main() {
        int x = 0; //integer x is declared with a value of 0
        x = MyMethod(); //var x wants to be equal to the return value of MyMethod()
        System.out.println(x); // the compiler will now output the new value of x which is now 5
    }   
```





```
    boolean myMethod(){
        boolean i = true;
        System.out.println("this is a boolean method so if there is no return java will throw an error");
        return i;
    }
```

This method can be used as follows:

```
    void main() {
        boolean x = false; //boolean x is declared with a value of false
        x = MyMethod(); //var x wants to be equal to the return value of MyMethod()
        System.out.println(x); // the compiler will now output the new value of x which is now true
    }   
```





## If, else if, else

Java supports the usual logical conditions from mathematics:
Less than: a < b
Less than or equal to: a <= b Greater than: a > b
Greater than or equal to: a >= b Equal to: a == b
Not equal: a != b
You can use these conditions to perform different actions for different decisions.
Java has the following conditional statements:
Use if to specify a block of code that will be executed if a particular condition is met.
Use else to specify a block of code to execute when the same condition is false.
Use else if to specify a new condition that will be tested if the first condition is false. Use switch to specify multiple alternative code blocks to be executed.


***Syntax***


```
    if (condition1){
        // block of code to be executed if condition1 is True
    }
    else if (condition2) {
        // block of code to be executed if the condition1 is false and condition2 is True
    }
    else{
        // block of code to be executed if the condition1 is false and condition2 is False
    }
```



***Examples***

```
    int time = 22; 
    
    if (time < 10) {
        System.out.println ("Good morning.");
    }
        else if (time < 20) { System.out.println("Good day");
    }
    else {
        System.out.println ("Good evening.");
    }

    // Outputs "Good evening."
```



**Short Hand If...Else (Ternary Operator)**

***Syntax***


```
    variable = (condition) ? expressionTrue : expressionFalse;
```


Instead of writing:

```
    int time = 20;

    if (time < 18) {
        System.out.println ("Good day.");
    }

    else {
        System.out.println("Good evening.");
    }
```

You can simply write:

```
    int time = 20;
    String result = (time < 18) ? "Good day." : "Good evening."; System.out.println(result);
```




## Switch Statements

Use the switch statement to select one of several code blocks to execute.

***Syntax***

```
    switch(expression)
    {
        case x:
            // code block
        break; 
        case y:
            // code block
        break; 
        default:
            // code block
        break;
    }
```



This works as follows:
The switch expression is evaluated once
The value of the expression is compared to the values of each case If there is a match, the corresponding code block is executed.
The keywords break and default are described later in this chapter.
The following example uses the weekday number to calculate the name of the weekday:
Use the switch statement to select one of several code blocks to execute.


***Examples***


```
    int day = 4;
    switch (day)
    {
        case 1:
            System.out.println("Monday");
        break;
        case 2:
            System.out.println("Tuesday");
        break;
        case 3:
            System.out.println("Wednesday");
        break;
        case 4:
            System.out.println("Thursday");
        break;
        case 5:
            System.out.println("Friday");
        break;
        case 6:
            System.out.println("Saturday");
        break;
        case 7:
            System.out.println("Sunday");
        break;
    }
    // Outputs "Thursday" (day 4)
```

**The key word "break"**

When Java reaches a break keyword, it breaks out of the switch block.
This stops the execution of further code and drop tests within the block.
When a match is found and the task is done, it is time for a break. There is no need for further testing.

**The key word "default"**


The default keyword is optional and specifies a code to be executed if there is no case match:

```
    int day = 4;
     switch (day)
    {
    case 6:
        System.out.println("Today is Saturday"); 
    break;
    case 7:
        System.out.println("Today is Sunday");
    break;
    default:
        System.out.println("Looking forward to the Weekend");
    break;
    }

    // Outputs "Looking forward to the Weekend."
```


## Loops

Loops can execute a block of code until a certain condition is met. Loops are convenient because they save time, reduce errors, and make code more readable.

**Java while Loop**

The while loop runs through a block of code as long as a certain condition is met:

***Syntax***

```
    while (condition)
    {
        // code block to be executed
    }
```


***Example***

In the following example, the code in the loop is executed again and again as long as a variable (i) is less than 5:
```
    int i = 0; while (i < 5)
    {
        System.out.println(i); 
        i++;
    }
```

**Java for loop**

***Syntax***

```
    for (statement 1; statement 2; statement 3)
    {
        // code block to be executed
    }
```

- Statement 1 is executed (once) before the code block is executed.
- Statement 2 defines the condition for the execution of the code block.
- Statement 3 is executed (each time) after the code block has been executed.

***Example***

The following example outputs the numbers 0 to 4:

```
    for (int i = 0; i < 5; i++)
    {
        System.out.println(i);
    }
```



**Java foreach Loop**

***Syntax***

```
    foreach (type variableName : arrayName)
    {
        // code block to be executed
    }
```

***Example***
```
    String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
    foreach (String i in cars)
    {
        System.out.println(i);
    }
```


## Operators

Operators are used to perform operations on variables and values. In the following example, we use the + operator to add two values:

```
    int sum1 = 100 + 50; // 150 (100 + 50) 
    int sum2 = sum1 + 250; // 400 (150 + 250) 
    int sum3 = sum2 + sum2; // 800 (400 + 400)
```

| Operator | Name | Description | Example |
| ----------- | ----------- | ----------- | ----------- |
| `+` | Addition | Adds two values together | `x + y` |
| `-` | Subtraction | Subtracts one valuefrom another | `x - y` |
| `*` | Multiplication | Multiplies two values | `x * y` |
| `/` | Division | Divides one value from another | `x / y` |
| `%` | Modulus | Returns the remainder of the Division | `x % y` |
| `++` | Increment | Increases the value of a variable by 1 | `x++` |
| `--` | decrement | Decreases the value of a variable by 1 | `x--` |
| `=` | equals | assigns a value to a variable | `x = 5` |
| `+=` | Addition assignment | The addition assignment operator adds the value of the right operand to a variable and assigns the result to the variable. | `x += 5` |
| `-=` | Subtraction assignment | The subtraction assignment operator subtracts the value of the right operand from a variable and assigns the result to the variable. | `x -= 5` |
| `*=` | Multiplication assignment | The multiplication assignment operator multiplies a variable by the value of the right operand and assigns the result to the variable. | `x *= 5` |
| `/=` | Division assignment | The division assignment operator divides a variable by the value of the right operand and assigns the result to the variable. | `x /= 5` |
| `==` | Equality | checks whether its two operands are equal, returning a Boolean result. | `x == y` |
| `!=` | Inequality | checks whether its two operands are not equal, returning a Boolean result. | `x != y` |
| `>` |  greater than | The greater than operator returns true if the left operand is greater than the right operand, and false otherwise | `x > y` |
| `<` |  less than | The less than operator returns false if the left operand is greater than the right operand, and false otherwise | `x < y` |
| `>=` |  Greater than or equal | The greater than or equal operator returns true if the right operand is less than or equal to the left operand, and false otherwise | `x >= y` |
| `<=` |  less than or equal | The less than or equal operator returns true if the left operand is less than or equal to the right operand, and false otherwise | `x <= y` |
| `&&` |  Logical and | Returns true if both statements are true | `x < 5 && x < 10` |
| `&#124;&#124;` |  Logical or Returns true if one of the statements is true | `x < 5 &#124;&#124; x < 10` |
| `!` |  Logical not | Reverses the result, returns false if the result is true | `!(x < 5 && x < 10)` |

