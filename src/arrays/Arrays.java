/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

/**
 *
 * @author miracle
 */
public class Arrays {

    
    public static void main(String[] args) {
        int doc_id[]={276,232,886,112};
        String doc_name[]={ "priya","janu","sowmya","jyothi"};
        float doc_sal[]={20000f,30000f,35000f,45000f};
        for(int i=0;i<doc_id.length;i++){
            System.out.println(doc_id[i]+"\t"+doc_name[i]+"\t"+doc_sal[i]);
        }        
    }
    
}
