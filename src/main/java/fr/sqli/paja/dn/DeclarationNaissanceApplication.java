package fr.sqli.paja.dn;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.ComponentScan;

import fr.sqli.paja.dn.dao.DeclarantDao;
import fr.sqli.paja.dn.dao.HopitalDao;
import fr.sqli.paja.dn.dao.NouveauNeDao;
import fr.sqli.paja.dn.entities.Declarant;
import fr.sqli.paja.dn.entities.Hopital;
import fr.sqli.paja.dn.entities.NouveauNe;
import fr.sqli.paja.dn.metier.CoucheServices;

@RefreshScope
@SpringBootApplication
@ComponentScan
public class DeclarationNaissanceApplication implements CommandLineRunner {
   
	@Autowired
	private NouveauNeDao nouveauNeDao;
	@Autowired
	private HopitalDao hopitalDao;
	@Autowired
	private DeclarantDao declarantDao;
	@Autowired
	private CoucheServices coucheServices;
	
	@Value("${spring.datasource.driver-class-name}")
    private String driverClassName;
 
    @Value("${spring.datasource.url}")
    private String url;
 
    @Value("${spring.datasource.username}")
    private String userName;
 
    @Value("${spring.datasource.password}")
    private String password;
	
	public static void main(String[] args) {
		
		 SpringApplication.run(DeclarationNaissanceApplication.class, args);
	
	}

	public void run(String... args) throws Exception {
		
		Declarant d = declarantDao.save (new Declarant("idDeclarant", "nom", "prenom", "telephone", "email"));		
		Declarant d1 =declarantDao.save (new Declarant("idDeclarant1", "nom1", "prenom1", "telephone1", "email1"));		
		Declarant d2 = declarantDao.save (new Declarant("idDeclarant2", "nom2", "prenom2", "telephone", "email2"));
		Declarant d3 = declarantDao.save (new Declarant("idDeclarant3", "nom3", "prenom3", "telephone3", "email3"));		
		Declarant d4 =declarantDao.save (new Declarant("idDeclarant4", "nom4", "prenom4", "telephone4", "email4"));		
		Declarant d5 = declarantDao.save (new Declarant("idDeclarant5", "nom5", "prenom5", "telephone5", "email5"));
		
		Hopital h =  hopitalDao.save (new Hopital("idHopital", "nom", "adresse", "telephone", "email"));
	 	Hopital h1 = hopitalDao.save (new Hopital("idHopital1", "nom1", "adresse1", "telephone1", "email1"));		
	 	Hopital h2 = hopitalDao.save (new Hopital("idHopital2", "nom2", "adresse2", "telephone2", "email2"));		
	 	Hopital h3 = hopitalDao.save (new Hopital("idHopital3", "nom3", "adresse3", "telephone3", "email3"));
	 	Hopital h4 = hopitalDao.save (new Hopital("idHopital4", "nom4", "adresse4", "telephone4", "email4"));		
	 	Hopital h5 = hopitalDao.save (new Hopital("idHopital5", "nom5", "adresse5", "telephone5", "email5"));		
        
	 	/*NouveauNe n = nouveauNeDao.save(new NouveauNe("nom", "prenom", "m", null, null, "13H15", h1.getIdHopital(), d1.getIdDeclarant()));
	    NouveauNe n1 = nouveauNeDao.save(new NouveauNe("nom1", "prenom1", "f", null, null, "13H15", h2.getIdHopital(),d2.getIdDeclarant()));
		NouveauNe n2 = nouveauNeDao.save(new NouveauNe("nom2", "prenom2", "m", null, null, "13H15", h2.getIdHopital(), d1.getIdDeclarant()));
		NouveauNe n3 = nouveauNeDao.save(new NouveauNe("nom3", "prenom3", "f", null, null, "13H15", h1.getIdHopital(), d1.getIdDeclarant()));
		NouveauNe n4 = nouveauNeDao.save(new NouveauNe("nom4", "prenom4", "m", null, null, "13H15", h1.getIdHopital(),d2.getIdDeclarant()));
		NouveauNe n5 = nouveauNeDao.save(new NouveauNe("nom5", "prenom5", "f", null, null, "13H15", h2.getIdHopital(), d1.getIdDeclarant()));
		*/
	 	
	coucheServices.listeHopitals().forEach(c->{System.out.println(c.getNom());});
	//hopitalDao.findAll()
	}
	
}
