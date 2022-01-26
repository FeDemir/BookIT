package com.BookIT.step_definitions;

import com.BookIT.utilities.DB_Util;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.util.List;

public class DBConnectionTest_StepDefinitions {

    @Given("user on no page")
    public void user_on_no_page() {
        
    }
    @Then("user prints column headers for books")
    public void user_prints_column_headers_for_books() {
        DB_Util.runQuery("select * from users");
        System.out.println("Column Count = "+DB_Util.getColumnCount());
        List<String> columns = DB_Util.getAllColumnNamesAsList();
        System.out.println("columns = " + columns);
    }
}
