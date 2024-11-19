# code wars


## run
```
sdk env
./gradlew build
./gradlew run
./gradlew test

./gradlew run < submissions/cw1157a.txt
```


## problems

- https://codeforces.com/contest/1157/problem/A


### codeforces round 988 (div 3)
- https://codeforces.com/contest/2037


## reference

- https://codeforces.com/blog/entry/71089

- https://play.kotlinlang.org/byExample/overview
- https://kotlinlang.org/docs/collections-overview.html


## notes

```kotlin
//fun main(args: Array<String>) {
    // 1) args:
    // ./gradlew run --args="arg1 arg2 arg3"
    args.forEach { println("Argument: $it") }

    // 2) stdin, line by line
    // echo "hello world" | ./gradlew run
    // ./gradlew run < a.txt
    println("Enter input:")
    val input = readLine()
    println("You entered: $input")

    // 3) stdin, at once
    val input = System.`in`.bufferedReader().readText()
    println("input = $input")
```
