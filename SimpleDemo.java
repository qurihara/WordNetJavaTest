import java.util.*;
import edu.cmu.lti.jawjaw.*;
import edu.cmu.lti.jawjaw.pobj.*;

public class SimpleDemo {
	private static void run( String word, POS pos ) {
		// ファサードから日本語 WordNet にアクセス
		Set<String> hypernyms = JAWJAW.findHypernyms(word, pos);
		Set<String> hyponyms = JAWJAW.findHyponyms(word, pos);
		Set<String> consequents = JAWJAW.findEntailments(word, pos);
		Set<String> translations = JAWJAW.findTranslations(word, pos);
		Set<String> definitions = JAWJAW.findDefinitions(word, pos);
		// 結果表示（多義語はごっちゃになっています）
		System.out.println( "hypernyms of "+word+" : \t"+ hypernyms );
		System.out.println( "hyponyms of "+word+" : \t"+ hyponyms );
		System.out.println( word+" entails : \t\t"+ consequents );
		System.out.println( "translations of "+word+" : \t"+ translations );
		System.out.println( "definitions of "+word+" : \t"+ definitions );		
	}

	public static void main(String[] args) {
		// "買収"(動詞)という単語から得られる関係の一部をデモします
		SimpleDemo.run( "買収", POS.v );
		//SimpleDemo.run( "売買", POS.v );
	
	}
}
