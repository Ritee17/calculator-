# Calculator - Basic Arithmetic Operations

A comprehensive Java calculator application that performs all basic arithmetic operations with user input.

## Description

This calculator application provides complete arithmetic functionality including addition, subtraction, multiplication, and division. The program prompts users to enter two numbers and select an operation to perform the calculation.

## Features

- **Addition**: Add two numbers together
- **Subtraction**: Subtract the second number from the first
- **Multiplication**: Multiply two numbers
- **Division**: Divide the first number by the second (with zero-division protection)
- **User Input**: Interactive input system using Scanner
- **Operation Selection**: Choose from +, -, *, / operations
- **Error Handling**: Prevents division by zero
- **Clean Output**: Displays the calculation in a readable format

## Files

- `Multiply.java` - Main Java class containing all arithmetic methods and user interface

## How to Use

1. **Compile the program:**
   ```bash
   javac Multiply.java
   ```

2. **Run the program:**
   ```bash
   java Multiply
   ```

3. **Follow the prompts:**
   - Enter the first number when prompted
   - Enter the second number when prompted
   - Enter the operation (+, -, *, /) when prompted
   - View the calculation result

## Example Usage

```
Enter first number: 10
Enter second number: 5
Enter operation (+, -, *, /): +
Result: 10.0 + 5.0 = 15.0
```

```
Enter first number: 15
Enter second number: 3
Enter operation (+, -, *, /): /
Result: 15.0 / 3.0 = 5.0
```

## Supported Operations

- **Addition (+)**: Returns the sum of two numbers
- **Subtraction (-)**: Returns the difference between two numbers
- **Multiplication (*)**: Returns the product of two numbers
- **Division (/)**: Returns the quotient of two numbers (prevents division by zero)

## Requirements

- Java Development Kit (JDK) 8 or higher
- Command line interface or Java IDE

## Project Structure

```
calculator-/
├── Multiply.java
└── README.md
```

## Error Handling

- Division by zero protection with error message
- Invalid operation detection and error reporting

---

*This project is part of the Full Stack Development Class*
