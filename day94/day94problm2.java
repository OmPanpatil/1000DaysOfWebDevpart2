public class day94problm2 {
    public static int binocoefficient(int n, int r){
        int fact_n= n;
        int fact_r = r;
        int fact_nmr = n - r;
        int binocoefficient = fact_n/(fact_r*fact_nmr);
        return binocoefficient;
    }

    public static void main(String[] args) {

        System.out.println(binocoefficient(2,3 ));
        
    }
}