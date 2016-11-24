package pl.pd.spring.rest;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.DateSerializer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by pdebala on 2016-06-23.
 */
@Controller
public class EmployeeRestController {

    private static final String GET_DUMMY_PATH = "/employee";
    private static final String CREATE_EMP_PATH = "/employee";
    private static final String GET_EMP_PATH = "/employee/{id}";
    private static final String PUT_EMP_PATH = "/employee/{id}";
    private static final String PATCH_EMP_PATH = "/employee/{id}";
    private static final String DELETE_EMP_PATH = "/employee/{id}";
    private static final String GET_EMPS_PATH = "/employees";

    //Map to store employees, ideally we should use database
    Map<Integer, Employee> empData = new HashMap<Integer, Employee>();

    @RequestMapping(method = RequestMethod.GET, value = GET_DUMMY_PATH)
    public @ResponseBody Employee getDummyEmployee() {
        Employee emp = new Employee();
        return emp;
    }

    @RequestMapping(method = RequestMethod.POST, value = CREATE_EMP_PATH)
    public @ResponseBody Employee getCreateEmployee(@RequestBody Employee emp) {
        empData.put(1, emp);
        return emp;
    }

    @RequestMapping(method = RequestMethod.GET, value = GET_EMP_PATH)
    public @ResponseBody Employee getEmployee(@PathVariable(value = "id") Integer id) {
        Employee emp = new Employee();
        return empData.get(id);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = GET_EMP_PATH)
    public void deleteEmployee(@PathVariable(value = "id") Integer id) {
        empData.remove(id);
    }


    class Employee {
        private Integer id;
        private String name;
        private Date birthDate;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @JsonSerialize(using = DateSerializer.class)
        public Date getBirthDate() {
            return birthDate;
        }

        public void setBirthDate(Date birthDate) {
            this.birthDate = birthDate;
        }
    }
}
