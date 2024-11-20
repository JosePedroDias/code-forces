#!/bin/bash
kotlinc code.kt -include-runtime -d code.jar
kotlin code.jar < input.txt | diff -s - expected.txt
#java -Xms1024m -Xmx2048m -jar code.jar < input2.txt
