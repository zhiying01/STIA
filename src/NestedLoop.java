public class NestedLoop {

    public static void main(String[] args) {
        
        for(int k=1; k<=3;k++){
            for (int i=1; i<=10 ;i++){ //i<=k so follow the first loop only
            System.out.print("*");;
            }
            System.out.println("");
        }
    }
    
}
