public class initials {

    static void printInitials(String name)
    {
        if (name.length() == 0)
            return;


        System.out.print(name.charAt(0));


        for (int i = 1; i < name.length() - 1; i++)
            if (name.charAt(i) == ' ')
                System.out.print(" " + name.charAt(i + 1));
    }

    // Driver code
    public static void main(String[] args)
    {
        String name = "samar samir abd elhaq";
        printInitials(name);
    }
}