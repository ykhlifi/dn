package fr.sqli.paja.dn.dao;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import fr.sqli.paja.dn.dao.DeclarantDao;
import fr.sqli.paja.dn.dao.HopitalDao;
import fr.sqli.paja.dn.dao.NouveauNeDao;
import fr.sqli.paja.dn.entities.Declarant;
import fr.sqli.paja.dn.entities.Hopital;
import fr.sqli.paja.dn.entities.NouveauNe;

@RunWith(SpringRunner.class)
@SpringBootTest
/*@DataJpaTest */
public class NouveauNeDaoTest {
	
	
	
	@Autowired
	private NouveauNeDao nouveauNeDao;
	@Autowired
	private DeclarantDao declarantDao;
	@Autowired
	private HopitalDao hopitalDao;
	
	  
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	/*
	 @Test
	public void testChercher() {
		//fail("Not yet implemented");
		
		 Declarant d1= new Declarant("idDeclarant1", "nom1", "prenom1", "telephone1", "email1");
		  Declarant d2= new Declarant("idDeclarant2", "nom2", "prenom2", "telephone2", "email2");
		  Hopital h1= new Hopital("idHopital1", "nom1", "adresse1", "telephone1", "email1"); 
		  Hopital h2= new Hopital("idHopital2", "nom2", "adresse2", "telephone2", "email2");
		
		NouveauNe n = nouveauNeDao.save(new NouveauNe("nom", "prenom", "m", null, null, "13H15", h1, d1));
		NouveauNe n1 = nouveauNeDao.save(new NouveauNe("nom1", "prenom1", "f", null, null, "13H15", h2,d2));
		NouveauNe n2 = nouveauNeDao.save(new NouveauNe("nom2", "prenom2", "m", null, null, "13H15", h2, d1));
		NouveauNe n3 = nouveauNeDao.save(new NouveauNe("nom3", "prenom3", "f", null, null, "13H15", h1, d1));
		NouveauNe n4 = nouveauNeDao.save(new NouveauNe("nom4", "prenom4", "m", null, null, "13H15", h1,d2));
		NouveauNe n5 = nouveauNeDao.save(new NouveauNe("nom5", "prenom5", "f", null, null, "13H15", h2, d1));
		
		List<NouveauNe> li=nouveauNeDao.findAll();
		//assertEquals(6, li.size());	
		//List<NouveauNe> res = nouveauNeDao.chercher(li.get(0).getIdNouveauNe());
		//assertEquals("nom", res.get(0).getNom());
		//assertEquals("prenom", res.get(0).getPrenom());
		
		nouveauNeDao.deleteAll();
	}
*/
	@Test
	public void testFindAll() {
		//fail("Not yet implemented");
		 Declarant d1= new Declarant("idDeclarant1", "nom1", "prenom1", "telephone1", "email1");
		  Declarant d2= new Declarant("idDeclarant2", "nom2", "prenom2", "telephone2", "email2");
		  Hopital h1= new Hopital("idHopital1", "nom1", "adresse1", "telephone1", "email1"); 
		  Hopital h2= new Hopital("idHopital2", "nom2", "adresse2", "telephone2", "email2");
		
		    /*NouveauNe n = nouveauNeDao.save(new NouveauNe("nom", "prenom", "m", null, null, "13H15", h1, d1));
			NouveauNe n1 = nouveauNeDao.save(new NouveauNe("nom1", "prenom1", "f", null, null, "13H15", h2,d2));
			NouveauNe n2 = nouveauNeDao.save(new NouveauNe("nom2", "prenom2", "m", null, null, "13H15", h2, d1));
			NouveauNe n3 = nouveauNeDao.save(new NouveauNe("nom3", "prenom3", "f", null, null, "13H15", h1, d1));
			NouveauNe n4 = nouveauNeDao.save(new NouveauNe("nom4", "prenom4", "m", null, null, "13H15", h1,d2));
			NouveauNe n5 = nouveauNeDao.save(new NouveauNe("nom5", "prenom5", "f", null, null, "13H15", h2, d1));*/
			
		List<NouveauNe> li=nouveauNeDao.findAll();
		//assertEquals(12, li.size());	
		
		//nouveauNeDao.deleteAll();
	}
	/*
	@Test
	public void testFindOne() {
		//fail("Not yet implemented");
		
		 Declarant d1= new Declarant("idDeclarant1", "nom1", "prenom1", "telephone1", "email1");
		  Declarant d2= new Declarant("idDeclarant2", "nom2", "prenom2", "telephone2", "email2");
		  Hopital h1= new Hopital("idHopital1", "nom1", "adresse1", "telephone1", "email1"); 
		  Hopital h2= new Hopital("idHopital2", "nom2", "adresse2", "telephone2", "email2");
		
		    NouveauNe n = nouveauNeDao.save(new NouveauNe("nom", "prenom", "m", null, null, "13H15", h1, d1));
			NouveauNe n1 = nouveauNeDao.save(new NouveauNe("nom1", "prenom1", "f", null, null, "13H15", h2,d2));
			NouveauNe n2 = nouveauNeDao.save(new NouveauNe("nom2", "prenom2", "m", null, null, "13H15", h2, d1));
			NouveauNe n3 = nouveauNeDao.save(new NouveauNe("nom3", "prenom3", "f", null, null, "13H15", h1, d1));
			NouveauNe n4 = nouveauNeDao.save(new NouveauNe("nom4", "prenom4", "m", null, null, "13H15", h1,d2));
			NouveauNe n5 = nouveauNeDao.save(new NouveauNe("nom5", "prenom5", "f", null, null, "13H15", h2, d1));
			
		 nouveauNeDao.findById(n1.getIdNouveauNe());
		 assertEquals("nom1",n1.getNom());	
		 
		 nouveauNeDao.deleteAll();
		} 
		 
	
*/

