package dvd.utils;

import dvd.modele.Dvd;
import dvd.modele.Media;


public class AffichageModele {
	
	public static void afficherMedia(Media unMedia){
		  System.out.println("Num : "+unMedia.getNum()+" - Titre : "+unMedia.getTitre()+" - Prix HT : "+unMedia.getPrixUnitHT());
		  System.out.println("Editeur : "+unMedia.getEditeur()+" - Date sortie "+unMedia.getDateSortie());
		  System.out.println("Stock minimum : "+unMedia.getStockMinimum()+" - Stock actuel : "+unMedia.getQteStock());
		}
	
	public static void afficherDvd(Dvd unDvd){
		afficherMedia(unDvd);
		System.out.println("Durée : "+unDvd.getDuree()+" - Num : "+unDvd.getAnneeFilm()+" - Zone : "+unDvd.getZone());
	}
}
