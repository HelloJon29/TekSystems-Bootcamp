package com.perscholas.operators;
// Write binary notation as decimal
public class ProgramTwo {
    public static void main(String[] args) {
        // converting from binary start from the right at 1
        //then double everytime moving left, then add all values at 1 binary positions
        // 0010 1,(2),4,8
        int a = 2;
        // 1001 (1),2,4,(8)
        int b = 9;
        // 0011 0100 1,2,(4),8,(16),(32),64,128
        int c = 52;
        // 0111 0010 1,(2),4,8,(16),(32),(64),128
        int d = 114;
        //0010 0001 1111 (1),(2),(4),(8),(16),32,64,128,256,(512),1024,2048
        int e = 543;
        // 0010 1100 0110 0111 (1),(2),(4),8,16,(32),(64),128,256,512,(1024),(2048),4096,(8192),16384,32768
        int f =11367;
    }
}
