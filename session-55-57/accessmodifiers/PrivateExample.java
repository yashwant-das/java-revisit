// File: PrivateExample.java
package accessmodifiers;

class PrivateExample {
    private int privateField;

    private void privateMethod() {
        System.out.println("Private method in PrivateExample");
    }

    // This method can access the private members of the class
    void accessPrivateMembers() {
        privateField = 10;
        privateMethod();
    }
}
