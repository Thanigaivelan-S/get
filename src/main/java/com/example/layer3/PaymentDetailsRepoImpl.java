package com.example.layer3;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.layer2.PaymentDetails;

@Repository
public class PaymentDetailsRepoImpl extends BaseRepository implements PaymentDetailsRepo{

	@Transactional
	public void deletePayment(String rID) throws NumberNotFoundException {
		EntityManager entityManager = getEntityManager();
		Query query = entityManager.createQuery("delete from PaymentDetails p where p.reservationId = :rID");
		query.setParameter("rID", rID);
		query.executeUpdate();		
	}
}
