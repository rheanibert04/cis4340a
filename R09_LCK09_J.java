// Rule 09. Locking (LCK)
// LCK09-J. Do not perform operations that can block while holding a lock

// NONCOMPLIANT EXAMPLE

public synchronized void doSomething(long time)
                         throws InterruptedException {
  // ...
  Thread.sleep(time);
}