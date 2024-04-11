# JAVA

## Understanding the Java Ecosystem: JDK, JRE, and JVM

### Java Development Kit (JDK)

*   **Definition:** The JDK is a comprehensive software development kit that provides everything you need to develop, debug, and run Java applications.
*   **Components:**
    *   **Java Runtime Environment (JRE):** Used to run Java applications.
    *   **Development Tools:**
        *   **javac:** Java compiler to convert Java source code into bytecode.
        *   **java:** Java interpreter to execute Java bytecode.
        *   **jar:** Utility for packaging Java classes into JAR (Java Archive) files.
        *   **javadoc:** Generates API documentation from Java source code.
        *   **Debugger:** Helps identify and fix errors in your code.
*   **Who needs it?:** Anyone who wants to develop Java applications.

### Java Runtime Environment (JRE)

*   **Definition:** The JRE is a software environment that provides the minimum requirements for running compiled Java applications.
*   **Components:**
    *   **Java Virtual Machine (JVM):** Interprets and executes Java bytecode.
    *   **Core Libraries:** Provides essential functionalities like input/output, networking, and collections.
*   **Who needs it?:** Anyone who wants to run Java applications on their system.

### Java Virtual Machine (JVM)

*   **Definition:** The JVM is an abstract computing machine that enables a computer to run Java programs. It is the core component of the JRE and is responsible for interpreting and executing Java bytecode.
*   **Key Features:**
    *   **Platform Independence:** Allows Java applications to run on any system with a compatible JVM, regardless of the underlying operating system. (Write Once, Run Anywhere)
    *   **Automatic Memory Management:** Handles memory allocation and reallocation, reducing the risk of memory leaks.
    *   **Security:** Provides a secure environment for running Java applications.
*   **Who needs it?:** Developers don't directly interact with the JVM. It's automatically used when running Java applications through the JRE.

### Relationship between JDK, JRE, and JVM
*   **JDK:** Contains the JRE and additional development tools.
*   **JRE:** Contains the JVM and core libraries needed to run Java applications.
*   **JVM:** The core component of the JRE that executes Java bytecode.

### Summary

*   **Develop Java Applications:** Use the JDK.
*   **Run Java Applications:** Use the JRE.
*   **Execute Java Bytecode:** The JVM does this within the JRE.

### Difference 

| Component                          | Description                                                               | Includes                                           |
|------------------------------------|---------------------------------------------------------------------------|----------------------------------------------------|
| **JDK (Java Development Kit)**     | A complete development environment for building Java applications.        | JRE + Development tools (compiler, debugger, etc.) |
| **JRE (Java Runtime Environment)** | Provides the minimum requirements for running compiled Java applications. | JVM + Core libraries (e.g., java.lang, java.util)  |
| **JVM (Java Virtual Machine)**     | Interprets and executes Java bytecode, providing platform independence.   | -                                                  | 

---
## Functions

### Types of functions: -
* No Return type—No Argument++
* With Return type—No Argument
* No Return type—With Argument
* With a Return type—With Argument

### To Call Method: -
Function_Name();

### Rules For Return Type: -
1. The Line Of Code After the Return Statement will not execute.
2. Return statements will not be allowed in the loop.
3. Return Statement Will Return Only One Value.

### Method OverLoading: -
1. You can change parameters When you have the same return type.
2. If the number of parameters is the same, we need to change the datatype.
3. You cannot just change the datatype of the arguments keeping the return type and the number of arguments the same for two methods.
---

## Constructor:-
1. Constructor should be the same name as the class name
2. There is no return type.
3. You can call a method inside the constructor.
4. We can use access Modifiers.
5. The constructor cannot be defined inside the constructor.

### Copy constructor
Here when we assign a constructor value, a constructor then it copies a constructor value to another.
#### Example: -
``` 
Constructor c = new Constructor();
Constructor c2 = new Constructor();
c2 = c;
``` 
---

