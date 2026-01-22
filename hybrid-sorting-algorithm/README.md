# Hybrid Sorting Algorithm

This project implements a **hybrid sorting algorithm** that combines two classical sorting
algorithms to efficiently sort an array of integers.

The approach applies one algorithm to handle the larger array and then uses a second
algorithm to refine the partially sorted data, demonstrating practical algorithm design
and performance analysis.

---

## Algorithms Used
- **Algorithm 1:** (QuickSort)
  - Used to sort the larger array efficiently.
- **Algorithm 2:** (Insertion Sort)
  - Applied to smaller subarrays produced by the first algorithm.

> The output of the first sorting algorithm is used as the input to the second algorithm.


