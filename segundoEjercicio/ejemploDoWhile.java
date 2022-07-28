public class ejemploDoWhile {
  public static void main(String[] args) {
    int numeroDoWhile = 1;
    String result = ejeDoWhile(numeroDoWhile);
    System.out.println(result);
  }

  public static String ejeDoWhile(int numeroWhile) {
    do {
      System.out.println(numeroWhile);
      numeroWhile++;
    } while (numeroWhile > 10);
    return "Fin del bucle";
  }
}
