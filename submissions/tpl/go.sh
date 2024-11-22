#!/bin/bash

kotlinc code.kt -include-runtime -d code.jar
kotlin code.jar < input.txt | diff -s - expected.txt
