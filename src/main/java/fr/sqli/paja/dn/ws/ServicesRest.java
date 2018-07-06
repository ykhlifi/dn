package fr.sqli.paja.dn.ws;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.sqli.paja.dn.entities.Declarant;
import fr.sqli.paja.dn.entities.Hopital;
import fr.sqli.paja.dn.entities.NouveauNe;
import fr.sqli.paja.dn.metier.CoucheServices;
import fr.sqli.paja.exception.EntityNotFoundException;
@RefreshScope
@RestController
//pour donner l'accés (autorisé) a toutes les requetes d'autre serveurs
@CrossOrigin("*")
public class ServicesRest {
	
	@Autowired
	private CoucheServices coucheServices;
	
//////////////////////////// ENFANT /////////////////////////////////////////////////////////////
	
	@RequestMapping(value="/enfants", method=RequestMethod.GET)
	public List<NouveauNe> listenfants() {
		return coucheServices.listenfants();
	}
	//les nouvelles de Rest (GetMapping)
	@GetMapping("/consultEnfant/{id}")
	public NouveauNe consultEnfant(@PathVariable Long id){
		return coucheServices.consulNouveauExtNaissance(id);
	}
	
	@RequestMapping(value="/declarerNouveauNe", method=RequestMethod.POST)
	public void ajouterNouveauNe(@RequestBody NouveauNe n){
	coucheServices.declarerNouveauNe(n.getDeclarant(), n.getHopital(), n);
	}
	
	
	@RequestMapping(value="/supprimeEnfant/{id}", method=RequestMethod.DELETE)
	public Boolean supprimerEnfant(@PathVariable Long id){
		     coucheServices.supprimerEnfant(id);
		return true;
	}
	
////////////////////////////// HOPITAL /////////////////////////////////////////////////////	
	
	@RequestMapping(value="/hopitals", method=RequestMethod.GET)
	public List<Hopital> listeHopitals(){
		return coucheServices.listeHopitals();
	}
	@RequestMapping(value="/consultHopital/{id}", method=RequestMethod.GET)
	public Hopital consulHopital(@PathVariable String id){
		return coucheServices.consultHopital(id);
			
	}
	
	@RequestMapping(value="/supprimeHopital/{id}", method=RequestMethod.DELETE)
	public Boolean supprimerHopital(@PathVariable String id){
		     coucheServices.supprimerHopital(id);
		return true;
	}
	
////////////////////////////// DECLARANT ///////////////////////////////////////////////////	
		
	@RequestMapping(value="/consultDeclarant/{id}", method=RequestMethod.GET)
	public Declarant consulDeclarant(@PathVariable String id){
		return coucheServices.consultDeclarant(id);
	}
		
	@RequestMapping(value="/ajouterUnDeclarant", method=RequestMethod.POST)
	public void ajouterDeclarant(@RequestBody Declarant d){
		coucheServices.ajouterDeclarant(d);
	}
	
	@RequestMapping(value="/declarants", method=RequestMethod.GET)
	public List<Declarant> listeDeclarant(){
		return coucheServices.listeDeclarant();
	}
	
	@RequestMapping(value="/supprimeDeclarant/{id}", method=RequestMethod.DELETE)
	public Boolean supprimerDeclarant(@PathVariable String id){
		     coucheServices.supprimerDeclarant(id);
		return true;
	}
}

