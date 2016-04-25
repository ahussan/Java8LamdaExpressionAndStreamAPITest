# Java 8 Lamda Expression and Stream API Practice Code

This project is about Practicing Lamda Expression in Java 8. I will commit my **Java 8 Lamda Expression** practice code in this repository.

Lambda expressions are introduced in Java 8 and are touted to be the biggest feature of Java 8. Lambda expression facilitates functional programming, and simplifies the development a lot.

Lambda expressions are a new and important feature included in Java SE 8. They provide a clear and concise way to represent one method interface using an expression. Lambda expressions also improve the Collection libraries making it easier to iterate through, filter, and extract data from a Collection. In addition, new concurrency features improve performance in multicore environments.

This project and practice code will include but not limited to:
-Anonymous inner classes in Java.
-Lambda expressions to replace anonymous inner classes in Java SE 8.
-The correct syntax for lambda expressions.
-A Predicate interface to perform searches on a list.
-A Function interface to process an object and produce a different type of object.
-New features added to Collections in Java SE 8 that support lambda expressions.
-Method Reference
-Stream API (Practice code will show on how to use Stream API)

#Stream API
Since past few versions, Java has started giving importance to concurrency. Java 8 goes one more step ahead and has developed a Streams API which lets us think about parallelism. Nowadays, because of the tremendous amount of development  on the hardware front, multicore CPUs are becoming more and more general. In order to leverage the hardware capabilities Java had introduced Fork Join Framework. **Java 8 Streams API** supports many parallel operations to process the data, while completely abstracting out the low level multithreading logic and letting the developer fully concentrate on the data and the operations to be performed on the data.

#Collections vs Streams
Collections are in-memory data structures which hold elements within it. Each element in the collection is computed before it actually becomes a part of that collection. On the other hand Streams are fixed data structures which computes the elements on-demand basis.

The Java 8 Streams can be seen as lazily constructed Collections, where the values are computed when user demands for it. Actual Collections behave absolutely opposite to it and they are set of eagerly computed values (no matter if the user demands for a particular value or not).

The Streams also support Pipelining and Internal Iterations. The Java 8 Streams are designed in such a way that most of its stream operations returns Streams only. This help us creating chain of various stream operations. This is called as pipelining. The pipelined operations looks similar to a sql query.

In Java, we traditionally use for loops or iterators to iterate through the collections. These kind of iterations are called as external iterations and they are clearly visible in the code. Java 8 Stream operations has methods like foreach, map, filter, etc. which internally iterates through the elements. The code is completely unaware of the iteration logic in the background. These kind of iterations are called as internal iterations.

```
List<String> names =newArrayList<>();
for(Student student : students){
if(student.getName().startsWith("A")){
names.add(student.getName());
}
}
```
There is nothing special about this code. This is a traditional Java external iterations example. Now, have a look at the below code. This line is doing exactly the same thing with **Stream API** but we can't see any iteration logic here and hence it is called as internal iterations.
```
List<string> names = students.stream().map(Student::getName).filter(name->name.startsWith("A"))
.collect(Collectors.toList());
```

**Question?** Shoot.




