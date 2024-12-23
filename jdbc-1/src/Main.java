import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.Statement;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    try{
        //load Driver
        System.out.println(Class.forName("java.util.ArrayList"));
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/p2","root","root");
        System.out.println(con);
        String sql_st="Create table emp(eid int,ename varchar(32),esal int);";
        Statement st=con.createStatement();
        st.executeUpdate(sql_st);
        System.out.println("Table Created");
        con.close();         //to release resource
    }
    catch (Exception e){
        e.printStackTrace();
    }
    }
}