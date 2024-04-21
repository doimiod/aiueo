public class Main {
    public static void main(String[] args) {
        String pat = args[0];
        String txt = args[1];
        KMP kmp = new KMP(pat);
        System.out.println("text: " + txt);
        int offset = kmp.search(txt);
        System.out.println("pattern: ");
        // for (int i = 0; i < offset; i++)
        System.out.println("found at " + offset);
        // System.out.println(pat);
    }
}