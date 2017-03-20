package com.sbt.traps;

/**
 JLS’s §15.25,

 If the second and third operands have the same type, that is the type of the con-
 ditional expression. In other words, you can avoid the whole mess by steering
 clear of mixed-type computation.
 2. If one of the operands is of type T where T is byte, short, or char and the other
 operand is a constant expression of type int whose value is representable in
 type T, the type of the conditional expression is T.
 3. Otherwise, binary numeric promotion is applied to the operand types, and the
 type of the conditional expression is the promoted type of the second and third
 operands.

 Note that binary numeric promotion performs value set conversion (§5.1.13)
 and may perform unboxing conversion (§5.1.8).
*/

public class DosEquis {
    public static void main(String[] args) {
        char x = 'X';
        int i = 0;
        System.out.print(true  ? x : 0);
        System.out.print(false ? i : x);

//        Integer i = new Integer(1);
//        if (i.equals(1))
//            i = null;
//        Double d = new Double(2.0);
//        Object o = true ? i : d; // NullPointerException!
//        System.out.println(o);

    }
}
