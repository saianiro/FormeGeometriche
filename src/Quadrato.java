public class Quadrato extends FormaGeometrica {

  private int lato;

  public Quadrato(int lato) {
    this.lato = lato;
  }

  @Override
  public void calcolaArea() {
    int result = lato * lato;
    System.out.println("L'area del quadrato è " + result);
  }
}
