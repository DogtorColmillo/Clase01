public class EjerciciosDiscordClase01 {
   public static void main(String[] args) {
      // System.out.println("Hola mundo!");
      int numeroA = 9;
      int numeroB = 3;
      int numeroC = 5;
      int anio = 1994;

      System.out.println("1.Comprobar si un numero es par o impar:");
      if (numeroA % 2 == 0)
         System.out.println("numeroA (" + numeroA + ") es par");
      else
         System.out.println("numeroA (" + numeroA + ") es impar");

      System.out.println("2.Comprobar si un numero es positivo, negativo o cero:");
      if (numeroA == 0)
         System.out.println("numeroA (" + numeroA + ") es cero");
      else if (numeroA > 0)
         System.out.println("numeroA (" + numeroA + ") es positivo");
      else if (numeroA < 0)
         System.out.println("numeroA (" + numeroA + ") es negativo");

      System.out.println("3.Comprobar si un numero es divisible por otro:");
      if (numeroA % numeroB == 0)
         System.out.println("numeroA (" + numeroA + ") es divisible por numeroB (" + numeroB + ")");
      else
         System.out.println("numeroA (" + numeroA + ") no es divisible por numeroB (" + numeroB + ")");

      System.out.println("4.Comprobar si un año es bisiesto:");
      if (anio % 4 == 0 && anio % 100 != 0)
         System.out.println("El año " + anio + " es bisiesto");
      else
         System.out.println("El año " + anio + " no es bisiesto");

      System.out.println("5.Comprobar si un numero es primo:");
      int divisor = (numeroA - 1) / 2;
      while (divisor > 1)
         if (numeroA % divisor != 0)
            divisor--;
         else
            break;
      if (divisor != 1)
         System.out.println("El numeroA (" + numeroA + ") no es primo.");
      else
         System.out.println("El numeroA (" + numeroA + ") es primo.");

      System.out.println("6.Calcular el mayor de tres números:");
      if (numeroA > numeroB && numeroA > numeroC)
         System.out.println("El numeroA (" + numeroA + ") es el mayor.");
      else if (numeroB > numeroC)
         System.out.println("El numeroB (" + numeroB + ") es el mayor.");
      else
         System.out.println("El numeroC (" + numeroC + ") es el mayor.");

      System.out.println("7.Calcular si un número está dentro de un rango:");
      if (numeroA >= 5 && numeroA <= 10)
         System.out.println("El numeroA (" + numeroA + ") es está en el rango [5,10].");
   }
}