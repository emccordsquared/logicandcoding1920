public class UniversalEx{
    
    public static int[] deci = {1,2,3,4,5,6,7,8,9,10};
    
    public static void main(String[] args) {
        
        boolean[] result = makebool();
        System.out.println(java.util.Arrays.toString(result));
    }
    
    public static boolean[] makebool() {
        
        boolean[] truf = new boolean[10];
        for ( int i = 0; i <=9; i++) {
            if (deci[i] % 2 == 0) {
                truf[i] = true;
            }
            else if (deci[i] % 2 == 1) {
                truf[i] = false;
            }
        }
        return truf;
    }
}
