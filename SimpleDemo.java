import java.util.*;
import edu.cmu.lti.jawjaw.*;
import edu.cmu.lti.jawjaw.pobj.*;

public class SimpleDemo {
	private static void run( String word, POS pos ) {
		// �t�@�T�[�h������{�� WordNet �ɃA�N�Z�X
		Set<String> hypernyms = JAWJAW.findHypernyms(word, pos);
		Set<String> hyponyms = JAWJAW.findHyponyms(word, pos);
		Set<String> consequents = JAWJAW.findEntailments(word, pos);
		Set<String> translations = JAWJAW.findTranslations(word, pos);
		Set<String> definitions = JAWJAW.findDefinitions(word, pos);
		// ���ʕ\���i���`��͂�������ɂȂ��Ă��܂��j
		System.out.println( "hypernyms of "+word+" : \t"+ hypernyms );
		System.out.println( "hyponyms of "+word+" : \t"+ hyponyms );
		System.out.println( word+" entails : \t\t"+ consequents );
		System.out.println( "translations of "+word+" : \t"+ translations );
		System.out.println( "definitions of "+word+" : \t"+ definitions );		
	}

	public static void main(String[] args) {
		// "����"(����)�Ƃ����P�ꂩ�瓾����֌W�̈ꕔ���f�����܂�
		SimpleDemo.run( "����", POS.v );
		//SimpleDemo.run( "����", POS.v );
	
	}
}
