/*
自动类型转换
把一个表示数据[范围小的数值]或者[变量]赋值给另一个表述数据[范围大的变量]
范例：double d = 10;
*/
public class zidong {
    public static void main(String[] args)  {
        //自动类型转换
        double d = 10;
        System.out.println(d);
        //定义byte类型的变量
        byte b = 10;
        short s = b;
        int i = b;
        long l =b;
        float f =b;
        double d1 =b;
        //char的类型不兼容
        //char c =b;
    }
}