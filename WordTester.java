import java.util.*;
import java.io.*;
public class WordTester{
  public static void main(String []args){
    LinkedList<Word> words = new LinkedList<Word>();
    ListIterator<Word> itr = words.listIterator();
    scanFile();
  }