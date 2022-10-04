//Hasan Geni� 201713171060

import java.util.Arrays;
import java.util.List;

class dinamikProgramlama 
{
	
	public static void kelimeBolme(List<String> sozluk, String str, String cikti)
	{
		
		if(str.length() == 0)
		{
			System.out.println(cikti);
			return;
		}
		
		for(int i = 1; i<= str.length(); i++)
		{
			
			String bol = str.substring(0,i);
			
			if(sozluk.contains(bol))
			{
				kelimeBolme(sozluk, str.substring(i), cikti + " " + bol);
			}
		}
	}
	
	public static void main(String[] args)
	{
		 List<String> sozluk = Arrays.asList("ak","al","Al�","al��","al��ma","al��mak","al��makta","al��maktan",
					"alma","almaz","almazlar","an","anla","anlar","ayan","az","azla","azlar",
					"bir","�al","�al�","�al��","�al��ma","�al��mak","�al��makta","�al��maktan",
					"de","def","dik","dikler","dikkleri","ede","ek","eki","er","eri","eri�","eri�me",
					"Eri�mek","ev","fi","hedef","hedefi","is","iste","istedi","istedik","istedikleri",
					"i�","kal","kalma","kalmaz","kalmazlar","kist","kiste","maya","ol","olma","olmaya",
					"olmayan","olmayanla","olmayanlar","ta","Tan","ya","yan","zevk");

		 String str =  "Eri�mekistedikleribirhedefiolmayanlar�al��maktanzevkalmazlar";
		 
		 kelimeBolme(sozluk, str, "");
		 
	}	
}
