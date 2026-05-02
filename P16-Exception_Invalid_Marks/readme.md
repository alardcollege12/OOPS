# P16 Exception Invalid Marks

## About
This practical throws an exception if marks are wrong.

## What it does
It stops the program and shows an error message if marks are above 100 or below 0.

## Code Explanation
- `throw new Exception` is used for bad input.
- `try-catch` in `main` handles the error so the program doesn't crash.
- It prints "Invalid Marks Entered" if input is 110.