	/*@Test
	public void testDeleteById() {
		//fail("Not yet implemented");
		  Declarant d1= new Declarant("idDeclarant1", "nom1", "prenom1", "telephone1", "email1");
		  Declarant d2= new Declarant("idDeclarant2", "nom2", "prenom2", "telephone2", "email2");
		  Hopital h1= new Hopital("idHopital1", "nom1", "adresse1", "telephone1", "email1"); 
		  Hopital h2= new Hopital("idHopital2", "nom2", "adresse2", "telephone2", "email2");
		 
		  NouveauNe n = nouveauNeDao.save(new NouveauNe("nom", "prenom", "m", null, null, "13H15",h1.getIdHopital() , d1.getIdDeclarant()));
		  //NouveauNe n1 = nouveauNeDao.save(new NouveauNe("nom1", "prenom1", "m", null, null, "13H15",h1.getIdHopital() , d1.getIdDeclarant()));
		  //NouveauNe n2 = nouveauNeDao.save(new NouveauNe("nom2", "prenom2", "m", null, null, "13H15",h1.getIdHopital() , d1.getIdDeclarant()));
		 
		  List<NouveauNe> li=nouveauNeDao.findAll();
		  assertEquals(18, li.size());	
		  System.out.println(n.getIdNouveauNe());
		  nouveauNeDao.deleteById(n.getIdNouveauNe());
		  List<NouveauNe> res=nouveauNeDao.findAll();
		  assertEquals(17, res.size());
	}*/
/*
	@Test
	public void testDelete() {
		//fail("Not yet implemented");
		
		 Declarant d1= new Declarant("idDeclarant1", "nom1", "prenom1", "telephone1", "email1");
		  Declarant d2= new Declarant("idDeclarant2", "nom2", "prenom2", "telephone2", "email2");
		  Hopital h1= new Hopital("idHopital1", "nom1", "adresse1", "telephone1", "email1"); 
		  Hopital h2= new Hopital("idHopital2", "nom2", "adresse2", "telephone2", "email2");
		
		
		    NouveauNe n = nouveauNeDao.save(new NouveauNe("nom", "prenom", "m", null, null, "13H15", h1, d1));
		    NouveauNe n1 = nouveauNeDao.save(new NouveauNe("nom1", "prenom1", "f", null, null, "13H15", h2,d2));
			NouveauNe n2 = nouveauNeDao.save(new NouveauNe("nom2", "prenom2", "m", null, null, "13H15", h2, d1));
			NouveauNe n3 = nouveauNeDao.save(new NouveauNe("nom3", "prenom3", "f", null, null, "13H15", h1, d1));
			NouveauNe n4 = nouveauNeDao.save(new NouveauNe("nom4", "prenom4", "m", null, null, "13H15", h1,d2));
			NouveauNe n5 = nouveauNeDao.save(new NouveauNe("nom5", "prenom5", "f", null, null, "13H15", h2, d1));
			
		
		List<NouveauNe> li=nouveauNeDao.findAll();
		assertEquals(6, li.size());	
		
		nouveauNeDao.delete(li.get(0));
		List<NouveauNe> res =nouveauNeDao.findAll();
		assertEquals(5, res.size());	
		
		nouveauNeDao.deleteAll();
	}*/
	
}
