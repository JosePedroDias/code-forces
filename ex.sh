#!/bin/bash

mkdir -p app/src/main/kotlin/org/cw${1}${2}
echo "package org.cw${1}${2}" > app/src/main/kotlin/org/cw${1}${2}/main.kt
echo "package org.cw${1}${2}" > app/src/main/kotlin/org/cw${1}${2}/code.kt

mkdir -p app/src/test/kotlin/org/cw${1}${2}
echo "package org.cw${1}${2}" > app/src/test/kotlin/org/cw${1}${2}/test.kt

mkdir -p submissions/${1}${2}
touch    submissions/${1}${2}/input.txt
touch    submissions/${1}${2}/expected.txt
touch    submissions/${1}${2}/code.kt
cp submissions/2037A/go.sh submissions/${1}${2}/go.sh
