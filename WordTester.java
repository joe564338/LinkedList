import java.util.*;
import java.io.*;
public class WordTester{
  public static void main(String []args) throws FileNotFoundException{
    WordList list = new WordList();
    System.out.println(list.scanFile());
  }
}