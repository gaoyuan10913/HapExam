package hbi.core.order.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hand.hap.core.IRequest;
import com.hand.hap.system.controllers.BaseController;
import com.hand.hap.system.dto.ResponseData;

import hbi.core.order.dto.OrderStatus;
import hbi.core.order.service.IOrderStatusService;

@Controller
public class OrderStatusController extends BaseController {

	@Autowired
	private IOrderStatusService orderStatusService;

	@RequestMapping(value = "/sale/orderstatus/query")
	@ResponseBody
	public ResponseData getStatus(OrderStatus orderStatus, @RequestParam(defaultValue = DEFAULT_PAGE) int page,
			@RequestParam(defaultValue = DEFAULT_PAGE_SIZE) int pagesize, HttpServletRequest request) {
		IRequest requestContext = createRequestContext(request);
		return new ResponseData(orderStatusService.selectOrderStatus(requestContext, orderStatus, page, pagesize));
	}

}
