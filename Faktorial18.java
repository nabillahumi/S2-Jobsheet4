public class Faktorial18 {

    public int faktorialBF (int n ) {
        int fakto =1;
        int i = 1; 
        do {
            fakto = fakto * i;
            i++;
        } while (i <= n);
        return fakto;
    }

    public int faktorialDC (int n ) {
        if (n == 1) {
            return 1;
        } else {
            int fakto = n * faktorialDC(n - 1);
            return fakto;
        }
    }
}