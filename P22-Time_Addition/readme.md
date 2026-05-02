# P22 Time Addition

## About
This practical adds two time objects.

## What it does
It adds hours, minutes, and seconds, making sure they roll over correctly (like 60 seconds = 1 minute).

## Code Explanation
- It adds seconds first and handles rollover with `/ 60`.
- Then adds minutes and handles rollover.
- Finally prints the total time in `H:M:S` format.
