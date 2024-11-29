#!/bin/bash

kotlinc src/main.kt -include-runtime -d main.jar
kotlin main.jar < input.txt | diff -s - expected.txt
