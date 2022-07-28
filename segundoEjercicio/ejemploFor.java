public class ejemploFor {
  public static void main(String[] args) {
    int numeroFor = 0;
    String result = ejeFor(numeroFor);
    System.out.println(result);
  }

  public static String ejeFor(int numeroFor) {
    for (int i = 0; i <= 3; i++) {
      System.out.println(numeroFor);
      numeroFor++;
    }
    return "Fin del bucle";
  }
}
