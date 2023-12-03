// File: SubclassExample.java
package accessmodifiers;

class SubclassExample extends ExampleClass {
    void accessProtectedMembers() {
        protectedField = 20; // Accessing protected field from the superclass
        protectedMethod(); // Accessing protected method from the superclass
    }
}
