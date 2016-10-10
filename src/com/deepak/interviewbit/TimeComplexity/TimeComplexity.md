_This topic has only multiple choice questions._ Answers are marked in **bold**
************************************************************
**1. What is the time, space complexity of following code :**
```java
int a = 0, b = 0;    
for (i = 0; i < N; i++) {
    a = a + rand();  
}
for (j = 0; j < M; j++) {
    b = b + rand();
}
```
Assume that rand() is O(1) time, O(1) space function.  

_**Answer :**_
_O(N * M) time, O(1) space
O(N + M) time, O(N + M) space
**O(N + M) time, O(1) space**
O(N * M) time, O(N + M) space
O(N * M) time, O(N * M) space_
************************************************************

**2. What is the time, space complexity of following code :**
```java
int a = 0, b = 0;    
for (i = 0; i < N; i++) {
    for (j = 0; j < N; j++) {
        a = a + j;
    }
}
for (k = 0; k < N; k++) {
    b = b + k;
} 
```

_**Answer :**_
_**O(N * N) time, O(1) space**
O(N) time, O(N) space
O(N) time, O(N) space
O(N * N) time, O(N) space
O(N * N * N) time, O(1) space_
************************************************************

**3. What is the time complexity of the following code :**
```java
int a = 0;
for (i = 0; i < N; i++) {
    for (j = N; j > i; j--) {
        a = a + i + j;
    }
}
```

_**Answer :**_
_O(N)
O(N X log(N))
**O(N ^ 2)**
O(N X Sqrt(N))_
************************************************************

**4. What does it mean when we say that an algorithm X is asymptotically more efficient than Y?**

_**Answer :**_
_X will always be a better choice for all inputs
X will always be a better choice for large inputs
**X will always be a better choice for small inputs**
Y will always be a better choice for small inputs_
************************************************************

**5. What is the time complexity of the following code :**
```java
int a = 0, i = N;
while (i > 0) {
    a += i;
    i /= 2;
}
```

_**Answer:**_
_O(N)
O(Sqrt(N))
O(N / 2)
**O(log N)**
O(log(log N))_
************************************************************

**6. What is time complexity of following code :**
```java
int count = 0;
for (int i = N; i > 0; i /= 2) {
    for (int j = 0; j < i; j++) {
        count += 1;
    }
}
```

_**Answer:**_
_O(N * N)
O(N * log N)
O(N * log(log(N)))
**O(N)**
O(N * Sqrt(N))_
************************************************************

**7. What is the time complexity of the following code :**
```java
int i, j, k = 0;
for (i  = n/2; i <= n; i++) {
    for (j = 2; j <= n; j = j * 2) {
        k = k + n/2;
    }
}
```

_**Answer:**_
_Θ(n)
**Θ(nLogn)**
Θ(n^2)
Θ(n^2 / Logn)
Θ(n^2Logn)_
************************************************************

**8. In the following C++ function, let n >= m. What is the time complexity of the below function assuming n > m?**
```c
int gcd(int n, int m) {
    if (n%m ==0) return m;
    if (n < m) swap(n, m);
    while (m > 0) {
        n = n%m;
        swap(n, m);
    }
    return n;
}
```

_**Answer:**_
_**Θ(logn)**
Ω(n)
Θ(loglogn)
Θ(sqrt(n))_
************************************************************

**9. Which of the following is not bounded by O(n^2)?**

_**Answer:**_
_(15^10) * n + 12099
n^1.98
**n^3 / (sqrt(n))**
(2^20) * n_
************************************************************

**10. In a competition, four different functions are observed. All the functions use a single for loop and within the for loop, same set of statements are executed.**
Consider the following for loops:

A) for(i = 0; i < n; i++) 
B) for(i = 0; i < n; i += 2) 
C) for(i = 1; i < n; i *= 2) 
D) for(i = n; i > -1; i /= 2)

If n is the size of input(positive), which function is the most efficient? In other words, which loop completes the fastest.

_**Answer:**_
_A
B
**C**
D_
************************************************************

**11. Which of the given options provides the increasing order of complexity of functions f1, f2, f3 and f4:**
```java
f1(n) = 2^n
f2(n) = n^(3/2)
f3(n) = nLogn
f4(n) = n^(Logn)
```

_**Answer:**_
_**f3, f2, f4, f1**
f3, f2, f1, f4
f2, f3, f1, f4
f2, f3, f4, f1_
************************************************************

**12. What is the worst case time complexity of the following code :**
```java
/* 
 * V is sorted 
 * V.size() = N
 * The function is initially called as searchNumOccurrence(V, k, 0, N-1)
 */
int searchNumOccurrence(vector<int> &V, int k, int start, int end) {
    if (start > end) return 0;
    int mid = (start + end) / 2;
    if (V[mid] < k) return searchNumOccurrence(V, k, mid + 1, end);
    if (V[mid] > k) return searchNumOccurrence(V, k, start, mid - 1);
    return searchNumOccurrence(V, k, start, mid - 1) + 1 + searchNumOccurrence(V, k, mid + 1, end);
}
```

_**Answer:**_
_O(sqrt N)
O(log N)
O(log^2 N )
**O(N)**
O(N * log N)
O(N * sqrt N)_
************************************************************

**13. What is the worst case time complexity of the following code:**
```java
int findMinPath(vector<vector<int> > &V, int r, int c) {
  int R = V.size();
  int C = V[0].size();
  if (r >= R || c >= C) return 100000000; // Infinity
  if (r == R - 1 && c == C - 1) return 0;
  return V[r][c] + min(findMinPath(V, r + 1, c), findMinPath(V, r, c + 1));
}
```
Assume R = V.size() and C = V[0].size().

_**Answer:**_
_**O(2^(R + C))**
O(R*C)
O(R + C)
O(R*R + C*C)
O(R*C*log(R*C))_
************************************************************

**14. What is the worst case time complexity of the following code:**
```java
int memo[101][101];
int findMinPath(vector<vector<int> >& V, int r, int c) {
  int R = V.size();
  int C = V[0].size();
  if (r >= R || c >= C) return 100000000; // Infinity
  if (r == R - 1 && c == C - 1) return 0;
  if (memo[r][c] != -1) return memo[r][c];
  memo[r][c] =  V[r][c] + min(findMinPath(V, r + 1, c), findMinPath(V, r, c + 1));
  return memo[r][c];
}
```

Callsite : 
memset(memo, -1, sizeof(memo));
findMinPath(V, 0, 0);
Assume R = V.size() and C = V[0].size() and V has positive elements

_**Answer:**_
_O(2^(R + C))
**O(R*C)**
O(R + C)
O(R*R + C*C)
O(R*C*log(R*C))_
************************************************************

**15. What is the time complexity of the following code :**
```java
int j = 0;
for(int i = 0; i < n; ++i) {
    while(j < n && arr[i] < arr[j]) {
        j++;
    }
}
```

_**Answer:**_
_**O(n)**
O(n^2)
O(nlogn)
O(n(logn)^2)
Can't say. Depends on the value of arr._
************************************************************
