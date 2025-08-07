# Calculator - Basic Arithmetic Operations

A comprehensive Java calculator application that performs all basic arithmetic operations with user input.

## Description

This calculator application provides complete arithmetic functionality including addition, subtraction, multiplication, and division. The program prompts users to enter two numbers and select an operation to perform the calculation.

## Features

- **Menu-Driven Interface**: Choose from 4 arithmetic operations via numbered menu
- **Addition**: Add two numbers together
- **Subtraction**: Subtract the second number from the first
- **Multiplication**: Multiply two numbers
- **Division**: Divide the first number by the second (with zero-division protection)
- **User Input**: Interactive input system using Scanner
- **Error Handling**: Prevents division by zero and invalid menu selections
- **Clean Output**: Displays the calculation in a readable format

## Files

- `Calculator.java` - Main Java class containing all arithmetic methods and user interface

## How to Use

1. **Compile the program:**
   ```bash
   javac Calculator.java
   ```

2. **Run the program:**
   ```bash
   java Calculator
   ```

3. **Follow the prompts:**
   - Choose an operation from the menu (1-4)
   - Enter the first number when prompted
   - Enter the second number when prompted
   - View the calculation result

## Example Usage

```
=== CALCULATOR ===
Choose an operation:
1. Addition (+)
2. Subtraction (-)
3. Multiplication (*)
4. Division (/)
Enter your choice (1-4): 1
Enter first number: 10
Enter second number: 5

Result: 10.0 + 5.0 = 15.0
```

```
=== CALCULATOR ===
Choose an operation:
1. Addition (+)
2. Subtraction (-)
3. Multiplication (*)
4. Division (/)
Enter your choice (1-4): 4
Enter first number: 15
Enter second number: 3

Result: 15.0 / 3.0 = 5.0
```

## Supported Operations

- **Addition (1)**: Returns the sum of two numbers
- **Subtraction (2)**: Returns the difference between two numbers
- **Multiplication (3)**: Returns the product of two numbers
- **Division (4)**: Returns the quotient of two numbers (prevents division by zero)

## Requirements

- Java Development Kit (JDK) 8 or higher
- Command line interface or Java IDE

## Project Structure

```
calculator-/
├── Calculator.java
└── README.md
```

## Error Handling

- Division by zero protection with error message
- Invalid menu choice detection and error reporting

---

*This project is part of the Full Stack Development Class*
