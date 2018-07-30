Using Java to evaluate the longest word in a sentence.
This Java project was built with Maven so the steps to run it are as follows.

_All maven commands start with "mvn"._

```
1. git clone https://github.com/avck25/MavenLongestWord.git
2. cd MavenLongestWord 
3. mvn compile
4. mvn Package (this also runs through the tests that were set up)
```
To run the tests again just run ```mvn test```

 To run the program on Windows just run this command:
```java -cp  target/LongestWord-1.0-SNAPSHOT.jar com.akurtz.App [sentence that you want evaluated]```
