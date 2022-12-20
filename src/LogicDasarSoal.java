public class LogicDasarSoal {
    public static void main(String[] args) {
        System.out.println("Soal 1");
        soal1(9);
        System.out.println("Soal 2");
        soal2(9);
        System.out.println("Soal 3");
        soal3(9);
        System.out.println("Soal 4");
        soal4(9);
        System.out.println("Soal 5");
        soal5(9);
        System.out.println("Soal 6");
        soal6(9);
        System.out.println("Soal 8");
        soal8(9);
        System.out.println("Soal 9");
        soal9(9);
        System.out.println("Soal 10");
        soal10(9);

        System.out.println("Soal 1 Part 2");
        soal1part2(9);
    }
    public static void soal1(int n) {
        int[] deret = new int[n];
        for (int i = 1; i <= deret.length; i++){
            System.out.print(i+"\t\t");
        }System.out.println("\n");
    }

    public static void soal2(int n) {
        int a = 0;
        int b = 0;
        int[] deret = new int[n];
        for (int i = 0; i < deret.length; i++){
            if(i % 2 == 0){
                if(i == 0){
                    a = 1;
                    System.out.print(a+"\t\t");
                }else{
                    System.out.print(a+"\t\t");
                }
            }else{
                b = a *3;
                System.out.print(b+"\t\t");
                a = b - i;
            }

        }System.out.println("\n");
    }
    public static void soal3(int n) {
        int[] deret = new int[n];
        for (int i = 0; i < deret.length; i++){
            if (i<=0){
                System.out.print(i+"\t\t");
            }else {
                int hasil = i * 2;
                System.out.print(hasil+"\t\t");
            }
            }System.out.println("\n");
    }
    public static void soal4(int n) {
        int[] deret = new int[n];
        for (int i = 0; i < deret.length; i++){
            if(i <=0 || i == 1){
                deret[i] = 1;
            }else{
                deret[i] = deret[i-1] + deret[i-2];
            }
            System.out.print(deret[i]+"\t\t");
        }System.out.println("\n");
    }
    public static void soal5(int n) {
        int[] deret = new int[n];
        for (int i = 0; i < deret.length; i++){
            if(i < 3){
                deret[i] = 1;
            }else{
                deret[i] = deret[i-1] + deret[i-2] + deret[i-3];
            }
            System.out.print(deret[i]+"\t\t");
        }System.out.println("\n");
    }
    public static void soal6(int n) {
        int[] deret = new int[n];
        int a = 0;

        for (int i=0; i<= 99; i++){
            int bil=0;
            for (int j=1;j<=i;j++){
                if (i%j==0){
                    bil=bil+1;
                }
            }
            if (bil==2){
                a+=1;
                if(a <= deret.length){
                    System.out.print(i+"\t\t");
                }else{
                    i=99;
                }

            }
        }System.out.println("\n");
    }
    public static void soal8(int n) {
        int[] deret = new int[n];
        char abcd;
        for (abcd = 'A'; abcd <= 'I'; abcd++){

            System.out.print(abcd+"\t\t");
        }System.out.println("\n");
    }
    public static void soal9(int n) {
        int[] deret = new int[n];
        int a = 0;
        int b = 0;
        for (int i = 1; i <= deret.length; i++){
            if(i == 1){
                System.out.print(i+"\t\t");
                a = i * 3;
            }else if (i == 2){
                System.out.print(a+"\t\t");

            }else {
                b = a * 3;
                System.out.print(b+"\t\t");
                a = b;
            }

        }System.out.println("\n");
    }
    public static void soal10(int n) {
        int[] deret = new int[n];
        int a = 0;
        for (int i = 0; i < deret.length; i++){
            if(i <= 1){
                System.out.print(i+"\t\t");
            }else {
                a = i * i * i;
                System.out.print(a+"\t\t");
            }

        }System.out.println("\n");
    }
    public static void soal1part2(int n) {
        int[] deret = new int[n];
        int c = 0;
        int d = 0;
        for(int i=1; i<=4; i++){
            for(int j=0;j<i;j++){
                System.out.print(" \t");
            }System.out.print(i+"\t");
            for(int a=3; a>=i; a--){
                for(int b=2; b>0; b--){
                    System.out.print(" \t");
                }
            }
            System.out.print(i+" \t");
//            if (d <= 4){
//                c =  i + 8 ;
//                System.out.print(c+"\t");
//                d = 6;
//            }else {
//                c = c -1;
//                System.out.print(c+"\t");
//            }
            System.out.print("\n");
        }

        for (int i = 1; i <= deret.length; i++){
            System.out.print(i+" \t");
        }
    }
}
