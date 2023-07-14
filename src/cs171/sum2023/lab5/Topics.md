# CS 171 | Lab 5
## Review 

### Auto-boxing and Auto-unboxing 

- Autoboxing in Java is an automatic conversion process that the compiler uses to convert the primitive types to their corresponding object wrapper classes.
    
      int i = 10;  // primitive data type
      Integer intObject = i;  // autoboxing

- Unboxing is the automatic conversion of wrapper class types to their corresponding primitive types.
       
      Integer intObject = new Integer(10);  // Integer object
      int i = intObject;  // unboxing

#### Why boxing?

- **Nullability:** Integer is an object that can represent the same values as int and additionally null. int is a primitive data type and cannot be null.
- **Methods and utilities:** The Integer class comes with a number of useful methods that you can use to perform operations on an int, like converting the int to a string, converting a string to an int, etc.
- **Use in collections:** Collections in Java (like ArrayList, HashMap, etc.) can't use primitive types like int. So if you want to store your numbers in a collection, you'll have to use Integer instead.
- **Use with generics:** Java's generic system doesn't support primitives. So, if you are using a generic class, you need to use the wrapper classes (like Integer) instead of the primitive types (like int).

**see cs171.sum2023.lab5.Boxing**
### Multiple Inheritance
- You can extend only one class

      class ClassA{}
      class ClassB{}
      class C extend ClassB, ClassA{} // Is not valid in Java
- You can implement multiple interfaces

      interface InterfaceA{}
      interface InterfaceB{}
      class ClassC{}
      class ClassD extends ClassC implements InterfaceA, InterfaceB{} // is valid
      class ClassD implements InterfaceA, InterfaceB{}

**see cs171.sum2023.lab5.MultipleInheritance**

### Type Casting:

**see cs171.sum2023.lab5.TypeCasting**

Practice:
1. Write your own version of **cs171.sum2023.lab5.MultipleInheritance**
2. BookAPI: **cs171.sum2023.lab5.BookAPI**
       
       public class Book extends BookAbstract implements Readable, Scanable{}
3. Advanced FileManager: **cs171.sum2023.lab5.FileManager**

   public class AdvancedFileManager extends FileManager implements Customizable {}