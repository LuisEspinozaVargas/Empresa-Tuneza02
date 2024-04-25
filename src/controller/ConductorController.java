package controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Conductor;

public class ConductorController{
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("Empresa-Tuneza02");
	EntityManager em = emf.createEntityManager();
	
	public ConductorController () {}
	
	public void Insertar_Conductor() {
	
	Conductor insertarConductor = new Conductor();
	insertarConductor.setIdconductor(8);
	insertarConductor.setDni("70804068");
	insertarConductor.setRestricciones(2);
	insertarConductor.setLicencia("HSJCHW757h");

	
	em.getTransaction().begin();
	em.persist(insertarConductor);
	em.getTransaction().commit();
	
	}
	
	public void Listar_Conductor() {
	    List<Conductor> listarConductor = em.createQuery("SELECT v FROM Conductor v", Conductor.class).getResultList();
	    System.out.println("Numero de conductores: " + listarConductor.size());
	    for (Conductor conductor : listarConductor) {
	        System.out.println("Conductor: " + conductor.toString());
	    }
	}
	
	
	public void Eliminar_Conductor() {  
		em.getTransaction().begin();  
	Conductor eliminarConductor = em.find(Conductor.class , 6);  
	System.out.println("idconductor" + eliminarConductor.getIdconductor());  
	System.out.println("dni" + eliminarConductor.getDni()); 
	em.remove(eliminarConductor);
	em.getTransaction().commit();
	} 
	
	public static void main(String [] arg) {
		
		ConductorController conductorcontroller = new ConductorController();
		conductorcontroller.Insertar_Conductor();
	}
		

}
