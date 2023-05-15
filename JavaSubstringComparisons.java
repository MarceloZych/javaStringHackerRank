/**En este ejercicio vamos a La ordenación lexicográfica es un método de ordenamiento utilizado para ordenar elementos alfabéticamente o de acuerdo con su orden en el diccionario. 
 * En el caso de las cadenas de texto, la ordenación lexicográfica se basa en la comparación de los valores numéricos de los caracteres en las cadenas.

Cuando se comparan dos cadenas lexicográficamente, se examinan los caracteres de las cadenas en orden secuencial. La comparación se realiza comparando el valor numérico de los 
caracteres correspondientes en cada posición. Si los caracteres en una posición son iguales, se pasa a la siguiente posición y se compara nuevamente. Esto continúa hasta que se 
encuentra una diferencia o se llega al final de una de las cadenas.

Aquí hay algunos ejemplos para ilustrar cómo funciona la ordenación lexicográfica:

"apple" vs "banana":
La comparación comienza con el primer carácter 'a' en ambas cadenas. Como 'a' es igual a 'a', pasamos al siguiente carácter. En la segunda posición, 'p' es menor que 'b' en la 
cadena "banana". Por lo tanto, "apple" es lexicográficamente menor que "banana".

"cat" vs "car":
La comparación comienza con el primer carácter 'c' en ambas cadenas. Como 'c' es igual a 'c', pasamos al siguiente carácter. En la segunda posición, 'a' es igual a 'a'. Luego, 
en la tercera posición, 't' es mayor que 'r'. Por lo tanto, "cat" es lexicográficamente mayor que "car".

"book" vs "boot":
La comparación comienza con el primer carácter 'b' en ambas cadenas. Como 'b' es igual a 'b', pasamos al siguiente carácter. En la segunda posición, 'o' es igual a 'o'. Luego, 
en la tercera posición, 'o' es menor que 't' en la cadena "boot". Por lo tanto, "book" es lexicográficamente menor que "boot". */

/** otros ejemplos podrian ser: ball < cat, dog < dorm, Happy < happy, Zoo < ball. */

import java.io.*;
import java.util.*;

public class Solution {
    
    public static String myString(String s, int n){
        String smallest = "";
        String largest = "";
        
                
        for (int i = 0; i <= s.length() - n; i++) {
            String subs = s.substring(i, i + n);
            
            if (subs.compareTo(smallest) < 0 || smallest.isEmpty()) {
                smallest = subs;
            }
            
            if (subs.compareTo(largest) > 0 || largest.isEmpty()) {
                largest = subs;
            }
        }
        return smallest +"\n"+ largest;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int N = sc.nextInt();
        sc.close();
        
        String result = myString(S , N);

        System.out.println(result);
        
    }
}