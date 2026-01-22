# LinkedList 
The aim of this assignment is to create the HospitalERSystem
to provide a practical demonstration of how custom data structures, specifically, a stack
and a queue implemented using linked lists can be used to manage real-world
operations in a hospital setting.
 Queue: Manages patients in the order they arrive, handling normal and
emergency cases fairly
 Stack: Handles undo operations to reverse the most recent treatments if a
mistake was made, simulating real-life decision corrections.

The hospital system does the following:
 Patients are admitted into a queue.
Emergency patients are given priority (i.e., they go ahead of normal patients).
Patients are treated in order using the queue.
Undo operations (e.g., reversing a treatment) are handled using a stack.
The system should include methods to admit patients, treat patients, undo the
last treatment, and display the current queue and stack status.
