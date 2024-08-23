public class StringMethod {
    public static void main(String[] args) {
        String name = "Farhana";
        System.out.println(name);

        int value = name.length();
        System.out.println(value);

        // conversion
        String name2 = name.toLowerCase();
        System.out.println(name2);
        String name3 = name.toUpperCase();
        System.out.println(name3);

        String nonTrimmed = "       Ankon Fuck You      ";
        System.out.println(nonTrimmed);
        System.out.println(nonTrimmed.trim());

        System.out.println(name.substring(3));
        System.out.println(name.substring(0,3)); // beginning is 0, end is 3
        //System.out.println(name.replace('F','R')); // character
        System.out.println(name.replace("ar","uck")); // string

        System.out.println(name.startsWith("An"));
        System.out.println(name.endsWith("ha"));

        // finding index number
        System.out.println(name.charAt(1));
        System.out.println(name.indexOf("F"));
        System.out.println(name.indexOf("hana"));

        // comparison
        System.out.println(name.equals("farhana"));
        System.out.println(name.equalsIgnoreCase("farHANA"));

        // Escape sequence character
        System.out.println("You have ignored me more than \"my expectations\" ");

    }
}
