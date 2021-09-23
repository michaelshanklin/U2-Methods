public class StringExamples {


    public static void main(String[] args) {
       String name = "hephaestus";
       String greeting = "Hello";

        //Style 1
        int stringSize = name.length();
        System.out.println(name + "has" + stringSize + "length.");

        //Style 2
        System.out.println(name + "has" + name.length() + "letters.");

        System.out.println(greeting + " has " +greeting.length() + "length");

        //Creat a program which capitalizes the first letter of a name

        //attempt 1
        //Plan
        // 1. Get input
        // 2. Isolate first letter
        // 3. Capitalize first letter
        // 4. Isolate the rest of the letters
        // 5. Put 3 and 4 together
        // 6. display results

       System.out.println(capFirst(name));
    }

    public static String capFirst(String name){

        String letter = name.substring(0,1);
        letter = letter.toUpperCase();

        return letter + name.substring(1);

    }
}
