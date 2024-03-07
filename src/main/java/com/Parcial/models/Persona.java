package com.Parcial.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table (name = "persona")
public class Persona {
	
	   @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    @Column(name = "nombre")
	    private String nombre;

	    @Column(name = "apellido")
	    private String apellido;
	    
	    @Column(name = "correo")
	    private String correo;
	    
	    @Column(name = "telefono")
	    private String telefono;
	    
	    @Column(name = "direccion")
	    private String direccion;

		public Persona() {
			super();
		}

		public Persona(Long id, String nombre, String apellido, String correo, String telefono, String direccion) {
			super();
			this.id = id;
			this.nombre = nombre;
			this.apellido = apellido;
			this.correo = correo;
			this.telefono = telefono;
			this.direccion = direccion;
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getApellido() {
			return apellido;
		}

		public void setApellido(String apellido) {
			this.apellido = apellido;
		}

		public String getCorreo() {
			return correo;
		}

		public void setCorreo(String correo) {
			this.correo = correo;
		}

		public String getTelefono() {
			return telefono;
		}

		public void setTelefono(String telefono) {
			this.telefono = telefono;
		}

		public String getDireccion() {
			return direccion;
		}

		public void setDireccion(String direccion) {
			this.direccion = direccion;
		}
	    
	    
}
