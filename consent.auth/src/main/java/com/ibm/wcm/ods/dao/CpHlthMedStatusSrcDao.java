package com.ibm.wcm.ods.dao;

import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.ibm.gbs.util.HibernateUtil;
import com.ibm.wcm.ods.dto.CpHlthMedStatusSrc;

public class CpHlthMedStatusSrcDao {

	public List<CpHlthMedStatusSrc> getCpHlthMedStatusSrcByCpHlthSrcSeqNum(BigDecimal seqNum) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		List<CpHlthMedStatusSrc> list = null;

		try {
			transaction = session.beginTransaction();
			Query query = session.createQuery("from CpHlthMedStatusSrc where clientProfileHlthSrc.clientProfileHlthSeqNum = :seq");
			query.setParameter("seq", seqNum);
			list = query.list();

			for (Iterator iterator = list.iterator(); iterator.hasNext();) {
				CpHlthMedStatusSrc dto = (CpHlthMedStatusSrc) iterator.next();
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
}