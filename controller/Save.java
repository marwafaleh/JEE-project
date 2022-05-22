package tn.essat.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tn.essat.dao.GestionImp;
import tn.essat.dao.IGestion;
import tn.essat.model.Categorie;
import tn.essat.model.Enseignant;
import tn.essat.model.Etudiant;
import tn.essat.model.Pfe;

/**
 * Servlet implementation class Save
 */
public class Save extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Save() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		IGestion dao = new GestionImp();
		String titre=request.getParameter("titrePfe");
	
		int id_etd=Integer.parseInt(request.getParameter("etud"));
		int id_ens=Integer.parseInt(request.getParameter("ense"));
		int id_cat=Integer.parseInt(request.getParameter("categ"));

	
		Pfe p = new Pfe(titre,id_etd,id_ens,id_cat);
		dao.addPfe(p);
		response.sendRedirect("Principale");

	}

}