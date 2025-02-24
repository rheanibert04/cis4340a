// Rule 10. Thread APIs (THI)
// THI03-J. Always invoke wait() and await() methods inside a loop

// COMPLIANT SOLUTION

synchronized (object) {
  while (<condition does not hold>) {
    object.wait();
  }
  // Proceed when condition holds
}