### Difference between Method and construction
| Method                                                                                                    | Constructor                                                                             |
|-----------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------|
| User can decide The method name.                                                                          | Construction name and class name should be the same.                                    |
| Method needs to be explicitly called.                                                                     | The construction is called implicitly during the object creation.                       |
| Method has a return type.                                                                                 | Construction has no return type.                                                        |
| We can call a method in the constructor.                                                                  | You cannot call the constructor inside the constructor.                                 |
| When the method has the same name, it is method overloading we need to change the return type/parameters. | In construction, overloading with only different parameters.                            |
| A method is used to expose behaviour of object                                                            | it is used to initialize state of object                                                |
| It is not provided by compiler in any case                                                                | java compiler provides a default constructor if you don't have any constructor in class |
| They are inherited by subclass                                                                            | they are not inherited by subclass                                                      |
| The constructor is never static or final                                                                  | A method can be static or final                                                         |

---

## Exception :-
In Java, an Exception is an unwanted or unexpected event, which occurs during the execution of a program, i.e., at run time, that disrupts the normal flow of the program’s instructions. Exceptions can be caught and handled by the program. When an exception occurs within a method, it creates an object. This object is called the exception object. It contains information about the exception, such as the name and description of the exception and the state of the program when the exception occurred.

### Major reasons why an exception Occurs
* Invalid user input
* Device failure
* Loss of network connection
* Physical limitations (out-of-disk memory)
* Code errors
* Opening an unavailable file

### Exception Handling: -
It is used to handle exceptions using try-catch.

```
try{ 
    //code
}
Catch(ExceptionObjecct eo){ 
    //code
}
Final{ 
    //code
}
```
#### Example:-

```
class demo{
public static void main(String[] args){
    int a=10 , b = 5 , c = 5;
    try{
       int x = a/(b-c);
    }
    catch(arithmeticexception e){
       sout("divide by zero .");
    }
       int y = a/(b+c)
       sout(y)
    }
}
```
So In Java Errors that cannot be handled by the user or programmer

Ex:—       
Virtual matching error, Stack Overflow, Out of Memory error, etc.

### Types of exceptions: -
1. IO Exception
2. SQLException
3. ClassNotFoundException
4. RuntimeException:—      
     1. ArithmeticException   
     2. NullPointerException   
     3. NumberFormetException       
     4. StringIndexException
     5. IndexOutOfBoundException  
        1) ArrayIndexOutOfBounds
        2) StringIndexOutOfBounds

### WRITE A PROGRAM USING MULTIPLE CATCH BLOCKS.

        try{

        }
        Catch(ExceptionObjecct eo){

        }Catch(ExceptionObjecct eo){

        }Catch(ExceptionObjecct eo){

        }
        Final{

        }

### Unchecked Exception: -
Exception predicted by the programmer, and it will handle at compile time.

### Checked Exception: -
Exception it will check at run time error.
It is comparable to handle check exceptions in the compiler.
Compiler tails it may be possible to come error at run time that the file has not found an exception,
so it is comparable to handle check exception.
We can handle check exceptions in two ways
1. Using Try Catch Block
2. Using throws keyword.

#### Example:-
// Using Try-Catch Block
``` 
try {
    Printwriter pw = new Printwriter("abc.txt");
}catch(FilenotfoundException e){
    sout("File Not Found.."+e.getMessage());
}
```

### Usage of Throws Keyword: -
* Throws keyword is used for checked exceptions.
* We can declare exceptions with the method signature using the throw keyword.
* We can declare multiple exceptions using the throw keyword.
* We can handle multiple exceptions at a time.
* throws Keyword Delegate the responsibility of exception handling to caller method.

### Syntax:-

    return_type method_Name() throws exception_class_Name{}

### Example:-

    public static void main(String[] args) throws FileNotFoundException , ClassNotFoundException{
        Printwriter pw = new Printwriter("abc.txt");
    }

---
## Access modifiers


