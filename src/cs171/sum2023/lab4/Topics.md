# CS 171 | Lab 4
## Terminologies
1. **Classes:** A class is a blueprint from which individual objects are created.
2. **Objects:** An object is an instance of a class.
3. **Variables:** State, Attributes, Properties, Fields, and Data Members.
   - **Local Variables:** These are declared inside methods, constructors, or blocks and are created when the method, constructor, or block is entered and destroyed once it is exited. These variables have **local scope**, which means they can only be accessed within the method, constructor, or block where they are declared.
   - **Instance Variables:** These are declared in a class, but outside a method or any block. They are instantiated when an object of the class is created and destroyed when the object is destroyed. These variables are available for all methods, constructors, and block in the class, and they are unique for each instance (object) of a class. Therefore, they are also referred to as fields, attributes, or properties.
   - **Class Variables:** Also known as static variables, these are declared within a class, outside a method, with the static keyword. They exist independently of any instances of the class and are shared among all instances. A class only has one copy of class variables, regardless of how many objects are created from it.
4. **Methods:** Behavior, Functions, Procedures, Operations, and Actions
   - **Constructor:** This is a special kind of method used to initialize the state of an object. It is invoked at the time of object creation and has the same name as the class.
   - **Instance Methods:** These methods operate on the instance variables of a class. An object (an instance of a class) is required to call these methods.
     - Accessors (Getters)
     - Mutators (Setters)
     - Many others: Helper Method, Factory Method, Lifecycle Method, etc.
   - **Final Methods:** Methods declared with the keyword final cannot be overridden by subclasses.
   - **Abstract Methods:** Abstract methods are declared but not implemented. They are declared in an abstract class and must be implemented in any non-abstract child class.
   - **Class Methods:** Also known as static methods, these methods are declared with the keyword static. They belong to the class rather than the instance of a class. You can call these methods without creating an instance of the class. They can only operate on class variables and not on instance variables.

##  The four foundational principles of Object-Oriented Programming (OOP) in Java:
### Encapsulation:
Encapsulation is the technique of making the fields in a class private and providing access to the fields via public methods. Encapsulation is also referred to as **data hiding.**

**See cs171.sum2023.lab4.Encapsulation**

### Inheritance:
This is the process where one class acquires the properties (methods and fields) of another. The class which inherits the properties of another class is known as the subclass, and the class whose properties are inherited is known as the superclass.
   
**See cs171.sum2023.lab3.Inheritance**

### Polymorphism:
This allows us to perform a single action in different ways. Polymorphism allows you to define one interface and have multiple implementations. We can create functions or reference variables which behave differently in different programmatic contexts.


1. Compile-time polymorphism (also known as static polymorphism or early binding) 
    - Achieved by **overloading**
2. Runtime polymorphism (also known as dynamic polymorphism or late binding)
    - Achieved by **overriding**
   
**See cs171.sum2023.lab4.Polymorphism**

### Abstraction:
Abstraction is the quality of dealing with ideas rather than events. It basically deals with hiding the details and showing the essential things to the user.

1. **Abstract classes:** Abstract classes are declared with the abstract keyword. They can have both abstract (method without a body) and non-abstract methods (method with a body). An abstract class cannot be instantiated, but it can be subclassed.
2. **Interfaces:** Interfaces are a completely abstract class that can only have abstract methods. In Java, you use the interface keyword to create an interface. All methods in an interface are implicitly public and abstract (even if you don't explicitly use these keywords).

**See cs171.sum2023.lab4.Abstraction**

### Practice:
1. SocialMedia
2. DataBase
3. Sort