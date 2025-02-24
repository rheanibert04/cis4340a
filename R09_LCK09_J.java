// Rule 09. Locking (LCK)
// LCK09-J. Do not perform operations that can block while holding a lock

// COMPLIANT SOLUTION

public synchronized void doSomething(long timeout)
                                     throws InterruptedException {
// ...
  while (<condition does not hold>) {
    wait(timeout); // Immediately releases the current monitor
  }
}