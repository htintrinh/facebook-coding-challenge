import org.joda.time.LocalDateTime;

public class DemoMainWithDep {

  public static void main(String[] args) {
    LocalDateTime dateTime = LocalDateTime.now();
    System.out.println(dateTime.toString());
  }
}
