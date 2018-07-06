package fr.sqli.paja.dn.metier;

import java.util.Date;
import java.util.List;

import fr.sqli.paja.dn.entities.Declarant;
import fr.sqli.paja.dn.entities.Hopital;
import fr.sqli.paja.dn.entities.NouveauNe;

public interface CoucheServices {
	
	
//********************************************************* SERVICES ENFANT *******************************	
	// afficher ou consulter un extrait de naissance
	public NouveauNe consulNouveauExtNaissance(Long id);
	
	// recuperer la liste des enfants
	public List<NouveauNe> listenfants();
	
	//Ajouter ou declarer un nouveau né
	public void declarerNouveauNe(String idDeclarnt,String idHopital, NouveauNe n);   
    void modifierCorNouveauNe(String idDeclarant, String idHopital, Long idNouveauNe, String nom, String prenom,
			String sexe, Date dateNaissance, String heurNaissance, Date dateDeclaration);
   
    //supprimer un enfant
    public void supprimerEnfant(Long id);
    
    /* public Page<NouveauNe> listeEnfant(String idHopital , int page, int size);
     */ 
      
//********************************************************* SERVICES DECLARANT *******************************	

	
	//afficher ou consulter un declarant
	public Declarant consultDeclarant(String idDeclarant);
	
	//ajouter un nouveau declarant
	public void ajouterDeclarant(Declarant declarant);
	
	//recuperer la liste des declarants
	public List<Declarant> listeDeclarant();
	
	//supprimer un declarant
	 public void supprimerDeclarant(String id);
	
//********************************************************* SERVICES HOPITAL *******************************	

	//afficher ou consulter un hopital
	public Hopital consultHopital(String idHopital);
		
	//ajouter un nouveau hopital  
    public void ajouterHopital(Hopital h); 
   
    //supprimer un hopital
    public void supprimerHopital(String id);
    
    //recuperer la liste des hopitaux
    public List<Hopital> listeHopitals();
    
    
   
    
    
    

	
}
