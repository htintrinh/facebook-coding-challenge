import java.util.Scanner;

public class TravelRestriction {

  public static void main(String[] args) {
    Scanner sa = new Scanner(System.in);
    int caseNum = sa.nextInt();

    for (int caseIdx = 0; caseIdx < caseNum; caseIdx++) {
      handleCase(sa, caseIdx);
    }
  }

  public static void handleCase(Scanner scanner, int caseIdx) {
    System.out.printf("Case #%d:\n", caseIdx + 1);
    int airLineNum = scanner.nextInt();
    scanner.nextLine();
    String in = scanner.nextLine();
    String out = scanner.nextLine();

    for (int i = 0; i < airLineNum; i++) {
      for (int j = 0; j < airLineNum; j++) {
        if (i == j) {
          System.out.print("Y");
          continue;
        }
        boolean ok = true;
        if (i < j) {
          for (int k = i; k < j; k++) {
            if (out.charAt(k) == 'N' || in.charAt(k + 1) == 'N') {
              ok = false;
            }
          }
        } else {
          for (int k = i; k > j; k--) {
            if (out.charAt(k) == 'N' || in.charAt(k - 1) == 'N') {
              ok = false;
            }
          }
        }
        printOk(ok);
      }
      System.out.println("");
    }
  }

  public static void printOk(boolean ok) {
    if (ok) {
      System.out.print("Y");
    } else {
      System.out.print("N");
    }
  }
}
