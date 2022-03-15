package model.service;

import java.sql.SQLException;

import exception.NotFoundException;
import model.dao.CustomerDAO;
import model.dao.CustomerDAOImpl;
import model.dto.Customer;
import session.Session;
import session.SessionSet;

public class CustomerServiceImpl implements CustomerService {
	CustomerDAO customerDao = new CustomerDAOImpl();


	/**
	 * �α����ϱ�
	 * @throws NotFoundException
	 * */
	@Override
	public Customer login(String cusId, String cusPwd) throws SQLException, NotFoundException {
		Customer customer = customerDao.login(cusId,cusPwd);
		if(customer==null) {
			throw new NotFoundException("������ �ٽ� Ȯ�����ּ���.");
		}

		//�α��� �� ���� �����ϱ�
		Session session = new Session(cusId);

		SessionSet sessionSet = SessionSet.getInstance();
		sessionSet.add(session);

		return customer;
	}

}
