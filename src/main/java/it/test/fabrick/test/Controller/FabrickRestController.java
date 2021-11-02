package it.test.fabrick.test.Controller;

import it.test.fabrick.test.Model.WrapperBalance;
import it.test.fabrick.test.Model.WrapperTransfer;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
public class FabrickRestController {
    private String basePath = "https://sandbox.platfr.io";
    RestTemplate restTemplate = new RestTemplate();


    private HttpHeaders getHeaders(){
        HttpHeaders headers = new HttpHeaders();
        headers.set("Auth-Schema", "S2S");
        headers.set("Api-Key", "FXOVVXXHVCPVPBZXIJOBGUGSKHDNFRRQJP");
        return headers;
    }

    @GetMapping("/getAccountBalance")
    public WrapperBalance getAccountBalance(){
        String path = basePath + "/api/gbs/banking/v4.0/accounts/14537780/balance";
        HttpEntity request = new HttpEntity(getHeaders());
        ResponseEntity<WrapperBalance> response = restTemplate.exchange(
                path,
                HttpMethod.GET,
                request,
                WrapperBalance.class
        );
        if (response.getStatusCode() == HttpStatus.OK) {
            System.out.println("RESPONSE: ");
            System.out.println(response.getStatusCode());
            return response.getBody();
        } else {
            System.out.println("RESPONSE: ");
            System.out.println(response.getStatusCode());
            return new WrapperBalance();
        }

    }

    @GetMapping("getTransfersList")
    public WrapperTransfer getTransferList(){
        String path = basePath + "/api/gbs/banking/v4.0/accounts/14537780/transactions?fromAccountingDate=2021-10-01&toAccountingDate=2021-10-31";
        HttpEntity request = new HttpEntity(getHeaders());
        ResponseEntity<WrapperTransfer> response = restTemplate.exchange(
                path,
                HttpMethod.GET,
                request,
                WrapperTransfer.class
        );
        if (response.getStatusCode() == HttpStatus.OK) {
            System.out.println("RESPONSE: ");
            System.out.println(response.getStatusCode());
            return response.getBody();
        } else {
            System.out.println("RESPONSE: ");
            System.out.println(response.getStatusCode());
            return new WrapperTransfer();
        }

    }

    //@PostMapping("saveTransfer")
}
