import java.util.*;
public class Java_RSA_Encryption {
    public static void main(String... args){
        double p,q,n, phi,e = 1,m,i,j,g=1;
        double c,z,d;

        Scanner s = new Scanner(System.in);
        System.out.println("\n\nEnter any two prime numbers\n\n");

        p = s.nextInt();
        q = s.nextInt();
        n = q*p;

        System.out.println("n = "+n);
        phi = (p-1)*(q-1);
        System.out.println("Phi= "+phi);
        for(e=2;e<n;e++){
            if(gcd(e,phi)==1){
                break;
            }

        }
        System.out.println("e = "+e);
        System.out.println("\nPublic Key is("+ e+","+n+")");
        for (d=1;;d++){
            if((e * d) % phi == 1) {
                break;
            }
        }
        System.out.println("d= "+ d);
        System.out.println("Private key is("+d+","+n+")");
        System.out.println("Enter Message");
        m = s.nextInt();
        c = Math.pow(m,e)%n;
        System.out.println("Encrypted Message : " + c);
        z= Math.pow(c,d)%n;
        System.out.println("Decrypted Message : "+z);
    }
    static double gcd(double a, double b) {
        double gcd = 1, min = a, j;
        if (b < a) {
            min = b;
        }
        for (j = 1; j <= min; j++) {
            if (a % j == 0 && b % j == 0) {
                gcd = j;
            }

        }
        return gcd;
    }
}
