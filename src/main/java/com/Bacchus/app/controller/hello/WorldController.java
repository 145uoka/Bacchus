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
 * HelloWorldコントローラ。
 *
 * @author sato
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

//    	model.addAttribute("key1", "GSI");
//    	model.addAttribute("key2", 1 + 2);
//
//    	List<Employee> employeeList = new ArrayList<Employee>();
//
//    	Employee employee = new Employee();
//    	employee.setEmpNo("001");
//   		employee.setEmpName("石郷岡");
//
//   		employeeList.add(employee);
//
//    	employee = new Employee();
//    	employee.setEmpNo("002");
//   		employee.setEmpName("佐藤");
//
//   		employeeList.add(employee);
//
//    	employee = new Employee();
//    	employee.setEmpNo("003");
//   		employee.setEmpName("徳野");
//
//   		employeeList.add(employee);
//
//   		model.addAttribute("key3", employee);
//   		model.addAttribute("key4", employeeList);

   		List<Employee> employeeDtoList = new ArrayList<Employee>();

   		ListResultBean<UserT> resultList = userTBhv.selectList(cb->{});

   		for (UserT userT : resultList) {
   			Employee employeeDto = new Employee();
   			employeeDto.setEmpNo(userT.getUserId().toString());
   			employeeDto.setEmpName(userT.getLastName() + " " + userT.getFirstName());

   			employeeDtoList.add(employeeDto);
   		}
   		model.addAttribute("key5", employeeDtoList);

        return "/hello/world";
    }
}
