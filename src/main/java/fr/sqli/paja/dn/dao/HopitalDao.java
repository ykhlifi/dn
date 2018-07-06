package fr.sqli.paja.dn.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import fr.sqli.paja.dn.entities.Hopital;
import fr.sqli.paja.dn.entities.NouveauNe;

public interface HopitalDao extends JpaRepository<Hopital, String> {

	@Query("select h from Hopital h  where h.idHopital=(:id)")
	Hopital findOne(@Param("id")String id);
	
	@Query("select hh from Hopital hh  where hh.idHopital=(:idh)")
	List<NouveauNe> chercher(@Param("idh")Long idh);
}
