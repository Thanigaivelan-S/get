package com.example.layer3;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class BusSeatDetailsRepoImpl extends BaseRepository implements BusSeatDetailsRepo{

	@Transactional
	public void updateSeatDetails(String rID) throws NumberNotFoundException{
		EntityManager entityManager = getEntityManager();
		Query query = entityManager.createQuery("update BusSeatsDetails b set b.reservationId=NULL where b.reservationId = :rID");
		query.setParameter("rID", rID);
		query.executeUpdate();
	}
}
