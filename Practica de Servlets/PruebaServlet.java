package Vaney;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import Vaney.Persona;


/**
 * Servlet implementation class PruebaServlet
 */
@WebServlet("/PruebaServlet")
public class PruebaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PruebaServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter outPW = response.getWriter();
		outPW.print("<!DOCTYPE html>\r\n" + 
				"<html>\r\n" + 
				"<head>\r\n" + 
				"<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n" + 
				"<title>PEPA Servlet </title>\r\n" + 
				"</head>\r\n" + 
				"<body>\r\n");
		
		String nombreColumna1 = "Nombre: ";
		String nombreColumna2 = "Apellido: ";
		String nombreColumna3 = "Edad: ";
		String nombreColumna4 = "Sexo: ";
		String nombreColumna5 = "Fecha de Nacimiento: ";
		String nombreColumna6 = "Semestre: ";
		String nombreColumna7 = "Codigo: ";
		String nombreColumna8 = "Materias: ";
		String nombreColumna9 = "Carrera: ";
		
		String name = request.getParameter("nombre");
		String lastname = request.getParameter("apellido");
		String year = request.getParameter("edad");
		String sex = request.getParameter("sexo");
		String date = request.getParameter("fecha_nacimiento");
		String semester = request.getParameter("semestre");
		String cod = request.getParameter("codigoEST");
		String  mater = request.getParameter("materias");
		String career = request.getParameter("carrera");
		
		String insert = "INSERT INTO estudiante(nombre, apellido, edad, sexo, fecha_nacimiento, semestre, numEstudiante, materias, carrera) values(?, ?, ?, ?, ?, ?, ?, ?, ?)";
		
		Connection con = null;
		ArrayList<Persona> listaPersona = new ArrayList<>();
		
		
		

			try {

				Class.forName("com.mysql.jdbc.Driver");

				con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/controldeestudio", "root", "");

				PreparedStatement pS = (PreparedStatement) con.prepareStatement(insert);

				pS.setString(1, name);
				pS.setString(2, lastname);
				pS.setString(3, year);
				pS.setString(4, sex);
				pS.setString(5, date);
				int semestry = Integer.parseInt(semester);
				pS.setInt(6, semestry);
				pS.setString(7, cod);
				pS.setString(8, mater);
				pS.setString(9, career);
				pS.executeUpdate();
				outPW.print("<script> alert(\"Agregado con exito...\");</script>");
				String query = "SELECT * FROM estudiante";		
				Statement statement = (Statement) con.createStatement();
				ResultSet rs2 = statement.executeQuery(query);
			
				while (rs2.next()){
				
					listaPersona.add( new Persona( rs2.getString(1), rs2.getString(2), rs2.getString(3), rs2.getString(4), rs2.getString(5), rs2.getInt(6), rs2.getString(7), rs2.getString(8), rs2.getString(9) ) );	
		
				}
				rs2.close();
				con.close();
			
			
			
			} catch (Exception e){
			
				outPW.print("<script> alert(\"Error: " + e.getMessage() + "\");</script>");
			}
		
		outPW.print("<table> \r\n" + 
				"			<tr>\r\n" + 
				"				<th>" + nombreColumna1 + "</th>\r\n" + 
				"				<th>" + nombreColumna2 + "</th>\r\n" + 
				"				<th>" + nombreColumna3 + "</th>\r\n" + 
				"				<th>" + nombreColumna4 + "</th>\r\n" + 
				"				<th>" + nombreColumna5 + "</th>\r\n" + 
				"				<th>" + nombreColumna6 + "</th>\r\n" + 
				"				<th>" + nombreColumna7 + "</th>\r\n" + 
				"				<th>" + nombreColumna8 + "</th>\r\n" + 
				"				<th>" + nombreColumna9 + "</th>\r\n" + 
				"				<th>Datos Completos del Estudiante...</th>\r\n" + 
				"				\r\n" + 
				"			</tr>");
		
		
		for(Persona i : listaPersona) {
			outPW.print("<tr>\r\n" + 
					"				<td>" + i.getName() + "</td>\r\n" + 
					"				<td>" + i.getLastname() + "</td>\r\n" + 
					"				<td>" + i.getIu() + "</td>\r\n" + 
					"				<td>" + i.getIi() + "</td>\r\n" + 
					"				<td>" + i.getCj() + "</td>\r\n" + 
					"				<td>" + i.getCi() + "</td>\r\n" + 
					"				<td>" + i.getCh() + "</td>\r\n" + 
					"				<td>" + i.getCg() + "</td>\r\n" + 
					"				<td>" + i.getCf() + "</td>\r\n" + 
					"				<td>");
		}
		
		outPW.print("</table>");
		outPW.print("</body>\r\n" + 
				"</html>");
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);

		
	}

}
