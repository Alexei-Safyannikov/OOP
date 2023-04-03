package OOP1;

public class LymdaDemo2 {
    public static void main(String[] args) {
        NumerikTest isFactor = (n,d)->(n%d)==0;

        if (isFactor.test(10,2)){
            System.out.println("2 являетcя делителем 10");
        }
        if (!isFactor.test(10,3)){
            System.out.println("3 не являетcя делителем 10");
        }

        NumerikTest lesZen = (n,m)->(n<m);

        if (lesZen.test(2,10)){
            System.out.println("2 < 10");
        }
        if (!lesZen.test(10,3)){
            System.out.println("10 !< 3");
        }

        NumerikTest absqual = (n,m)->(n<0 ? -n:n)==(m<0?-m:m);

        if (absqual.test(4,-4)){
            System.out.println("4 = -4");
        }
        if (!absqual.test(4,-5)){
            System.out.println("4 !< -5");
        }
    }

}
