There are two ways to run the test from the command line interface:

1. Download selenium/out/artifacts/kraftvaerktest_jar/kraftvaerktest.jar, then run it with
java -classpath "pathTo_1\.m2\repository\junit\junit\4.12;pathTo_2\kraftvaerktest.jar" org.junit.runner.JUnitCore rutest.Kraftvaerk
  where pathTo_1 and PathTo_2 are paths to JUnit and kraftvaerktest.jar
  
2. Build project with Maven:
mvn -f pathTo_3\kraftvaerktest clean install assembly:single
  where pathTo_3 is a path to kraftvaerktest project

then run the test:
java -classpath "pathTo_3\kraftvaerktest\target\kraftvaerk-test-1.0-SNAPSHOT-jar-with-dependencies.jar;pathTo_3\kraftvaerktest\target\kraftvaerk-test-1.0-SNAPSHOT-tests.jar" org.junit.runner.JUnitCore rutest.Kraftvaerk
