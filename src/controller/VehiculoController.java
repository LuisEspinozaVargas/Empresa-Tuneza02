package controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Vehiculo;

public class VehiculoController {
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("Empresa-Tuneza02");
	EntityManager em = emf.createEntityManager();
	
	public VehiculoController () {}
	
	public void Insertar_Vehiculo() {
	
	Vehiculo insertarVehiculo = new Vehiculo();
	insertarVehiculo.setIdvehiculo(10);
	insertarVehiculo.setMarca("Toyota");
	insertarVehiculo.setModelo("II20205");
	insertarVehiculo.setPlaca("KM3543768");
	
	em.getTransaction().begin();
	em.persist(insertarVehiculo);
	em.getTransaction().commit();
	
	}
	
	public void Listar_Vehiculo() {
	    List<Vehiculo> listarVehiculo = em.createQuery("SELECT v FROM Vehiculo v", Vehiculo.class).getResultList();
	    System.out.println("Numero de vehiculos: " + listarVehiculo.size());
	    for (Vehiculo vehiculo : listarVehiculo) {
	        System.out.println("Vehiculo: " + vehiculo.toString());
	    }
	}
	
	public void Eliminar_Vehiculo() {  
		em.getTransaction().begin();  
	Vehiculo eliminarVehiculo = em.find(Vehiculo.class , 4);  
	System.out.println("idvehiculo" + eliminarVehiculo.getIdvehiculo());  
	System.out.println("marca" + eliminarVehiculo.getMarca()); 
	em.remove(eliminarVehiculo);
	em.getTransaction().commit();
	} 

	
	public static void main(String [] arg) {
		
		VehiculoController vehiculocontroller = new VehiculoController();
		vehiculocontroller.Eliminar_Vehiculo();
	}

}
