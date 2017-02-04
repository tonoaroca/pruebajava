package wc_cryptocesar;

import java.util.Scanner;

/**
 *
 * @author LUIFRAN
 */
public class Wc_cryptocesar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String cadena = sc.nextLine();
        
        cadena = cadena.toUpperCase();
        
        for(int i = 1; i<26; i++)
        {
            System.out.println(CifradoCesar(cadena,i));
        }
        
    }
    
    
    public static String CifradoCesar(String Cadena, int dz)
        {
            String Cifrado = "";
            int[] Ascii = new int[Cadena.length()];
            int i;
            int tmp = 0;

            for (i = 0; i < Cadena.length();i++ )
            {
                Ascii[i] = Cadena.charAt(i);

                if(Ascii[i] != 32)
                {
                    Ascii[i] = Ascii[i] - dz;

                    if (Ascii[i] < 65)
                    {
                        tmp = 65 - (Ascii[i]);
                        Ascii[i] = 91 - tmp;
                    }
                }

                Cifrado = Cifrado + (char) Ascii[i];
            }

            return Cifrado;
        }
    
}
