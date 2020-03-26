import java.io.UnsupportedEncodingException;

public class ChangeEncoding {

public ChangeEncoding() {

}

public static String toLatin(String str){

byte[] b = str.getBytes();

try {

return new String(b,"ISO-8859-1");

} catch (UnsupportedEncodingException e) {

System.out.println("toLatin 오류"+e.getMessage());

}

return null;

}

public static String toUnicode(String str){

try {

byte[] b = str.getBytes("IOS-8859-1");

return new String(b);

} catch (UnsupportedEncodingException e) {

System.out.println("toUnicode 오류"+e.getMessage());

}

return null;

}

​

}

​