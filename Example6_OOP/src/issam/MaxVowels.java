package issam;

public class MaxVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		  String sentence = "This is a loooooooooong sentence";
	        int maxVowelCount = 0;
	        String wordsWithMostVowels = null;
	        String[] words = sentence.split(" ");

	        for(String word : words){
	            int vowelCount = 0;
	            word = word.toLowerCase();
	            for(int i = 0; i < word.length() ; i++){
	                char x = word.charAt(i);
	                if(x == 'a' || x == 'e' || x == 'i' ||
	                   x == 'o' || x == 'u'){
	                    vowelCount++;
	                }
	            }
	            if(vowelCount > maxVowelCount){
	                maxVowelCount = vowelCount;
	                wordsWithMostVowels = word;
	            }
	        }
	        System.out.println("Word with most vowels is: " + wordsWithMostVowels);

	}

}
