# Laboratory Work No.5: Regular Expressions

## Overview
This repository contains the implementation of Laboratory Work No.5 for the Moscow Technical University of Communications and Informatics (MTUCI). 

The primary focus of this project is to study and practically apply regular expressions in Java for text processing, parsing, and data validation. The project includes five distinct tasks utilizing the Pattern and Matcher classes, featuring robust exception handling and input validation.

## Tasks Description

### Task 1: Number Finder (NumFind)
A program designed to extract all numbers from a given text.
* Mechanics: Uses regular expressions to locate both integers and floating-point numbers embedded in arbitrary text.
* Error Handling: Validates input strings and gracefully handles processing issues.

### Task 2: Password Validator (PassOk)
A utility to verify if a password meets strict security guidelines.
* Criteria: The password must be 8 to 16 characters long, contain only Latin letters and digits, and include at least one uppercase letter and at least one digit.
* Mechanics: Implements regex pattern matching to enforce all security constraints simultaneously.

### Task 3: Case Transition Highlighter (SBR)
A text-formatting utility that detects specific letter-case boundaries.
* Mechanics: Finds every instance where a capital letter immediately follows a lowercase letter with no separating characters.
* Output: Automatically highlights these transitions by wrapping them in exclamation marks (e.g., "aB" becomes "!aB!").

### Task 4: IP Address Validator (IP)
A strict validation tool for network addresses.
* Mechanics: Validates whether a given string is a correctly formatted IPv4 address.
* Validation: Implements rigorous regex bounds to ensure each of the four octets strictly falls within the acceptable range of 0 to 255.

### Task 5: Unicode Word Search (WFind)
A dynamic, case-insensitive word search utility with full multi-language support.
* Mechanics: Searches for words starting with a specific letter using the specific regex flags for Unicode-aware case folding and word boundaries.
* Capability: Correctly processes both Latin and Cyrillic character sets, handles single-character words, and includes safety checks for null or empty input values.

## Technologies Used
* Language: Java
* Core Concepts: Regular Expressions (Pattern, Matcher classes), Regex Flags, Unicode Text Processing, Data Validation, Exception Handling.

## Key Learnings and Conclusion
This laboratory work demonstrates the efficiency and versatility of regular expressions for complex text manipulation tasks in Java. By developing these five algorithms, key principles of data validation, boundary control, and automated formatting were reinforced. Special emphasis was placed on creating resilient code capable of handling diverse text inputs, including multi-language (Cyrillic) scenarios and edge-case exceptions.

---

## Author
* Name: Pavel Petrovich Koshelev
* Group: BST 2401
* Institution: MTUCI
* Year: 2026
