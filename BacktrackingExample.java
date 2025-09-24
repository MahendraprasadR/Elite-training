
public class BacktrackingExample {
static void place(String s, int b, int g) {
if (s.length() == 3) {
System.out.println(s);
return;
}
if (b < 2) place(s + "B", b + 1, g);
if (g < 1) place(s + "G", b, g + 1);
}
public static void main(String[] args) {
place("", 0, 0);
}
}

