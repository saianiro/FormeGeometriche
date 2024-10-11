public class Cerchio extends FormaGeometrica {

  private int raggio;

  public Cerchio(int raggio) {
    this.raggio = raggio;
  }

  @Override
  public void calcolaArea() {
    double result = (raggio * raggio) * PI_GRECO;
    System.out.println("L'area del cerchio è " + result);
  }
}
