# P6 Student Marks Validation

## About
This practical checks if marks are between 0 and 100.

## What it does
It only saves the marks if the value is correct (not too high or low).

## Code Explanation
- `setMarks()` has an `if` condition: `marks >= 0 && marks <= 100`.
- Only if the condition is true, the value is saved.
- `getMarks()` returns the valid score.
