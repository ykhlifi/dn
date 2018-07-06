package fr.sqli.paja.dn.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import fr.sqli.paja.dn.entities.NouveauNe;

public interface NouveauNeDao extends JpaRepository<NouveauNe, Long>{
	
	@Query("select ne from NouveauNe ne  where ne.idNouveauNe=(:d)")
	List<NouveauNe> chercher(@Param("d")Long id);

	@Query("select nn from NouveauNe nn  where nn.idNouveauNe=(:id)")
	NouveauNe findOne(@Param("id")Long id);
	
	/*@Query("select lnn from NouveauNe lnn  where lnn.Hopital=(:idh)")
	public Page<NouveauNe> listeEnfant(@Param("idh")String idh, Pageable pageable);
*/
}
