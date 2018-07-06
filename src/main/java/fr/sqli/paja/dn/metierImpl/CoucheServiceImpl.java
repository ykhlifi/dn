package fr.sqli.paja.dn.metierImpl;

import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.sqli.paja.dn.dao.DeclarantDao;
import fr.sqli.paja.dn.dao.HopitalDao;
import fr.sqli.paja.dn.dao.NouveauNeDao;
import fr.sqli.paja.dn.entities.Declarant;
import fr.sqli.paja.dn.entities.Hopital;
import fr.sqli.paja.dn.entities.NouveauNe;
import fr.sqli.paja.dn.metier.CoucheServices;
import fr.sqli.paja.exception.EntityNotFoundException;

@Service
@Transactional
public class CoucheServiceImpl implements CoucheServices {
	
	@Autowired
	private NouveauNeDao nouveauNeDao;
	
	@Autowired
	private DeclarantDao declarantDao;
	
	@Autowired
	private HopitalDao hopitalDao;
	
//********************************************************* SERVICES IMPL ENFANT *******************************	
 
    //ajouter ou declarer un nouveau né(e)	
	@Override
	public void declarerNouveauNe(String idDeclarant, String idHopital, NouveauNe n) {
		
		Declarant d=declarantDao.findOne(idDeclarant);
		Hopital h= hopitalDao.findOne(idHopital);	
		
		NouveauNe nn= new NouveauNe();
		nn.setNom(n.getNom());
		nn.setPrenom(n.getPrenom());
		nn.setSexe(n.getSexe());
		nn.setDatenaissance(n.getDatenaissance());
		nn.setHeurenaissance(n.getHeurenaissance());
		nn.setDatedeclarant(n.getDatedeclarant());
		nn.setDeclarant(idDeclarant);
		nn.setHopital(idHopital);
		nouveauNeDao.save(nn);
		//List<NouveauNe> list = nouveauNeDao.findAll();
		//List<NouveauNe> list1 = nouveauNeDao.findAll();
		//h.setEnfants(list);
		
		//d.setEnfants(list1);
		System.out.println("l'ajout est fait");
		System.out.println(h.getIdHopital());
		System.out.println(d.getIdDeclarant());
		
	}
	
	//afficher ou consulter un extreit de naissance
	@Override
	public  NouveauNe consulNouveauExtNaissance(Long id) {
		NouveauNe nn= nouveauNeDao.findOne(id);
		if(nn==null) throw new EntityNotFoundException();
		else 
		return nn;	
		}
	//recuperer la liste des enfants
	@Override
	public List<NouveauNe> listenfants() {
		List<NouveauNe> liste= nouveauNeDao.findAll();
		return liste;
	}
	//modifier les coordonnées d'un enfant
	@Override
	public void modifierCorNouveauNe(String idDeclarant, String idHopital, Long idNouveauNe,
			String nom, String prenom,String sexe, Date dateNaissance, String heurNaissance, Date dateDeclaration) {
		Hopital h= consultHopital(idHopital);
		Declarant d= consultDeclarant(idDeclarant);
		NouveauNe nn = consulNouveauExtNaissance(idNouveauNe);
		
		nn.setIdNouveauNe(idNouveauNe);
		nn.setNom(nom);
		nn.setPrenom(prenom);
		nn.setSexe(sexe);
		nn.setDatenaissance(dateNaissance);
		nn.setHeurenaissance(heurNaissance);
		nn.setDatedeclarant(dateDeclaration);
		nn.setDeclarant(idDeclarant);
		nn.setHopital(idHopital);
		nouveauNeDao.save(nn);
		
	}
	
	//supprimer un enfant
	@Override
	public void supprimerEnfant(Long id) {
		nouveauNeDao.deleteById(id);
		
	}
	
//********************************************************* SERVICES IMPL DECLARANT *******************************	
    //ajouter un nouveau declarant
	@Override
	public void ajouterDeclarant(Declarant declarant) {
		Declarant d = new Declarant();
		d.setIdDeclarant(declarant.getIdDeclarant());
		d.setNom(declarant.getNom());
		d.setPrenom(declarant.getPrenom());
		d.setTelephone(declarant.getTelephone());
		d.setEmail(declarant.getEmail());	
		declarantDao.save(d);
	}

	//recuperer la liste des declarant
		@Override
		public List<Declarant> listeDeclarant() {
		List<Declarant> liste = declarantDao.findAll();
		return liste;
		}
    
		//conculter ou afficher un declarant
		@Override
		public Declarant consultDeclarant(String idDeclarant) {
			Declarant d= declarantDao.findOne(idDeclarant);
			if(d==null) throw new EntityNotFoundException();
			else 
			return d;	
		}
		
       //supprimer un declarant
		@Override
		public void supprimerDeclarant(String id) {
			declarantDao.deleteById(id);
			
		}

//********************************************************* SERVICES IMPL HOPITAL*******************************	

	//ajouter un nouveau hopital
	@Override
	public void ajouterHopital(Hopital hopital) {
		Hopital h = new Hopital();
		h.setIdHopital(hopital.getIdHopital());
		h.setNom(hopital.getNom());
		h.setAdresse(hopital.getAdresse());
		h.setEmail(hopital.getEmail());
		h.setTelephone(hopital.getTelephone());
		hopitalDao.save(h);
		
	}

	//recuperer la liste des hopitaux
	@Override
	public List<Hopital> listeHopitals() {
	List<Hopital> liste = hopitalDao.findAll();
	return liste;
		
	}

	
	// afficher ou consulter un hopital
	@Override
	public Hopital consultHopital(String idHopital) {
		Hopital hh = hopitalDao.findOne(idHopital);
		if(hh == null) throw new EntityNotFoundException();
		else 
		return hh ;	
	}

	//supprimer un hopital
	@Override
	public void supprimerHopital(String id) {
		hopitalDao.deleteById(id);
		
	}
	
}