| Access Modifier                 | Class | Package | Subclass | World | Description                                                                                                                     |
|---------------------------------|-------|---------|----------|-------|---------------------------------------------------------------------------------------------------------------------------------|
| `public`                        | Yes   | Yes     | Yes      | Yes   | Accessible from anywhere. There are no restrictions on access.                                                                  |
| `protected`                     | Yes   | Yes     | Yes      | No    | Accessible within the same class, package, and subclasses (even if the subclass is in a different package).                     |
| `no modifier` (package-private) | Yes   | Yes     | No       | No    | Accessible within the same class and package, but not from subclasses or outside the package.                                   |
| `private`                       | Yes   | No      | No       | No    | Accessible only within the same class. Not accessible from anywhere else, including subclasses or even within the same package. |

---
## Wrapper Class
* Java support-only calls by value, so we use a wrapper class.    
* Used to create a Reference of a variable.   
* It is used to provide a mechanism to convert primitive into object and object into primitive.   
* It has two types
  1. Autoboxing
  2. Unboxing

| Feature             | Autoboxing                                                                                          | Unboxing                                                                                          |
|---------------------|-----------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------|
| **Definition**      | Automatic conversion of primitive types to their corresponding wrapper objects.                     | Automatic conversion of wrapper objects to their corresponding primitive types.                   |
| **Process**         | The compiler implicitly creates a wrapper object for the primitive type.                            | The compiler implicitly extracts the primitive value from the wrapper object.                     |
| **Example**         | `int i = 10; Integer obj = i;`                                                                      | `Integer obj = 10; int i = obj;`                                                                  |
| **Purpose**         | Simplifies code by eliminating the need to explicitly create wrapper objects.                       | Allows direct use of primitive values from wrapper objects without explicit conversion.           |
| **Performance**     | May introduce slight overhead due to object creation.                                               | Generally more efficient than explicit casting.                                                   |
| **Usage Scenarios** | - Collections (which require objects) - Generics - Method parameters/return types requiring objects | - Arithmetic operations - Assignments to primitive variables - Comparisons using primitive values |

> **Note:** While autoboxing and unboxing provide convenience, it's essential to be mindful of potential performance implications and null values when working with wrapper objects.

### uses
1. Change the value in the method
2. Serialization
3. Synchronization

### Example:-
``` 
int a = 20;
Integer i = Integer.valueOf(a);
Integer j = a; // autoboxing
Integer a = new Integer(3);
int i = a.intValue(); //Explicit
```
### method in a string wrapper class


| No. | Method                                                                                | Description                                                          |
|-----|---------------------------------------------------------------------------------------|----------------------------------------------------------------------|
| 1   | char charAt(int index)                                                                | It returns char value for the particular index.                      |
| 2   | int length()                                                                          | It returns string length                                             |
| 3   | static String format(String format, Object... args)                                   | It returns a formatted string                                        |
| 4   | static String format(Locale I, String format, Object... args)                         | It returns formatted string with given locale.                       |
| 5   | String substring(int beginIndex)                                                      | It returns substring for given begin index.                          |
| 6   | String substring(int beginIndex, int endIndex)                                        | It returns substring for given begin index and end index.            |
| 7   | boolean contains(CharSequence s)                                                      | It returns true or false after matching the sequence of char value.  |
| 8   | static String join(CharSequence delimiter, CharSequence... elements)                  | It returns a joined string                                           |
| 9   | static String join(CharSequence delimiter, Iterable<? extends CharSequence> elements) | It return joined String                                              | 
| 10  | boolean equals(Object another)                                                        | It checks the equality of string with the given object.              |
| 11  | boolean isEmpty()                                                                     | It checks if string is empty.                                        |
| 12  | String concat(String str)                                                             | It concatenates the specified string.                                | 
| 13  | String replace(char old, char new)                                                    | It replaces all occurrences of the specified char value.             | 
| 14  | String replace(CharSequence old, CharSequence new)                                    | It replaces all occurrences of the specified CharSequence.           | 
| 15  | static String equalsIgnoreCase(String another)                                        | It compares another string. It doesn't check case.                   |
| 16  | String[] split(String regex)                                                          | It returns a split string matching regex.                            |
| 17  | String[] split(String regex, int limit)                                               | It returns a split string matching regex and limit.                  |
| 18  | int indexOf(int ch)                                                                   | It returns the specified char value index.                           |
| 19  | int indexOf(int ch, int fromIndex)                                                    | It returns the specified char value index starting with given index. | 
| 20  | int indexOf(String substring)                                                         | It returns the specified substring index.                            | 
| 21  | int indexOf(String substring, int fromIndex)                                          | It returns the specified substring index starting with given index.  |
| 22  | String toLowerCase()                                                                  | It returns a string in lowercase.                                    | 
| 23  | String toLowerCase(Locale I)                                                          | It returns a string in lowercase using specified locale.             |
| 24  | String toUpperCase()                                                                  | It returns a string in uppercase.                                    | 
| 25  | String toUpperCase(Locale I)                                                          | It returns a string in uppercase using specified locale.             |
| 26  | String trim()                                                                         | It removes beginning and ending spaces of this string.               |
| 27  | static String valueOf(int value)                                                      | It converts given type into string. It is an overloaded method.      | 


