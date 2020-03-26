package org.mybatis.presentation;

import java.util.*;
import javax.annotation.Resource;
import org.mybatis.domain.Shop;
import org.mybatis.service.ShopService;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.sun.org.apache.regexp.internal.recompile;

@Controller
@RequestMapping(value="/shop")
public class ShopController {
	
	//@Resource에 의해 자동 주입(ShopServiceImpl 객체)
	@Resource
	private ShopService shopService;
	
	/**가게 목록 조회 (/shop/list get요청시)*/
	@RequestMapping(value="/list", method = RequestMethod.GET)
	public ModelAndView list(Shop shop) throws Exception{
		
		//서비스 객체 find()호출
		List<Shop> listShop =  this.shopService.find(shop);
		ModelAndView modelAndView = new ModelAndView("/shop/list");
		modelAndView.addObject("listShop",listShop);
	
		return modelAndView;
	}

	/**가게 등록 화면~~~/shop/add  get방식 요청시*/
	@RequestMapping(value="add",  method = RequestMethod.GET)
	public String addForm() throws Exception{
		return "/shop/add";//해당 view 만 전달(WEB-INF/jsp/shop/add.jsp)
	}
	
	/** 가게 등록 처리 ~~~/shop/add post 방식 요청 시 */
	@RequestMapping(value="add",  method = RequestMethod.POST)
	public ModelAndView add(Shop shop) throws Exception{
		
		RedirectView redirectView = new RedirectView("list");
		redirectView.setExposeContextBeansAsAttributes(false);
		//RedirectView의 경우 파라미터까지 같이 전달되므로 파라미터는 전달되지 못하도록 false
		
		//서비스 객체 호출
		this.shopService.add(shop);
		
		return new ModelAndView(redirectView);//sendRedirect()와 동일
	}
	
	/**가게 조회~~~/shop/view/shopNo=10  get식 요청시*/
	@RequestMapping(value="/view/{shopNo}",  method = RequestMethod.GET)
	//view/{shopNo}"의/{shopNo}값을 @PathVariable String shopNo에  shopNo로 직접 전달 할 수 있다.
	public ModelAndView view(@PathVariable String shopNo) throws Exception{
		
		ModelAndView modelAndView = new ModelAndView("/shop/view");
		
		//서비스 객체 호출
		Shop shop =this.shopService.view(shopNo);
		modelAndView.addObject("shop",shop);
		
		return modelAndView;
	}
	
	/**가게 수정 화면~~~/shop/edit/shopNo=10  get식 요청시*/
	@RequestMapping(value="/edit/{shopNo}",  method = RequestMethod.GET)
	public ModelAndView editForm(@PathVariable String shopNo) throws Exception{
		
		ModelAndView modelAndView = new ModelAndView("/shop/edit");
		//서비스 객체 호출
		Shop shop =this.shopService.view(shopNo);
		modelAndView.addObject("shop",shop);
		
		return modelAndView;
		
	}
	/**가게 수정 처리~~~/shop/edit  post식 요청시*/
	@RequestMapping(value="/edit",  method = RequestMethod.POST)
	public ModelAndView edit(Shop shop) throws Exception{
		
		
		RedirectView redirectView = new RedirectView("list");
		redirectView.setExposeContextBeansAsAttributes(false);
		
		//서비스 객체 호출
		this.shopService.edit(shop);
		
		return new ModelAndView(redirectView);
	}
	
	/**가게 삭제 처리~~~/shop/remove/shopNo=10   get식 요청시*/
	@RequestMapping(value="/remove/{shopNo}",  method = RequestMethod.GET)
	public ModelAndView remove(@PathVariable String shopNo) throws Exception{
		RedirectView redirectView = new RedirectView("../list");
		redirectView.setExposeContextBeansAsAttributes(false);
		
		//서비스 객체 호출
		this.shopService.remove(shopNo);
		return new ModelAndView(redirectView);
				
		
	}
	
	
}
