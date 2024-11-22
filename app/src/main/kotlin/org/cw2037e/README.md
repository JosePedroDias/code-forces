`s` - binary string we need to guess
`n` - size of the binary string

`f(l, r)` (1 >= l > r >= n)
number of subsequences of `01` in `s`

```
                12345
             (s=01001)
             n=5
? 1 5        4
? 2 4        0
? 4 5        1
? 3 5        2
! 01001
n=2
? 1 2        0
! IMPOSSIBLE
```
