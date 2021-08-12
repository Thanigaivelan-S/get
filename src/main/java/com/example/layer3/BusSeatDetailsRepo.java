package com.example.layer3;



import org.springframework.stereotype.Repository;

@Repository
public interface BusSeatDetailsRepo {
	void updateSeatDetails(String rID) throws NumberNotFoundException;
}
