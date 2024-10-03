# TwoTopicReview
**Date:** 10/02/2024

## Assignment
For this assignment, you get to choose what you create. Make a Java program that does anything (class-appropriate) you like; however, it must utilize the two review topics you requested. You should come up with your own idea — do not copy someone else's work.

### Requirements:
- The program should incorporate two review topics of your choice.
- The solution should be unique and class-appropriate.

---

## Project Structure

### `instances/`
This folder contains a program that runs in the terminal. It asks the user for their name and favorite sport, then constructs an instance of the object using the provided data. Afterward, it prints out a message using the `.toString()` method from the constructed object.

### `loops/`
This class prompts the user for a unique food item. If the input is not already present in the `HashMap`, it adds the selection to the map. Otherwise, the program informs the user that their selection is not unique and has already been entered a certain number of times.

> **Note:** This version does not persist the data in the `HashMap` across different sessions, so the information is not stored permanently.
