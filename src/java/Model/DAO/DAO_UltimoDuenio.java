/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import Model.UltimoDuenio;
import java.sql.SQLException;
import java.util.List;
import Model.Conexion;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author maranda
 */
public class DAO_UltimoDuenio extends Conexion implements DAO<UltimoDuenio> {

    public DAO_UltimoDuenio(String bd) throws ClassNotFoundException, SQLException {
        super("registroAutomovilesMAAT");
    }

    @Override
    public void create(UltimoDuenio ob) throws SQLException {
        ejecutar("INSERT INTO ultimoDuenio VALUES ('"+ob.getRun()+"','"+ob.getNombreCompleto()+"',"
                + "'"+ob.getTelefono()+"')");
    }

    @Override
    public List<UltimoDuenio> read() throws SQLException {
        List<UltimoDuenio> listaDuenio= new ArrayList<UltimoDuenio>();
        
        
        
        return listaDuenio;
    }

    @Override
    public void update(UltimoDuenio ob) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(int id) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<UltimoDuenio> searchByText(String txt) throws SQLException {
        return null;
    }

    @Override
    public UltimoDuenio searchById(String id) throws SQLException {
        UltimoDuenio ud=new UltimoDuenio();
        ResultSet rs=ejecutar("SELECT * FROM ultimoDuenio WHERE run='"+id+"'");
        
        if(rs.next()){
            ud.setRun(rs.getString(1));
            ud.setNombreCompleto(rs.getString(2));
            ud.setTelefono(rs.getString(3));

        }
 
        
        return ud;
    }
    
}
