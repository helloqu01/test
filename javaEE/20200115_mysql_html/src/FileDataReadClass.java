import java.io.BufferedReader;

import java.io.FileNotFoundException;

import java.io.FileReader;

import java.io.IOException;

import java.util.ArrayList;


public class FileDataReadClass {

public FileDataReadClass() {

}

public static ArrayList<String> readFileData(String uri){

ArrayList<String> lines = new ArrayList<String>();

try {

FileReader fr = new FileReader(uri);

BufferedReader br = new BufferedReader(fr);

String line = null;

while(true){

line=br.readLine();

if(line==null){

return lines;

}

lines.add(line);

}

} catch (FileNotFoundException e) {

System.out.println("ERR 파일 uri 오류"+e.getMessage());

}catch(IOException e){

System.out.println("ERR 파일 read 오류"+e.getMessage());

}

return lines;

}
}

