package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import beans.EmpDao;

public class EmpCRUDController extends MultiActionController {
	
	private EmpDao dao;
	
	public void setDao(EmpDao dao) {
		this.dao = dao;
	}
	public EmpDao getDao() {
		return dao;
	}
	
	public ModelAndView cdempsaveDemo(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		String name= req.getParameter("name");
		String email = req.getParameter("email");
		String address = req.getParameter("address");
		int i=dao.save(name, email, address);
		
		ModelAndView mav=null;
		if (i>0){
			mav= new ModelAndView("success");
		}
		else{
			mav= new ModelAndView("failure");
		}		
		
		return mav;
	}
	
	public ModelAndView cdempupdateDemo(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		int id= Integer.parseInt(req.getParameter("id"));
		String name= req.getParameter("name");
		String email = req.getParameter("email");
		String address = req.getParameter("address");
		
		int i=dao.update(id, name, email, address);
		
		ModelAndView mav=null;
		if (i>0){
			mav= new ModelAndView("success");
		}
		else{
			mav= new ModelAndView("failure");
		}		
		
		return mav;
	}
	
	public ModelAndView cdcheckempDemo(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		int id= Integer.parseInt(req.getParameter("id"));
		
		int i=dao.isAvailable(id);
		ModelAndView mav=null;
		if (i>0){
			mav= new ModelAndView("empupdate");
		}
		else{
			mav= new ModelAndView("noemp");
		}		
		
		return mav;
	}
	
	

}
