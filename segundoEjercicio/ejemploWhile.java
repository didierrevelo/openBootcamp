public class ejemploWhile {
  public static void main(String[] args) {
    int numeroWhile = 1;
    String result = ejeWhile(numeroWhile);
    System.out.println(result);
  }

  public static String ejeWhile(int numeroWhile) {
    while (numeroWhile <= 10) {
      System.out.println(numeroWhile);
      numeroWhile++;
    }
    return "Fin del bucle";
  }
}
