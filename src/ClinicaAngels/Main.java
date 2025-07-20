<<<<<<< HEAD
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClinicaAngels;
import java.io.*;
import java.sql.*;
import javax.swing.*;
/**
 *
 * @author HP
 */
public class Main {
    static Connection conn=null;
    static Statement st=null;
    static ResultSet rs=null;

    static String bd="XE";
    static String login="SYSTEM";
    static String password="76122302";
    static String url="jdbc:oracle:thin:@localhost:1521:XE";
    
    public static Connection Enlace(Connection conn)throws SQLException {
        try {
        Class.forName("oracle.jdbc.OracleDriver");
        conn=DriverManager.getConnection(url, login, password);
    }
        catch(ClassNotFoundException e )
    {
        System.out.print("Clase no encontrada");
    }
        return conn;
    }
        public static Statement sta(Statement st)throws SQLException {
        conn=Enlace(conn);
        st=conn.createStatement();
        return st;
    }
        
    public static ResultSet EnlEst(ResultSet rs)throws SQLException    {
       st=sta(st);
       rs=st.executeQuery("select * from ADMINISTRADOR");
       return rs;
    }
    
    public static ResultSet EnlEst20(ResultSet rs)throws SQLException    {
       st=sta(st);
       rs=st.executeQuery("select * from MEDICOEN");
       return rs;
    } 
    
    public static ResultSet EnlEst50(ResultSet rs)throws SQLException    {
       st=sta(st);
       rs=st.executeQuery("select * from Historial");
       return rs;
    }
    
    public static ResultSet EnlEst30(ResultSet rs)throws SQLException    {
       st=sta(st);
       rs=st.executeQuery("select * from EMPLEADOCON");
       return rs;
    } 
        
    public static ResultSet EnlEst0(ResultSet rs)throws SQLException {
        st=sta(st);
        rs=st.executeQuery("select * from CitaMedica");
        return rs;
    }
    
    public static ResultSet EnlEst1(ResultSet rs)throws SQLException {
        st=sta(st);
        rs=st.executeQuery("select * from Medico");
        return rs;
    }
    public static ResultSet EnlEst11(ResultSet rs)throws SQLException {
        st=sta(st);
        rs=st.executeQuery("select * from Cliente");
        return rs;
    }
    
    public static ResultSet EnlEst2(ResultSet rs)throws SQLException {
        st=sta(st);
        rs=st.executeQuery("select * from Enfermero");
        return rs;
    }
    
    public static ResultSet EnlEst3(ResultSet rs)throws SQLException {
        st=sta(st);
        rs=st.executeQuery("select * from Medicamento");
        return rs;
    }
    
    public static ResultSet EnlEst4(ResultSet rs)throws SQLException {
        st=sta(st);
        rs=st.executeQuery("select * from Especialidad");
        return rs;
    }
    
    public static ResultSet EnlEst5(ResultSet rs)throws SQLException {
        st=sta(st);
        rs=st.executeQuery("select * from Paciente");
        return rs;
    }
    
    public static ResultSet EnlEst100(ResultSet rs)throws SQLException {
        st=sta(st);
        rs=st.executeQuery("select * from venta");
        return rs;
    }
    
    public static ResultSet EnlEst101(ResultSet rs)throws SQLException {
        st=sta(st);
        rs=st.executeQuery("select * from factura");
        return rs;
    }
}
=======
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClinicaAngels;
import java.io.*;
import java.sql.*;
import javax.swing.*;
/**
 *
 * @author HP
 */
public class Main {
    static Connection conn=null;
    static Statement st=null;
    static ResultSet rs=null;

    static String bd="XE";
    static String login="SYSTEM";
    static String password="76122302";
    static String url="jdbc:oracle:thin:@localhost:1521:XE";
    
    public static Connection Enlace(Connection conn)throws SQLException {
        try {
        Class.forName("oracle.jdbc.OracleDriver");
        conn=DriverManager.getConnection(url, login, password);
    }
        catch(ClassNotFoundException e )
    {
        System.out.print("Clase no encontrada");
    }
        return conn;
    }
        public static Statement sta(Statement st)throws SQLException {
        conn=Enlace(conn);
        st=conn.createStatement();
        return st;
    }
        
    public static ResultSet EnlEst(ResultSet rs)throws SQLException    {
       st=sta(st);
       rs=st.executeQuery("select * from ADMINISTRADOR");
       return rs;
    }
    
    public static ResultSet EnlEst20(ResultSet rs)throws SQLException    {
       st=sta(st);
       rs=st.executeQuery("select * from MEDICOEN");
       return rs;
    } 
    
    public static ResultSet EnlEst50(ResultSet rs)throws SQLException    {
       st=sta(st);
       rs=st.executeQuery("select * from Historial");
       return rs;
    }
    
    public static ResultSet EnlEst30(ResultSet rs)throws SQLException    {
       st=sta(st);
       rs=st.executeQuery("select * from EMPLEADOCON");
       return rs;
    } 
        
    public static ResultSet EnlEst0(ResultSet rs)throws SQLException {
        st=sta(st);
        rs=st.executeQuery("select * from CitaMedica");
        return rs;
    }
    
    public static ResultSet EnlEst1(ResultSet rs)throws SQLException {
        st=sta(st);
        rs=st.executeQuery("select * from Medico");
        return rs;
    }
    public static ResultSet EnlEst11(ResultSet rs)throws SQLException {
        st=sta(st);
        rs=st.executeQuery("select * from Cliente");
        return rs;
    }
    
    public static ResultSet EnlEst2(ResultSet rs)throws SQLException {
        st=sta(st);
        rs=st.executeQuery("select * from Enfermero");
        return rs;
    }
    
    public static ResultSet EnlEst3(ResultSet rs)throws SQLException {
        st=sta(st);
        rs=st.executeQuery("select * from Medicamento");
        return rs;
    }
    
    public static ResultSet EnlEst4(ResultSet rs)throws SQLException {
        st=sta(st);
        rs=st.executeQuery("select * from Especialidad");
        return rs;
    }
    
    public static ResultSet EnlEst5(ResultSet rs)throws SQLException {
        st=sta(st);
        rs=st.executeQuery("select * from Paciente");
        return rs;
    }
    
    public static ResultSet EnlEst100(ResultSet rs)throws SQLException {
        st=sta(st);
        rs=st.executeQuery("select * from venta");
        return rs;
    }
    
    public static ResultSet EnlEst101(ResultSet rs)throws SQLException {
        st=sta(st);
        rs=st.executeQuery("select * from factura");
        return rs;
    }
}
>>>>>>> 359e4d52bb43043cbac973561d666cfb924a57d9
