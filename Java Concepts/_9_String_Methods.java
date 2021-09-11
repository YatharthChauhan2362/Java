// String Methods in Java
// This Program was created by Yatharth Chauhan

/*
String Methods operate on Java Strings. They can be used to find the length of the string, convert to lowercase, etc.)

Escape Sequence Characters : 
The sequence of characters after backslash ‘\’ = Escape Sequence Characters
Escape Sequence Characters consist of more than one character but represent one character when used within the strings.
Examples: \n (newline), \t (tab), \’ (single quote), \\ (backslash), etc.
*/

public class _9_String_Methods {
    public static void main(String[] args) {

        String name = "Yatharth";
        System.out.println(name);

        int value = name.length();
        System.out.println(value);

        String lstring = name.toLowerCase();
        System.out.println(lstring);

        String ustring = name.toUpperCase();
        System.out.println(ustring);

        String nonTrimmedString = " Yatharth ";
        System.out.println(nonTrimmedString);

        String trimmedString = nonTrimmedString.trim();
        System.out.println(trimmedString);

        System.out.println(name.substring(1));
        System.out.println(name.substring(1, 4));

        System.out.println(name.replace('t', 'h'));
        System.out.println(name.replace("r", "iya"));

        System.out.println(name.startsWith("Yath"));
        System.out.println(name.endsWith("Riy"));

        System.out.println(name.charAt(4));

        String modifiedName = "Yattthhaarthh";
        System.out.println(modifiedName.indexOf("ttth"));
        System.out.println(modifiedName.indexOf("ttth", 4));
        System.out.println(modifiedName.lastIndexOf("aar", 5));

        System.out.println(name.equals("Yatharth"));
        System.out.println(name.equalsIgnoreCase("YaTHaRtH"));
    }
}
