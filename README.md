# kotlin-jdk9-javadoc-bug-demo

The intention of this project is to demonstrate the bug in the JDK 9 javadoc parser detailed
on the [Oracle Bug Tracker here](http://bugs.java.com/bugdatabase/view_bug.do?bug_id=JDK-8187087) and the 
[Kotlin YouTrack here](https://youtrack.jetbrains.com/issue/KT-20025).

## Development/Demonstration Environment Requirement

 - You need JDK 9 to be installed and its path assigned to your `$JAVA_HOME` environment variable.
 - **Notice:** If you have `$JAVA_HOME` environment variable assigned to the path of a JDK 8 install there will be no problem. 
 
 ## Demonstrating Bug
 
 On any 'nix' based system:
 
 ```bash
 ./gradlew javadoc
 ```
 
On Windows:
```
gradlew.bat javadoc
```

Gradle should dump the exception.

The bytecode that the kotlin compiler has produced
should be in the `build/classes/kotlin/main/example` directory.
