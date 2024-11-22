#!/bin/bash

mkdir -p app/src/main/kotlin/org/cw${1}${2}
printf "package org.cw${1}${2}\n\n"   > app/src/main/kotlin/org/cw${1}${2}/main.kt
cat submissions/tpl/main-app.txt     >> app/src/main/kotlin/org/cw${1}${2}/main.kt
printf "package org.cw${1}${2}\n\n"   > app/src/main/kotlin/org/cw${1}${2}/code.kt
cat submissions/tpl/code.txt         >> app/src/main/kotlin/org/cw${1}${2}/code.kt

mkdir -p app/src/test/kotlin/org/cw${1}${2}
printf "package org.cw${1}${2}\n\n" > app/src/test/kotlin/org/cw${1}${2}/test.kt
cat submissions/tpl/test.txt       >> app/src/test/kotlin/org/cw${1}${2}/test.kt

mkdir -p submissions/cw${1}${2}
touch    submissions/cw${1}${2}/input.txt
touch    submissions/cw${1}${2}/expected.txt
cp submissions/tpl/main-sub.txt submissions/cw${1}${2}/main.kt
cp submissions/tpl/go.sh submissions/cw${1}${2}/go.sh
