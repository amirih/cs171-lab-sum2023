package cs171.sum2023.lab5.MultipleInheritance;


interface InterfaceA {
}

interface InterfaceB {
}

class ClassA {
}

class ClassB extends ClassA implements InterfaceA, InterfaceB {
}

class ClassC extends ClassB {
}

class ClassD implements InterfaceA {
}

class ClassE extends ClassD {
}

class ClassF extends ClassE implements InterfaceA {
}


public class MultipleInheritance {

    public static void main(String[] args) {
        ClassA classA = new ClassA();
        System.out.println("classA instanceof InterfaceA?" + (classA instanceof InterfaceA ? " yes" : "  no"));
        System.out.println("classA instanceof InterfaceB?" + (classA instanceof InterfaceB ? " yes" : "  no"));
        System.out.println("classA instanceof ClassA?" + (classA instanceof ClassA ? " yes" : "  no"));
        System.out.println("classA instanceof ClassB?" + (classA instanceof ClassB ? " yes" : "  no"));
        System.out.println("classA instanceof ClassC?" + (classA instanceof ClassC ? " yes" : "  no"));
//        System.out.println("classA instanceof ClassD?" + (classA instanceof ClassD ? " yes" : "  no")); //compile error
//        System.out.println("classA instanceof ClassE?" + (classA instanceof ClassE ? " yes" : "  no")); //compile error
//        System.out.println("classA instanceof ClassF?" + (classA instanceof ClassF ? " yes" : "  no")); //compile error

        ClassB classB = new ClassB();
        System.out.println("classB instanceof InterfaceA?" + (classB instanceof InterfaceA ? " yes" : "  no"));
        System.out.println("classB instanceof InterfaceA?" + (classB instanceof InterfaceB ? " yes" : "  no"));
        System.out.println("classB instanceof ClassA?" + (classB instanceof ClassA ? " yes" : "  no"));
        System.out.println("classB instanceof ClassB?" + (classB instanceof ClassB ? " yes" : "  no"));
        System.out.println("classB instanceof ClassC?" + (classB instanceof ClassC ? " yes" : "  no"));
//        System.out.println("classB instanceof ClassD?" + (classB instanceof ClassD ? " yes" : "  no")); //compile error
//        System.out.println("classB instanceof ClassE?" + (classB instanceof ClassE ? " yes" : "  no")); //compile error
//        System.out.println("classB instanceof ClassF?" + (classB instanceof ClassF ? " yes" : "  no")); //compile error

        ClassC classC = new ClassC();
        System.out.println("classC instanceof InterfaceA?" + (classC instanceof InterfaceA ? " yes" : "  no"));
        System.out.println("classC instanceof InterfaceB?" + (classC instanceof InterfaceB ? " yes" : "  no"));
        System.out.println("classC instanceof ClassA?" + (classC instanceof ClassA ? " yes" : "  no"));
        System.out.println("classC instanceof ClassB?" + (classC instanceof ClassB ? " yes" : "  no"));
        System.out.println("classC instanceof ClassC?" + (classC instanceof ClassC ? " yes" : "  no"));
//        System.out.println("classC instanceof ClassD?" + (classC instanceof ClassD ? " yes" : "  no")); //compile error
//        System.out.println("classC instanceof ClassE?" + (classC instanceof ClassE ? " yes" : "  no")); //compile error
//        System.out.println("classC instanceof ClassF?" + (classC instanceof ClassF ? " yes" : "  no")); //compile error

        ClassD classD = new ClassD();
        System.out.println("classD instanceof InterfaceA?" + (classD instanceof InterfaceA ? " yes" : "  no"));
        System.out.println("classD instanceof InterfaceB?" + (classD instanceof InterfaceB ? " yes" : "  no"));
//        System.out.println("classD instanceof ClassA?" + (classD instanceof ClassA ? " yes" : "  no")); //compile error
//        System.out.println("classD instanceof ClassB?" + (classD instanceof ClassB ? " yes" : "  no")); //compile error
//        System.out.println("classD instanceof ClassC?" + (classD instanceof ClassC ? " yes" : "  no")); //compile error
        System.out.println("classD instanceof ClassD?" + (classD instanceof ClassD ? " yes" : "  no"));
        System.out.println("classD instanceof ClassE?" + (classD instanceof ClassE ? " yes" : "  no"));
        System.out.println("classD instanceof ClassF?" + (classD instanceof ClassF ? " yes" : "  no"));

        ClassE classE = new ClassE();
        System.out.println("classE instanceof InterfaceA?" + (classE instanceof InterfaceA ? " yes" : "  no"));
        System.out.println("classE instanceof InterfaceB?" + (classE instanceof InterfaceB ? " yes" : "  no"));
//        System.out.println("classE instanceof ClassA?" + (classE instanceof ClassA ? " yes" : "  no")); //compile error
//        System.out.println("classE instanceof ClassB?" + (classE instanceof ClassB ? " yes" : "  no")); //compile error
//        System.out.println("classE instanceof ClassC?" + (classE instanceof ClassC ? " yes" : "  no")); //compile error
        System.out.println("classE instanceof ClassD?" + (classE instanceof ClassD ? " yes" : "  no"));
        System.out.println("classE instanceof ClassE?" + (classE instanceof ClassE ? " yes" : "  no"));
        System.out.println("classE instanceof ClassF?" + (classE instanceof ClassF ? " yes" : "  no"));

        ClassF classF = new ClassF();
        System.out.println("classF instanceof InterfaceA?" + (classF instanceof InterfaceA ? " yes" : "  no"));
        System.out.println("classF instanceof InterfaceB?" + (classF instanceof InterfaceB ? " yes" : "  no"));
//        System.out.println("classF instanceof ClassA?" + (classF instanceof ClassA ? " yes" : "  no")); //compile error
//        System.out.println("classF instanceof ClassB?" + (classF instanceof ClassB ? " yes" : "  no")); //compile error
//        System.out.println("classF instanceof ClassC?" + (classF instanceof ClassC ? " yes" : "  no")); //compile error
        System.out.println("classF instanceof ClassD?" + (classF instanceof ClassD ? " yes" : "  no"));
        System.out.println("classF instanceof ClassE?" + (classF instanceof ClassE ? " yes" : "  no"));
        System.out.println("classF instanceof ClassF?" + (classF instanceof ClassF ? " yes" : "  no"));
    }
}