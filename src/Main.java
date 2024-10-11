public class Main {
  public static void main(String[] args) {
    System.out.println("Forme geometriche");

    FormaGeometrica obj1 = new Cerchio(5);
    FormaGeometrica obj2 = new Quadrato(4);
    FormaGeometrica obj3 = new Triangolo(3, 7);

    //obj1.calcolaArea();
    //obj2.calcolaArea();
    //obj3.calcolaArea();

    FormaGeometrica[] forme = {obj1, obj2, obj3};

    //foreach
    // per ogni elemento "f" di tipo FormaGeometrica (tipo di dato)
    // all'interno ":" dell'array "forme"
    // invoco il metodo calcolaArea() dell'oggetto f
    for(FormaGeometrica f : forme) {
      f.calcolaArea();
    }

    for(int index = 0; index < forme.length; index++) {
      forme[index].calcolaArea();
    }

  }
}