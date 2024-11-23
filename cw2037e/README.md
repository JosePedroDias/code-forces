
secret binary string `s` of size `n`

we can query limits `f(l, r)`, to get the amount of subsequences of `01`, ie,
starting from the substring with our limit and removing none to all digits, how many `01`
transitions there are.
string positions as 1-based.

ask up to `n` questions.

if there are more than 1 possible `s` by then, reply `IMPOSSIBLE`

as soon as we know the single possible `s`, reply with `! 01010000101`

we sure to newline and flush between interactions ( `System.out.flush()` )
