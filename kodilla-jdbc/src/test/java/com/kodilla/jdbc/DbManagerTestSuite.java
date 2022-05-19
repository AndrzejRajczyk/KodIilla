package com.kodilla.jdbc;

import org.junit.jupiter.api.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class DbManagerTestSuite {

    @Test
    void testConnect() throws SQLException {
        //Given
        //When
        DbManager dbManager = DbManager.getInstance();
        //Then
        assertNotNull(dbManager.getConnection());
    }
    @Test
    void testSelectUsers() throws SQLException {
        //Given
        DbManager dbManager = DbManager.getInstance();

        //When
        String sqlQuery = "SELECT * FROM USERS";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet rs = statement.executeQuery(sqlQuery);

        //Then
        int counter = 0;
        while (rs.next()) {
            System.out.println(rs.getInt("ID") + ", " +
                    rs.getString("FIRSTNAME") + ", " +
                    rs.getString("LASTNAME"));
            counter++;
        }
        rs.close();
        statement.close();
        assertEquals(6, counter);
    }
    @Test
   void testSelectUsersAndPosts() throws SQLException {
       //WHEN
        DbManager dbManager = DbManager.getInstance();
        Statement statement = dbManager.getConnection().createStatement();
        String mySQLquerry = "SELECT U.FIRSTNAME, U.LASTNAME, "+" COUNT(*) AS USERSPOSTSCOUNT " +
        "FROM USERS U "+
        "JOIN POSTS P ON U.ID = P.USER_ID " +
        "GROUP BY P.USER_ID " +
         "having count(*) > 1; ";


        ResultSet rs = statement.executeQuery(mySQLquerry);

        //THEN
        int counter = 0;
        while(rs.next()) {
            System.out.println("\n" + rs.getString("FIRSTNAME") + " " +
                    rs.getString("LASTNAME") + ", got: " +
                    rs.getInt("USERSPOSTSCOUNT") + " posts");
            counter++;
        }
        rs.close();
        statement.close();
        assertEquals(1, counter);
    }
}