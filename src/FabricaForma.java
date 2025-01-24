import java.util.HashMap;

public class FabricaForma {
    private static final HashMap<String, Forma> MapaCirculo = new HashMap<>();

    public static Forma getCirculo(String color){
        Circulo circulo = (Circulo) MapaCirculo.get(color);
        if(circulo == null){
            circulo = new Circulo(color);
            MapaCirculo.put(color, circulo);
            System.out.println("Creando un nuevo circulo de color " + color);            
        }
        return circulo;
    }
}
