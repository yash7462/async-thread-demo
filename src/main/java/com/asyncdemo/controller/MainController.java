package com.asyncdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.asyncdemo.service.AsynchronousService;

import lombok.extern.java.Log;

@Log
@RestController
public class MainController {

	@Autowired
    private AsynchronousService asynchronousService;
 
    @GetMapping(value = "/asynctest")
    public void nonAsyncMethod() throws InterruptedException {
    	for (int i = 0; i < 1000; i++) {
    		asynchronousService.processData(i);	
		}
        
    }

//	@GetMapping("/email")
//	public String sendEmail() {
//		log.info("Sending email");
//		rqueueMessageEnqueuer.enqueue(emailQueueName, new EmailModel("yash@gmail.com", "firstMessage", "None"));
//		return "Please check your inbox!";
//	}
//
//	@GetMapping("/invoice")
//	public String generateInvoice() {
//		log.info("Generate invoice");
//		rqueueMessageEnqueuer.enqueueIn(invoiceQueueName, new InvoiceModel("1", "TaxInvoice"), invoiceDelay);
//		return "Invoice would be generated in " + invoiceDelay + " milliseconds";
//	}

	
}
