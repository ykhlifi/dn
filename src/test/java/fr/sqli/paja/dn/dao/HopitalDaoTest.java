package fr.sqli.paja.dn.dao;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import fr.sqli.paja.dn.dao.HopitalDao;
import fr.sqli.paja.dn.entities.Hopital;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HopitalDaoTest {
	@Autowired
	private HopitalDao hopitalDao;

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testFindAll() {
		//fail("Not yet implemented");
	 	Hopital h =  hopitalDao.save (new Hopital("idHopital", "nom", "adresse", "telephone", "email"));
	 	Hopital h1 = hopitalDao.save (new Hopital("idHopital1", "nom1", "adresse1", "telephone1", "email1"));		
	 	Hopital h2 = hopitalDao.save (new Hopital("idHopital2", "nom2", "adresse2", "telephone2", "email2"));		
	 	Hopital h3 = hopitalDao.save (new Hopital("idHopital3", "nom3", "adresse3", "telephone3", "email3"));
	 	Hopital h4 = hopitalDao.save (new Hopital("idHopital4", "nom4", "adresse4", "telephone4", "email4"));		
	 	Hopital h5 = hopitalDao.save (new Hopital("idHopital5", "nom5", "adresse5", "telephone5", "email5"));		
        
        
		List<Hopital> liste =hopitalDao.findAll();
		//assertEquals(7, liste.size());	
		
		//hopitalDao.deleteAll();
		
	}
	/*
	@Test
	public void testFindOne() {
		//fail("Not yet implemented");
		
		Hopital h =  hopitalDao.save (new Hopital("idHopital", "nom", "adresse", "telephone", "email"));
	 	Hopital h1 = hopitalDao.save (new Hopital("idHopital1", "nom1", "adresse1", "telephone1", "email1"));		
	 	Hopital h2 = hopitalDao.save (new Hopital("idHopital2", "nom2", "adresse2", "telephone2", "email2"));		
	 	Hopital h3 = hopitalDao.save (new Hopital("idHopital3", "nom3", "adresse3", "telephone3", "email3"));
	 	Hopital h4 = hopitalDao.save (new Hopital("idHopital4", "nom4", "adresse4", "telephone4", "email4"));		
	 	Hopital h5 = hopitalDao.save (new Hopital("idHopital5", "nom5", "adresse5", "telephone5", "email5"));		
        
		List<Hopital> liste = hopitalDao.findAll();
		hopitalDao.findById(h1.getIdHopital());
		assertEquals("idHopital1", h1.getIdHopital());	
		
		//hopitalDao.deleteAll();
	}
	
	@Test
	public void testSave() {
		//fail("Not yet implemented");

		Hopital h =  hopitalDao.save (new Hopital("idHopital", "nom", "adresse", "telephone", "email"));
	 	Hopital h1 = hopitalDao.save (new Hopital("idHopital1", "nom1", "adresse1", "telephone1", "email1"));		
	 	Hopital h2 = hopitalDao.save (new Hopital("idHopital2", "nom2", "adresse2", "telephone2", "email2"));		
	 	Hopital h3 = hopitalDao.save (new Hopital("idHopital3", "nom3", "adresse3", "telephone3", "email3"));
	 	Hopital h4 = hopitalDao.save (new Hopital("idHopital4", "nom4", "adresse4", "telephone4", "email4"));		
	 	Hopital h5 = hopitalDao.save (new Hopital("idHopital5", "nom5", "adresse5", "telephone5", "email5"));		
        				
		List<Hopital> liste = hopitalDao.findAll();
		assertEquals(6, liste.size());	
		
		//hopitalDao.deleteAll();
	}

	@Test
	public void testDeleteById() {
		//fail("Not yet implemented");
		Hopital h =  hopitalDao.save (new Hopital("idHopital6", "nom6", "adresse6", "telephone6", "email6"));
	 	Hopital h1 = hopitalDao.save (new Hopital("idHopital7", "nom7", "adresse7", "telephone7", "email7"));		
	 	
		List<Hopital> liste =hopitalDao.findAll();
		assertEquals(8, liste.size());	
		
		hopitalDao.deleteById(liste.get(7).getIdHopital());
		
		List<Hopital> res =hopitalDao.findAll();
		assertEquals(7, res.size());
		
	}

	*/

}