> The object or variable of a string class will never be changed even if you contact replace trim or any operation to it To save the updated screen after these operations You need to create another variable or object of the string class.

### Example of string class methods
``` 
// length()
"Nimesh".length();  // returns 6

// charAt()
"Nimesh".charAt(3); // returns  ‘m’

// contains
"nim".concat("esh"); // returns “nimesh”

// replace
String s1 = “Nimesh“;
String s2 = “Nimesh”.replace(‘N’ ,’g’); // returns “gimesh”

// equals
“Nimesh”.equals(“Nimesh”); // returns true
“Nimesh”.equals(“nimesh”); // returns false

// equalsIgnoreCase
“Nimesh”.equalsIgnoreCase(“Nimesh”); // returns true
“Nimesh”.equalsIgnoreCase(“nimesh”); // returns true

// ___.toLowerCase();
"NiMeSh".toLowerCase(); // return "nimesh"

// ___.toUpperCase();
"nImEsH".toUpperCase(); // return "NIMESH"

--- For advance ---

// substring()
"Nimesh".substring(3); // returns “mesh”
"nimesh".substring(2, 5); // returns “mes” == [2,5)
// 2 is inclusive and 5 is exclusive

//index of
String s = ”Learn Share Learn”;
int output = s.indexOf(“Share”); // returns 6
// return -1 if it can't find it 
// if we put location > length then it generate IndexOutOfBounds exception 
```

---

### Difference between string vs StringBuffer
| String                                                                                                                                                                        | String Buffer                                                                                                  |
|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------|
| The string class objects are immutable.                                                                                                                                       | The string Buffer class objects are mutable.                                                                   |
| String Class objects holds its string length you can not change its size.                                                                                                     | In StringBuffer Class objects you can change its size.                                                         |
| You can concat the string string with other string and replace the characters of the string at a given position but you can not insert a character sequence amidst the string | You can insert a character sequence in a string buffer object retaining the original characters in the string. |
| You can not delete any character from a string class object.                                                                                                                  | You can delete any character from a string Buffer class object which also adjust the …                         |
| String class object need to be type case explicitly to use string Buffer class methods                                                                                        | String Buffer class object can use string class methods directly                                               |
| You don't need a any object to initialize a variable.                                                                                                                         | You comparably need a object to initialize a variable.                                                         |

> You can convert a string class object into a string buffer object to access the methods of string buffer class. You cannot directly pass a string to a string buffer object.

### String Buffer Methods

| Methods          | Action Performed                                                            |
|------------------|-----------------------------------------------------------------------------|
| append()         | Used to add text at the end of the existing text.                           |
| length()         | The length of a StringBuffer can be found by the length() method            |
| capacity()       | the total allocated capacity can be found by the capacity() method          |
| charAt()         | This method returns the char value in this sequence at the specified index. |
| delete()         | Deletes a sequence of characters from the invoking object                   |
| deleteCharAt()   | Deletes the character at the index specified by the loc                     |
| ensureCapacity() | Ensures capacity is at least equal to the given minimum.                    |
| insert()         | Inserts text at the specified index position                                |
| length()         | Returns the length of the string                                            |
| reverse()        | Reverse the characters within a StringBuffer object                         |
| replace()        | Replace one set of characters with another set inside a StringBuffer object | 

