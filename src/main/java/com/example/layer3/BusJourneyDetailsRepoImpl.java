package com.example.layer3;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.layer2.ReservationDetails;

@Repository
public class BusJourneyDetailsRepoImpl extends BaseRepository implements BusJourneyDetailsRepo{

		@Transactional
		public void changeAvailableSeats(int jID, String rID) throws NumberNotFoundException{
				EntityManager entityManager = getEntityManager();
				Query query = entityManager.createQuery("update BusJourneyDetails b set b.availableseates = (select r.seatsBooked from ReservationDetails r where r.journeyId = :jID and r.reservationId = :rID) + b.availableseates where b.journeyId = :jID").setParameter("jID",jID).setParameter("rID", rID);
				query.executeUpdate();
			}
		
	}

