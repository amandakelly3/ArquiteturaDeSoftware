package p2.FINANCING;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="serasa")
public interface SerasaClient {

	@GetMapping("/serasa/{cpf}")
    public int temNomeSujo(@PathVariable long cpf);
}