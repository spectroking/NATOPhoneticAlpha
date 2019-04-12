/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package natophoneticalpha;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author KingLM
 */
public class NATOPhoneticAlpha extends HashMap<String, String>{
    
//    @Override
//    public String put(String key, String value) {
//        return super.put(key.toLowerCase(), value);
//    }
//    
//    @Override
//    public String get(Object key) {
//        return super.get(key.toString().toLowerCase());
//    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
//
//        char[] plain = in.next().toCharArray();
//        char[] key = in.next().toCharArray();
//        char[] cypher = new char[plain.length];
//        
//        char[][] vigenereSquare = new char[26][26];
//        for(int i = 0; i < vigenereSquare.length; i++) {
//            for(int j = 0; j< vigenereSquare[0].length; j++) {
//                vigenereSquare[i][j] = (char) (65 + (j + i) % 26);
//            }
//        }
//        
//        int k = 0;
//        for (char[] vigenereSquare1 : vigenereSquare) {
//            for (int j = 0; j< vigenereSquare[0].length; j++) {
//                if (vigenereSquare1[0] == plain[k] && vigenereSquare[0][j] == key[k]) {
//                    cypher[k] = vigenereSquare1[j];
//                    k++;
//                }
//            }
//        }
//       
//        for(int i = 0; i < cypher.length; i++) {
//            System.out.print(cypher[i]);
//            Arrays.toString(cypher);
//        }


        HashMap<String, String> alphaDic = new NATOPhoneticAlpha();
        alphaDic.put("A", "Alpha");
        alphaDic.put("B", "Bravo");
        alphaDic.put("C", "Charlie");
        alphaDic.put("D", "Delta");
        alphaDic.put("E", "Echo");
        alphaDic.put("F", "Foxtrot");
        alphaDic.put("G", "Golf");
        alphaDic.put("H", "Hotel");
        alphaDic.put("I", "India");
        alphaDic.put("J", "Juliett");
        alphaDic.put("K", "Kilo");
        alphaDic.put("L", "Lima");
        alphaDic.put("M", "Mike");
        alphaDic.put("N", "November");
        alphaDic.put("O", "Oscar");
        alphaDic.put("P", "Papa");
        alphaDic.put("Q", "Quebec");
        alphaDic.put("R", "Romeo");
        alphaDic.put("S", "Sierra");
        alphaDic.put("T", "Tango");
        alphaDic.put("U", "Uniform");
        alphaDic.put("V", "Victor");
        alphaDic.put("W", "Whiskey");
        alphaDic.put("X", "Xray");
        alphaDic.put("Y", "Yankee");
        alphaDic.put("Z", "Zulu");

        while (in.hasNext()) {
            String str = in.next();
            String[] str2 = str.split("");

            for (String s : str2) {
                String a = s.toUpperCase();
                if (alphaDic.containsKey(a)) {
                    System.out.print(" " + alphaDic.get(a));
                } else {
                    System.out.print(a);
                }
            }
            
            System.out.println("");
        }

   }

}
