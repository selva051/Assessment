public class StringConcat {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Please provide exactly 2 arguments");
            return;
        }
        System.out.println(args[0] + " Technologies " + args[1]);
    }
}