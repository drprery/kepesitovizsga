package hu.nive.ujratervezes.kepesitovizsga.jurassic;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JurassicPark {
    private DataSource dataSource;

    public JurassicPark(DataSource dataSource){
        this.dataSource = dataSource;
    }

    public List<String> checkOverpopulation(){
        List<String> overPopulated = new ArrayList<>();


            try (Connection conn = dataSource.getConnection();
                 Statement stmt = conn.createStatement();
                 ResultSet rs = stmt.executeQuery("SELECT `breed` FROM `dinosaur` WHERE `expected` < `actual` ORDER BY breed;")) {
                while (rs.next()) {
                    String name = rs.getString("breed");
                    overPopulated.add(name);
                }


                return overPopulated;

            } catch (SQLException se) {
                throw new IllegalArgumentException("Error by select", se);
            }
        }

    }

