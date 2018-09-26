/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import Model.Automovil;
import Model.Conexion;
import Model.UltimoDuenio;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author maranda
 */
public class DAO_Automovil extends Conexion implements DAO<Automovil>{

    public DAO_Automovil(String bd) throws ClassNotFoundException, SQLException {
        super("registroAutomovilesMAAT");
    }

    @Override
    public void create(Automovil ob) throws SQLException {
        ejecutar("INSERT INTO automovil VALUES (NULL, '"+ob.getPatente()+"','"+ob.getMarca()+"',"
                + " "+ob.getAnio()+", '"+ob.getDetalles()+", '"+ob.getUd().getRun()+"')");
    }

    @Override
    public List<Automovil> read() throws SQLException {
        ResultSet rs=ejecutar("SELECT * FROM automovil");
        List<Automovil> listaDeAutomoviles= new ArrayList<Automovil>();
        
        Automovil auto;
        
        while(rs.next()){
            auto = new Automovil();
            
            auto.setId(rs.getInt(1));
            auto.setPatente(rs.getString(2));
            auto.setMarca(rs.getString(3));
            auto.setAnio(rs.getInt(4));
            auto.setDetalles(rs.getString(5));
            
            String runDuenio=rs.getString(6);
            
            ResultSet buscaDuenio=ejecutar("SELECT * FROM ultimoDuenio WHERE run='"+runDuenio+"'");
            UltimoDuenio ud=new UltimoDuenio();
            
            
            while(buscaDuenio.next()){
                ud.setRun(runDuenio);
                ud.setNombreCompleto(buscaDuenio.getString(2));
                ud.setTelefono(buscaDuenio.getString(3));
            }
            
            auto.setUd(ud);
            
        }
        
        
        
        return listaDeAutomoviles;
    }

    @Override
    public void update(Automovil ob) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(int id) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Automovil> searchByText(String txt) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Automovil searchById(String id) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
