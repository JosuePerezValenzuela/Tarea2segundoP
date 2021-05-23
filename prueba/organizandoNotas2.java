public class organizandoNotas2
{
    private int estudiantes;
    public organizandoNotas2(int est){
     estudiantes = est;
    }
    public int [] arreglo (){
      int [] notas = new int [estudiantes];
      return notas;
    }
    public void añadirNotas(int nota, int estudiante, int a[]){
        int estudianteReal = estudiante -1;
        a[estudianteReal] = nota;
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
