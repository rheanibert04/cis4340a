// Rule 10. Thread APIs (THI)
// THI03-J. Always invoke wait() and await() methods inside a loop

// NONCOMPLIANT EXAMPLE

synchronized (object) {
  if (<condition does not hold>) {
    object.wait();
  }
  // Proceed when condition holds
}