import java.util.*;
import java.io.*;
public class WordList{
  public WordList(){
    LinkedList<Word> words = new LinkedList<Word>();
  }
  String s1;
  LinkedList<Word> words = new LinkedList<Word>();
  ListIterator<Word> it = words.listIterator();
  boolean added = false;
  public LinkedList<Word> scanFile() throws FileNotFoundException{
    Scanner in = new Scanner(new File("emma.txt"));
    in.useDelimiter("[^a-zA-Z]+");
    while (in.hasNext()){
      String s1 = in.next().toLowerCase();
      Word newWord = new Word(s1,1);
      it = words.listIterator(0);
      if(words.size() == 0){
        words.add(newWord);
      }
      else{
          words.add(newWord);
      }
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
    public void incCount(){
    count++;
    }
    public String getString(){
      return s;
    }
    public String toString(){
    return ("list:" + s + " count " +count);
    }
  }
}