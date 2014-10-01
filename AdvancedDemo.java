import java.util.*;
//import edu.cmu.lti.jawjaw.*;
import edu.cmu.lti.jawjaw.db.*;
import edu.cmu.lti.jawjaw.pobj.*;

public class AdvancedDemo {
	private static void run( String word, POS pos ) {
		// 日本語 WordNet に直接アクセスし、生データを処理
		List<Word> words = WordDAO.findWordsByLemmaAndPos(word, pos);
		List<Sense> senses = SenseDAO.findSensesByWordid( words.get(0).getWordid() );
		String synsetId = senses.get(0).getSynset();
		Synset synset = SynsetDAO.findSynsetBySynset( synsetId );
		SynsetDef synsetDef = SynsetDefDAO.findSynsetDefBySynsetAndLang(synsetId, Lang.eng);
		List<Synlink> synlinks = SynlinkDAO.findSynlinksBySynset( synsetId );
		// 結果表示
		System.out.println( words.get(0) );
		System.out.println( senses.get(0) );
		System.out.println( synset );
		System.out.println( synsetDef );
		System.out.println( synlinks.get(0) );
	}
//	public static void main(String[] args) {
//		// "自然言語処理"(名詞)という単語から得られる関係の一部をデモします
//		AdvancedDemo.run( "自然言語処理", POS.n ); 
//	}
}
