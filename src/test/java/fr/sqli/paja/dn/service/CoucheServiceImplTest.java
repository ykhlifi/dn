package fr.sqli.paja.dn.service;

import static org.junit.Assert.*;

import java.util.Date;

import org.aspectj.weaver.tools.cache.AsynchronousFileCacheBacking.RemoveCommand;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import fr.sqli.paja.dn.entities.Declarant;
import fr.sqli.paja.dn.entities.Hopital;
import fr.sqli.paja.dn.entities.NouveauNe;
import fr.sqli.paja.dn.metier.CoucheServices;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CoucheServiceImplTest {
	
	@Autowired
	private CoucheServices coucheServices;

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

///////////////////////////////////////////// TEST SERVICES ENFANT /////////////////////////////////////////////	

	@Test
	public void testConsulNouveauExtNaissance() {
		//fail("Not yet implemented");
		NouveauNe nn = coucheServices.consulNouveauExtNaissance((long) 6);
		//assertEquals("nom4",nn.getNom());
		//assertEquals("prenom4",nn.getPrenom());
		//assertEquals("m",nn.getSexe());	
	}
	
	/*@Test 
	public void supprimerEnfant(Long id) {		
		coucheServices.supprimerEnfant(id);	
	}
	
///////////////////////////////////////////// TEST SERVICES DECLARANT /////////////////////////////////////////////	
		
	@Test
	public void testConsultDeclarant() {
		//fail("Not yet implemented");
		Declarant d= coucheServices.consultDeclarant( "idDeclarant1");
		assertEquals("nom1", d.getNom());
		
	}
	
	@Test 
	public void supprimerDeclarant(String id) {		
		coucheServices.supprimerDeclarant(id);	
	}
///////////////////////////////////////////// TEST SERVICES HOPITAL /////////////////////////////////////////////	

	@Test
	public void testConsultHopital() {
		//fail("Not yet implemented");
		Hopital h = coucheServices.consultHopital("idHopital1");
		assertEquals("nom1", h.getNom());
	}
	
	@Test 
	public void supprimerHopital(String id) {		
		coucheServices.supprimerHopital(id);	
	}
	
	
	
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
	
	

	@Test
	public void testDeclarerNouveauNe() {
		//fail("Not yet implemented");
		NouveauNe nn = new NouveauNe( "b", "s", "m", null, null, "15H15",null,null );
		  coucheServices.declarerNouveauNe("idDeclarnt2", "idHopital2", nn);
		  assertEquals("b",nn.getNom());
			assertEquals("s",nn.getPrenom());
			assertEquals("m",nn.getSexe());
			
			coucheServices.supprimer(nn);
				
	}

	@Test
	public void testModifierCorNouveauNe() {
		//fail("Not yet implemented");
		coucheServices.modifierCorNouveauNe("idDeclarant1", "idHopital1", (long) 20,
				 "nom20","prenom20","f", new Date(),
					"02H07" , new Date()) ;
	
	}

	@Test
	public void testAjouterDeclarant() {
		//fail("Not yet implemented");
		coucheServices.ajouterDeclarant(new Declarant("idDeclarant5", "nom5", "prenom5", "telephone5", "email5"));
		
	}

	@Test
	public void testAjouterHopital() {
		//fail("Not yet implemented");
		coucheServices.ajouterHopital( new Hopital("idHopital5", "nom5", "adresse5", "telephone5", "email5"));
	}
	

*/
	
		
	

}

