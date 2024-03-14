package dominio;

public class Algoritmos {
    //35
//Este método suma los números desde 1 hasta n
    public static int suma(int n) {
        for(int i = 0; i < n; i++) {
            n += i;
       
        }
        return n;
    }

    //35
//Este método suma los cuadrados de los números desde 1 hasta n
    public static int sumaCuadrados(int n) {
       if (n == 0) {
           return 0;
       } else {
           return n * n + sumaCuadrados(n - 1);
        
       }
    }

    // int suma(int n) {
    //     int i;
    //     for(i = 0; i < n; i++) {
    //         n += i;
    //     }
    //     return n;
    // }
    
    // int sumaCuadrados(int n) {
    //     if (n == 0) {
    //         return 0;
    //     } else {
    //         return n * n + sumaCuadrados(n - 1);
    //     }
    // }

    //40
    //Este metodo calcula la potencia de dos numeros
    public static int potencia(int base, int exponente) {
       for(int i = 0; i < exponente; i++) {
           base *= base;
       }
       return base;
    }
    //41
//Este método calcula el factorial de un número
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
    //44
    public static boolean buscar(int e, int[] array){
        for(int i = 0; i < array.length; i++){
            if(array[i] == e){
                return true;
            }
        }
        return false;
    }
    //45

    public static boolean buscar(int e, int[] array, int index) {
        if (index == array.length) {
            return false;
        } else if (array[index] == e) {
            return true;
        } else {
            return buscar(e, array, index + 1);
        }
    }
//46
    public static int fibonacci(int n){
        if (n<=1){
        return n;
        }else{ 
        return fibonacci(n-1)+ fibonacci(n-2);
        }
    }
    
}
