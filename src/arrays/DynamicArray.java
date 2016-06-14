/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;
import java.util.Scanner;
public class DynamicArray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int doc_id[]=new int[n];
        String doc_name[]=new String[n];
        float doc_sal[]=new float[n];
        for(int i=0;i<doc_id.length;i++){
            doc_id[i]=sc.nextInt();
            doc_name[i]=sc.next();
            doc_sal[i]=sc.nextFloat();
        }
        for(int i=0;i<doc_id.length;i++){
            System.out.println(doc_id[i]+"\t"+doc_name[i]+"\t"+doc_sal[i]3);
        }
    }
    
}
