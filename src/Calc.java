import java.util.ArrayList;
import java.util.List;

public class Calc {

 
	 public int numeroInt(String s){

        String num = s.trim().toLowerCase();
        num = num.replaceAll("(.)\\1", "$1");
        int d;
        
        if (num.equals("uno")){
            d = 1;
        }
        else if (num.equals("dos")) {
            d = 2; 
        }
        else if (num.equals("tres")) {
            d = 3; 
        }
        else if (num.equals("cuatro")) {
            d = 4; 
        }
        else if (num.equals("cinco")) {
            d = 5; 
        }
        else if (num.equals("seis")) {
            d = 6; 
        }
        else if (num.equals("siete")) {
            d = 7; 
        }
        else if (num.equals("ocho")) {
            d = 8; 
        }
        else if (num.equals("nueve")) {
            d = 8; 
        }
        else {
            d = 0; 
        }


        return d;
    }

   public List<Integer> valoresDeNumeros(String s) {
        List<Integer> valores = new ArrayList<Integer>();;

        //Normalizacion de las palabras
        String[] palabras = s.trim().split("\s+");

        // Por cada palabra se invoca al metodo
        for(int i=0;i<palabras.length;i++){
           // y el valor se añade a una Lista
           valores.add(numeroInt(palabras[i]));
        }
        return valores;
    }

    public List<Double> reglaDe3(double[] array, double valor) {
        List<Double> regla = new ArrayList<>();
       
        double total = 0;
    
            //--Para sumar el total del array
        for(int i=0;i<array.length;i++){
           total = total + array[i];
        }
            //--Para realizar la regla de 3
        for(int i=0;i<array.length;i++){
            double nuevo = array[i]*valor/ total;
            regla.add(nuevo);
        }
        return regla;
    }
}
