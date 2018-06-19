package com.ibm.wcm.ods.dao;

import java.util.Iterator;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.ibm.gbs.util.HibernateUtil;
import com.ibm.wcm.ods.dto.ClientProfileLglSrc;

public class ClientProfileLglSrcDao {

	public List<ClientProfileLglSrc> getMemberListByMemIDSrcCode(String memIdnum, String srcCode) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		List<ClientProfileLglSrc> list = null;

		try {
			transaction = session.beginTransaction();
			Query query = session.createQuery("from ClientProfileLglSrc where clientId = :cid and sourceSystemId = :sid");
			query.setParameter("cid", memIdnum);
			query.setParameter("sid", srcCode);
			list = query.list();

			for (Iterator iterator = list.iterator(); iterator.hasNext();) {
				ClientProfileLglSrc clientProfileLglSrcDto = (ClientProfileLglSrc) iterator.next();
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