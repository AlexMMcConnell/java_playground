class PrimDataTypes {
    public static void main(String args[])
    {
        // I think this is just a shorthand string of some sort?
        char a = 'G';
        // probably used for most number related things
        int i = 89;
        // the most efficient number data type, but also very limiting
        byte b = 4;
        // larger than bytes, shorter than integers
        short s = 56;
        // basically a float with more room that doesn't have a standard suffix
        double d = 4.32356243;
        // floats use a suffix of 'f' as standard
        float f = 4.23632f;
        // longs allow for larger ranges of numbers? not sure what exactly this means atm
        long l = 345621;
        
        System.out.println("char: " + a);
        System.out.println("integer: " + i);
        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("long: " + l);
    }
}