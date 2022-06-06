// You can experiment here, it won’t be checked

public class Task {
  public static void main(String[] args) {
    System.out.print("**");
    System.out.println();
    System.out.println("**");
    System.out.print("**");

    boolean b1 = false;
    boolean b2 = true;
    boolean b3 = false;
    boolean result = (b1 && b2) ? b1 : (b2 || b3) ? b2 : b3;
    System.out.println(result);
  }
}
