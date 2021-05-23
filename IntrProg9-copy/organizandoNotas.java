import java.util.Scanner;
public class organizandoNotas
{
    private int estudiantes;
    public organizandoNotas(int est){
     estudiantes = est;
    }
    public int [] añadirNotas(){
     Scanner teclado = new Scanner(System.in);   
     int notas [] = new int [estudiantes];
      for (int i = 0; i < estudiantes; i = i+1){
        notas [i]= teclado.nextInt();   
     }
     return notas;
    }
    public double prom(int a []){
      double aux = 0; 
      double suma = 0;
      for (int i = 0 ; i < a.length; i = i +1){
          suma = a [i]+ aux;
          aux = suma;
        }
       double promedio = suma / a.length;
       return promedio;
    }
    public double promApro(int a []){
       double aux = 0;
       double suma = 0;
       int contador = 0;
       for (int i = 0; i < a.length; i = i +1){
         if(a [i] >50){
             suma = a [i]+ aux;
             aux = suma;
             contador = contador + 1;
        } 
       }
       double promedio = suma / contador;
       return promedio;
    }
    public double repro(int a []){
       int repro = 0;
       for (int i = 0; i < a.length; i = i +1){
         if(a [i] <51){
             repro++;
        } 
       }
       return repro;
    }
    public double apro(int a []){
       int apro = 0;
       for (int i = 0; i < a.length; i = i +1){
         if(a [i] >51){
             apro++;
        } 
       }
       return apro;
    }
    public double mayor(int a []){
      int aux = 0;
      for (int i = 0; i< a.length;i = i+1){
        int mayor = Math.max( a [i], aux);
        aux = mayor;
        }
        return aux;
    }
}
