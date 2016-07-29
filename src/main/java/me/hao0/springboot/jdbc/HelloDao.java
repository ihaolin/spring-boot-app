package me.hao0.springboot.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


/**
 * Author: haolin
 * Date:   7/29/16
 * Email:  haolin.h0@gmail.com
 */
@Repository
public class HelloDao {

    @Autowired
    private JdbcTemplate jdbc;

    public void select1(){
        jdbc.execute("SELECT 1");
    }
}
