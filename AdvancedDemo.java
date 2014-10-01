import java.util.*;
//import edu.cmu.lti.jawjaw.*;
import edu.cmu.lti.jawjaw.db.*;
import edu.cmu.lti.jawjaw.pobj.*;

public class AdvancedDemo {
	private static void run( String word, POS pos ) {
		// ���{�� WordNet �ɒ��ڃA�N�Z�X���A���f�[�^������
		List<Word> words = WordDAO.findWordsByLemmaAndPos(word, pos);
		List<Sense> senses = SenseDAO.findSensesByWordid( words.get(0).getWordid() );
		String synsetId = senses.get(0).getSynset();
		Synset synset = SynsetDAO.findSynsetBySynset( synsetId );
		SynsetDef synsetDef = SynsetDefDAO.findSynsetDefBySynsetAndLang(synsetId, Lang.eng);
		List<Synlink> synlinks = SynlinkDAO.findSynlinksBySynset( synsetId );
		// ���ʕ\��
		System.out.println( words.get(0) );
		System.out.println( senses.get(0) );
		System.out.println( synset );
		System.out.println( synsetDef );
		System.out.println( synlinks.get(0) );
	}
//	public static void main(String[] args) {
//		// "���R���ꏈ��"(����)�Ƃ����P�ꂩ�瓾����֌W�̈ꕔ���f�����܂�
//		AdvancedDemo.run( "���R���ꏈ��", POS.n ); 
//	}
}
