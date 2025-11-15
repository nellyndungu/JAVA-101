# JAVA-101
Basics of Java Programming.
### Java uses: 
- Mobile and Web applications
- Desktop applications
- Database connection
### Software Tools
- Install Java SDK
- Install IntelliJ Community Version
### Introduction
- Every Java application begins with a class name that must match the filename.
- The .java file must be located in the 'src' folder to be compiled.
-  The 'src' file must be a root source folder.
-  Java can only run a java class if it finds the main entry point
-  Every code must be in a class.
### The main() method
- The program starts to run from the `main(String[] args)`
### Java Output
- To print out and include a new line use: `System.out.println()`
- To print out without including a new line use: `System.out.print()`
- Text to be printed is wrapped in double quotes
### Comments
- One-line comment syntax -> `// comment`
- Multiple lines comment syntax -> `/* comment */`
### Variable Definition
- String - stores text sorrounded by double quotes.
- int - stores whole numbers.
- float - stores decimal point numbers.
- char - stores single character wrapped in single quote.
- boolean - stores True/False states.
- final - used to define variabbles whose value remains constant and can't be changed within the program.
### Data Types
- Primitive Data Types - Specifies type of variable and kind of vaues it can hold.
    - byte - represent 8-bit whole numbers (-128 to 127)
    - short - represent 16-bit whole numbers (-32768 to 32767)
    - char - represent one character and unicode character values.
    - int - represent 32-bit whole numbers.
    - long - represents 64-bit whole numbers. 
    - float - represents 32-bit decimal values. The values ends with 'f' eg `float num = 4l`;
    - double - represents 64-bit decimal values. The values ends with 'd' eg `double num = 4d`;
- Non-primitive Data Types - data types that refer to objects. They include class, array, String.
- `var` - Introduced in Java 10, allows java to automatically detect data type. Can be used when handling complex data types to make code shorter and easy to read
### Java Type Casting
Casting is converting one data type to another. 
Types of casing: 
- Widening casting(automatic) - converts smaller types to larger types.
    - byte -> short -> char -> int -> long -> float -> double. 
- Narrowing casting (manual) - converts larger types to smaller types.
    - double -> float -> long -> int -> char -> short -> byte.
    - **Syntax**: `largeType variable_Name = (smallerType) newVariable_Name;`
 ### Arrays
 - Store multiple values in a single variable.
 - The array variables are defined using square brackets `[]`.
 - **Syntax**: `dataType[] variable_Name;`
 - To print arrays using `println()`, the array is converted to a string.
 - The conversion requires built-in `util`library to be imported as follows: `import java.util.Arrays;`
### Boolean Operator
- Used to determine logic between variables or values.
    - Equal to -> `==` -> Returns true when both statements are equal.
    - Logical NOT -> `!=` -> returns true id statements are not equal.
### Comparison Operator
- Compares two values or variables. When comparing strings or objects use the `.equals()` method. 
    - Equal to -> `==`
    - Not Equal -> `!=`
    - Greater than -> `>`
    - Less than -> `<`
    - Greater than or equal to -> `>=`
    - Less than or equal to -> `<=`
### Logical Operators
- They evaluate the logic between variables or values
    - Logical AND -> `&&` Returns true if both statements are true.
    - Logical OR -> `||` Returns true if one of the statements is true.
    - Logical NOT -> `!` Reverses the results. Returns false if the result is true.
### Arithmetic Operators
- Perform Mathematical operations
  - Addition -> `+`
  - Subtraction -> `-`
  - Multiplication -> `*`
  - Division -> `/`
  - Modulus -> `%` Returns the division remainder
  - increment -> `++`
  - Decrement -> `--`
### Operatore Precedence
- Order of operations when there is multiple operators.
- Oder from highest to lowest priority
Paranthesis`()` -> `*` -> `\` -> `%` -> `+` -> `-` -> `>` -> `<` -> `>=` -> `<=` -> `==` -> `!=` -> `&&` -> `||` -> `=`


      
 
