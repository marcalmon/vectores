/**
 *
 * @author Ingles
 */
public class Vectores1 {
    
    public static void main(String[] args){
    
        int indicePositivo=0;
        int i;
        int[] vecNumeros={11, -22, 33, -44, 55, -66, 77, -88, 99};
        int[] vecPositivos=new int[10];
    
        for (i=0; i<vecNumeros.length; i++){
    
            System.out.print(vecNumeros[i]+ " ");
    
           }
        for(i=0; i<vecNumeros.length; i++){
            if (vecNumeros[i]>0){
        
                vecPositivos[indicePositivo]=vecNumeros[i];
                indicePositivo++;
            }
        
        }
        for(i=0; i<vecNumeros.length; i++){
            System.out.print("\n" +vecPositivos[i] + " ");
        }
        for(i=0; i<indicePositivo; i++){
            System.out.print("\n" +vecPositivos[i] + " ");
        }
    }
    
}
