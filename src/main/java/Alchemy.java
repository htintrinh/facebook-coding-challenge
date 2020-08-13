import java.util.Scanner;

public class Alchemy {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int caseNum = scanner.nextInt();
    scanner.nextLine();

    for (int i = 0; i < caseNum; i++) {
      handleCase(scanner, i);
    }
  }

  public static void handleCase(Scanner scanner, int caseIdx) {
    int shardNum = scanner.nextInt();
    scanner.nextLine();
    String shards = scanner.nextLine();

    int aShardCount = 0;
    int bShardCount = 0;
    for (int i = 0; i < shardNum; i++) {
      if (shards.charAt(i) == 'A') {
        aShardCount++;
      } else {
        bShardCount++;
      }
    }
    if (Math.abs(aShardCount - bShardCount) > 1) {
      System.out.printf("Case #%d: N\n", caseIdx + 1);
      return;
    }
    System.out.printf("Case #%d: Y\n", caseIdx + 1);
  }
}
