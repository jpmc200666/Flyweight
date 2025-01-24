public class App {
    private static final String[] colores = {"Rojo", "Verde", "Azul", "Blanco", "Negro"};
    public static void main(String[] args) throws Exception {
        for(int i = 0; i < 10; i++){
            String color = getRandomColor();
            int x = getRandomNumber();
            int y = getRandomNumber();
            int radio = getRandomNumber();
            Forma circulo = FabricaForma.getCirculo(color);
            circulo.dibujar(x, y, radio);
        }
    }

    private static String getRandomColor(){
        return colores[(int)(Math.random()*colores.length)];  
    }
    private static int getRandomNumber(){
        return (int) (Math.random()*100);
    } 
}
