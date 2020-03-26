
import java.util.ArrayList;

public class MainClass {

public static void main(String[] args) {

String uri ="c:/filetest/newsdata/txt";

ArrayList<String> lines =FileDataReadClass.readFileData(uri);

DBClass dbc = new DBClass();

dbc.connectDB();

dbc.insertData(lines);

}

}