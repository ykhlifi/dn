package fr.sqli.paja.dn.dao;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import fr.sqli.paja.dn.entities.Declarant;
import fr.sqli.paja.dn.entities.NouveauNe;


public interface DeclarantDao extends JpaRepository<Declarant, String> {

	
	@Query("select d from Declarant d  where d.idDeclarant=(:id)")
	Declarant findOne(@Param("id")String id);
	
	@Query("select dd from Declarant dd  where dd.idDeclarant=(:idd)")
	List<NouveauNe> chercher(@Param("idd")Long idd);
}
