package com.example.layer3;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.layer2.TransactionDetails;

@Repository
public class TransactionDetailsRepoImpl extends BaseRepository implements TransactionDetailsRepo{

	@Transactional
		public void deleteTransaction(String rID) throws NumberNotFoundException {
		EntityManager entityManager = getEntityManager();
		Query query = entityManager.createQuery("delete from TransactionDetails t where t.reservationId = :rID");
		query.setParameter("rID", rID);
		query.executeUpdate();
	}
}