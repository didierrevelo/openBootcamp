public class ejemploSwitch {
  public static void main(String[] args) {
    String estacion = "invierno";
    String result = ejeSwitch(estacion);
    System.out.println(result);
  }

  public static String ejeSwitch(String estacion) {
    switch (estacion) {
      case "invierno":
        return "Estamos en invierno";
      case "primavera":
        return "Estamos en primavera";
      case "verano":
        return "Estamos en verano";
      case "otoño":
        return "Estamos en otoño";
      default:
        return "No se ha definido la estación";
    }
  }
}
