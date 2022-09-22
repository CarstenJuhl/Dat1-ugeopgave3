public class Main
{
  public static void main(String[] args)
  {
	String word = "Danmark";
	int charCount = word.length();

	
	System.out.println(word);
	System.out.println("1 + "+charCount/2);
	System.out.println(word.substring(1,charCount/2+1));	
  }
}