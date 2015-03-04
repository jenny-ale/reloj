
package reloj;

public class Reloj {

    
    public static void main(String[] args) {
  
        int h=0,m=0,s=0;
        
        while(h<24){
        while(m<60){
        while(s<60){
      System.out.println(h+":"+m+":"+s);
      s++;
        } s=0; m++;
        } m=0;  h++;
        }
        
        
    }
    
}
