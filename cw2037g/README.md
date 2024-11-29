
<n> - number of cities [2, 200000]
<a1>, <a2>, ..., <an> - attractiveness of each city [2, 1000000]

A directed edge exists from City 𝑖 to City 𝑗 if and only if 𝑖<𝑗 and gcd(𝑎𝑖,𝑎𝑗) ≠ 1


compute edges always smaller to bigger
discard pairs which have gcd != 1

we always start at city 1
we should always end at city n
how many distinct paths exist?

```
5
2 6 3 4 6
```

2 (1)
6 (5)

