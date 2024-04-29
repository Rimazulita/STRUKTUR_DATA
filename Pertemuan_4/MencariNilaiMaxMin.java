package Array1Dimensi;
import java.util.Arrays;
import java.util.Collections;
public class MencariNilaiMaxMin {
    public static void main(String[] args) {
        Integer [] a = {19,24,32,47,100,51,62,77,85,92,0};
        int maks = Collections.max(Arrays.asList(a));
        int min = Collections.min(Arrays.asList(a));
       
        System.out.print("Deret Angka : ");
        
        for(int i=0; i<a.length; i++){
            System.out.print(a[i]+" ");
        }
       
        System.out.println("");
        System.out.println("maks : "+maks);
        System.out.println("min : "+min);
    }
    
}
