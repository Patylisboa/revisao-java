public class NumerosPares {
    public static void main(String[] args){
        double par;
        for(int i=1; i<=100; i++){
            par = i%2;
            if(par == 0){
                System.out.println(i);
            }
        }
    }
}
