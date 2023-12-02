Relational operators in Java are used to compare values and determine the relationship between them. They are often used in conditional statements and loops. Here are the common relational operators in Java:

### Equality (`==`):

```java
int a = 5;
int b = 7;

boolean isEqual = (a == b);  // Checks if a is equal to b
System.out.println("Is a equal to b? " + isEqual);  // Outputs: false
```

### Inequality (`!=`):

```java
int x = 10;
int y = 10;

boolean isNotEqual = (x != y);  // Checks if x is not equal to y
System.out.println("Is x not equal to y? " + isNotEqual);  // Outputs: false
```

### Greater Than (`>`):

```java
int m = 15;
int n = 12;

boolean isGreaterThan = (m > n);  // Checks if m is greater than n
System.out.println("Is m greater than n? " + isGreaterThan);  // Outputs: true
```

### Less Than (`<`):

```java
int p = 8;
int q = 10;

boolean isLessThan = (p < q);  // Checks if p is less than q
System.out.println("Is p less than q? " + isLessThan);  // Outputs: true
```

### Greater Than or Equal To (`>=`):

```java
int r = 20;
int s = 20;

boolean isGreaterOrEqual = (r >= s);  // Checks if r is greater than or equal to s
System.out.println("Is r greater than or equal to s? " + isGreaterOrEqual);  // Outputs: true
```

### Less Than or Equal To (`<=`):

```java
int u = 25;
int v = 30;

boolean isLessOrEqual = (u <= v);  // Checks if u is less than or equal to v
System.out.println("Is u less than or equal to v? " + isLessOrEqual);  // Outputs: true
```

These relational operators return a boolean result (`true` or `false`) based on the comparison of values. They are often used in conditional statements to make decisions in your Java programs.