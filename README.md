# What is this?

This library provides functions that perform type arithemtic over the type system
of Java5. For example, you can compute that `List<String>` is a sub-type of
`Collection<String>` but not `Collection<Object>`, you can compute
the erasure of `java.lang.reflect.Type`, or you can determine the array
component type `T` from `A[T]`

# How to use?

If you are using Maven, put the following dependency in your POM:

    <dependency>
      <groupId>org.jvnet</groupId>
      <artifactId>tiger-types</artifactId>
      <version>RELEASE</version>
    </dependency>

Otherwise just download the jar and put that in your classpath.


