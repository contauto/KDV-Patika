import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        double kdvsiz=0;
        double kdvli=0;
        double oran=0;

        Scanner scanner=new Scanner(System.in);

        System.out.println("Tutarı giriniz.");
        kdvsiz=scanner.nextDouble();

        if(kdvsiz<1000&&kdvsiz>0){
            oran=0.18;
        }
        else{
            oran=0.08;
        }
        kdvli=kdvsiz+(kdvsiz*oran);
        System.out.println("KDV="+oran);
        System.out.println("KDVli tutar: "+kdvli);
    }
}
