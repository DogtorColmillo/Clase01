public class Clase01Ejercicio02{
   public static void main(String[] args){
      //System.out.println("Hola mundo!");
      float ingresos = 200000;
      int vehiculo1 = 7;
      int vehiculo2 = 8;
      int vehiculo3 = 6;
      int numeroInmuebles = 2;
      boolean embarcacion = false;
      boolean aeronave = false;
      boolean activosSocietarios = false;
      if((ingresos>=489083) || (vehiculo1<5 && vehiculo2<5 && vehiculo3<5) || (numeroInmuebles>=3) || (embarcacion || aeronave || activosSocietarios))
         System.out.println("Hogar de alto ingreso.");
      else
         System.out.println("Hogar de bajo ingreso.");
   }
}