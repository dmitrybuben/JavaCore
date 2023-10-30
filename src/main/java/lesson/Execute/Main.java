package lesson.Execute;
import lesson.Calculate.Make;

//javac -sourcepath ./java -d out java/lesson/Execute/Main.java

/*FROM bellsoft/liberica-openjdk-alpine
  COPY ./java ./src
  RUN mkdir ./out
  RUN javac -sourcepath ./src -d out src/lesson/Execute/Main.java
  CMD java -classpath ./out lesson/Execute/Main

  (base) dmitrybuben@MacBook-Air main % docker build . -t sampleappjava:v1
  (base) dmitrybuben@MacBook-Air main % docker run sampleappjava
  */

public class Main {
    public static void main(String[] args) {
        int res = Make.sum(5,5);
        System.out.printf("The result is: %d.\n",res);
        res = Make.sub(10,4);
        System.out.printf("The result is: %d.\n",res);
        res = Make.div(10,2);
        System.out.printf("The result is: %d.\n",res);
        res = Make.mul(10,2);
        System.out.printf("The result is: %d.\n",res);
    }
}