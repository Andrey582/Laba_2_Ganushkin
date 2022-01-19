package com.metanit;

public class Main {

    public static void main(String[] args) {
	// write your code here
        IntToString();
        DoubleToString();
        LongToString();
        FloatToString();
        CharToString1();
        CharToString2();
        CharToString3();
        CharToString4();
        CharToInt1();
        CharToInt2();
        IntToLong();
        IntToFloat();
        LongToInt();
        DoubleToInt();
    }

    public static void IntToString()
    {
        int i = 35;
        String str = Integer.toString(i);
        System.out.println(str);
    }

    public static void DoubleToString()
    {
        double  i = 32.4e10;
        String str = Double.toString(i);
        System.out.println(str);
    }

    public static void LongToString()
    {
        long  i = 3422222;
        String str = Long.toString(i);
        System.out.println(str);
    }

    public static void FloatToString()
    {
        float  i = 3.46f;
        String str = Float.toString(i);
        System.out.println(str);
    }

    public static void CharToString1()
    {
        char ch = 'S';
        String charToString = Character.toString(ch);
        System.out.println(charToString);
    }

    public static void CharToString2()
    {
        char ch = 'S';
        String str = "" + ch;
        System.out.println(str);
    }

    public static void CharToString3()
    {
        char ch = 'S';
        String fromChar = new String(new char[] { ch });
        System.out.println(fromChar);
    }

    public static void CharToString4()
    {
        char ch = 'S';
        String valueOfchar = String.valueOf(ch);
        System.out.println(valueOfchar);
    }

    public static void CharToInt1()
    {
        char ch = '9';
        int i1 = Character.getNumericValue(ch);
        System.out.println(i1);
    }

    public static void CharToInt2()
    {
        char ch = '9';
        int i2 = Character.digit(ch,10);
        System.out.println(i2);
    }

    public static void IntToLong()
    {
        int i = 2015;
        long l = (long) (i);
        System.out.println(l);
    }

    public static void IntToFloat()
    {
        int i = 2015;
        float f = (float) (i);
        System.out.println(f);
    }

    public static void LongToInt()
    {
        long l = 214748364;
        int i = (int) l;
        System.out.println(i);
    }

    public static void DoubleToInt()
    {
        double d = 3.14;
        int i = (int) d;
        System.out.println(i);
    }
}
