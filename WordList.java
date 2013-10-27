import java.util.*;
import java.io.*;
public class WordList{
  public WordList(){
    LinkedList<Word> words = new LinkedList<Word>();
  }  
  LinkedList<Word> words = new LinkedList<Word>();
  public LinkedList<Word> scanFile() throws FileNotFoundException{
    Scanner in = new Scanner(new File("emma.txt"));
    in.useDelimiter("[^a-zA-Z]+");
    while (in.hasNext()){
      String s = in.next().toLowerCase();
      Word newWord = new Word(s,1);
      words.add(newWord);
      }
    in.close();
    return words;
    }
  class Word{ 
    String s;
    int count;
    public Word(){
      s = "s";
      count = 1;
    }
    public Word(String ins, int incount){
      s = ins;
      count = incount;
    }
  }
}