##Sieve of Eratoshenes
Complexity: O(NloglogN)

The basic idea is to mark the numbers as composite which are multiple or factors
of some other numbers.

```
private static boolean[] generatePrime() {
        boolean a[] = new boolean[1000000];
        for (int i = 0; i < a.length; i++) {
            a[i] = true;
        }

        for (int p = 2; p * p < a.length; p++) {
            if (a[p]) {
                for (int i = p * p; i < a.length; i+=p) {
                    a[i] = false;
                }
            }
        }

        return a;
    }
```