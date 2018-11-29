package com.simtlix.consultafijapoc.customer.repository;

import com.simtlix.consultafijapoc.customer.DataSource;
import com.simtlix.consultafijapoc.customer.model.Customer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import javax.transaction.Transactional;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
@Transactional
public class CustomerRepository {

    static private Logger logger = LoggerFactory.getLogger(CustomerRepository.class);

    public static List<Customer> findAll() {
        String SQL_QUERY = "select * from CUSTOMER";
        List<Customer> customers = null;
        try (Connection connection = DataSource.getConnection();
             PreparedStatement pst = connection.prepareStatement(SQL_QUERY);
             ResultSet rs = pst.executeQuery();){
            customers = new ArrayList<>();
            Customer customer;
            while (rs.next()) {
                customer = new Customer();
                customer.setDni(rs.getInt("dni"));
                customer.setNombre(rs.getString("nombre"));
                customer.setApellido(rs.getString("apellido"));
                customers.add(customer);
            }
        } catch (SQLException e) {
            logger.error("Error on querying the database. ", e.getMessage());
            e.printStackTrace();
        }
        return customers;
    }

}
