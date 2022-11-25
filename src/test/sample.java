package test;

public class sample {
    public static void main(String[] args) {
        int[][][] household = {
                {
                        {2, 4},{8, 16},{32,64},{128,256},{512,1024},{2048,4096},{8192,16384},{32768,65536} //의제곱동 1,2,3,4,5 층 별 세대
                },
                {
                        {14, 15, 16},{17, 18, 19}, {20}, { 21, 22, 23},{24, 25, 26} //3
                },
                {
                        {14, 15, 16},{17, 18, 19}, {20}, { 21, 22, 23},{24, 25, 26} //5
                }
        };
        System.out.printf("%d\t", household[0][0][0]);
        System.out.printf("%d\t", household[0][0][1]);
        System.out.printf("%d\t", household[0][0][2]);
        System.out.printf("%d\t", household[0][0][3]);
        System.out.printf("%d\t", household[0][0][4]);
        System.out.printf("%d\t", household[0][0][5]);
        System.out.printf("%d\t", household[0][0][6]);
        System.out.printf("%d\n", household[0][0][7]);

        System.out.printf("1동 2층 1세대: %d\t", household[0][1][0]);
        System.out.printf("1동 2층 2세대: %d\t", household[0][1][1]);
        System.out.printf("1동 2층 3세대: %d\t\n", household[0][1][2]);

        System.out.printf("1동 3층 1세대: %d\t\n", household[0][2][0]);

        System.out.printf("1동 4층 1세대: %d\t", household[0][3][0]);
        System.out.printf("1동 4층 2세대: %d\t", household[0][3][1]);
        System.out.printf("1동 4층 3세대: %d\t\n", household[0][3][2]);

        System.out.printf("1동 5층 1세대: %d\t", household[0][4][0]);
        System.out.printf("1동 5층 2세대: %d\t", household[0][4][1]);
        System.out.printf("1동 5층 3세대: %d\t\n", household[0][4][2]);


        System.out.printf("2동 1층 1세대: %d\t", household[1][0][0]);
        System.out.printf("2동 1층 2세대: %d\t", household[1][0][1]);
        System.out.printf("2동 1층 3세대: %d\t\n", household[1][0][2]);

        System.out.printf("2동 2층 1세대: %d\t", household[1][1][0]);
        System.out.printf("2동 2층 2세대: %d\t", household[1][1][1]);
        System.out.printf("2동 2층 3세대: %d\t\n", household[1][1][2]);

        System.out.printf("2동 3층 1세대: %d\t\n", household[1][2][0]);

        System.out.printf("2동 4층 1세대: %d\t", household[1][3][0]);
        System.out.printf("2동 4층 2세대: %d\t", household[1][3][1]);
        System.out.printf("2동 4층 3세대: %d\t\n", household[1][3][2]);

        System.out.printf("2동 5층 1세대: %d\t", household[0][4][0]);
        System.out.printf("2동 5층 2세대: %d\t", household[0][4][1]);
        System.out.printf("2동 5층 3세대: %d\t\n", household[0][4][2]);
    }
}
