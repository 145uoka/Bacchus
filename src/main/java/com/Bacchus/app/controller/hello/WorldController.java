package com.Bacchus.app.controller.hello;

import java.util.ArrayList;
import java.util.List;

import org.dbflute.cbean.result.ListResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.Bacchus.app.components.Employee;
import com.Bacchus.dbflute.exbhv.UserTBhv;
import com.Bacchus.dbflute.exentity.UserT;
import com.Bacchus.webbase.appbase.BaseController;

/**
 * ハローワールドコントローラ。
 *
 * @author tokuno
 */
@Controller
public class WorldController extends BaseController {
    @Autowired
    UserTBhv userTBhv;

    /**
     * ユーザ一覧表示。
     *
     * @param form
     * @param model Model
     * @return /user/userIndex
     * @throws Exception
     */
    @RequestMapping(value = "/hello/world", method = RequestMethod.GET)
    public String index(Model model) throws Exception {

//        model.addAttribute("key1", "gsi");
//        model.addAttribute("key2", 1 + 2);
//
//        List<Employee> employeeList = new ArrayList<Employee>();
//
//
//        Employee employee = new Employee();
//        employee.setEmpNo("社員番号");
//        employee.setEmpName("社員名");
//
//
//        employeeList.add(employee);
//
//        employee = new Employee();
//        employee.setEmpNo("社員番号2");
//        employee.setEmpName("社員名2");
//        employeeList.add(employee);
//
//        employee = new Employee();
//        employee.setEmpNo("社員番号3");
//        employee.setEmpName("社員名3");
//        employeeList.add(employee);

//        model.addAttribute("key3", employee);
//        model.addAttribute("key4", employeeList);

        ListResultBean<UserT> resultList = userTBhv.selectList(cb->{});

        List<Employee> employeeDtoList = new ArrayList<Employee>();
        for(UserT userT : resultList){
            Employee employeeDto = new Employee();
            employeeDto.setEmpNo(userT.getUserId().toString());
            employeeDto.setEmpName(userT.getLastName() + "" + userT.getFirstName());


            employeeDtoList.add(employeeDto);
        };
        model.addAttribute("key5", employeeDtoList);
        return "/hello/world";
    }
}
