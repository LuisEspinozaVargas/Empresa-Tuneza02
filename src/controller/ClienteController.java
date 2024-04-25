package controller;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Cliente;


public class ClienteController{
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("Empresa-Tuneza02");
	EntityManager em = emf.createEntityManager();
	
	public ClienteController () {}
	
	public void Insertar_Cliente() {
	
	Cliente insertarCliente = new Cliente();
	insertarCliente.setIdcliente(6);
	insertarCliente.setNombre("All");
	insertarCliente.setNom_apellido("Tori");
	insertarCliente.setDireccion("lima");
	insertarCliente.setTelefono("948294373");
	insertarCliente.setEmail("aldergomez5.com");
	
	em.getTransaction().begin();
	em.persist(insertarCliente);
	em.getTransaction().commit();
	
	}
	
	public void Listar_Cliente() {  
	List<Cliente> listarCliente = em.createQuery("SELECT v FROM Cliente v", Cliente.class).getResultList();  
	System.out.println("Numero de clientes: " + listarCliente.size() ); for(Cliente us:listarCliente) {  
	System.out.println("Cliente: " + us);}
	
	}  
	
	
	public void Eliminar_Cliente() {  
		em.getTransaction().begin();  
	Cliente eliminarCliente = em.find(Cliente.class , 2);  
	System.out.println("idcliente" + eliminarCliente.getIdcliente());  
	System.out.println("nombre" + eliminarCliente.getNombre()); 
	em.remove(eliminarCliente);
	em.getTransaction().commit();
	} 
	
	public static void main(String [] arg) {
		
		ClienteController clientecontroller = new ClienteController();
		clientecontroller.Listar_Cliente();
	}


}
