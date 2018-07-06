package fr.sqli.paja.dn.dao;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Example;
import org.springframework.test.context.junit4.SpringRunner;

import fr.sqli.paja.dn.dao.DeclarantDao;
import fr.sqli.paja.dn.entities.Declarant;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DeclarantDaoTest {
	@Autowired
	private DeclarantDao declarantDao;

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testFindAll() {
		//fail("Not yet implemented");
		Declarant d = declarantDao.save (new Declarant("idDeclarant", "nom", "prenom", "telephone", "email"));		
		Declarant d1 =declarantDao.save (new Declarant("idDeclarant1", "nom1", "prenom1", "telephone1", "email1"));		
		Declarant d2 = declarantDao.save (new Declarant("idDeclarant2", "nom2", "prenom2", "telephone", "email2"));
		Declarant d3 = declarantDao.save (new Declarant("idDeclarant3", "nom3", "prenom3", "telephone3", "email3"));		
		Declarant d4 =declarantDao.save (new Declarant("idDeclarant4", "nom4", "prenom4", "telephone4", "email4"));		
		Declarant d5 = declarantDao.save (new Declarant("idDeclarant5", "nom5", "prenom5", "telephone5", "email5"));
         
		List<Declarant> liste = declarantDao.findAll();
		//assertEquals(6, liste.size());	
		
		
	}
	@Test
	public void testFindOne() {
		//fail("Not yet implemented");
		Declarant d = declarantDao.save (new Declarant("idDeclarant", "nom", "prenom", "telephone", "email"));		
		Declarant d1 =declarantDao.save (new Declarant("idDeclarant1", "nom1", "prenom1", "telephone1", "email1"));		
		Declarant d2 = declarantDao.save (new Declarant("idDeclarant2", "nom2", "prenom2", "telephone", "email2"));
		Declarant d3 = declarantDao.save (new Declarant("idDeclarant3", "nom3", "prenom3", "telephone3", "email3"));		
		Declarant d4 =declarantDao.save (new Declarant("idDeclarant4", "nom4", "prenom4", "telephone4", "email4"));		
		Declarant d5 = declarantDao.save (new Declarant("idDeclarant5", "nom5", "prenom5", "telephone5", "email5"));
        
		List<Declarant> liste = declarantDao.findAll();
		declarantDao.findById(liste.get(0).getIdDeclarant());	
		//assertEquals("prenom", d.getPrenom());	
		
	}

	@Test
	public void testSave() {
		//fail("Not yet implemented");
		Declarant d = declarantDao.save (new Declarant("idDeclarant", "nom", "prenom", "telephone", "email"));		
		Declarant d1 =declarantDao.save (new Declarant("idDeclarant1", "nom1", "prenom1", "telephone1", "email1"));		
		Declarant d2 = declarantDao.save (new Declarant("idDeclarant2", "nom2", "prenom2", "telephone", "email2"));
		Declarant d3 = declarantDao.save (new Declarant("idDeclarant3", "nom3", "prenom3", "telephone3", "email3"));		
		Declarant d4 =declarantDao.save (new Declarant("idDeclarant4", "nom4", "prenom4", "telephone4", "email4"));		
		Declarant d5 = declarantDao.save (new Declarant("idDeclarant5", "nom5", "prenom5", "telephone5", "email5"));
        
		List<Declarant> liste = declarantDao.findAll();
		//assertEquals(6, liste.size());
		//assertEquals("nom4", d4.getNom());
		//assertEquals("prenom4",d4.getPrenom());
		//assertEquals("telephone4", d4.getTelephone());
		//assertEquals("email4", d4.getEmail());
		
		//declarantDao.deleteAll();
		
	}

	@Test
	public void testDeleteById() {
		//fail("Not yet implemented");
		Declarant d = declarantDao.save (new Declarant("idDeclarant6", "nom", "prenom", "telephone", "email"));		
		Declarant d1 =declarantDao.save (new Declarant("idDeclarant7", "nom1", "prenom1", "telephone1", "email1"));		
		
		List<Declarant> liste = declarantDao.findAll();
		//assertEquals(8, liste.size());	
		
		 declarantDao.deleteById(liste.get(7).getIdDeclarant());
		 List<Declarant> res = declarantDao.findAll();		
		 //assertEquals(7, res.size());
		
	}
	
	}


