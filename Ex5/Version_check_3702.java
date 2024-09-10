import java.util.Scanner;
class Version {
 public void check_version(String version1, String version2) {
 int result = compareVersions(version1, version2);
 if (result > 0) {
 System.out.println(version1 + " is greater than " + version2);
 } else if (result < 0) {
 System.out.println(version1 + " is less than " + version2);
 } else {
 System.out.println(version1 + " is equal to " + version2);
 }
 }
 private int compareVersions(String version1, String version2) {
 String[] parts1 = version1.split("\\.");
 String[] parts2 = version2.split("\\.");
 int length = Math.max(parts1.length, parts2.length);
 for (int i = 0; i < length; i++) {
 int v1 = i < parts1.length ? Integer.parseInt(parts1[i]) : 0;
 int v2 = i < parts2.length ? Integer.parseInt(parts2[i]) : 0;
 if (v1 != v2) {
 return v1 - v2;
 }
 }
 return 0;
 }
}
public class Version_check_3702 {
 public static void main(String[] args) {
 System.out.println("Name: ATHITHRAJA. R\nRegno: 2022503702");
 Version obj = new Version();
10
 Scanner in = new Scanner(System.in);
 System.out.print("\nEnter the 1st version: ");
 String a = in.nextLine();
 System.out.print("Enter the 2nd version: ");
 String b = in.nextLine();
 try {
 obj.check_version(a, b);
 }
 catch (Exception e) {
 System.out.println("Invalid Input...");
 }
 }
}