#### Example:
``` 
StringBuffer sb = new StringBuffer("Hello");

sb.append(" World !"); // now sb = "Hello World"

sb.reverse(); // now sb = "dlroW olleH"

sb.length(); // return = 11

sb.insert(1,"java"); // return = "djavalroW olleH" //insert before the index (Won't delete)

sb.replace(1,5,""); // return = "dlroW olleH" // insert at the index (delete it)

sb.delete(0,5);// return = " olleH"

//When we create a string buffer object it allocates some capacity = 16
sb.capacity(); // return = 21 + length == 

```

---

### Difference between Character and String

| Character (char)              | String (java.lang.String)     |
|-------------------------------|-------------------------------|
| Primitive                     | Class                         |
| 2 bytes                       | Variable (depends on content) |
| `char c = 'a';`               | `String s = "hello";`         |
| Single character              | Sequence of characters        |
| `==` operator for compression | `.equals()` method            |
| Direct access                 | Methods like `charAt()`       |
| White space is ignored        | White space it not ignored    |
| Has `Character` wrapper class | it self is a wrapper class    |

---

## Interface

> The interface in Java is a mechanism to achieve abstraction. There can be only abstract methods in the Java interface, not the method body. It is used to achieve abstraction and multiple inheritances in Java using Interface.

### Uses of Interfaces in Java are mentioned below:

* It is used to achieve total abstraction.
* Since Java does not support multiple inheritances in the case of class, by using an interface, it can achieve multiple inheritances.
* Any class can extend only one class, but can any class implement an infinite number of interfaces.
* It is also used to achieve loose coupling.
* Interfaces are used to implement abstraction.

### Syntax
``` 
interface {
// declare constant fields
// declare methods that abstract
// by default.   
}
```

### Difference Between Class and Interface

| Class                                                                       | Interface                                                              |
|-----------------------------------------------------------------------------|------------------------------------------------------------------------|
| In class, you can instantiate variables and create an object.               | In an interface, you can’t instantiate variables and create an object. |
| A class can contain concrete (with implementation) methods                  | The interface cannot contain concrete (with implementation) methods.   |
| The access specifiers used with classes are private, protected, and public. | In Interface, only one specifier is used — Public.                     |

### Relationship Between Class and Interface

![interface.png](interface.png)

### Advantage
* Without bothering about the implementation part, we can achieve the security of the implementation.
* In Java, multiple inheritances are not allowed; however, you can use an interface to make use of it as you can implement more than one interface.

### Multiple Inheritance in Java Using Interface
![interface2.png](interface2.png)

### take out
* We can’t create an instance (interface can’t be instantiated) of the interface, but we can make the reference to it that refers to the Object of its implementing class.
* A class can implement more than one interface.
* An interface can extend to another interface or interface (more than one interface).
* A class that implements the interface must implement all the methods in the interface.
* All the methods are public and abstract. All the fields are public, static, and final.
* It is used to achieve multiple inheritances.
* It is used to achieve loose coupling.
* Inside the Interface is not possible to declare instance variables because by default variables are public static final.
* Inside the Interface, constructors are not allowed.
* Inside the interface, the main method is not allowed.
* Inside the interface, static, final, and private methods declaration is not possible.

### Example:

``` 
interface In1
{
    void display();
}
class TestClass implements In1
{
    public void display(){
        System.out.println("hello");
    }
    public static void main (String[] args)
    {
        TestClass t = new TestClass();
        t.display();
    }
}

OUTPUT: 
    hello
```

---

## Instance of operator in Java
* This operator returns either true or false and hence is majorly used in conditional statements
* it is used to check whether a given object belongs to a particular class or not
* an object of subclass is also an instanceof parent class
``` 
class Parent {
}
class Child extends Parent {
} 
class Test {
    public static void main(String[] args)
    {
        Parent pobj = new Parent();
        if (pobj instanceof Child)
            System.out.println("pobj is instance of Child");
        else
            System.out.println("pobj is NOT instance of Child");
    }
}
```

## ArrayList
* No size limits
