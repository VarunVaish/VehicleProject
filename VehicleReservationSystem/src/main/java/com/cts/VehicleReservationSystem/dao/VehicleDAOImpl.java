package com.cts.VehicleReservationSystem.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cts.VehicleReservationSystem.bean.Vehicle;


@Repository("vehicleDAO")
@Transactional
public class VehicleDAOImpl implements VehicleDAO{
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	@Transactional
	public Vehicle insertVehicle(Vehicle vehicle) {
		System.out.println("In DAO" + vehicle);

		Session session=null;
		session=sessionFactory.getCurrentSession();
		System.out.println(vehicle);
		
		session.saveOrUpdate(vehicle);
		// TODO Auto-generated method stub
		return vehicle;
	}

	
	
	@Transactional(readOnly=true)
	public List<Vehicle> getallVehicle() {
		Session session=null;
		String query="from vehicle";
		org.hibernate.query.Query<Vehicle> query2=null;
		session = sessionFactory.getCurrentSession();
		query2=session.createQuery(query);
		List<Vehicle> list=query2.getResultList();
		System.out.println(list);
		return list;
	}

}
