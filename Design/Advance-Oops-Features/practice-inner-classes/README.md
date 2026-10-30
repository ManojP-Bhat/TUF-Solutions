# [Practice (Inner classes)](https://takeuforward.org/practice/design/practice-inner-classes?category=advance-oops-features&source=oops)

![Difficulty: Unspecified](https://img.shields.io/badge/Difficulty-Unspecified-6b7280?style=for-the-badge)

---

## 📝 Problem Statement

You are tasked with designing a Robot class to demonstrate the functionality of different types of inner classes, Implement the following:

Class **Robot:**Attribute** : *name* (string)

**Method** : *performAction* () - Prints the robot's action

Class **Arm** (Non-static Inner Class) :

**Method** : *pickItem* () to print the message "Arm picking an item.".

Class **Processor** (Static Nested Class) :

**Method** : *process* () to print the message "Processor analyzing the data.".

**Local Inner** Class : *manageSensors* () method is used to implement the local inner class sensor.

**Method** : *sense* () to print the message "Sensor detecting obstacles." which is defined inside the local inner class.

**Anonymous Inner** Class:

Implements an interface **Task** with a single method *execute* ();

**Method** : *executeTask* () method to implement the overrides of execute() method of interface to print "Executing a custom task"

Refer the Commented code on IDE to see the output statements.

### Example 1:

**Input:** name = "Robot-1"

**Output:**

Robot-1 is performing an action.

Robot-1 arm picking an item.

Processor analyzing the data.

Robot-1 sensor detecting obstacles.

Robot-1 executing a custom task.

**Explanation:**

- First we create the Robot class object and initialize the name of robot.
- Then we call method *performAction* and print the corresponding text.
- Then we call method *pickItem* and print the corresponding text.
- Then we call method *process* and print the corresponding text.
- Then we call method manageSensors and print the corresponding text.
- Then we call method *executeTask* and print the corresponding text.

Still unsure what the problem is asking ?

Let’s go through a few more examples, step by step, to make it clearer.

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/pricing?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>
