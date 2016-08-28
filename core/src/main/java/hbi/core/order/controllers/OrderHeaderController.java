package hbi.core.order.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hand.hap.core.IRequest;
import com.hand.hap.core.exception.BaseException;
import com.hand.hap.system.controllers.BaseController;
import com.hand.hap.system.dto.ResponseData;

import hbi.core.order.dto.OrderHeader;
import hbi.core.order.dto.OrderLine;
import hbi.core.order.service.IOrderHeaderService;
import hbi.core.order.service.IOrderLineService;

@Controller
public class OrderHeaderController extends BaseController {

	@Autowired
	private IOrderHeaderService orderHeaderService;
	
    @Autowired
    private IOrderLineService orderLineService;

	@RequestMapping(value = "/sale/order/query")
	@ResponseBody
	public ResponseData getTasks(OrderHeader orderHeader, @RequestParam(defaultValue = DEFAULT_PAGE) int page,
			@RequestParam(defaultValue = DEFAULT_PAGE_SIZE) int pagesize, HttpServletRequest request) {
		IRequest requestContext = createRequestContext(request);
		return new ResponseData(orderHeaderService.selectByOrderHeader(requestContext, orderHeader, page, pagesize));
	}
	
    @RequestMapping(value="/sale/orderheader/insert")
    @ResponseBody
    public ResponseData submitHeader(@RequestBody List<OrderHeader> headers, BindingResult result, HttpServletRequest request)
            throws BaseException {
        IRequest requestContext = createRequestContext(request);
        OrderHeader orderHeader = headers.get(0);
        System.out.println(orderHeader);
        return new ResponseData(orderHeaderService.batchUpdate(requestContext, headers));
    }
    
    @RequestMapping(value = "/sale/orderLine/query")
    @ResponseBody
    public ResponseData getTasks(OrderLine orderline, @RequestParam(defaultValue = DEFAULT_PAGE) int page,
            @RequestParam(defaultValue = DEFAULT_PAGE_SIZE) int pagesize, HttpServletRequest request) {
        IRequest requestContext = createRequestContext(request);
        return new ResponseData(orderLineService.selectOrderLine(requestContext, orderline, page, pagesize));
    }

}
