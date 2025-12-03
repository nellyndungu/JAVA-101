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
- String - stores text surrounded by double quotes.
- int - stores whole numbers.
- float - stores decimal point numbers.
- char - stores single character wrapped in single quote.
- boolean - stores True/False states.
- final - used to define variables whose value remains constant and can't be changed within the program.
### Data Types
- Primitive Data Types - Specifies type of variable and kind of values it can hold.
    - byte - represent 8-bit whole numbers (-128 to 127)
    - short - represent 16-bit whole numbers (-32768 to 32767)
    - char - represent one character and Unicode character values.
    - int - represent 32-bit whole numbers.
    - long - represents 64-bit whole numbers. 
    - float - represents 32-bit decimal values. The values ends with 'f' eg `float num = 4l`;
    - double - represents 64-bit decimal values. The values end with 'd' eg `double num = 4d`;
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
 - Fixed size that is set when declared and remains static throughout the program.
 - It stores objects and primitives. 
 - They cannot store non-primitive types directly
 - The array variables are defined using square brackets `[]`.
 - **Syntax**: `dataType[] variable_Name;`
 - Individual elements are accessed using index e.g., `myArray[0]` for first element. 
 - To print arrays using `println()`, the array is converted to a string.
 - The conversion requires built-in `util`library to be imported as follows: `import java.util.Arrays;`
### ArrayList
- A class with resizable size and the size doesn't need to be set at declaration. 
- Stores objects only. 
- To use ArrayList, import java.util.
- ArrayList are modified using methods such as:
  - `add()` - adding elements. Position can be specified using index.
  - `get(index)` - get the specified element. 
  - `set(index, value)` - modify an existing element.
  - `remove(index)` - Delete an element. 
  - `clear()` - Clear all elements in the array
  - `size()` - get the number of elements in the array. 
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
### Operators Precedence
- Order of operations when there is multiple operators.
- Oder from highest to lowest priority
Parenthesis`()` -> `*` -> `\` -> `%` -> `+` -> `-` -> `>` -> `<` -> `>=` -> `<=` -> `==` -> `!=` -> `&&` -> `||` -> `=`
### Java Strings
- Store text surrounded by double quotes.
- String Length
  - Length of string is found using -> `length()`.
### If...Else
`if` statements need condition that result to either true or false.
Comparison operators are used to check for conditions. 
Syntax: `if(condition) {
... block ofcode...}`
- If without braces only executes the first line after the if statement. 
### While Loop
- The while loop requires a condition and repeats while the condition is true.
- The condition is validated before the entering loop.
- Syntax -> `while(condition){..statement..}`
- A while loop must have a break point to avoid having infinite loops to avoid system crash.
### Do while Loop
- Used in instances where loop is executed once before checking the condition. 
- For instance when connecting to a database once and if it fails the connection program is run again.
- Syntax: `do{..statement..} while(condition);`
### Iterators
These are part of Java collection framework, and they can loop through collection classes.
Declaration of Iterators: `Iterator<type> variableName = variableName.iterator()`
- Methods: 
    - `next()` -> Returns the first element in an array. 
    - `hasNext()` -> Returns a boolean value as it iterates through all elements in an array.
    - `remove()`-> Removes the elements from an array. Position of element is specified using index. 

### Map Interface
Map interface is used to store a pair containing a key and its value. The key
is used to get the value.The map interface consists of the  following classes: HashMap, TreeMap and LinkedHashMap. 
These classes use the following methods:
- `put()` -> For adding elements into the object.
- `get()` -> To access an element in the object.
- `remove()` -> To remove an element in the object.

### HashSet
The hashset class stores elements in containers. It uses similar methods as the hashmaps and has an additional
element for checking existence of an element:
- `contains()` -> Returns a boolean value true when the element exists in the object.