// import java.util.ArrayList;

public class Main1 {
  public static void main(String[] args) {
    Coche miCoche = new Coche();
    miCoche.carDoors(1);
    System.out.println(miCoche.doors);
  }

}

class Coche {
  public int doors = 4;

  public void carDoors(int n) {
    this.doors += n;
  }
}
