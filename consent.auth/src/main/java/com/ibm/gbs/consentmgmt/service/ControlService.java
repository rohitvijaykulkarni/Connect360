/*Licensed Materials - 
 Property of IBM
6949 - 67L
  Copyright IBM Corp. 2017, 2018 All Rights Reserved
*/

/* Licensed Materials - 
 Property of IBM 6949 - 67L 
 Copyright IBM Corp. 2017, 2018 All Rights Reserved */
package  com.ibm.gbs.consentmgmt.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ibm.gbs.consentmgmt.dao.CosdabacconstraintDao;
import com.ibm.gbs.consentmgmt.dao.CosdabaccontrolgroupDao;
import com.ibm.gbs.consentmgmt.dao.CosdabactransactionDao;
import com.ibm.gbs.consentmgmt.dto.Cosdabacconstraint;
import com.ibm.gbs.consentmgmt.dto.Cosdabaccontrolgroup;
import com.ibm.gbs.consentmgmt.dto.Cosdabactransaction;

@Service("ControlService")
public class ControlService {
	
	
	
	/*------------------------------  Constraint ----------------------------------------*/
	public List<Cosdabacconstraint> getListConstraint()
	{
		CosdabacconstraintDao cosdabactransactiondao = new CosdabacconstraintDao();
		List<Cosdabacconstraint> constraintlist = cosdabactransactiondao.getlist() ;
		return constraintlist ;
	}
	
	public void saveConstraint(long grpID , long txnid ,Cosdabacconstraint cosdabacconstraint)
	{
		CosdabacconstraintDao cosdabacconstraintdao = new CosdabacconstraintDao();
		cosdabacconstraintdao.save(grpID, txnid,cosdabacconstraint);
	}
	
	public String updateConstraint(Cosdabacconstraint cosdabacconstraint)
	{
		CosdabacconstraintDao cosdabacconstraintdao = new CosdabacconstraintDao();
		return cosdabacconstraintdao.update(cosdabacconstraint);
	}
	
	public String deleteConstraint(long id)
	{
		CosdabacconstraintDao cosdabacconstraintdao = new CosdabacconstraintDao();
		return cosdabacconstraintdao.delete(id);
	}
	
	public Cosdabacconstraint getConstraint(long id)
	{
		CosdabacconstraintDao cosdabacconstraintdao = new CosdabacconstraintDao();
		return cosdabacconstraintdao.getById(id);
	}
	
	/*------------------------------  Cosdabactransaction ----------------------------------------*/
	public List<Cosdabactransaction> getListCosdabacTxn()
	{
		CosdabactransactionDao cosdabactransactiondao = new CosdabactransactionDao();
		List<Cosdabactransaction> cosdabactxngrouplist = cosdabactransactiondao.getlist() ;
		return cosdabactxngrouplist ;
	}
	
	public void saveCosdabacTxn(long grpID, Cosdabactransaction cosdabactransaction)
	{
		CosdabactransactionDao cosdabactransactiondao = new CosdabactransactionDao();
		cosdabactransactiondao.save(grpID , cosdabactransaction);
	}
	
	public void updateCosdabacTxn(Cosdabactransaction cosdabactransaction)
	{
		CosdabactransactionDao cosdabactransactiondao = new CosdabactransactionDao();
		cosdabactransactiondao.update(cosdabactransaction);
	}
	
	public String deleteCosdabacTxn(long id)
	{
		CosdabactransactionDao cosdabactransactiondao = new CosdabactransactionDao();
		return cosdabactransactiondao.delete(id);
	}
	
	public Cosdabactransaction getTxn(long id)
	{
		CosdabactransactionDao cosdabactransactiondao = new CosdabactransactionDao();
		return cosdabactransactiondao.getById(id);
	}
	
	/*------------------------------  Cosdabaccontrolgroup ----------------------------------------*/
	public List<Cosdabaccontrolgroup> getListCosdabaccontrolgroup()
	{ 
		CosdabaccontrolgroupDao cosdabaccontrolgroupdao = new CosdabaccontrolgroupDao();
		List<Cosdabaccontrolgroup> Cosdabaccontrolgrouplist = cosdabaccontrolgroupdao.getlist() ;
		return Cosdabaccontrolgrouplist ;
	}
	
	public List<Cosdabaccontrolgroup> getListcontrolgroupWithGrpName(String grpName)
	{
		CosdabaccontrolgroupDao cosdabaccontrolgroupdao = new CosdabaccontrolgroupDao();
		List<Cosdabaccontrolgroup> Cosdabaccontrolgrouplist = cosdabaccontrolgroupdao.getlistByGroupName(grpName) ;
		return Cosdabaccontrolgrouplist ;
	}
	
	public Cosdabaccontrolgroup getGrpwithID(long id)
	{
		CosdabaccontrolgroupDao cosdabaccontrolgroupdao = new CosdabaccontrolgroupDao();		
		Cosdabaccontrolgroup cosdabaccontrolgroup = cosdabaccontrolgroupdao.getById(id);
		
		return cosdabaccontrolgroup ;
	}
	
	public void saveCosdabaccontrolgroup(Cosdabaccontrolgroup cosdabaccontrolgroup)
	{
		CosdabaccontrolgroupDao cosdabaccontrolgroupdao = new CosdabaccontrolgroupDao();
		cosdabaccontrolgroupdao.save(cosdabaccontrolgroup);
	}
	
	public String updateCosdabaccontrolgroup(Cosdabaccontrolgroup cosdabaccontrolgroup)
	{
		CosdabaccontrolgroupDao cosdabaccontrolgroupdao = new CosdabaccontrolgroupDao();
		return cosdabaccontrolgroupdao.update(cosdabaccontrolgroup);
	}
	
	public String deleteCosdabaccontrolgroup(long id)
	{
		CosdabaccontrolgroupDao cosdabaccontrolgroupdao = new CosdabaccontrolgroupDao();
		return cosdabaccontrolgroupdao.delete(id);
	}

}
