public class Ejecutar {
   public static void main(String[] args) {
     
      //Forma 1 - Creación del arreglo
      int[] a = {2, 8, 10, 6, 15, 20, 21, 1, 3, 12};
 
      //Mostrar el arreglo
      for (int i = 0; i < a.length; i++) {
         System.out.println("a[" + i + "]=" + a[i]);  
      }
 
      //Forma 2 - llenando el arreglo de manera aleatoria
      int[] b = new int[5]; //arerglo b de tamaño 5
 
      int max = 100;
      int min = 1;
 
      //Llenamos el arreglo
      for (int i = 0; i < b.length; i++) {
         b[i] = (int)(Math.random() * (max - min + 1)) + min;
      }
 
      //Mostrar el arreglo
      for (int i = 0; i < b.length; i++) {
         System.out.println("b[" + i + "]=" + b[i]);  
      }
   }
}
