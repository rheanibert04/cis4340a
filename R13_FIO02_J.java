// Rule 13. Input Output (FIO)
// FIO02-J. Detect and handle file-related errors

// COMPLIANT SOLUTION

File file = new File("file");
if (!file.delete()) {
  // Deletion failed, handle error
}