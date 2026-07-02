# Stack and Queue Using LinkedList in Java

This repository demonstrates the implementation of **Stack** and **Queue** data structures in Java using both:

- Traditional Approach (Custom LinkedList)
- Java Collections Framework (LinkedList)

The project is implemented as part of Java Data Structures practice by following Object-Oriented Programming principles.

---

## 📌 Features

### Stack
- Push elements onto the stack
- Peek the top element
- Pop elements until the stack becomes empty
- Check whether the stack is empty

### Queue
- Enqueue elements into the queue
- Peek the front element
- Dequeue elements until the queue becomes empty
- Check whether the queue is empty

---

# Project Structure

```
Stack-Queue-Using-LinkedList/
│
├── Stack/
│   ├── Node.java
│   ├── LinkedList.java
│   ├── Stack.java
│   └── Main.java
│
├── Queue/
│   ├── Node.java
│   ├── LinkedList.java
│   ├── Queue.java
│   └── Main.java
│
└── README.md
```

---

# Technologies Used

- Java
- Object-Oriented Programming (OOP)
- LinkedList
- Java Collections Framework
- Eclipse IDE / IntelliJ IDEA

---

# Stack Use Cases

## UC1 – Create a Stack

### Objective

Create a Stack using a LinkedList where the **push()** operation internally calls the **add()** method of the LinkedList.

### Operations

- Push 70
- Push 30
- Push 56

### Stack Representation

```
Top
 |
56
30
70
```

### Methods Used

| Method | Description |
|---------|-------------|
| push() | Inserts an element at the top of the stack |
| add() | Adds a node at the beginning of the LinkedList |
| display() | Displays the stack |

### Output

```
Top
56
30
70
```

---

## UC2 – Peek and Pop Until Stack is Empty

### Objective

Retrieve the top element using **peek()** and remove all elements one by one using **pop()** until the stack becomes empty.

### Operations

```
peek()
pop()
pop()
pop()
```

### Output

```
Top Element : 56

Popped : 56
Popped : 30
Popped : 70

Stack is Empty
```

---

# Queue Use Cases

## UC3 – Create a Queue

### Objective

Create a Queue using a LinkedList where **enqueue()** internally calls the **append()** method.

### Operations

```
enqueue(56)
enqueue(30)
enqueue(70)
```

### Queue Representation

```
Front                    Rear
  |                        |
56 ----> 30 ----> 70 ----> null
```

### Methods Used

| Method | Description |
|---------|-------------|
| enqueue() | Adds an element to the rear of the queue |
| append() | Appends a node at the end of the LinkedList |
| peek() | Returns the front element |
| display() | Displays the queue |

### Output

```
Front -> 56 -> 30 -> 70 <- Rear
```

---

## UC4 – Dequeue Until Queue is Empty

### Objective

Remove elements from the beginning of the queue until it becomes empty.

### Operations

```
dequeue()
dequeue()
dequeue()
```

### Output

```
Dequeued : 56
Dequeued : 30
Dequeued : 70

Queue is Empty
```

---

# Stack Operations

| Operation | Time Complexity |
|-----------|-----------------|
| Push | O(1) |
| Pop | O(1) |
| Peek | O(1) |
| isEmpty | O(1) |

---

# Queue Operations

| Operation | Time Complexity |
|-----------|-----------------|
| Enqueue | O(1) |
| Dequeue | O(1) |
| Peek | O(1) |
| isEmpty | O(1) |

---

# Traditional Implementation

The traditional implementation creates the following classes:

- Node
- LinkedList
- Stack / Queue
- Main

The Stack and Queue are built manually using a custom LinkedList implementation without relying on Java's built-in data structure classes.

---

# Java Collections Implementation

The project also includes implementations using the Java Collections Framework.

### Stack

```java
LinkedList<Integer> stack = new LinkedList<>();

stack.push(70);
stack.push(30);
stack.push(56);
```

### Queue

```java
Queue<Integer> queue = new LinkedList<>();

queue.offer(56);
queue.offer(30);
queue.offer(70);
```

---

# Learning Outcomes

After completing this project, you will understand:

- Stack (LIFO) implementation
- Queue (FIFO) implementation
- Custom LinkedList implementation
- Node creation and traversal
- Object-Oriented Programming concepts
- Java Collections Framework
- Time complexity of Stack and Queue operations

---

# Author

**Saravanan S**

Java Developer | Learning Data Structures and Algorithms using Java

---
```
