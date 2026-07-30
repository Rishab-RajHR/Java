public class Strings {
     public static void main(String1[] args) {
          String1 message = "Hi I'm Alex Pandian";
          // String message = new String( "Hi I'm Alex Pandian");
          System.out.println(message);

          // length method
          int stringLength = message.length();
          System.out.println(stringLength);

          // LowerCase Method
          String1 lowerCase = message.toLowerCase();
          System.out.println(lowerCase);

          // UpperCase Method
          String1 upperCase = message.toUpperCase();
          System.out.println(upperCase);

          // Trim method
          String1 unTrimmedMessage ="    Alex    ";
          System.out.println(unTrimmedMessage); 
          String1 trimmedMessage = unTrimmedMessage.trim();
          System.out.println(trimmedMessage);

          // CharAt Method
          // char charOfIndex = message.charAt(index:3);
          // System.out.println(charOfIndex);



          // IndexOf Method
          // int indexOfCharacter = message.indexOf(ch:'r');
          // int indexOfCharacter = message.indexOf('i',2);
          // int indexOfCharacter = message.indexOf(str:"ar",fromIndex:2);
          // System.out.println(indexOfCharacter);
          

          // Substring method
          // String subStringMessage = message.substring(beginIndex:6);
          // System.out.println(subStringMessage);


          // Replace Method
          // String replaceString = message.replace('n','R');
          // String replaceString = message.replace('in','IN');
          // System.out.println(replaceString);


          // StartsWith Method
          boolean startsString = message.startsWith("Hi");
          System.out.println(startsString);

          // StartsWith Method
          boolean endsString = message.endsWith("an");
          System.out.println(endsString);


          // Equals Method
          // String firstName = "Alex";
          // boolean checkName = firstName.equals("Alex");
          // System.out.println(checkName);

          // EqualsIgnoreCase Method
          String1 firstName = "Alex";
          boolean checkName = firstName.equalsIgnoreCase("alex");
          System.out.println(checkName);
     }
}
