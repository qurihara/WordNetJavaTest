#!/bin/sh
javac -cp jawjaw-1.0.2.jar SimpleDemo.java
java -cp .:jawjaw-1.0.2.jar SimpleDemo > out.txt

