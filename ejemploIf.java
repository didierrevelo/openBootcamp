public class ejemploIf {
  public static void main(String[] args) {
    int numeroIf = 15;
    String result = ejeIf(numeroIf);
    System.out.println(result);
  }

  public static String ejeIf(int numeroIf) {
    if (numeroIf > 0) {
      return "El numero es positivo";
    } else if (numeroIf == 0) {
      return "El numero es cero";
    } else {
      return "El numero es negativo";
    }
  }

}
