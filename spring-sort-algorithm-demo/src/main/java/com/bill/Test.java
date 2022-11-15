package com.bill;

public class Test {
    public static void main(String[] args) {
        int n =13;
        for(int i=0; i<10; i++) {
            System.out.println(getBit(n, i));
        }

        // 8 = 1000 -> 1010 = 10
        System.out.println("setBit: "+ setBit(8, 1));

        /**
         * mask = 0100
         * 15 = 1111 -> 1011 -> 11
         */
        System.out.println("clearBit: "+ clearBit(15, 2));

        /**
         * mask = 0100-1 = 0011
         * 15 = 1111 -> 0011 -> 3
         */
        System.out.println("clearBitsThroughI: "+ clearBitsThroughI(15, 2));

        /**
         * mask = 1100
         * 15 = 1111 -> 1100 -> 12
         */
        System.out.println("clearBitsThroughI: "+ clearBitsThrough0(15, 1));
    }

    private static boolean getBit(int num, int i) {
        return ((num & (1 << i)) != 0);
    }

    private static int setBit(int num, int i) {
        return num | (1 << i);
    }

    private static int clearBit(int num, int i) {
        int mask = ~(1 << i);
        return num & mask;
    }

    private static int clearBitsThroughI(int num, int i) {
        int mask = (1 << i) - 1;
        return num & mask;
    }

    private static int clearBitsThrough0(int num, int i) {
        int mask = (-1 << (i+1));
        return num & mask;
    }
}
