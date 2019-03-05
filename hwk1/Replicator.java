package main;
/* @author Andrew Knaack */
public class Ouroboros {
public static void main(String[] args) {
char c = 34;
String[] s = {
"package main;",
"/* @author Andrew Knaack */",
"public class Ouroboros {",
"public static void main(String[] args) {",
"char c = 34;",
"String[] s = {",
"};",
"for (int i = 0; i < 6; i++) System.out.println(s[i]);",
"for (int i = 0; i < s.length; i++) System.out.println(c + s[i] + c + ',');",
"for (int i = 6; i < 13; i++) System.out.println(s[i]);",
"System.err.println(0);",
"}",
"}",
};
for (int i = 0; i < 6; i++) System.out.println(s[i]);
for (int i = 0; i < s.length; i++) System.out.println(c + s[i] + c + ',');
for (int i = 6; i < 13; i++) System.out.println(s[i]);
System.err.println(0);
}
}