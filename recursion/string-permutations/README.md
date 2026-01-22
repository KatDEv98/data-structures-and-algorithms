# String Permutations Using Recursion and a Stack

This project implements a Java program that generates all permutations of a given string
using **recursion**, while explicitly using a **stack** to trace recursive function calls.

The goal is to demonstrate how recursion works internally and how the call stack grows
and shrinks as recursive calls are made and returned.

---

## Concepts Demonstrated
- Recursion
- Stack data structure
- String manipulation
- Backtracking
- Time and space complexity analysis

---

## How It Works
- The program recursively generates permutations of the input string.
- Each recursive call pushes the current state of the string onto a stack.
- When the base case is reached, a complete permutation is stored.
- As the recursion unwinds, stack frames are popped to trace the return path.
- The stack trace clearly shows the order in which recursive calls are made and resolved.

---

## Program Structure
- **StringPermutation.java**
  - Contains the recursive `permuteString()` method.
  - Manages stack operations and permutation generation.

- **PermutationTest.java**
  - Prompts the user to enter a string.
  - Displays the original string.
  - Displays all generated permutations.
  - Displays the stack trace showing recursive push and pop operations.

---


