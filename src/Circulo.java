public class Circulo implements Forma{
    private String color;

    public Circulo(String color){
        this.color = color;
    }
    @Override
    public void dibujar(int x, int y, int radio){
        System.out.println("Dibujando un círculo [Color: " + color + ", x: " + x + ", y: " + y + ", Radio: " + radio + "]");
    }
}
