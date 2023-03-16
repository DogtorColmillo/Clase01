public class Clase01Ejercicio01{
   public static void main(String[] args){
      //System.out.println("Hola mundo!");
      int numeroInicio=6;
      int numeroFin=14;
      int numeroEvaluable=numeroInicio;

      System.out.println("a.Mostrar todos los números entre "+numeroInicio+" y "+numeroFin+":");
      while(numeroEvaluable<=numeroFin){
         System.out.println(numeroEvaluable);
         numeroEvaluable++;
      }
      
      numeroEvaluable=numeroInicio;
      System.out.println("b.Mostrar los números pares entre "+numeroInicio+" y "+numeroFin+":");
      while(numeroEvaluable<=numeroFin){
         if(numeroEvaluable%2 == 0)
            System.out.println(numeroEvaluable);
         numeroEvaluable++;
      }
      
      numeroEvaluable=numeroInicio;
      int resto=1;
      System.out.println("c.Mostrar los números pares/impares entre "+numeroInicio+" y "+numeroFin+":");
      while(numeroEvaluable<=numeroFin){
         if(numeroEvaluable%2 == resto)
            System.out.println(numeroEvaluable);
         numeroEvaluable++;
      }
      
      numeroEvaluable=numeroFin;
      System.out.println("d.Mostrar los números pares descendentes entre "+numeroInicio+" y "+numeroFin+":");
      for(;numeroEvaluable>=numeroInicio;numeroEvaluable--){
         if(numeroEvaluable%2 == 0)
            System.out.println(numeroEvaluable);
      }
   }
}