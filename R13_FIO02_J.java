// Rule 13. Input Output (FIO)
// FIO02-J. Detect and handle file-related errors

// NONCOMPLIANT EXAMPLE

File file = new File(args[0]);
file.delete();