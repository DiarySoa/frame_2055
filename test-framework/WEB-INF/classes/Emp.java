package etu2055.framework.entity;

import java.sql.Date;
import java.time.LocalDate;
import java.util.Calendar;

import etu2055.framework.*;
import java.util.*;

@Singleton

public class Emp {
	String nom;
	String prenom;
	int appel;
	Date dateNaissance;
		HashMap<String, Object> session;

	public HashMap<String, Object> getSession() {
		return session;
	}

	public void setSession(HashMap<String, Object> session) {
		this.session = session;
	}
	
	
	@AppRoute(url = "/emp-get-nom")
	public String getNom() {
		return nom;
	}
	@AppRoute(url = "/emp-set-nom")
	public void setNom(String nom) {
		this.nom = nom;
	}
	@AppRoute(url = "/emp-get-prenom")
	public String getPrenom() {
		return prenom;
	}
	@AppRoute(url = "/emp-set-prenom")
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	@AppRoute(url = "/emp-get-dateNaissance")
	public Date getDateNaissance() {
		return dateNaissance;
	}
	@AppRoute(url = "/emp-set-dateNaissance")
	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	@AppRoute(url = "/emp-get-age")
	public int getAge() {
		Date nowDate = Date.valueOf(LocalDate.now());
		
		Calendar calendar = Calendar.getInstance();
		Calendar calendar2 = Calendar.getInstance();
		
		calendar.setTime(this.getDateNaissance());
		calendar2.setTime(nowDate);
		
		return calendar2.get(Calendar.YEAR) - calendar.get(Calendar.YEAR);
	}
	@AppRoute(url = "/emp-getAll")
	public ModelView getAllEmp(){
		ModelView modelView = new ModelView("TongaSoa.jsp");
		String testData = "Mande";
		modelView.addItem("test", testData);
		return modelView;
	}
	@AppRoute(url = "/emp-printNom")
	public ModelView printName(){
		ModelView modelView = new ModelView("test.jsp");
		modelView.addItem("test",this.getNom());
		modelView.addItem("test2",this.getPrenom());
		modelView.addItem("test3",this.getAge());
		return modelView;
	}



	@Identification(user="isa-roa-telo")
	@AppRoute(url= "/emp-Appel")
	public ModelView appel(){
		ModelView modelView = new ModelView("singleton.jsp");
		this.appel = this.appel+1;
		modelView.addItem("nbr",this.appel);
		return modelView;
	}

	@AppRoute(url= "/emp-Login")
	public ModelView login(){
		ModelView modelView = new ModelView("index.jsp");

		modelView.addSession("user", "un-deux-trois");
		modelView.addSession("admin", "un-deux-trois");
		modelView.addSession("user", "isa-roa-telo");
		modelView.addSession("admin", "isa-roa-telo");
		return modelView;
	}


	

}
