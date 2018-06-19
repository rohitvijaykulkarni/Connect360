package com.ibm.wcm.ods.dao;

import java.util.Iterator;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.ibm.gbs.util.HibernateUtil;
import com.ibm.wcm.ods.dto.ClientProfileHlthSrc;

public class ClientProfileHlthSrcDao {

	public List<ClientProfileHlthSrc> getMemberListByMemIDSrcCode(String memIdnum, String srcCode) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		List<ClientProfileHlthSrc> list = null;

		try {
			transaction = session.beginTransaction();
			Query query = session.createQuery("from ClientProfileHlthSrc where clientId = :cid and sourceSystemId = :sid");
			query.setParameter("cid", memIdnum);
			query.setParameter("sid", srcCode);
			list = query.list();

			for (Iterator iterator = list.iterator(); iterator.hasNext();) {
				ClientProfileHlthSrc dto = (ClientProfileHlthSrc) iterator.next();
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