/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

import java.util.Scanner;
public class DynamicTwoDimentional {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int doc_id[][]=new int[n][n];
        String doc_name[][]=new String[n][n];
        float doc_sal[][]=new float[n][n];
        for(int i=0;i<doc_id.length;i++){
            for(int j=0;j<doc_id.length;j++){
            doc_id[i][j]=sc.nextInt();
            doc_name[i][j]=sc.next();
            doc_sal[i][j]=sc.nextFloat();
        }
        }
        for(int i=0;i<doc_id.length;i++){
            for(int j=0;j<doc_id.length;j++){
            System.out.println(doc_id[i][j]+"\t"+doc_name[i][j]+"\t"+doc_sal[i][j]);
        }
    }
    
}
}


