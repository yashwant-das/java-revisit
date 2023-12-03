// File: Main.java
package accessmodifiers;

public class Main {
    public static void main(String[] args) {
        // ExampleClass (default access)
        ExampleClass example = new ExampleClass();
        example.protectedField = 5;
        example.protectedMethod();
        ;

        // PublicClass (public access)
        PublicClass publicExample = new PublicClass();
        publicExample.publicField = 15;
        publicExample.publicMethod();

        // PrivateExample (private access)
        PrivateExample privateExample = new PrivateExample();
        privateExample.accessPrivateMembers();

        // SubclassExample (protected access)
        SubclassExample subclassExample = new SubclassExample();
        subclassExample.accessProtectedMembers();
    }
}
