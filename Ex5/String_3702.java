class StringOp{
    void StringMethods(String s1,String s2, String s3, String s4){
        //print values
        System.out.println("\nString Initilization: \nString s1=”Welcome to Java”;\n" +
                "String s2=s1;\n" +
                "String s3=new String(“Welcome to Java”);\n" +
                "String s4=s1.intern();");
        System.out.println("\nString Values: ");
        System.out.println("s1: "+s1);
        System.out.println("s2: "+s2);
        System.out.println("s3: "+s3);
        System.out.println("s4: "+s4);
        System.out.println("\nString Methods: ");
        //print the operations
        System.out.println("s1 == s2: "+(s1 == s2));
        System.out.println("s2 == s3: "+(s2 == s3));
        System.out.println("s1.equalsIgnoreCase(s2): "+(s1.equalsIgnoreCase(s2)));
        System.out.println("s2.equals(s3): "+(s2.equals(s3)));
        System.out.println("s1.compareTo(s2): "+s1.compareTo(s2));
        System.out.println("s2.compareTo(s3): "+s2.compareTo(s3));
        System.out.println("s1.equals(s2): "+s1.equals(s2));
        System.out.println("s2 == s4: "+(s2 == s4));
        System.out.println("s1 + s2: "+s1 + s2);
        System.out.println("s1.charAt(0): "+s1.charAt(0));
        System.out.println("s1.indexOf('j'): "+s1.indexOf('j') );
        System.out.println("s1.indexOf(\"to\"): "+s1.indexOf("to"));
        System.out.println("s1.lastIndexOf('a'): "+s1.lastIndexOf('a') );
        System.out.println("s1.lastIndexOf(\"o\", 15): "+s1.lastIndexOf("o", 15));
        System.out.println("s1.codePointCount(0, s1.length()): "+s1.codePointCount(0, s1.length()));
        System.out.println("String.join(\"-\", s1, s2, s3): "+String.join("-", s1, s2, s3));
        System.out.println("s1.length(): "+s1.length());
        System.out.println("s1.substring( 3): "+s1.substring( 3));
        System.out.println("s1.substring(1, 3): "+s1.substring(1, 3));
        System.out.println("s1.startsWith(\"Wel\"): "+s1.startsWith("Wel"));
        System.out.println("s1.endsWith(\"Java\"): "+s1.endsWith("Java") );
        System.out.println("s1.toLowerCase(): "+s1.toLowerCase() );
        System.out.println("s1.toUpperCase(): "+s1.toUpperCase() );
        System.out.println("“ Hi”.trim(): "+(" Hi".trim()));
        System.out.println("s1.replace('o', 'O'): "+s1.replace('o', 'O'));
        System.out.println("s1.replaceAll(\"o\", \"O\"): "+s1.replaceAll("o", "O") );
        System.out.println("s1.replaceFirst(\"o\", \"O\"): "+s1.replaceFirst("o", "O") );
        String[] s5=(s1.split("O"));
        System.out.print("s1.split(\"O\"): ");
        for (String a : s5)
            System.out.print(a);
        String[] s6=s1.split("O", 4);
        System.out.print("\ns1.split(\"O\", 4): ");
        for (String a : s6)
            System.out.print(a);
        char[] s7=s1.toCharArray();
        System.out.print("\ns1.toCharArray(): ");
        for (char a : s7)
            System.out.print(a);
        System.out.println("\ns1.codePointAt(0): "+s1.codePointAt(0));
        System.out.println("s1.contains(\"or\"): "+s1.contains("or"));;
    }
}


public class String_3702 {
    public static void main(String []args){
        System.out.println("Name: ATHITHRAJA. R\nRegno: 2022503702");
        StringOp obj=new StringOp();
        String s1="Welcome to Java";
        String s2=s1;
        String s3=new String("Welcome to Java");
        String s4=s1.intern();
        obj.StringMethods(s1,s2,s3,s4);
    }
}
