/*/* Licensed Materials - 
 Property of IBM 6949 - 67L 
 Copyright IBM Corp. 2017, 2018 All Rights Reserved */
/*package  com.ibm.gbs.auth.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ibm.gbs.auth.model.Cosdabactransaction;

public interface CosdabactransactionRepository extends JpaRepository<Cosdabactransaction, Long> {
	
	public static final String sqlTrans = "from COSDABACTRANSACTION trans ,COSDABACCONTROLOBJECT cobj where "
			+ "cobj.TRANSACTIONID = trans.TRANSACTIONID and cobj.CONTROLGROUPID = :id " ;
	
	@Query(sqlTrans) 
	Cosdabactransaction findById(@Param("id") Long id);


}
*/