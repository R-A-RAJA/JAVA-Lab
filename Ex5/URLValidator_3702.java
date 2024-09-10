import java.net.*;
import java.util.*;
class Operation {
 void validateAndExtract(String urlString) {
 try {
 if (!urlString.startsWith("http://") && !urlString.startsWith("https://")) {
 urlString = "http://" + urlString;
 }
 @SuppressWarnings("deprecation")
 final URL url = new URL(urlString);
 String protocol = url.getProtocol();
11
 String domain = url.getHost();
 String path = url.getPath();
 String query = url.getQuery();
 System.out.println("Protocol: " + protocol);
 System.out.println("Domain: " + domain);
 System.out.println("Path: " + path);
 if (query != null && !query.isEmpty()) {
 System.out.println("Query Parameters:");
 String[] queryParams = query.split("&");
 for (String param : queryParams) {
 String[] keyValue = param.split("=");
 if (keyValue.length == 2) {
 System.out.println(keyValue[0] + ": " + keyValue[1]);
 }
 }
 } else {
 System.out.println("No query parameters found.");
 }
 } catch (MalformedURLException e) {
 System.out.println("Invalid URL: " + urlString);
 }
 }
}
// Main class
public class URLValidator_3702 {
 public static void main(String[] args) {
 System.out.println("Name: ATHITHRAJA. R\nRegno: 2022503702");
 Operation obj = new Operation();
 try (Scanner in = new Scanner(System.in)) {
 System.out.print("\nEnter the URL: ");
 String urlString = in.nextLine();
 obj.validateAndExtract(urlString);
 }
12
 }
}
