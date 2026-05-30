# Public Class and File Name

When Java sees a **public class**, it expects:

* The class to be the **main identity** of the file.
* The **file name** and **class name** should match.

This helps Java locate classes properly.

---

# Garbage Collection (GC)

**Garbage Collection** = Automatic removal of unreachable objects.

Example:

```java
Example e1 = new Example(); // Object 1
e1 = new Example();         // Object 2
```

**Object 1** becomes unreachable and is eligible for garbage collection.

---

# Members of a Class

In Java, the term **member** means anything that belongs to a class.

A class can have:

* **Fields (Variables)**
* **Methods (Functions)**
* **Constructors**
* **Nested Classes**

These are all called **members of a class**.

---

# Static vs Non-Static

## Non-Static

→ Belongs to an **object (instance)**.

* Requires an object to access.
* Each object gets its own copy.
* Data can vary from object to object.

---

## Static

→ Belongs to the **class itself**.

* Can be accessed using the class name.
* Only one copy exists.
* Data is shared by all objects.

---

# Static or Non-Static Method?

Ask:

> **Does this method need data from a specific object?**

## Yes

➡️ Make it a **Non-Static (Instance) Method**

## No

➡️ Make it a **Static Method**

---

# Field

A **Field** is any variable declared inside a class.

Example:

```java
class Student {
    String name; // Field
}
```

---

# Types of Fields

## 1. Instance Field (Non-Static Field)

Also called:

* **Instance Variable**

### Each object gets its own value.

Examples:

* name
* age
* salary
* balance

### Rule

**Does every object need its own value?**

➡️ Use an **Instance Field**.

### Memory Trick

**Instance Field = Each object has its own notebook page.**

---

## 2. Static Field (Class Field)

Also called:

* **Class Variable**

### Shared by all objects.

Examples:

* companyName
* collegeName
* countryCode
* PI

### Rule

**Is the value common to all objects?**

➡️ Use a **Static Field**.

### Memory Trick

**Static Field = One notice board shared by everyone.**

---

# Terminology

| Term               | Meaning                                     |
| ------------------ | ------------------------------------------- |
| Field              | Variable declared inside a class            |
| Instance Variable  | Non-static field                            |
| Class Variable     | Static field                                |
| Data Member        | Another name for a field                    |
| Method             | Member Function                             |
| Instance Method    | Non-static method                           |
| Static Method      | Class method                                |
| Object             | Instance of a class                         |
| Reference Variable | Stores the reference of an object           |
| Constructor        | Special method used to initialize an object |

---

# Quick Revision

## Non-Static

* Belongs to an object
* Object required
* Separate copy for each object

## Static

* Belongs to the class
* Object not required
* One shared copy

## Field

* Variable inside a class

## Instance Field

* Non-static field
* Each object has its own value

## Static Field

* Class field
* Shared by all objects

## Garbage Collection

* Automatic removal of unreachable objects
