package com.example.layer3;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.layer2.ReservationDetails;
@Repository
public class ReservationDetailsRepoImpl extends BaseRepository implements ReservationDetailsRepo {

	@Transactional
	public void deleteReservation(String rID) throws NumberNotFoundException {
		EntityManager entityManager = getEntityManager();
		Query query = entityManager.createQuery("delete from ReservationDetails r where r.reservationId = :rID");
		query.setParameter("rID", rID);
		query.executeUpdate();
}
}