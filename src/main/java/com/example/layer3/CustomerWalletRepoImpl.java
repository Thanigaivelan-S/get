package com.example.layer3;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
@Repository
public class CustomerWalletRepoImpl extends BaseRepository implements CustomerWalletRepo{

	@Transactional
	public void addMoneyToWallet(String mailID) throws NumberNotFoundException{
			EntityManager entityManager = getEntityManager();
			Query query = entityManager.createQuery("update CustomerWallet c set c.walletAmount = (select r.totalAmountPaid from PaymentDetails r where r.registeredEmail = :mail) + c.walletAmount where c.registeredEmail = :mail");
			query.setParameter("mail", mailID);
			query.executeUpdate();
		}
	}


