package com.ibm.wcm.ods.dao;

import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.ibm.gbs.consentmgmt.dto.Cosdabaccontrolobject;
import com.ibm.gbs.util.HibernateUtil;
import com.ibm.wcm.ods.dto.ClientProfileAdsSrc;
import com.ibm.wcm.ods.dto.CpAdsAbuseSrc;
import com.ibm.wcm.ods.dto.CpAdsEncounterSrc;

public class CpAdsAbuseSrcDao {
	
	public List<CpAdsAbuseSrc> getByCpAdsSrcSeqId(BigDecimal seqNum) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		List<CpAdsAbuseSrc> list = null;

		try {
			transaction = session.beginTransaction();
			Query query = session.createQuery("from CpAdsAbuseSrc where clientProfileAdsSrc.clientProfileAdsSeqNum = :seq");
			query.setParameter("seq", seqNum);
			list = query.list();

			for (Iterator iterator = list.iterator(); iterator.hasNext();) {
				CpAdsAbuseSrc dto = (CpAdsAbuseSrc) iterator.next();
			}

			transaction.commit();

		} catch (HibernateException e) {
			transaction.rollback();
			e.printStackTrace();

		} finally {
			session.close();
		}

		return list;
	}

	public CpAdsAbuseSrc save(CpAdsAbuseSrc CpAdsAbuseSrc) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		try {

			transaction = session.beginTransaction();

			session.save(CpAdsAbuseSrc);
			transaction.commit();
		} catch (HibernateException e) {
			System.out.println("Exception ..mmm");
			transaction.rollback();
			e.printStackTrace();
		} finally {
			session.close();
			return CpAdsAbuseSrc;
		}
	}

	public List<CpAdsAbuseSrc> getlist() {

		System.out.println(" ");
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		List<CpAdsAbuseSrc> cosdpersonconsentlist = null;
		try {

			transaction = session.beginTransaction();
			cosdpersonconsentlist = session.createQuery("from CpAdsAbuseSrc ").list();
			for (Iterator iterator = cosdpersonconsentlist.iterator(); iterator.hasNext();) {
				CpAdsAbuseSrc cosdpersonconsent = (CpAdsAbuseSrc) iterator.next();

			}
			transaction.commit();
		} catch (HibernateException e) {
			transaction.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}

		return cosdpersonconsentlist;
	}

	public CpAdsAbuseSrc getById(long id) {

		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		CpAdsAbuseSrc CpAdsAbuseSrc = null;

		try {
			session.beginTransaction();
			CpAdsAbuseSrc = (CpAdsAbuseSrc) session.get(CpAdsAbuseSrc.class, new BigDecimal(id));

			session.getTransaction().commit();
		} catch (HibernateException e) {
			e.printStackTrace();
			session.getTransaction().rollback();

		} finally {
			session.close();
		}
		return CpAdsAbuseSrc;
	}

	public List<CpAdsAbuseSrc> getlistByClinetID(long clientId) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		List<CpAdsAbuseSrc> Cosdabaccontrolgrouplist = null;
		try {

			transaction = session.beginTransaction();

			Query query = session.createQuery("from CpAdsAbuseSrc where  clientId = :clientId ");
			query.setBigDecimal("clientId", new BigDecimal(clientId));

			Cosdabaccontrolgrouplist = query.list();
			// Cosdabaccontrolgrouplist = session.createQuery("from Cosdabaccontrolgroup
			// where controlgroupname = :code").list();
			for (Iterator iterator = Cosdabaccontrolgrouplist.iterator(); iterator.hasNext();) {
				CpAdsAbuseSrc CpAdsAbuseSrc = (CpAdsAbuseSrc) iterator.next();
				System.out.println("DischargeStatus  :: " + CpAdsAbuseSrc.getClientProfileAdsSrc());
			}
			transaction.commit();
		} catch (HibernateException e) {
			transaction.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}

		return Cosdabaccontrolgrouplist;
	}

	public List<CpAdsAbuseSrc> getByclientProfileAdsSrc(ClientProfileAdsSrc clientProfileAdsSrc) {

		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		Cosdabaccontrolobject cosdabaccontrolobject = null;
		CpAdsAbuseSrc cpadsabusesrc = null;
		List<CpAdsAbuseSrc> cosdabactransactionlist = null;

		try {
			session.beginTransaction();
			// 1. Take cosdabaccontrolgroup

			Query query = session.createQuery("from CpAdsAbuseSrc where   clientProfileAdsSrc = :txnID ");
			query.setParameter("txnID", clientProfileAdsSrc);
			cosdabactransactionlist = query.list();

			for (Iterator iterator = cosdabactransactionlist.iterator(); iterator.hasNext();) {
				cpadsabusesrc = (CpAdsAbuseSrc) iterator.next();
				System.out.println("CpAdsAbuseSrc--inside loop of -getByclientProfileAdsSrc");
			}

			// System.out.println(cosdabaccontrolobject.getCosdabaccontrolgroup()+ " - " +
			// cosdabaccontrolobject.getCosdabactransaction());
			session.getTransaction().commit();
		} catch (HibernateException e) {
			e.printStackTrace();
			session.getTransaction().rollback();

		} finally {
			session.close();
		}
		return cosdabactransactionlist;
	}

	public String delete(long id) {

		Session session = HibernateUtil.getSessionFactory().openSession();
		// Transaction transaction = null;

		try {
			session.beginTransaction();
			CpAdsAbuseSrc CpAdsAbuseSrc = (CpAdsAbuseSrc) session.get(CpAdsAbuseSrc.class, new BigDecimal(id));

			session.delete(CpAdsAbuseSrc);

			session.getTransaction().commit();
		} catch (HibernateException e) {
			e.printStackTrace();
			session.getTransaction().rollback();
			return "Error - in deletion";

		} finally {
			session.close();
		}

		return "deleted";
	}

	public String update(CpAdsAbuseSrc CpAdsAbuseSrc) {

		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		CpAdsAbuseSrc old_CpAdsAbuseSrc = null;
		CpAdsAbuseSrcDao CpAdsAbuseSrcdao = new CpAdsAbuseSrcDao();

		try {

			transaction = session.beginTransaction();

			// old_CpAdsAbuseSrc =
			// CpAdsAbuseSrcdao.getById(CpAdsAbuseSrc.getPersonconsentid().longValue());
			// if(old_CpAdsAbuseSrc == null)
			// return "Consent Person - is not present" ;
			// old_cosdauthorizationgroup.setJobid(cosdauthorizationgroup.getJobid());

			session.update(CpAdsAbuseSrc);
			transaction.commit();
		} catch (HibernateException e) {
			transaction.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		return "Updated";
	}
}
