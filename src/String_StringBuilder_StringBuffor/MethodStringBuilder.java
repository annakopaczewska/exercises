package String_StringBuilder_StringBuffor;

public class MethodStringBuilder {
    public static void main(String[] args) {

        java.lang.StringBuilder sb = new java.lang.StringBuilder("Java8 Rocks");

//      String actualValue = sb.append('1').append("1").append(1).toString(); // dowolnie można zapisywać argument "1", '1' (1)
//      System.out.println(actualValue);
//
//
//        sb.insert(0,"Java Rocks");
//        String actualValue1=sb.insert(4,8).toString();
//        System.out.println(actualValue1);

        //       sb.replace(0,0,"Java 8 Rocks");
        //       String actualValue2 = sb.replace(0,6,"Java7").toString();
        //      System.out.println(actualValue2);

        //       String actualValue3 = sb.delete(4,5).toString();
        //     System.out.println(actualValue3);

        //      String actualValue4 = sb.reverse().toString();
        //       System.out.println(actualValue4);

        System.out.println(sb.length());

 //       char actualValue5 = sb.charAt(6);
   //     System.out.println(actualValue5);

 //       String actualValue6 = sb.substring(0,4);
  //      System.out.println(actualValue6);


    }
}
