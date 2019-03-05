package main;
/* @author Andrew Knaack */
public class Ouroboros {
public static void main(String[] args) {
char n = 10;
char c = 34;
int nameIndex = 11;
String[] s = {
"package main;",
"/* @author Andrew Knaack */",
"public class Ouroboros {",
"public static void main(String[] args) {",
"char n = 10;",
"char c = 34;",
"int nameIndex = ",
"String[] s = {",
"};",
"for (int i = 0; i < 6; i++) System.out.println(s[i]);",
"if (nameIndex < 24) System.out.println(s[6] + (nameIndex + 1) + ';');",
"else System.out.println(s[6] + 11 + ';');",
"for (int i = 7; i < 8; i++) System.out.println(s[i]);",
"for (int i = 0; i < s.length; i++) System.out.println(c + s[i] + c + ',');",
"for (int i = 8; i < 19; i++) System.out.println(s[i]);",
"if (nameIndex < 24) System.err.print(s[1].charAt(nameIndex));",
"else System.err.print(n);",
"}",
"}",
};
for (int i = 0; i < 6; i++) System.out.println(s[i]);
if (nameIndex < 24) System.out.println(s[6] + (nameIndex + 1) + ';');
else System.out.println(s[6] + 11 + ';');
for (int i = 7; i < 8; i++) System.out.println(s[i]);
for (int i = 0; i < s.length; i++) System.out.println(c + s[i] + c + ',');
for (int i = 8; i < 19; i++) System.out.println(s[i]);
if (nameIndex < 24) System.err.print(s[1].charAt(nameIndex));
else System.err.print(n);
}
}
 