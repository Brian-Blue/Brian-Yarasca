import java.util.ArrayList;
import java.util.Collection;

public class EjemploCollection {
    public static void main(String[] args){
        Collection<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(2);
        System.out.println("Existe el numero 3"+numeros.contains(3));
        System.out.println("Tamano: "+ numeros.size());
    }

}
